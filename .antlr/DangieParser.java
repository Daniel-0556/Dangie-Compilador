// Generated from c:/Users/dania/Desktop/Documentos de la U/Sexto Semestre/Lab de Compi 2/Dangie/Dangie.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DangieParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CONF=8, PIN=9, 
		WHEN=10, THEN=11, LOOP=12, WHILE=13, TIPO=14, MODO=15, ESTADO=16, TIPO_LECTURA=17, 
		HL=18, WAIT=19, OP_COMP=20, POINT=21, NUMB=22, ID=23, COMMENT=24, WS=25;
	public static final int
		RULE_program = 0, RULE_instruccion = 1, RULE_declaracionVar = 2, RULE_asignacionVar = 3, 
		RULE_valor = 4, RULE_confPin = 5, RULE_actuadorPin = 6, RULE_lecturaSensor = 7, 
		RULE_bucleWhen = 8, RULE_bucleLoop = 9, RULE_funcionwait = 10, RULE_expresion = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruccion", "declaracionVar", "asignacionVar", "valor", 
			"confPin", "actuadorPin", "lecturaSensor", "bucleWhen", "bucleLoop", 
			"funcionwait", "expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'{'", "'}'", "'('", "')'", "'is'", "'CONF'", "'Pin'", 
			"'WHEN'", "'THEN'", "'LOOP'", "'WHILE'", null, null, null, null, null, 
			"'WAIT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "CONF", "PIN", "WHEN", 
			"THEN", "LOOP", "WHILE", "TIPO", "MODO", "ESTADO", "TIPO_LECTURA", "HL", 
			"WAIT", "OP_COMP", "POINT", "NUMB", "ID", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Dangie.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DangieParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DangieParser.EOF, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9066240L) != 0)) {
				{
				{
				setState(24);
				instruccion();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public ConfPinContext confPin() {
			return getRuleContext(ConfPinContext.class,0);
		}
		public ActuadorPinContext actuadorPin() {
			return getRuleContext(ActuadorPinContext.class,0);
		}
		public LecturaSensorContext lecturaSensor() {
			return getRuleContext(LecturaSensorContext.class,0);
		}
		public DeclaracionVarContext declaracionVar() {
			return getRuleContext(DeclaracionVarContext.class,0);
		}
		public AsignacionVarContext asignacionVar() {
			return getRuleContext(AsignacionVarContext.class,0);
		}
		public BucleWhenContext bucleWhen() {
			return getRuleContext(BucleWhenContext.class,0);
		}
		public BucleLoopContext bucleLoop() {
			return getRuleContext(BucleLoopContext.class,0);
		}
		public FuncionwaitContext funcionwait() {
			return getRuleContext(FuncionwaitContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONF:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				confPin();
				}
				break;
			case PIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				actuadorPin();
				}
				break;
			case TIPO_LECTURA:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				lecturaSensor();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				declaracionVar();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				asignacionVar();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				bucleWhen();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 7);
				{
				setState(38);
				bucleLoop();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 8);
				{
				setState(39);
				funcionwait();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionVarContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(DangieParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(DangieParser.ID, 0); }
		public DeclaracionVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionVar; }
	}

	public final DeclaracionVarContext declaracionVar() throws RecognitionException {
		DeclaracionVarContext _localctx = new DeclaracionVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracionVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(TIPO);
			setState(43);
			match(ID);
			setState(44);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DangieParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public AsignacionVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionVar; }
	}

	public final AsignacionVarContext asignacionVar() throws RecognitionException {
		AsignacionVarContext _localctx = new AsignacionVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacionVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ID);
			setState(47);
			match(T__1);
			setState(48);
			valor();
			setState(49);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public TerminalNode POINT() { return getToken(DangieParser.POINT, 0); }
		public TerminalNode HL() { return getToken(DangieParser.HL, 0); }
		public TerminalNode ID() { return getToken(DangieParser.ID, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14942208L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConfPinContext extends ParserRuleContext {
		public TerminalNode CONF() { return getToken(DangieParser.CONF, 0); }
		public TerminalNode PIN() { return getToken(DangieParser.PIN, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public TerminalNode MODO() { return getToken(DangieParser.MODO, 0); }
		public ConfPinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_confPin; }
	}

	public final ConfPinContext confPin() throws RecognitionException {
		ConfPinContext _localctx = new ConfPinContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_confPin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(CONF);
			setState(54);
			match(PIN);
			setState(55);
			match(NUMB);
			setState(56);
			match(MODO);
			setState(57);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActuadorPinContext extends ParserRuleContext {
		public TerminalNode PIN() { return getToken(DangieParser.PIN, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public TerminalNode ESTADO() { return getToken(DangieParser.ESTADO, 0); }
		public ActuadorPinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actuadorPin; }
	}

	public final ActuadorPinContext actuadorPin() throws RecognitionException {
		ActuadorPinContext _localctx = new ActuadorPinContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_actuadorPin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(PIN);
			setState(60);
			match(NUMB);
			setState(61);
			match(ESTADO);
			setState(62);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LecturaSensorContext extends ParserRuleContext {
		public TerminalNode TIPO_LECTURA() { return getToken(DangieParser.TIPO_LECTURA, 0); }
		public TerminalNode PIN() { return getToken(DangieParser.PIN, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public LecturaSensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecturaSensor; }
	}

	public final LecturaSensorContext lecturaSensor() throws RecognitionException {
		LecturaSensorContext _localctx = new LecturaSensorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lecturaSensor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(TIPO_LECTURA);
			setState(65);
			match(T__2);
			setState(66);
			match(PIN);
			setState(67);
			match(NUMB);
			setState(68);
			match(T__3);
			setState(69);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucleWhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(DangieParser.WHEN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(DangieParser.THEN, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BucleWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucleWhen; }
	}

	public final BucleWhenContext bucleWhen() throws RecognitionException {
		BucleWhenContext _localctx = new BucleWhenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bucleWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(WHEN);
			setState(72);
			match(T__4);
			setState(73);
			expresion();
			setState(74);
			match(T__5);
			setState(75);
			match(THEN);
			setState(76);
			match(T__2);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9066240L) != 0)) {
				{
				{
				setState(77);
				instruccion();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(T__3);
			setState(84);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucleLoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(DangieParser.LOOP, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BucleLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucleLoop; }
	}

	public final BucleLoopContext bucleLoop() throws RecognitionException {
		BucleLoopContext _localctx = new BucleLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bucleLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(LOOP);
			setState(87);
			match(T__2);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9066240L) != 0)) {
				{
				{
				setState(88);
				instruccion();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__3);
			setState(95);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionwaitContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(DangieParser.WAIT, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public FuncionwaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionwait; }
	}

	public final FuncionwaitContext funcionwait() throws RecognitionException {
		FuncionwaitContext _localctx = new FuncionwaitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcionwait);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(WAIT);
			setState(98);
			match(T__4);
			setState(99);
			match(NUMB);
			setState(100);
			match(T__5);
			setState(101);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode PIN() { return getToken(DangieParser.PIN, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public TerminalNode ESTADO() { return getToken(DangieParser.ESTADO, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode OP_COMP() { return getToken(DangieParser.OP_COMP, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresion);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(PIN);
				setState(104);
				match(NUMB);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(105);
					match(T__6);
					}
				}

				setState(108);
				match(ESTADO);
				}
				break;
			case HL:
			case POINT:
			case NUMB:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				valor();
				setState(110);
				match(OP_COMP);
				setState(111);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019t\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bO\b\b\n\b\f\bR\t\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\tZ\b\t\n\t\f\t]\t\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000bk\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000br\b\u000b\u0001\u000b"+
		"\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0000\u0001\u0002\u0000\u0012\u0012\u0015\u0017s\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000"+
		"\u0006.\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\n5\u0001\u0000"+
		"\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000e@\u0001\u0000\u0000\u0000"+
		"\u0010G\u0001\u0000\u0000\u0000\u0012V\u0001\u0000\u0000\u0000\u0014a"+
		"\u0001\u0000\u0000\u0000\u0016q\u0001\u0000\u0000\u0000\u0018\u001a\u0003"+
		"\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001"+
		"\u0000\u0000\u0000 )\u0003\n\u0005\u0000!)\u0003\f\u0006\u0000\")\u0003"+
		"\u000e\u0007\u0000#)\u0003\u0004\u0002\u0000$)\u0003\u0006\u0003\u0000"+
		"%)\u0003\u0010\b\u0000&)\u0003\u0012\t\u0000\')\u0003\u0014\n\u0000( "+
		"\u0001\u0000\u0000\u0000(!\u0001\u0000\u0000\u0000(\"\u0001\u0000\u0000"+
		"\u0000(#\u0001\u0000\u0000\u0000($\u0001\u0000\u0000\u0000(%\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0003"+
		"\u0001\u0000\u0000\u0000*+\u0005\u000e\u0000\u0000+,\u0005\u0017\u0000"+
		"\u0000,-\u0005\u0001\u0000\u0000-\u0005\u0001\u0000\u0000\u0000./\u0005"+
		"\u0017\u0000\u0000/0\u0005\u0002\u0000\u000001\u0003\b\u0004\u000012\u0005"+
		"\u0001\u0000\u00002\u0007\u0001\u0000\u0000\u000034\u0007\u0000\u0000"+
		"\u00004\t\u0001\u0000\u0000\u000056\u0005\b\u0000\u000067\u0005\t\u0000"+
		"\u000078\u0005\u0016\u0000\u000089\u0005\u000f\u0000\u00009:\u0005\u0001"+
		"\u0000\u0000:\u000b\u0001\u0000\u0000\u0000;<\u0005\t\u0000\u0000<=\u0005"+
		"\u0016\u0000\u0000=>\u0005\u0010\u0000\u0000>?\u0005\u0001\u0000\u0000"+
		"?\r\u0001\u0000\u0000\u0000@A\u0005\u0011\u0000\u0000AB\u0005\u0003\u0000"+
		"\u0000BC\u0005\t\u0000\u0000CD\u0005\u0016\u0000\u0000DE\u0005\u0004\u0000"+
		"\u0000EF\u0005\u0001\u0000\u0000F\u000f\u0001\u0000\u0000\u0000GH\u0005"+
		"\n\u0000\u0000HI\u0005\u0005\u0000\u0000IJ\u0003\u0016\u000b\u0000JK\u0005"+
		"\u0006\u0000\u0000KL\u0005\u000b\u0000\u0000LP\u0005\u0003\u0000\u0000"+
		"MO\u0003\u0002\u0001\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\u0004\u0000\u0000TU\u0005"+
		"\u0001\u0000\u0000U\u0011\u0001\u0000\u0000\u0000VW\u0005\f\u0000\u0000"+
		"W[\u0005\u0003\u0000\u0000XZ\u0003\u0002\u0001\u0000YX\u0001\u0000\u0000"+
		"\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005"+
		"\u0004\u0000\u0000_`\u0005\u0001\u0000\u0000`\u0013\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0013\u0000\u0000bc\u0005\u0005\u0000\u0000cd\u0005\u0016"+
		"\u0000\u0000de\u0005\u0006\u0000\u0000ef\u0005\u0001\u0000\u0000f\u0015"+
		"\u0001\u0000\u0000\u0000gh\u0005\t\u0000\u0000hj\u0005\u0016\u0000\u0000"+
		"ik\u0005\u0007\u0000\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000lr\u0005\u0010\u0000\u0000mn\u0003\b\u0004"+
		"\u0000no\u0005\u0014\u0000\u0000op\u0003\b\u0004\u0000pr\u0001\u0000\u0000"+
		"\u0000qg\u0001\u0000\u0000\u0000qm\u0001\u0000\u0000\u0000r\u0017\u0001"+
		"\u0000\u0000\u0000\u0006\u001b(P[jq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}