// Generated from Dangie.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DangieLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CONF=8, PIN=9, 
		WHEN=10, THEN=11, ELSE=12, LOOP=13, WHILE=14, TIPO=15, MODO=16, ESTADO=17, 
		TIPO_LECTURA=18, HL=19, WAIT=20, OP_COMP=21, POINT=22, NUMB=23, ID=24, 
		COMMENT=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "CONF", "PIN", 
		"WHEN", "THEN", "ELSE", "LOOP", "WHILE", "TIPO", "MODO", "ESTADO", "TIPO_LECTURA", 
		"HL", "WAIT", "OP_COMP", "POINT", "NUMB", "ID", "COMMENT", "WS"
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


	public DangieLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Dangie.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00d6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nR\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20y\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0080\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0087\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0093\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u009c\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ac\n\26\3\27\6\27\u00af\n"+
		"\27\r\27\16\27\u00b0\3\27\3\27\6\27\u00b5\n\27\r\27\16\27\u00b6\3\30\6"+
		"\30\u00ba\n\30\r\30\16\30\u00bb\3\31\3\31\7\31\u00c0\n\31\f\31\16\31\u00c3"+
		"\13\31\3\32\3\32\3\32\3\32\7\32\u00c9\n\32\f\32\16\32\u00cc\13\32\3\32"+
		"\3\32\3\33\6\33\u00d1\n\33\r\33\16\33\u00d2\3\33\3\33\2\2\34\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\b\4\2>>@@\3\2\62;"+
		"\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00e6\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2"+
		"\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21F\3\2\2\2\23Q\3\2"+
		"\2\2\25S\3\2\2\2\27X\3\2\2\2\31]\3\2\2\2\33b\3\2\2\2\35g\3\2\2\2\37x\3"+
		"\2\2\2!\177\3\2\2\2#\u0086\3\2\2\2%\u0092\3\2\2\2\'\u009b\3\2\2\2)\u009d"+
		"\3\2\2\2+\u00ab\3\2\2\2-\u00ae\3\2\2\2/\u00b9\3\2\2\2\61\u00bd\3\2\2\2"+
		"\63\u00c4\3\2\2\2\65\u00d0\3\2\2\2\678\7=\2\28\4\3\2\2\29:\7?\2\2:\6\3"+
		"\2\2\2;<\7}\2\2<\b\3\2\2\2=>\7\177\2\2>\n\3\2\2\2?@\7*\2\2@\f\3\2\2\2"+
		"AB\7+\2\2B\16\3\2\2\2CD\7k\2\2DE\7u\2\2E\20\3\2\2\2FG\7E\2\2GH\7Q\2\2"+
		"HI\7P\2\2IJ\7H\2\2J\22\3\2\2\2KL\7R\2\2LM\7k\2\2MR\7p\2\2NO\7R\2\2OP\7"+
		"K\2\2PR\7P\2\2QK\3\2\2\2QN\3\2\2\2R\24\3\2\2\2ST\7Y\2\2TU\7J\2\2UV\7G"+
		"\2\2VW\7P\2\2W\26\3\2\2\2XY\7V\2\2YZ\7J\2\2Z[\7G\2\2[\\\7P\2\2\\\30\3"+
		"\2\2\2]^\7G\2\2^_\7N\2\2_`\7U\2\2`a\7G\2\2a\32\3\2\2\2bc\7N\2\2cd\7Q\2"+
		"\2de\7Q\2\2ef\7R\2\2f\34\3\2\2\2gh\7Y\2\2hi\7J\2\2ij\7K\2\2jk\7N\2\2k"+
		"l\7G\2\2l\36\3\2\2\2mn\7P\2\2no\7W\2\2op\7O\2\2py\7D\2\2qr\7J\2\2ry\7"+
		"N\2\2st\7R\2\2tu\7Q\2\2uv\7K\2\2vw\7P\2\2wy\7V\2\2xm\3\2\2\2xq\3\2\2\2"+
		"xs\3\2\2\2y \3\2\2\2z{\7K\2\2{\u0080\7P\2\2|}\7Q\2\2}~\7W\2\2~\u0080\7"+
		"V\2\2\177z\3\2\2\2\177|\3\2\2\2\u0080\"\3\2\2\2\u0081\u0082\7Q\2\2\u0082"+
		"\u0087\7P\2\2\u0083\u0084\7Q\2\2\u0084\u0085\7H\2\2\u0085\u0087\7H\2\2"+
		"\u0086\u0081\3\2\2\2\u0086\u0083\3\2\2\2\u0087$\3\2\2\2\u0088\u0089\7"+
		"C\2\2\u0089\u008a\7T\2\2\u008a\u008b\7G\2\2\u008b\u008c\7C\2\2\u008c\u0093"+
		"\7F\2\2\u008d\u008e\7F\2\2\u008e\u008f\7T\2\2\u008f\u0090\7G\2\2\u0090"+
		"\u0091\7C\2\2\u0091\u0093\7F\2\2\u0092\u0088\3\2\2\2\u0092\u008d\3\2\2"+
		"\2\u0093&\3\2\2\2\u0094\u0095\7J\2\2\u0095\u0096\7K\2\2\u0096\u0097\7"+
		"I\2\2\u0097\u009c\7J\2\2\u0098\u0099\7N\2\2\u0099\u009a\7Q\2\2\u009a\u009c"+
		"\7Y\2\2\u009b\u0094\3\2\2\2\u009b\u0098\3\2\2\2\u009c(\3\2\2\2\u009d\u009e"+
		"\7Y\2\2\u009e\u009f\7C\2\2\u009f\u00a0\7K\2\2\u00a0\u00a1\7V\2\2\u00a1"+
		"*\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3\u00ac\7?\2\2\u00a4\u00a5\7#\2\2\u00a5"+
		"\u00ac\7?\2\2\u00a6\u00a7\7@\2\2\u00a7\u00ac\7?\2\2\u00a8\u00a9\7>\2\2"+
		"\u00a9\u00ac\7?\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a4"+
		"\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		",\3\2\2\2\u00ad\u00af\t\3\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4"+
		"\7\60\2\2\u00b3\u00b5\t\3\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7.\3\2\2\2\u00b8\u00ba\t"+
		"\3\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\60\3\2\2\2\u00bd\u00c1\t\4\2\2\u00be\u00c0\t\5\2"+
		"\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\62\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5"+
		"\u00c6\7\61\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c9\n\6\2\2\u00c8\u00c7\3"+
		"\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b\32\2\2\u00ce\64\3\2\2"+
		"\2\u00cf\u00d1\t\7\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\33\2\2"+
		"\u00d5\66\3\2\2\2\20\2Qx\177\u0086\u0092\u009b\u00ab\u00b0\u00b6\u00bb"+
		"\u00c1\u00ca\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}