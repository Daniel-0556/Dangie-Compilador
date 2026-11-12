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
		WHEN=10, THEN=11, ELSE=12, LOOP=13, WHILE=14, TIPO=15, MODO=16, ESTADO=17, 
		TIPO_LECTURA=18, HL=19, WAIT=20, OP_COMP=21, POINT=22, NUMB=23, ID=24, 
		COMMENT=25, WS=26;
	public static final int
		RULE_program = 0, RULE_instruccion = 1, RULE_declaracionVar = 2, RULE_asignacionVar = 3, 
		RULE_valor = 4, RULE_confPin = 5, RULE_actuadorPin = 6, RULE_lecturaSensor = 7, 
		RULE_lecturaPin = 8, RULE_bucleWhen = 9, RULE_bloqueWhen = 10, RULE_bucleLoop = 11, 
		RULE_funcionwait = 12, RULE_expresion = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruccion", "declaracionVar", "asignacionVar", "valor", 
			"confPin", "actuadorPin", "lecturaSensor", "lecturaPin", "bucleWhen", 
			"bloqueWhen", "bucleLoop", "funcionwait", "expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'{'", "'}'", "'('", "')'", "'is'", "'CONF'", null, 
			"'WHEN'", "'THEN'", "'ELSE'", "'LOOP'", "'WHILE'", null, null, null, 
			null, null, "'WAIT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "CONF", "PIN", "WHEN", 
			"THEN", "ELSE", "LOOP", "WHILE", "TIPO", "MODO", "ESTADO", "TIPO_LECTURA", 
			"HL", "WAIT", "OP_COMP", "POINT", "NUMB", "ID", "COMMENT", "WS"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18130688L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActuadorPinContext extends ParserRuleContext {
		public TerminalNode PIN() { return getToken(DangieParser.PIN, 0); }
		public TerminalNode ESTADO() { return getToken(DangieParser.ESTADO, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public TerminalNode ID() { return getToken(DangieParser.ID, 0); }
		public ActuadorPinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actuadorPin; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class LecturaPinContext extends ParserRuleContext {
		public TerminalNode TIPO_LECTURA() { return getToken(DangieParser.TIPO_LECTURA, 0); }
		public TerminalNode ID() { return getToken(DangieParser.ID, 0); }
		public TerminalNode NUMB() { return getToken(DangieParser.NUMB, 0); }
		public LecturaPinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecturaPin; }
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18130688L) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18130688L) != 0)) {
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
		"\u0004\u0001\u001a\u0089\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004=\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t_\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0005\ne\b\n\n\n\f\nh\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000bo\b\u000b\n\u000b\f\u000br\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u0080\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0087\b\r\u0001\r\u0000\u0000\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001"+
		"\u0001\u0000\u0017\u0018\u008b\u0000\u001f\u0001\u0000\u0000\u0000\u0002"+
		",\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u00062\u0001"+
		"\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\n>\u0001\u0000\u0000\u0000"+
		"\fD\u0001\u0000\u0000\u0000\u000eI\u0001\u0000\u0000\u0000\u0010P\u0001"+
		"\u0000\u0000\u0000\u0012U\u0001\u0000\u0000\u0000\u0014b\u0001\u0000\u0000"+
		"\u0000\u0016k\u0001\u0000\u0000\u0000\u0018v\u0001\u0000\u0000\u0000\u001a"+
		"\u0086\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0000\u0000\u0001"+
		"#\u0001\u0001\u0000\u0000\u0000$-\u0003\n\u0005\u0000%-\u0003\f\u0006"+
		"\u0000&-\u0003\u000e\u0007\u0000\'-\u0003\u0004\u0002\u0000(-\u0003\u0006"+
		"\u0003\u0000)-\u0003\u0012\t\u0000*-\u0003\u0016\u000b\u0000+-\u0003\u0018"+
		"\f\u0000,$\u0001\u0000\u0000\u0000,%\u0001\u0000\u0000\u0000,&\u0001\u0000"+
		"\u0000\u0000,\'\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000,)\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000"+
		"-\u0003\u0001\u0000\u0000\u0000./\u0005\u000f\u0000\u0000/0\u0005\u0018"+
		"\u0000\u000001\u0005\u0001\u0000\u00001\u0005\u0001\u0000\u0000\u0000"+
		"23\u0005\u0018\u0000\u000034\u0005\u0002\u0000\u000045\u0003\b\u0004\u0000"+
		"56\u0005\u0001\u0000\u00006\u0007\u0001\u0000\u0000\u00007=\u0005\u0017"+
		"\u0000\u00008=\u0005\u0016\u0000\u00009=\u0005\u0013\u0000\u0000:=\u0005"+
		"\u0018\u0000\u0000;=\u0003\u0010\b\u0000<7\u0001\u0000\u0000\u0000<8\u0001"+
		"\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<;\u0001\u0000\u0000\u0000=\t\u0001\u0000\u0000\u0000>?\u0005\b\u0000"+
		"\u0000?@\u0005\t\u0000\u0000@A\u0007\u0000\u0000\u0000AB\u0005\u0010\u0000"+
		"\u0000BC\u0005\u0001\u0000\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0005"+
		"\t\u0000\u0000EF\u0007\u0000\u0000\u0000FG\u0005\u0011\u0000\u0000GH\u0005"+
		"\u0001\u0000\u0000H\r\u0001\u0000\u0000\u0000IJ\u0005\u0012\u0000\u0000"+
		"JK\u0005\u0003\u0000\u0000KL\u0005\t\u0000\u0000LM\u0005\u0017\u0000\u0000"+
		"MN\u0005\u0004\u0000\u0000NO\u0005\u0001\u0000\u0000O\u000f\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0012\u0000\u0000QR\u0005\u0005\u0000\u0000RS\u0007"+
		"\u0000\u0000\u0000ST\u0005\u0006\u0000\u0000T\u0011\u0001\u0000\u0000"+
		"\u0000UV\u0005\n\u0000\u0000VW\u0005\u0005\u0000\u0000WX\u0003\u001a\r"+
		"\u0000XY\u0005\u0006\u0000\u0000YZ\u0005\u000b\u0000\u0000Z^\u0003\u0014"+
		"\n\u0000[\\\u0005\u0001\u0000\u0000\\]\u0005\f\u0000\u0000]_\u0003\u0014"+
		"\n\u0000^[\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`a\u0005\u0001\u0000\u0000a\u0013\u0001\u0000\u0000\u0000"+
		"bf\u0005\u0003\u0000\u0000ce\u0003\u0002\u0001\u0000dc\u0001\u0000\u0000"+
		"\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005"+
		"\u0004\u0000\u0000j\u0015\u0001\u0000\u0000\u0000kl\u0005\r\u0000\u0000"+
		"lp\u0005\u0003\u0000\u0000mo\u0003\u0002\u0001\u0000nm\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005"+
		"\u0004\u0000\u0000tu\u0005\u0001\u0000\u0000u\u0017\u0001\u0000\u0000"+
		"\u0000vw\u0005\u0014\u0000\u0000wx\u0005\u0005\u0000\u0000xy\u0005\u0017"+
		"\u0000\u0000yz\u0005\u0006\u0000\u0000z{\u0005\u0001\u0000\u0000{\u0019"+
		"\u0001\u0000\u0000\u0000|}\u0005\t\u0000\u0000}\u007f\u0005\u0017\u0000"+
		"\u0000~\u0080\u0005\u0007\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0087\u0005\u0011\u0000\u0000\u0082\u0083\u0003\b\u0004\u0000\u0083\u0084"+
		"\u0005\u0015\u0000\u0000\u0084\u0085\u0003\b\u0004\u0000\u0085\u0087\u0001"+
		"\u0000\u0000\u0000\u0086|\u0001\u0000\u0000\u0000\u0086\u0082\u0001\u0000"+
		"\u0000\u0000\u0087\u001b\u0001\u0000\u0000\u0000\b\u001f,<^fp\u007f\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}