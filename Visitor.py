from asyncio import sleep

from DangieParser import DangieParser
from DangieVisitor import DangieVisitor


class Visitor(DangieVisitor):
    def __init__(self):
        super().__init__()

        self.tablaPines = {}
        self.tablaSimbolos = {}
        self.logErrores = []
        self.PINES_VALIDOS = {f"pin_{i}" for i in range(14)}

        self.variables = {}
        self.pin_estados = {}
        self.pin_modos = {}

    def _nombre_pin(self, ctx):
        return f"pin_{int(ctx.NUMB().getText())}"

    def _resolver_numero_pin(self, ctx):
        if ctx.ID():
            nombre_variable = ctx.ID().getText()
            numero_pin = self.variables.get(nombre_variable)
            if not isinstance(numero_pin, int):
                self.logErrores.append(
                    f"Error: {nombre_variable} no contiene un número de pin válido."
                )
                return None
            return numero_pin

        return int(ctx.NUMB().getText())

    def _leer_valor(self, valor_ctx):
        if valor_ctx is None:
            return None

        if valor_ctx.lecturaPin():
            return self.visitLecturaPin(valor_ctx.lecturaPin())

        if valor_ctx.NUMB():
            return int(valor_ctx.NUMB().getText())

        if valor_ctx.POINT():
            return float(valor_ctx.POINT().getText())

        if valor_ctx.HL():
            return valor_ctx.HL().getText().upper()

        if valor_ctx.ID():
            nombre = valor_ctx.ID().getText()
            return self.variables.get(nombre, nombre)

        return valor_ctx.getText()

    def _leer_pin_digital(self, ctx):
        numero_pin = self._resolver_numero_pin(ctx)
        if numero_pin is None:
            return None

        nombre_pin = f"pin_{numero_pin}"
        if nombre_pin not in self.PINES_VALIDOS:
            self.logErrores.append(
                f"Error: {nombre_pin} no es válido. Solo se permite pin 0 a pin 13."
            )
            return None

        if self.pin_modos.get(nombre_pin) != "IN":
            self.logErrores.append(
                f"Error: {nombre_pin} debe estar configurado como entrada para leerlo."
            )
            return None

        estado = self.pin_estados.get(nombre_pin, "OFF")
        valor = "HIGH" if estado in ("ON", "HIGH") else "LOW"
        print(
            f"Leyendo {ctx.TIPO_LECTURA().getText()} de {nombre_pin}: "
            f"{valor} (simulado)"
        )
        return valor

    def _evaluar_expresion(self, ctx):
        if ctx is None:
            return True

        if ctx.PIN() is not None:
            nombre_pin = self._nombre_pin(ctx)
            estado_esperado = ctx.ESTADO().getText().upper()
            estado_actual = self.pin_estados.get(nombre_pin, "OFF")
            return estado_actual == estado_esperado

        if len(ctx.valor()) >= 2:
            izquierda = self._leer_valor(ctx.valor(0))
            derecha = self._leer_valor(ctx.valor(1))
            operador = ctx.OP_COMP().getText()

            if operador == "==":
                return izquierda == derecha
            if operador == "!=":
                return izquierda != derecha
            if operador == ">=":
                return izquierda >= derecha
            if operador == "<=":
                return izquierda <= derecha
            if operador == ">":
                return izquierda > derecha
            if operador == "<":
                return izquierda < derecha

        return False

    def visitProgram(self, ctx: DangieParser.ProgramContext):
        for ctx_instruccion in ctx.instruccion():
            self.visit(ctx_instruccion)

        if self.logErrores:
            print("Errores encontrados durante la ejecución:")
            for error in self.logErrores:
                print(error)
        print("Fin del recorrido, exito")
        return None

    def visitInstruccion(self, ctx: DangieParser.InstruccionContext):
        return self.visitChildren(ctx)

    def visitConfPin(self, ctx: DangieParser.ConfPinContext):
        numero_pin = self._resolver_numero_pin(ctx)
        if numero_pin is None:
            return None

        nombre_pin = f"pin_{numero_pin}"
        num = str(numero_pin)
        modo = ctx.MODO().getText()

        if nombre_pin not in self.PINES_VALIDOS:
            self.logErrores.append(
                f"Error: {nombre_pin} no es válido. Solo se permite pin 0 a pin 13."
            )
            return None

        if nombre_pin in self.tablaPines:
            print(
                f"Advertencia: {nombre_pin} ya ha sido configurado previamente. "
                "Sobrescribiendo configuración."
            )

        self.pin_modos[nombre_pin] = modo
        self.pin_estados.setdefault(nombre_pin, "OFF")
        self.tablaPines[nombre_pin] = (num, modo)
        print(f"Configurando {nombre_pin} {num} como {modo}")
        return None

    def visitActuadorPin(self, ctx: DangieParser.ActuadorPinContext):
        numero_pin = self._resolver_numero_pin(ctx)
        if numero_pin is None:
            return None

        nombre_pin = f"pin_{numero_pin}"
        num = str(numero_pin)
        estado = ctx.ESTADO().getText().upper()

        if nombre_pin not in self.PINES_VALIDOS:
            self.logErrores.append(f"Error: {nombre_pin} Este pin no existe.")
            return None

        if nombre_pin not in self.tablaPines:
            self.logErrores.append(f"Error: {nombre_pin} Este pin no está configurado.")
            return None

        if self.tablaPines[nombre_pin][1] != "OUT":
            self.logErrores.append(
                f"Error: {nombre_pin} Este pin no está configurado como salida."
            )
            return None

        self.pin_estados[nombre_pin] = estado
        print(f"Pin detectado {nombre_pin} {num} en estado {estado}")
        return None

    def visitLecturaSensor(self, ctx: DangieParser.LecturaSensorContext):
        nombre_pin = self._nombre_pin(ctx)
        num = ctx.NUMB().getText()
        tipo_lectura = ctx.TIPO_LECTURA().getText()
        print(f"Pin detectado {nombre_pin} {num} en lectura {tipo_lectura}")
        return None

    def visitLecturaPin(self, ctx: DangieParser.LecturaPinContext):
        return self._leer_pin_digital(ctx)

    def visitDeclaracionVar(self, ctx: DangieParser.DeclaracionVarContext):
        nombre_var = ctx.ID().getText()
        valor = self._leer_valor(ctx.valor()) if hasattr(ctx, "valor") and ctx.valor() is not None else None
        self.variables[nombre_var] = valor
        print(f"Declarando variable {nombre_var} con valor {valor}")
        return None

    def visitAsignacionVar(self, ctx: DangieParser.AsignacionVarContext):
        nombre_var = ctx.ID().getText()
        valor = self._leer_valor(ctx.valor())
        self.variables[nombre_var] = valor
        print(f"Asignando variable {nombre_var} con valor {valor}")
        return None

    def visitBucleWhen(self, ctx: DangieParser.BucleWhenContext):
        condicion = ctx.expresion().getText()
        print(f"Evaluando WHEN con condición {condicion}")
        bloques = ctx.bloqueWhen()

        if self._evaluar_expresion(ctx.expresion()):
            print(f"La condición se cumple: {condicion}")
            instrucciones = bloques[0].instruccion()
        elif len(bloques) > 1:
            print(f"La condición NO se cumple: {condicion}")
            instrucciones = bloques[1].instruccion()
        else:
            print(f"La condición NO se cumple: {condicion}")
            instrucciones = []

        for ctx_instruccion in instrucciones:
            self.visit(ctx_instruccion)

        print("Saliendo del bucle WHEN")
        return None

    def visitBucleLoop(self, ctx: DangieParser.BucleLoopContext):
        print("Entrando al bucle LOOP sin condición")

        for ctx_instruccion in ctx.instruccion():
            self.visit(ctx_instruccion)

        print("Saliendo del bucle LOOP")
        return None
    
    def visitFuncionwait(self, ctx: DangieParser.FuncionwaitContext):
        tiempo_espera = int(ctx.NUMB().getText())
        sleep(tiempo_espera)
        print(f"Esperando {tiempo_espera} unidades de tiempo")
        return None
