# Generated from Dangie.g4 by ANTLR 4.7.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32")
        buf.write("m\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\7\2\32\n\2")
        buf.write("\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\5\3(\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6")
        buf.write("\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3")
        buf.write("\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nN\n")
        buf.write("\n\f\n\16\nQ\13\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13Y\n\13")
        buf.write("\f\13\16\13\\\13\13\3\13\3\13\3\13\3\f\3\f\3\f\5\fd\n")
        buf.write("\f\3\f\3\f\3\f\3\f\3\f\5\fk\n\f\3\f\2\2\r\2\4\6\b\n\f")
        buf.write("\16\20\22\24\26\2\3\4\2\24\24\26\30\2l\2\33\3\2\2\2\4")
        buf.write("\'\3\2\2\2\6)\3\2\2\2\b-\3\2\2\2\n\62\3\2\2\2\f\64\3\2")
        buf.write("\2\2\16:\3\2\2\2\20?\3\2\2\2\22F\3\2\2\2\24U\3\2\2\2\26")
        buf.write("j\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33")
        buf.write("\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2")
        buf.write("\36\37\7\2\2\3\37\3\3\2\2\2 (\5\f\7\2!(\5\16\b\2\"(\5")
        buf.write("\20\t\2#(\5\6\4\2$(\5\b\5\2%(\5\22\n\2&(\5\24\13\2\' ")
        buf.write("\3\2\2\2\'!\3\2\2\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2")
        buf.write("\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)*\7\20\2\2*+\7\30\2")
        buf.write("\2+,\7\3\2\2,\7\3\2\2\2-.\7\30\2\2./\7\4\2\2/\60\5\n\6")
        buf.write("\2\60\61\7\3\2\2\61\t\3\2\2\2\62\63\t\2\2\2\63\13\3\2")
        buf.write("\2\2\64\65\7\n\2\2\65\66\7\13\2\2\66\67\7\27\2\2\678\7")
        buf.write("\21\2\289\7\3\2\29\r\3\2\2\2:;\7\13\2\2;<\7\27\2\2<=\7")
        buf.write("\22\2\2=>\7\3\2\2>\17\3\2\2\2?@\7\23\2\2@A\7\5\2\2AB\7")
        buf.write("\13\2\2BC\7\27\2\2CD\7\6\2\2DE\7\3\2\2E\21\3\2\2\2FG\7")
        buf.write("\f\2\2GH\7\7\2\2HI\5\26\f\2IJ\7\b\2\2JK\7\r\2\2KO\7\5")
        buf.write("\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2")
        buf.write("PR\3\2\2\2QO\3\2\2\2RS\7\6\2\2ST\7\3\2\2T\23\3\2\2\2U")
        buf.write("V\7\16\2\2VZ\7\5\2\2WY\5\4\3\2XW\3\2\2\2Y\\\3\2\2\2ZX")
        buf.write("\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\6\2\2^_\7")
        buf.write("\3\2\2_\25\3\2\2\2`a\7\13\2\2ac\7\27\2\2bd\7\t\2\2cb\3")
        buf.write("\2\2\2cd\3\2\2\2de\3\2\2\2ek\7\22\2\2fg\5\n\6\2gh\7\25")
        buf.write("\2\2hi\5\n\6\2ik\3\2\2\2j`\3\2\2\2jf\3\2\2\2k\27\3\2\2")
        buf.write("\2\b\33\'OZcj")
        return buf.getvalue()


