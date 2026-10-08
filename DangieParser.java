// Generated from Dangie.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DangieParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
	public static final String[] ruleNames = {
		"program", "instruccion", "declaracionVar", "asignacionVar", "valor", 
		"confPin", "actuadorPin", "lecturaSensor", "bucleWhen", "bucleLoop", "expresion"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'{'", "'}'", "'('", "')'", "'is'", "'CONF'", "'Pin'", 
		"'WHEN'", "'THEN'", "'LOOP'", "'WHILE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "CONF", "PIN", "WHEN", 
		"THEN", "LOOP", "WHILE", "TIPO", "MODO", "ESTADO", "TIPO_LECTURA", "HL", 
		"OP_COMP", "POINT", "NUMB", "ID", "COMMENT", "WS"
	};
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitProgram(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONF) | (1L << PIN) | (1L << WHEN) | (1L << LOOP) | (1L << TIPO) | (1L << TIPO_LECTURA) | (1L << ID))) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitInstruccion(this);
		}
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

	public static class DeclaracionVarContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(DangieParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(DangieParser.ID, 0); }
		public DeclaracionVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterDeclaracionVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitDeclaracionVar(this);
		}
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

	public static class AsignacionVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DangieParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public AsignacionVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterAsignacionVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitAsignacionVar(this);
		}
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public TerminalNode POINT() { return getToken(DangieParser.POINT, 0); }
		public TerminalNode HL() { return getToken(DangieParser.HL, 0); }
		public TerminalNode ID() { return getToken(DangieParser.ID, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitValor(this);
		}
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HL) | (1L << POINT) | (1L << NUMB) | (1L << ID))) != 0)) ) {
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

	public static class ConfPinContext extends ParserRuleContext {
		public TerminalNode CONF() { return getToken(DangieParser.CONF, 0); }
		public TerminalNode PIN() { return getToken(DangieParser.PIN, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public TerminalNode MODO() { return getToken(DangieParser.MODO, 0); }
		public ConfPinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_confPin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterConfPin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitConfPin(this);
		}
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

	public static class ActuadorPinContext extends ParserRuleContext {
		public TerminalNode PIN() { return getToken(DangieParser.PIN, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public TerminalNode ESTADO() { return getToken(DangieParser.ESTADO, 0); }
		public ActuadorPinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actuadorPin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterActuadorPin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitActuadorPin(this);
		}
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

	public static class LecturaSensorContext extends ParserRuleContext {
		public TerminalNode TIPO_LECTURA() { return getToken(DangieParser.TIPO_LECTURA, 0); }
		public TerminalNode PIN() { return getToken(DangieParser.PIN, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public LecturaSensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecturaSensor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterLecturaSensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitLecturaSensor(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterBucleWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitBucleWhen(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONF) | (1L << PIN) | (1L << WHEN) | (1L << LOOP) | (1L << TIPO) | (1L << TIPO_LECTURA) | (1L << ID))) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterBucleLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitBucleLoop(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONF) | (1L << PIN) | (1L << WHEN) | (1L << LOOP) | (1L << TIPO) | (1L << TIPO_LECTURA) | (1L << ID))) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitExpresion(this);
		}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\nN\n\n\f\n\16\nQ\13\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\7\13Y\n\13\f\13\16\13\\\13\13\3\13\3\13\3\13\3\f\3\f\3\f\5\fd\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\fk\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\4\2"+
		"\24\24\26\30\2l\2\33\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b-\3\2\2\2\n\62\3"+
		"\2\2\2\f\64\3\2\2\2\16:\3\2\2\2\20?\3\2\2\2\22F\3\2\2\2\24U\3\2\2\2\26"+
		"j\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34"+
		"\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\2\2\3\37\3\3\2\2\2 (\5\f"+
		"\7\2!(\5\16\b\2\"(\5\20\t\2#(\5\6\4\2$(\5\b\5\2%(\5\22\n\2&(\5\24\13\2"+
		"\' \3\2\2\2\'!\3\2\2\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'"+
		"&\3\2\2\2(\5\3\2\2\2)*\7\20\2\2*+\7\30\2\2+,\7\3\2\2,\7\3\2\2\2-.\7\30"+
		"\2\2./\7\4\2\2/\60\5\n\6\2\60\61\7\3\2\2\61\t\3\2\2\2\62\63\t\2\2\2\63"+
		"\13\3\2\2\2\64\65\7\n\2\2\65\66\7\13\2\2\66\67\7\27\2\2\678\7\21\2\28"+
		"9\7\3\2\29\r\3\2\2\2:;\7\13\2\2;<\7\27\2\2<=\7\22\2\2=>\7\3\2\2>\17\3"+
		"\2\2\2?@\7\23\2\2@A\7\5\2\2AB\7\13\2\2BC\7\27\2\2CD\7\6\2\2DE\7\3\2\2"+
		"E\21\3\2\2\2FG\7\f\2\2GH\7\7\2\2HI\5\26\f\2IJ\7\b\2\2JK\7\r\2\2KO\7\5"+
		"\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2"+
		"\2\2RS\7\6\2\2ST\7\3\2\2T\23\3\2\2\2UV\7\16\2\2VZ\7\5\2\2WY\5\4\3\2XW"+
		"\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\6\2\2"+
		"^_\7\3\2\2_\25\3\2\2\2`a\7\13\2\2ac\7\27\2\2bd\7\t\2\2cb\3\2\2\2cd\3\2"+
		"\2\2de\3\2\2\2ek\7\22\2\2fg\5\n\6\2gh\7\25\2\2hi\5\n\6\2ik\3\2\2\2j`\3"+
		"\2\2\2jf\3\2\2\2k\27\3\2\2\2\b\33\'OZcj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}