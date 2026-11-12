class GeneradorArduino:
    def __init__(self, lista_c3d: list):
        self.c3d = lista_c3d
        self.global_code = []
        self.setup_code = []
        self.loop_code = []

    def generar(self) -> str:
        self.global_code = []
        self.setup_code = []
        self.loop_code = []
        profundidad_loop = 0
        destino = self.setup_code

        for linea in self.c3d:
            linea = linea.strip()
            if not linea:
                continue

            partes = linea.split()
            instruccion = partes[0]

            if instruccion == "CONFIG_PIN":
                pin = partes[1].replace(",", "")
                modo = partes[2]
                modo_arduino = {"IN": "INPUT", "OUT": "OUTPUT"}.get(modo)
                if modo_arduino is None:
                    raise ValueError(f"Modo de pin no reconocido: {modo}")
                self.setup_code.append(f"  pinMode({pin}, {modo_arduino});")

            elif instruccion == "DECLARE":
                tipo = partes[1]
                nombre = partes[2]
                tipo_arduino = {"NUMB": "int", "HL": "int", "POINT": "float"}.get(tipo)
                if tipo_arduino is None:
                    raise ValueError(f"Tipo de variable no reconocido: {tipo}")
                self.global_code.append(f"{tipo_arduino} {nombre};")

            elif instruccion == "SET_PIN":
                pin = partes[1].replace(",", "")
                estado = partes[2]
                destino.append(f"  digitalWrite({pin}, {estado});")

            elif len(partes) >= 4 and partes[2] == "READ_DIGITAL":
                temp = partes[0]
                pin = partes[3]
                destino.append(f"  int {temp} = digitalRead({pin});")

            elif len(partes) >= 4 and partes[2] == "READ_ANALOG":
                temp = partes[0]
                pin = partes[3]
                destino.append(f"  int {temp} = analogRead({pin});")

            elif instruccion == "READ_SENSOR":
                tipo_lectura = partes[1]
                pin = partes[2]
                funcion = "digitalRead" if tipo_lectura == "DREAD" else "analogRead"
                destino.append(f"  (void){funcion}({pin});")

            elif len(partes) == 5 and partes[1] == "=":
                temp = partes[0]
                izq = partes[2]
                op = partes[3]
                der = partes[4]
                destino.append(f"  bool {temp} = ({izq} {op} {der});")

            elif len(partes) == 3 and partes[1] == "=":
                destino.append(f"  {partes[0]} = {partes[2]};")

            elif instruccion == "IF_BEGIN":
                destino.append(f"  if ({partes[1]}) {{")

            elif instruccion == "ELSE":
                destino.append("  } else {")

            elif instruccion == "END_IF":
                destino.append("  }")

            elif instruccion == "DELAY":
                destino.append(f"  delay({partes[1]});")

            elif instruccion == "LOOP_BEGIN":
                profundidad_loop += 1
                destino = self.loop_code
                if profundidad_loop > 1:
                    destino.append("  while (true) {")

            elif instruccion == "LOOP_END":
                if profundidad_loop > 1:
                    destino.append("  }")
                profundidad_loop -= 1
                destino = self.loop_code if profundidad_loop > 0 else self.setup_code

            elif instruccion == "IF_FALSE":
                cond = partes[1]
                label = partes[3]
                self.loop_code.append(f"  if (!{cond}) goto {label};")

            elif instruccion == "GOTO":
                label = partes[1]
                # Si es el salto del loop infinito principal, no necesitamos emitir goto en Arduino
                # porque void loop() ya se repite infinitamente por sí solo.
                if not label.startswith("L_LOOP_"):
                    self.loop_code.append(f"  goto {label};")

            elif instruccion == "LABEL":
                label = partes[1].replace(":", "")
                if not label.startswith("L_LOOP_"):
                    self.loop_code.append(f"{label}:")

        plantilla = [
            "// ====================================================",
            "// Codigo generado automaticamente desde Dangie (C3D)",
            "// ====================================================",
            "",
            "\n".join(self.global_code),
            "",
            "void setup() {",
            "\n".join(self.setup_code) if self.setup_code else "  // Sin configuraciones",
            "}",
            "",
            "void loop() {",
            "\n".join(self.loop_code) if self.loop_code else "  // Sin acciones",
            "}"
        ]

        return "\n".join(plantilla)