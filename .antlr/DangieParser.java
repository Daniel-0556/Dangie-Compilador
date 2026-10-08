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
		HL=18, OP_COMP=19, POINT=20, NUMB=21, ID=22, COMMENT=23, WS=24;
	public static final int
		RULE_program = 0, RULE_instruccion = 1, RULE_declaracionVar = 2, RULE_asignacionVar = 3, 
		RULE_valor = 4, RULE_confPin = 5, RULE_actuadorPin = 6, RULE_lecturaSensor = 7, 
		RULE_bucleWhen = 8, RULE_bucleLoop = 9, RULE_expresion = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruccion", "declaracionVar", "asignacionVar", "valor", 
			"confPin", "actuadorPin", "lecturaSensor", "bucleWhen", "bucleLoop", 
			"expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'{'", "'}'", "'('", "')'", "'is'", "'CONF'", "'Pin'", 
			"'WHEN'", "'THEN'", "'LOOP'", "'WHILE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "CONF", "PIN", "WHEN", 
			"THEN", "LOOP", "WHILE", "TIPO", "MODO", "ESTADO", "TIPO_LECTURA", "HL", 
			"OP_COMP", "POINT", "NUMB", "ID", "COMMENT", "WS"
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4347648L) != 0)) {
				{
				{
				setState(22);
				instruccion();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONF:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				confPin();
				}
				break;
			case PIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				actuadorPin();
				}
				break;
			case TIPO_LECTURA:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				lecturaSensor();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				declaracionVar();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				asignacionVar();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				bucleWhen();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 7);
				{
				setState(36);
				bucleLoop();
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
			setState(39);
			match(TIPO);
			setState(40);
			match(ID);
			setState(41);
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
			setState(43);
			match(ID);
			setState(44);
			match(T__1);
			setState(45);
			valor();
			setState(46);
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
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7602176L) != 0)) ) {
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
			setState(50);
			match(CONF);
			setState(51);
			match(PIN);
			setState(52);
			match(NUMB);
			setState(53);
			match(MODO);
			setState(54);
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
			setState(56);
			match(PIN);
			setState(57);
			match(NUMB);
			setState(58);
			match(ESTADO);
			setState(59);
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
			setState(61);
			match(TIPO_LECTURA);
			setState(62);
			match(T__2);
			setState(63);
			match(PIN);
			setState(64);
			match(NUMB);
			setState(65);
			match(T__3);
			setState(66);
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
			setState(68);
			match(WHEN);
			setState(69);
			match(T__4);
			setState(70);
			expresion();
			setState(71);
			match(T__5);
			setState(72);
			match(THEN);
			setState(73);
			match(T__2);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4347648L) != 0)) {
				{
				{
				setState(74);
				instruccion();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__3);
			setState(81);
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
			setState(83);
			match(LOOP);
			setState(84);
			match(T__2);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4347648L) != 0)) {
				{
				{
				setState(85);
				instruccion();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__3);
			setState(92);
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
		enterRule(_localctx, 20, RULE_expresion);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(PIN);
				setState(95);
				match(NUMB);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(96);
					match(T__6);
					}
				}

				setState(99);
				match(ESTADO);
				}
				break;
			case HL:
			case POINT:
			case NUMB:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				valor();
				setState(101);
				match(OP_COMP);
				setState(102);
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
		"\u0004\u0001\u0018k\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001&\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\bL\b\b\n\b\f\bO\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005"+
		"\tW\b\t\n\t\f\tZ\t\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003"+
		"\nb\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\ni\b\n\u0001\n\u0000"+
		"\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000"+
		"\u0001\u0002\u0000\u0012\u0012\u0014\u0016j\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0002%\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000"+
		"\u0006+\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\n2\u0001\u0000"+
		"\u0000\u0000\f8\u0001\u0000\u0000\u0000\u000e=\u0001\u0000\u0000\u0000"+
		"\u0010D\u0001\u0000\u0000\u0000\u0012S\u0001\u0000\u0000\u0000\u0014h"+
		"\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c"+
		"\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\u0000\u0000\u0001\u001d\u0001\u0001\u0000\u0000\u0000\u001e&\u0003"+
		"\n\u0005\u0000\u001f&\u0003\f\u0006\u0000 &\u0003\u000e\u0007\u0000!&"+
		"\u0003\u0004\u0002\u0000\"&\u0003\u0006\u0003\u0000#&\u0003\u0010\b\u0000"+
		"$&\u0003\u0012\t\u0000%\u001e\u0001\u0000\u0000\u0000%\u001f\u0001\u0000"+
		"\u0000\u0000% \u0001\u0000\u0000\u0000%!\u0001\u0000\u0000\u0000%\"\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000"+
		"&\u0003\u0001\u0000\u0000\u0000\'(\u0005\u000e\u0000\u0000()\u0005\u0016"+
		"\u0000\u0000)*\u0005\u0001\u0000\u0000*\u0005\u0001\u0000\u0000\u0000"+
		"+,\u0005\u0016\u0000\u0000,-\u0005\u0002\u0000\u0000-.\u0003\b\u0004\u0000"+
		"./\u0005\u0001\u0000\u0000/\u0007\u0001\u0000\u0000\u000001\u0007\u0000"+
		"\u0000\u00001\t\u0001\u0000\u0000\u000023\u0005\b\u0000\u000034\u0005"+
		"\t\u0000\u000045\u0005\u0015\u0000\u000056\u0005\u000f\u0000\u000067\u0005"+
		"\u0001\u0000\u00007\u000b\u0001\u0000\u0000\u000089\u0005\t\u0000\u0000"+
		"9:\u0005\u0015\u0000\u0000:;\u0005\u0010\u0000\u0000;<\u0005\u0001\u0000"+
		"\u0000<\r\u0001\u0000\u0000\u0000=>\u0005\u0011\u0000\u0000>?\u0005\u0003"+
		"\u0000\u0000?@\u0005\t\u0000\u0000@A\u0005\u0015\u0000\u0000AB\u0005\u0004"+
		"\u0000\u0000BC\u0005\u0001\u0000\u0000C\u000f\u0001\u0000\u0000\u0000"+
		"DE\u0005\n\u0000\u0000EF\u0005\u0005\u0000\u0000FG\u0003\u0014\n\u0000"+
		"GH\u0005\u0006\u0000\u0000HI\u0005\u000b\u0000\u0000IM\u0005\u0003\u0000"+
		"\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0004\u0000\u0000"+
		"QR\u0005\u0001\u0000\u0000R\u0011\u0001\u0000\u0000\u0000ST\u0005\f\u0000"+
		"\u0000TX\u0005\u0003\u0000\u0000UW\u0003\u0002\u0001\u0000VU\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u0004\u0000\u0000\\]\u0005\u0001\u0000\u0000]\u0013\u0001\u0000"+
		"\u0000\u0000^_\u0005\t\u0000\u0000_a\u0005\u0015\u0000\u0000`b\u0005\u0007"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ci\u0005\u0010\u0000\u0000de\u0003\b\u0004\u0000ef\u0005"+
		"\u0013\u0000\u0000fg\u0003\b\u0004\u0000gi\u0001\u0000\u0000\u0000h^\u0001"+
		"\u0000\u0000\u0000hd\u0001\u0000\u0000\u0000i\u0015\u0001\u0000\u0000"+
		"\u0000\u0006\u0019%MXah";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}