from DangieParser import DangieParser
from DangieVisitor import DangieVisitor


class C3DVisitor(DangieVisitor):
    """Genera instrucciones intermedias a partir del arbol de Dangie."""

    def __init__(self):
        super().__init__()
        self.temp_count = 0
        self.codigo = []

    def nuevo_temp(self) -> str:
        temp = f"t{self.temp_count}"
        self.temp_count += 1
        return temp

    def emitir(self, instruccion: str) -> None:
        self.codigo.append(instruccion)

    def visitProgram(self, ctx: DangieParser.ProgramContext):
        self.codigo = []
        self.temp_count = 0
        for instruccion in ctx.instruccion():
            self.visit(instruccion)
        return self.codigo

    def visitInstruccion(self, ctx: DangieParser.InstruccionContext):
        return self.visitChildren(ctx)

    def visitDeclaracionVar(self, ctx: DangieParser.DeclaracionVarContext):
        self.emitir(f"DECLARE {ctx.TIPO().getText()} {ctx.ID().getText()}")

    def visitAsignacionVar(self, ctx: DangieParser.AsignacionVarContext):
        nombre = ctx.ID().getText()
        valor = self.visit(ctx.valor())
        self.emitir(f"{nombre} = {valor}")

    def visitValor(self, ctx: DangieParser.ValorContext):
        if ctx.lecturaPin() is not None:
            return self.visit(ctx.lecturaPin())
        if ctx.HL() is not None:
            return ctx.HL().getText()
        if ctx.ID() is not None:
            return ctx.ID().getText()
        if ctx.POINT() is not None:
            return ctx.POINT().getText()
        if ctx.NUMB() is not None:
            return ctx.NUMB().getText()
        raise ValueError(f"Valor no reconocido: {ctx.getText()}")

    def _pin(self, ctx) -> str:
        if ctx.ID() is not None:
            return ctx.ID().getText()
        return ctx.NUMB().getText()

    def visitConfPin(self, ctx: DangieParser.ConfPinContext):
        self.emitir(f"CONFIG_PIN {self._pin(ctx)}, {ctx.MODO().getText()}")

    def visitActuadorPin(self, ctx: DangieParser.ActuadorPinContext):
        estado = "HIGH" if ctx.ESTADO().getText() == "ON" else "LOW"
        self.emitir(f"SET_PIN {self._pin(ctx)}, {estado}")

    def visitLecturaSensor(self, ctx: DangieParser.LecturaSensorContext):
        pin = ctx.NUMB().getText()
        self.emitir(f"READ_SENSOR {ctx.TIPO_LECTURA().getText()} {pin}")

    def visitLecturaPin(self, ctx: DangieParser.LecturaPinContext):
        pin = self._pin(ctx)
        tipo = "READ_DIGITAL" if ctx.TIPO_LECTURA().getText() == "DREAD" else "READ_ANALOG"
        temp = self.nuevo_temp()
        self.emitir(f"{temp} = {tipo} {pin}")
        return temp

    def visitBucleWhen(self, ctx: DangieParser.BucleWhenContext):
        condicion = self.visit(ctx.expresion())
        bloques = ctx.bloqueWhen()

       
        self.emitir(f"IF_BEGIN {condicion}")
        for instruccion in bloques[0].instruccion():
            self.visit(instruccion)

        if ctx.ELSE() is not None:
            self.emitir("ELSE")
            for instruccion in bloques[1].instruccion():
                self.visit(instruccion)
        self.emitir("END_IF")

    def visitBucleLoop(self, ctx: DangieParser.BucleLoopContext):
       
        self.emitir("LOOP_BEGIN")
        for instruccion in ctx.instruccion():
            self.visit(instruccion)
        self.emitir("LOOP_END")

    def visitFuncionwait(self, ctx: DangieParser.FuncionwaitContext):
        self.emitir(f"DELAY {ctx.NUMB().getText()}")

    def visitExpresion(self, ctx: DangieParser.ExpresionContext):
        if ctx.PIN() is not None:
            lectura = self.nuevo_temp()
            self.emitir(f"{lectura} = READ_DIGITAL {ctx.NUMB().getText()}")
            izquierda = lectura
            operador = "=="
            derecha = "HIGH" if ctx.ESTADO().getText() == "ON" else "LOW"
        else:
            valores = ctx.valor()
            izquierda = self.visit(valores[0])
            derecha = self.visit(valores[1])
            operador = ctx.OP_COMP().getText()

        temp = self.nuevo_temp()
        self.emitir(f"{temp} = {izquierda} {operador} {derecha}")
        return temp
