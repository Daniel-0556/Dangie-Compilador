from antlr4 import CommonTokenStream, InputStream
from DangieLexer import DangieLexer
from DangieParser import DangieParser
from C3DVisitor import C3DVisitor
from GeneradorArduino import GeneradorArduino


def compilar():
    codigo_fuente = """
        


CONF PIN 13 OUT;
CONF PIN 12 OUT;
CONF PIN 11 OUT;


CONF PIN 4 IN;
CONF PIN 3 IN;
CONF PIN 2 IN;

NUMB modo;
modo = 0;

NUMB botonEncender;
NUMB botonApagar;
NUMB botonTodos;

LOOP {
    
    botonEncender = DREAD(4);
    botonTodos = DREAD(2);
    botonApagar = DREAD(3);

   
    WHEN (botonEncender == HIGH) THEN {
        modo = 1;
    };

    WHEN (botonTodos == HIGH) THEN {
        modo = 2;
    };

    WHEN (botonApagar == HIGH) THEN {
        modo = 0;
    };

    
    WHEN (modo == 0) THEN {
        PIN 13 OFF;
        PIN 12 OFF;
        PIN 11 OFF;
    };

    
    WHEN (modo == 2) THEN {
        PIN 13 ON;
        PIN 12 ON;
        PIN 11 ON;
    };

    
    WHEN (modo == 1) THEN {
        PIN 11 ON;
        PIN 12 OFF;
        PIN 13 OFF;
        WAIT(3000);

        PIN 11 OFF;
        PIN 12 ON;
        PIN 13 OFF;
        WAIT(1000);

        PIN 11 OFF;
        PIN 12 OFF;
        PIN 13 ON;
        WAIT(3000);
    };
};
    """

    print("--- 1. Analizando sintaxis con ANTLR ---")
    stream = InputStream(codigo_fuente)
    lexer = DangieLexer(stream)
    parser = DangieParser(CommonTokenStream(lexer))
    arbol = parser.program()

    if parser.getNumberOfSyntaxErrors() > 0:
        print("✗ Se detuvo la compilación: Errores sintácticos.")
        return

    print("--- 2. Generando Código Intermedio (C3D) ---")
    visitor_c3d = C3DVisitor()
    instrucciones_c3d = visitor_c3d.visit(arbol)
    
    for linea in instrucciones_c3d:
        print(f"  {linea}")

    print("\n--- 3. Generando archivo de Arduino (.ino) ---")
    backend = GeneradorArduino(instrucciones_c3d)
    codigo_arduino = backend.generar()

    print(codigo_arduino)

    # Guardar en disco para abrirlo o copiarlo directo a Wokwi
    with open("sketch.ino", "w") as f:
        f.write(codigo_arduino)
    print("\n✓ Archivo 'sketch.ino' generado exitosamente.")


if __name__ == "__main__":
    compilar()