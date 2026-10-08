from antlr4 import CommonTokenStream, InputStream
from DangieLexer import DangieLexer
from DangieParser import DangieParser
from Visitor import Visitor

def ejecutar():
    #codigo de prueba
    codigo_fuente = """
        CONF Pin 99 OUT;
        CONF Pin 4 OUT;
        Pin 6 ON;
        DREAD {Pin 5};
        WHEN(Pin 6 is ON)THEN{Pin 4 OFF;};
        LOOP{Pin 6 ON;};
    """
    #1. FLUJO DE ENTRADA
    input_stream = InputStream(codigo_fuente)
    
    
    #LEXER Y TOKENS
    
    lexer = DangieLexer(input_stream)
    stream = CommonTokenStream(lexer)
    
    #PARSER Y ARBOL
    
    parser = DangieParser(stream)
    arbol = parser.program()
    
    
    #VERIFICACION DE SINTAXIS
    
    if parser.getNumberOfSyntaxErrors() > 0:
        print("Errores de sintaxis encontrados. No se puede continuar con la ejecución.")
        return
    #EJECUTAR EL VISITOR
    
    visitor = Visitor()
    visitor.visit(arbol)
    
if __name__ == '__main__':
    ejecutar()

from antlr4 import CommonTokenStream, InputStream
from DangieLexer import DangieLexer
from DangieParser import DangieParser
from Visitor import Visitor

def ejecutar():
    #codigo de prueba
    codigo_fuente = """
        CONF Pin 6 OUT;
        CONF Pin 4 OUT;
        Pin 6 ON;
    """
    #1. FLUJO DE ENTRADA
    input_stream = InputStream(codigo_fuente)
    
    
    #LEXER Y TOKENS
    
    lexer = DangieLexer(input_stream)
    stream = CommonTokenStream(lexer)
    
    #PARSER Y ARBOL
    
    parser = DangieParser(stream)
    arbol = parser.program()
    
    
    #VERIFICACION DE SINTAXIS
    
    if parser.getNumberOfSyntaxErrors() > 0:
        print("Errores de sintaxis encontrados. No se puede continuar con la ejecución.")
        return
    #EJECUTAR EL VISITOR
    
    visitor = Visitor()
    visitor.visit(arbol)
    