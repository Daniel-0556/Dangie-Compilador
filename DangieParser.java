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
		WHEN=10, THEN=11, ELSE=12, LOOP=13, WHILE=14, TIPO=15, MODO=16, ESTADO=17, 
		TIPO_LECTURA=18, HL=19, WAIT=20, OP_COMP=21, POINT=22, NUMB=23, ID=24, 
		COMMENT=25, WS=26;
	public static final int
		RULE_program = 0, RULE_instruccion = 1, RULE_declaracionVar = 2, RULE_asignacionVar = 3, 
		RULE_valor = 4, RULE_confPin = 5, RULE_actuadorPin = 6, RULE_lecturaSensor = 7, 
		RULE_lecturaPin = 8, RULE_bucleWhen = 9, RULE_bloqueWhen = 10, RULE_bucleLoop = 11, 
		RULE_funcionwait = 12, RULE_expresion = 13;
	public static final String[] ruleNames = {
		"program", "instruccion", "declaracionVar", "asignacionVar", "valor", 
		"confPin", "actuadorPin", "lecturaSensor", "lecturaPin", "bucleWhen", 
		"bloqueWhen", "bucleLoop", "funcionwait", "expresion"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'{'", "'}'", "'('", "')'", "'is'", "'CONF'", null, 
		"'WHEN'", "'THEN'", "'ELSE'", "'LOOP'", "'WHILE'", null, null, null, null, 
		null, "'WAIT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "CONF", "PIN", "WHEN", 
		"THEN", "ELSE", "LOOP", "WHILE", "TIPO", "MODO", "ESTADO", "TIPO_LECTURA", 
		"HL", "WAIT", "OP_COMP", "POINT", "NUMB", "ID", "COMMENT", "WS"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONF) | (1L << PIN) | (1L << WHEN) | (1L << LOOP) | (1L << TIPO) | (1L << TIPO_LECTURA) | (1L << WAIT) | (1L << ID))) != 0)) {
				{
				{
				setState(28);
				instruccion();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
		public FuncionwaitContext funcionwait() {
			return getRuleContext(FuncionwaitContext.class,0);
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONF:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				confPin();
				}
				break;
			case PIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				actuadorPin();
				}
				break;
			case TIPO_LECTURA:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				lecturaSensor();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				declaracionVar();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				asignacionVar();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				bucleWhen();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				bucleLoop();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 8);
				{
				setState(43);
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
			setState(46);
			match(TIPO);
			setState(47);
			match(ID);
			setState(48);
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
			setState(50);
			match(ID);
			setState(51);
			match(T__1);
			setState(52);
			valor();
			setState(53);
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
		public LecturaPinContext lecturaPin() {
			return getRuleContext(LecturaPinContext.class,0);
		}
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
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMB:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(NUMB);
				}
				break;
			case POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(POINT);
				}
				break;
			case HL:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(HL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(ID);
				}
				break;
			case TIPO_LECTURA:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				lecturaPin();
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

	public static class ConfPinContext extends ParserRuleContext {
		public TerminalNode CONF() { return getToken(DangieParser.CONF, 0); }
		public TerminalNode PIN() { return getToken(DangieParser.PIN, 0); }
		public TerminalNode MODO() { return getToken(DangieParser.MODO, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public TerminalNode ID() { return getToken(DangieParser.ID, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(CONF);
			setState(63);
			match(PIN);
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==NUMB || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			match(MODO);
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

	public static class ActuadorPinContext extends ParserRuleContext {
		public TerminalNode PIN() { return getToken(DangieParser.PIN, 0); }
		public TerminalNode ESTADO() { return getToken(DangieParser.ESTADO, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public TerminalNode ID() { return getToken(DangieParser.ID, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(PIN);
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==NUMB || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			match(ESTADO);
			setState(71);
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
			setState(73);
			match(TIPO_LECTURA);
			setState(74);
			match(T__2);
			setState(75);
			match(PIN);
			setState(76);
			match(NUMB);
			setState(77);
			match(T__3);
			setState(78);
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

	public static class LecturaPinContext extends ParserRuleContext {
		public TerminalNode TIPO_LECTURA() { return getToken(DangieParser.TIPO_LECTURA, 0); }
		public TerminalNode ID() { return getToken(DangieParser.ID, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public LecturaPinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecturaPin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterLecturaPin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitLecturaPin(this);
		}
	}

	public final LecturaPinContext lecturaPin() throws RecognitionException {
		LecturaPinContext _localctx = new LecturaPinContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lecturaPin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(TIPO_LECTURA);
			setState(81);
			match(T__4);
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==NUMB || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(83);
			match(T__5);
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
		public List<BloqueWhenContext> bloqueWhen() {
			return getRuleContexts(BloqueWhenContext.class);
		}
		public BloqueWhenContext bloqueWhen(int i) {
			return getRuleContext(BloqueWhenContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DangieParser.ELSE, 0); }
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
		enterRule(_localctx, 18, RULE_bucleWhen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(WHEN);
			setState(86);
			match(T__4);
			setState(87);
			expresion();
			setState(88);
			match(T__5);
			setState(89);
			match(THEN);
			setState(90);
			bloqueWhen();
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(91);
				match(T__0);
				setState(92);
				match(ELSE);
				setState(93);
				bloqueWhen();
				}
				break;
			}
			setState(96);
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

	public static class BloqueWhenContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BloqueWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterBloqueWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitBloqueWhen(this);
		}
	}

	public final BloqueWhenContext bloqueWhen() throws RecognitionException {
		BloqueWhenContext _localctx = new BloqueWhenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloqueWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__2);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONF) | (1L << PIN) | (1L << WHEN) | (1L << LOOP) | (1L << TIPO) | (1L << TIPO_LECTURA) | (1L << WAIT) | (1L << ID))) != 0)) {
				{
				{
				setState(99);
				instruccion();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(T__3);
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
		enterRule(_localctx, 22, RULE_bucleLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(LOOP);
			setState(108);
			match(T__2);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONF) | (1L << PIN) | (1L << WHEN) | (1L << LOOP) | (1L << TIPO) | (1L << TIPO_LECTURA) | (1L << WAIT) | (1L << ID))) != 0)) {
				{
				{
				setState(109);
				instruccion();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__3);
			setState(116);
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

	public static class FuncionwaitContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(DangieParser.WAIT, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public FuncionwaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionwait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).enterFuncionwait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DangieListener ) ((DangieListener)listener).exitFuncionwait(this);
		}
	}

	public final FuncionwaitContext funcionwait() throws RecognitionException {
		FuncionwaitContext _localctx = new FuncionwaitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcionwait);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(WAIT);
			setState(119);
			match(T__4);
			setState(120);
			match(NUMB);
			setState(121);
			match(T__5);
			setState(122);
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
		enterRule(_localctx, 26, RULE_expresion);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(PIN);
				setState(125);
				match(NUMB);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(126);
					match(T__6);
					}
				}

				setState(129);
				match(ESTADO);
				}
				break;
			case TIPO_LECTURA:
			case HL:
			case POINT:
			case NUMB:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				valor();
				setState(131);
				match(OP_COMP);
				setState(132);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u008b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13a\n\13\3\13\3\13\3\f\3"+
		"\f\7\fg\n\f\f\f\16\fj\13\f\3\f\3\f\3\r\3\r\3\r\7\rq\n\r\f\r\16\rt\13\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u0082\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u0089\n\17\3\17\2\2\20\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\2\3\3\2\31\32\2\u008d\2!\3\2\2\2\4.\3\2\2\2\6\60"+
		"\3\2\2\2\b\64\3\2\2\2\n>\3\2\2\2\f@\3\2\2\2\16F\3\2\2\2\20K\3\2\2\2\22"+
		"R\3\2\2\2\24W\3\2\2\2\26d\3\2\2\2\30m\3\2\2\2\32x\3\2\2\2\34\u0088\3\2"+
		"\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2"+
		"\2\2#!\3\2\2\2$%\7\2\2\3%\3\3\2\2\2&/\5\f\7\2\'/\5\16\b\2(/\5\20\t\2)"+
		"/\5\6\4\2*/\5\b\5\2+/\5\24\13\2,/\5\30\r\2-/\5\32\16\2.&\3\2\2\2.\'\3"+
		"\2\2\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5"+
		"\3\2\2\2\60\61\7\21\2\2\61\62\7\32\2\2\62\63\7\3\2\2\63\7\3\2\2\2\64\65"+
		"\7\32\2\2\65\66\7\4\2\2\66\67\5\n\6\2\678\7\3\2\28\t\3\2\2\29?\7\31\2"+
		"\2:?\7\30\2\2;?\7\25\2\2<?\7\32\2\2=?\5\22\n\2>9\3\2\2\2>:\3\2\2\2>;\3"+
		"\2\2\2><\3\2\2\2>=\3\2\2\2?\13\3\2\2\2@A\7\n\2\2AB\7\13\2\2BC\t\2\2\2"+
		"CD\7\22\2\2DE\7\3\2\2E\r\3\2\2\2FG\7\13\2\2GH\t\2\2\2HI\7\23\2\2IJ\7\3"+
		"\2\2J\17\3\2\2\2KL\7\24\2\2LM\7\5\2\2MN\7\13\2\2NO\7\31\2\2OP\7\6\2\2"+
		"PQ\7\3\2\2Q\21\3\2\2\2RS\7\24\2\2ST\7\7\2\2TU\t\2\2\2UV\7\b\2\2V\23\3"+
		"\2\2\2WX\7\f\2\2XY\7\7\2\2YZ\5\34\17\2Z[\7\b\2\2[\\\7\r\2\2\\`\5\26\f"+
		"\2]^\7\3\2\2^_\7\16\2\2_a\5\26\f\2`]\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\3"+
		"\2\2c\25\3\2\2\2dh\7\5\2\2eg\5\4\3\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\6\2\2l\27\3\2\2\2mn\7\17\2\2nr\7\5\2\2"+
		"oq\5\4\3\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2"+
		"uv\7\6\2\2vw\7\3\2\2w\31\3\2\2\2xy\7\26\2\2yz\7\7\2\2z{\7\31\2\2{|\7\b"+
		"\2\2|}\7\3\2\2}\33\3\2\2\2~\177\7\13\2\2\177\u0081\7\31\2\2\u0080\u0082"+
		"\7\t\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0089\7\23\2\2\u0084\u0085\5\n\6\2\u0085\u0086\7\27\2\2\u0086\u0087\5"+
		"\n\6\2\u0087\u0089\3\2\2\2\u0088~\3\2\2\2\u0088\u0084\3\2\2\2\u0089\35"+
		"\3\2\2\2\n!.>`hr\u0081\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}