class DangieParser ( Parser ):

    grammarFileName = "Dangie.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "';'", "'='", "'{'", "'}'", "'('", "')'", 
                     "'is'", "'CONF'", "'Pin'", "'WHEN'", "'THEN'", "'LOOP'", 
                     "'WHILE'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "CONF", "PIN", "WHEN", "THEN", "LOOP", "WHILE", "TIPO", 
                      "MODO", "ESTADO", "TIPO_LECTURA", "HL", "OP_COMP", 
                      "POINT", "NUMB", "ID", "COMMENT", "WS" ]

    RULE_program = 0
    RULE_instruccion = 1
    RULE_declaracionVar = 2
    RULE_asignacionVar = 3
    RULE_valor = 4
    RULE_confPin = 5
    RULE_actuadorPin = 6
    RULE_lecturaSensor = 7
    RULE_bucleWhen = 8
    RULE_bucleLoop = 9
    RULE_expresion = 10

    ruleNames =  [ "program", "instruccion", "declaracionVar", "asignacionVar", 
                   "valor", "confPin", "actuadorPin", "lecturaSensor", "bucleWhen", 
                   "bucleLoop", "expresion" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    CONF=8
    PIN=9
    WHEN=10
    THEN=11
    LOOP=12
    WHILE=13
    TIPO=14
    MODO=15
    ESTADO=16
    TIPO_LECTURA=17
    HL=18
    OP_COMP=19
    POINT=20
    NUMB=21
    ID=22
    COMMENT=23
    WS=24

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class ProgramContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(DangieParser.EOF, 0)

        def instruccion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DangieParser.InstruccionContext)
            else:
                return self.getTypedRuleContext(DangieParser.InstruccionContext,i)


        def getRuleIndex(self):
            return DangieParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = DangieParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << DangieParser.CONF) | (1 << DangieParser.PIN) | (1 << DangieParser.WHEN) | (1 << DangieParser.LOOP) | (1 << DangieParser.TIPO) | (1 << DangieParser.TIPO_LECTURA) | (1 << DangieParser.ID))) != 0):
                self.state = 22
                self.instruccion()
                self.state = 27
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 28
            self.match(DangieParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class InstruccionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def confPin(self):
            return self.getTypedRuleContext(DangieParser.ConfPinContext,0)


        def actuadorPin(self):
            return self.getTypedRuleContext(DangieParser.ActuadorPinContext,0)


        def lecturaSensor(self):
            return self.getTypedRuleContext(DangieParser.LecturaSensorContext,0)


        def declaracionVar(self):
            return self.getTypedRuleContext(DangieParser.DeclaracionVarContext,0)


        def asignacionVar(self):
            return self.getTypedRuleContext(DangieParser.AsignacionVarContext,0)


        def bucleWhen(self):
            return self.getTypedRuleContext(DangieParser.BucleWhenContext,0)


        def bucleLoop(self):
            return self.getTypedRuleContext(DangieParser.BucleLoopContext,0)


        def getRuleIndex(self):
            return DangieParser.RULE_instruccion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInstruccion" ):
                listener.enterInstruccion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInstruccion" ):
                listener.exitInstruccion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInstruccion" ):
                return visitor.visitInstruccion(self)
            else:
                return visitor.visitChildren(self)




    def instruccion(self):

        localctx = DangieParser.InstruccionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_instruccion)
        try:
            self.state = 37
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [DangieParser.CONF]:
                self.enterOuterAlt(localctx, 1)
                self.state = 30
                self.confPin()
                pass
            elif token in [DangieParser.PIN]:
                self.enterOuterAlt(localctx, 2)
                self.state = 31
                self.actuadorPin()
                pass
            elif token in [DangieParser.TIPO_LECTURA]:
                self.enterOuterAlt(localctx, 3)
                self.state = 32
                self.lecturaSensor()
                pass
            elif token in [DangieParser.TIPO]:
                self.enterOuterAlt(localctx, 4)
                self.state = 33
                self.declaracionVar()
                pass
            elif token in [DangieParser.ID]:
                self.enterOuterAlt(localctx, 5)
                self.state = 34
                self.asignacionVar()
                pass
            elif token in [DangieParser.WHEN]:
                self.enterOuterAlt(localctx, 6)
                self.state = 35
                self.bucleWhen()
                pass
            elif token in [DangieParser.LOOP]:
                self.enterOuterAlt(localctx, 7)
                self.state = 36
                self.bucleLoop()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class DeclaracionVarContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TIPO(self):
            return self.getToken(DangieParser.TIPO, 0)

        def ID(self):
            return self.getToken(DangieParser.ID, 0)

        def getRuleIndex(self):
            return DangieParser.RULE_declaracionVar

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDeclaracionVar" ):
                listener.enterDeclaracionVar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDeclaracionVar" ):
                listener.exitDeclaracionVar(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaracionVar" ):
                return visitor.visitDeclaracionVar(self)
            else:
                return visitor.visitChildren(self)




    def declaracionVar(self):

        localctx = DangieParser.DeclaracionVarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_declaracionVar)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 39
            self.match(DangieParser.TIPO)
            self.state = 40
            self.match(DangieParser.ID)
            self.state = 41
            self.match(DangieParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class AsignacionVarContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(DangieParser.ID, 0)

        def valor(self):
            return self.getTypedRuleContext(DangieParser.ValorContext,0)


        def getRuleIndex(self):
            return DangieParser.RULE_asignacionVar

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAsignacionVar" ):
                listener.enterAsignacionVar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAsignacionVar" ):
                listener.exitAsignacionVar(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAsignacionVar" ):
                return visitor.visitAsignacionVar(self)
            else:
                return visitor.visitChildren(self)




    def asignacionVar(self):

        localctx = DangieParser.AsignacionVarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_asignacionVar)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            self.match(DangieParser.ID)
            self.state = 44
            self.match(DangieParser.T__1)
            self.state = 45
            self.valor()
            self.state = 46
            self.match(DangieParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ValorContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMB(self):
            return self.getToken(DangieParser.NUMB, 0)

        def POINT(self):
            return self.getToken(DangieParser.POINT, 0)

        def HL(self):
            return self.getToken(DangieParser.HL, 0)

        def ID(self):
            return self.getToken(DangieParser.ID, 0)

        def getRuleIndex(self):
            return DangieParser.RULE_valor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValor" ):
                listener.enterValor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValor" ):
                listener.exitValor(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValor" ):
                return visitor.visitValor(self)
            else:
                return visitor.visitChildren(self)




    def valor(self):

        localctx = DangieParser.ValorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_valor)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 48
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << DangieParser.HL) | (1 << DangieParser.POINT) | (1 << DangieParser.NUMB) | (1 << DangieParser.ID))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ConfPinContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CONF(self):
            return self.getToken(DangieParser.CONF, 0)

        def PIN(self):
            return self.getToken(DangieParser.PIN, 0)

        def NUMB(self):
            return self.getToken(DangieParser.NUMB, 0)

        def MODO(self):
            return self.getToken(DangieParser.MODO, 0)

        def getRuleIndex(self):
            return DangieParser.RULE_confPin

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConfPin" ):
                listener.enterConfPin(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConfPin" ):
                listener.exitConfPin(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConfPin" ):
                return visitor.visitConfPin(self)
            else:
                return visitor.visitChildren(self)




    def confPin(self):

        localctx = DangieParser.ConfPinContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_confPin)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 50
            self.match(DangieParser.CONF)
            self.state = 51
            self.match(DangieParser.PIN)
            self.state = 52
            self.match(DangieParser.NUMB)
            self.state = 53
            self.match(DangieParser.MODO)
            self.state = 54
            self.match(DangieParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ActuadorPinContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PIN(self):
            return self.getToken(DangieParser.PIN, 0)

        def NUMB(self):
            return self.getToken(DangieParser.NUMB, 0)

        def ESTADO(self):
            return self.getToken(DangieParser.ESTADO, 0)

        def getRuleIndex(self):
            return DangieParser.RULE_actuadorPin

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterActuadorPin" ):
                listener.enterActuadorPin(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitActuadorPin" ):
                listener.exitActuadorPin(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitActuadorPin" ):
                return visitor.visitActuadorPin(self)
            else:
                return visitor.visitChildren(self)




    def actuadorPin(self):

        localctx = DangieParser.ActuadorPinContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_actuadorPin)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 56
            self.match(DangieParser.PIN)
            self.state = 57
            self.match(DangieParser.NUMB)
            self.state = 58
            self.match(DangieParser.ESTADO)
            self.state = 59
            self.match(DangieParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class LecturaSensorContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TIPO_LECTURA(self):
            return self.getToken(DangieParser.TIPO_LECTURA, 0)

        def PIN(self):
            return self.getToken(DangieParser.PIN, 0)

        def NUMB(self):
            return self.getToken(DangieParser.NUMB, 0)

        def getRuleIndex(self):
            return DangieParser.RULE_lecturaSensor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLecturaSensor" ):
                listener.enterLecturaSensor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLecturaSensor" ):
                listener.exitLecturaSensor(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLecturaSensor" ):
                return visitor.visitLecturaSensor(self)
            else:
                return visitor.visitChildren(self)




    def lecturaSensor(self):

        localctx = DangieParser.LecturaSensorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_lecturaSensor)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 61
            self.match(DangieParser.TIPO_LECTURA)
            self.state = 62
            self.match(DangieParser.T__2)
            self.state = 63
            self.match(DangieParser.PIN)
            self.state = 64
            self.match(DangieParser.NUMB)
            self.state = 65
            self.match(DangieParser.T__3)
            self.state = 66
            self.match(DangieParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class BucleWhenContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHEN(self):
            return self.getToken(DangieParser.WHEN, 0)

        def expresion(self):
            return self.getTypedRuleContext(DangieParser.ExpresionContext,0)


        def THEN(self):
            return self.getToken(DangieParser.THEN, 0)

        def instruccion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DangieParser.InstruccionContext)
            else:
                return self.getTypedRuleContext(DangieParser.InstruccionContext,i)


        def getRuleIndex(self):
            return DangieParser.RULE_bucleWhen

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBucleWhen" ):
                listener.enterBucleWhen(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBucleWhen" ):
                listener.exitBucleWhen(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBucleWhen" ):
                return visitor.visitBucleWhen(self)
            else:
                return visitor.visitChildren(self)




    def bucleWhen(self):

        localctx = DangieParser.BucleWhenContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_bucleWhen)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 68
            self.match(DangieParser.WHEN)
            self.state = 69
            self.match(DangieParser.T__4)
            self.state = 70
            self.expresion()
            self.state = 71
            self.match(DangieParser.T__5)
            self.state = 72
            self.match(DangieParser.THEN)
            self.state = 73
            self.match(DangieParser.T__2)
            self.state = 77
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << DangieParser.CONF) | (1 << DangieParser.PIN) | (1 << DangieParser.WHEN) | (1 << DangieParser.LOOP) | (1 << DangieParser.TIPO) | (1 << DangieParser.TIPO_LECTURA) | (1 << DangieParser.ID))) != 0):
                self.state = 74
                self.instruccion()
                self.state = 79
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 80
            self.match(DangieParser.T__3)
            self.state = 81
            self.match(DangieParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class BucleLoopContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LOOP(self):
            return self.getToken(DangieParser.LOOP, 0)

        def instruccion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DangieParser.InstruccionContext)
            else:
                return self.getTypedRuleContext(DangieParser.InstruccionContext,i)


        def getRuleIndex(self):
            return DangieParser.RULE_bucleLoop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBucleLoop" ):
                listener.enterBucleLoop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBucleLoop" ):
                listener.exitBucleLoop(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBucleLoop" ):
                return visitor.visitBucleLoop(self)
            else:
                return visitor.visitChildren(self)




    def bucleLoop(self):

        localctx = DangieParser.BucleLoopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_bucleLoop)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 83
            self.match(DangieParser.LOOP)
            self.state = 84
            self.match(DangieParser.T__2)
            self.state = 88
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << DangieParser.CONF) | (1 << DangieParser.PIN) | (1 << DangieParser.WHEN) | (1 << DangieParser.LOOP) | (1 << DangieParser.TIPO) | (1 << DangieParser.TIPO_LECTURA) | (1 << DangieParser.ID))) != 0):
                self.state = 85
                self.instruccion()
                self.state = 90
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 91
            self.match(DangieParser.T__3)
            self.state = 92
            self.match(DangieParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ExpresionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PIN(self):
            return self.getToken(DangieParser.PIN, 0)

        def NUMB(self):
            return self.getToken(DangieParser.NUMB, 0)

        def ESTADO(self):
            return self.getToken(DangieParser.ESTADO, 0)

        def valor(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DangieParser.ValorContext)
            else:
                return self.getTypedRuleContext(DangieParser.ValorContext,i)


        def OP_COMP(self):
            return self.getToken(DangieParser.OP_COMP, 0)

        def getRuleIndex(self):
            return DangieParser.RULE_expresion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresion" ):
                listener.enterExpresion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresion" ):
                listener.exitExpresion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresion" ):
                return visitor.visitExpresion(self)
            else:
                return visitor.visitChildren(self)




    def expresion(self):

        localctx = DangieParser.ExpresionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_expresion)
        self._la = 0 # Token type
        try:
            self.state = 104
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [DangieParser.PIN]:
                self.enterOuterAlt(localctx, 1)
                self.state = 94
                self.match(DangieParser.PIN)
                self.state = 95
                self.match(DangieParser.NUMB)
                self.state = 97
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==DangieParser.T__6:
                    self.state = 96
                    self.match(DangieParser.T__6)


                self.state = 99
                self.match(DangieParser.ESTADO)
                pass
            elif token in [DangieParser.HL, DangieParser.POINT, DangieParser.NUMB, DangieParser.ID]:
                self.enterOuterAlt(localctx, 2)
                self.state = 100
                self.valor()
                self.state = 101
                self.match(DangieParser.OP_COMP)
                self.state = 102
                self.valor()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





