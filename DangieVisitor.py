# Generated from Dangie.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .DangieParser import DangieParser
else:
    from DangieParser import DangieParser

# This class defines a complete generic visitor for a parse tree produced by DangieParser.

class DangieVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by DangieParser#program.
    def visitProgram(self, ctx:DangieParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DangieParser#instruccion.
    def visitInstruccion(self, ctx:DangieParser.InstruccionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DangieParser#declaracionVar.
    def visitDeclaracionVar(self, ctx:DangieParser.DeclaracionVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DangieParser#asignacionVar.
    def visitAsignacionVar(self, ctx:DangieParser.AsignacionVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DangieParser#valor.
    def visitValor(self, ctx:DangieParser.ValorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DangieParser#confPin.
    def visitConfPin(self, ctx:DangieParser.ConfPinContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DangieParser#actuadorPin.
    def visitActuadorPin(self, ctx:DangieParser.ActuadorPinContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DangieParser#lecturaSensor.
    def visitLecturaSensor(self, ctx:DangieParser.LecturaSensorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DangieParser#bucleWhen.
    def visitBucleWhen(self, ctx:DangieParser.BucleWhenContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DangieParser#bucleLoop.
    def visitBucleLoop(self, ctx:DangieParser.BucleLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DangieParser#expresion.
    def visitExpresion(self, ctx:DangieParser.ExpresionContext):
        return self.visitChildren(ctx)



del DangieParser