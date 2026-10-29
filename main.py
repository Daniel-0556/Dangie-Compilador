from antlr4 import CommonTokenStream, InputStream
from DangieLexer import DangieLexer
from DangieParser import DangieParser
from Visitor import Visitor

def ejecutar():
    codigo_fuente = """
        NUMB pBoton;
        pBoton = 2;
        NUMB pLed;
        pLed = 8;
        
        CONF Pin pLed OUT;
        CONF Pin pBoton IN;
        
        LOOP {
            NUMB estadoBoton;
            estadoBoton = DREAD(pBoton);
            WHEN (estadoBoton == HIGH) THEN {
                PIN pLed ON;
            };ELSE {
                PIN pLed OFF;
            };
        };
            
    """
    #1. FLUJO DE ENTRADA
    input_stream = InputStream(codigo_fuente)
    lexer = DangieLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = DangieParser(stream)
    arbol = parser.program()

    if parser.getNumberOfSyntaxErrors() > 0:
        print("Errores de sintaxis encontrados. No se puede continuar con la ejecución.")
        return

    visitor = Visitor()
    visitor.visit(arbol)

if __name__ == "__main__":
    ejecutar()