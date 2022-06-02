// Generated from C:/Users/Vlada/Downloads/pbl-sem-4/matrixoLang/src/matrixoLang\matrixo.g4 by ANTLR 4.9.2
package matrixoLang;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class matrixoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INBUILT_OPERATION=1, INBUILT_FUNCTION=2, RETURN=3, FOR=4, L_PAR=5, R_PAR=6, 
		SEMICOL=7, ELSE=8, IF=9, L_BRAK=10, L_SQBRAK=11, R_SQBRAK=12, R_BRAK=13, 
		WHILE=14, COMMENT=15, VOID=16, FUNCTION=17, RETURNS=18, BOOL_TYPE=19, 
		INT_TYPE=20, TRUE=21, FALSE=22, DOUBLE_TYPE=23, MATRIX=24, VECTOR=25, 
		BREAK=26, POWER=27, SQRT=28, PREFIX_OP=29, SECOND_ORDER_OP=30, FIRST_ORDER_OP=31, 
		BOOL_OP=32, ASSIGN_OP=33, COMMA=34, DOT=35, NUMBER=36, GET=37, IMPORT=38, 
		FILE_TYPE=39, SPACE=40, FROM=41, IDENTIFIER=42, NAME=43, PATH=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INBUILT_OPERATION", "INBUILT_FUNCTION", "RETURN", "FOR", "L_PAR", "R_PAR", 
			"SEMICOL", "ELSE", "IF", "L_BRAK", "L_SQBRAK", "R_SQBRAK", "R_BRAK", 
			"WHILE", "COMMENT", "VOID", "FUNCTION", "RETURNS", "BOOL_TYPE", "INT_TYPE", 
			"TRUE", "FALSE", "DOUBLE_TYPE", "MATRIX", "VECTOR", "BREAK", "POWER", 
			"SQRT", "PREFIX_OP", "SECOND_ORDER_OP", "FIRST_ORDER_OP", "BOOL_OP", 
			"ASSIGN_OP", "COMMA", "DOT", "NUMBER", "GET", "IMPORT", "FILE_TYPE", 
			"SPACE", "FROM", "IDENTIFIER", "NAME", "PATH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'print'", "'return'", "'for'", "'('", "')'", "';'", "'else'", 
			"'if'", "'{'", "'['", "']'", "'}'", "'while'", null, "'void'", null, 
			null, "'bool'", "'int'", "'true'", "'false'", "'double'", "'matrix'", 
			"'vector'", "'break'", "'**'", "'%%'", null, null, null, null, null, 
			"','", "'.'", null, "'get'", null, null, null, "'from'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INBUILT_OPERATION", "INBUILT_FUNCTION", "RETURN", "FOR", "L_PAR", 
			"R_PAR", "SEMICOL", "ELSE", "IF", "L_BRAK", "L_SQBRAK", "R_SQBRAK", "R_BRAK", 
			"WHILE", "COMMENT", "VOID", "FUNCTION", "RETURNS", "BOOL_TYPE", "INT_TYPE", 
			"TRUE", "FALSE", "DOUBLE_TYPE", "MATRIX", "VECTOR", "BREAK", "POWER", 
			"SQRT", "PREFIX_OP", "SECOND_ORDER_OP", "FIRST_ORDER_OP", "BOOL_OP", 
			"ASSIGN_OP", "COMMA", "DOT", "NUMBER", "GET", "IMPORT", "FILE_TYPE", 
			"SPACE", "FROM", "IDENTIFIER", "NAME", "PATH"
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


	public matrixoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "matrixo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u018f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2q\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00a4\n\20\f\20\16\20\u00a7\13"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00bb\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00c7\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0103\n\36\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u011b"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0126\n\"\3#\3#\3$\3$\3%\3"+
		"%\7%\u012e\n%\f%\16%\u0131\13%\3%\3%\7%\u0135\n%\f%\16%\u0138\13%\3%\3"+
		"%\7%\u013c\n%\f%\16%\u013f\13%\3%\5%\u0142\n%\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0151\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5"+
		"(\u015d\n(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\7+\u016a\n+\f+\16+\u016d\13"+
		"+\3,\6,\u0170\n,\r,\16,\u0171\3,\3,\3,\3,\3,\3,\3,\3,\5,\u017c\n,\3-\3"+
		"-\3-\3-\3-\6-\u0183\n-\r-\16-\u0184\3-\7-\u0188\n-\f-\16-\u018b\13-\3"+
		"-\5-\u018e\n-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\13\4\2\f\f\17"+
		"\17\4\2--//\5\2\'\',,\61\61\4\2>>@@\3\2\63;\3\2\62;\5\2\13\f\17\17\"\""+
		"\5\2C\\aac|\6\2\62;C\\aac|\2\u01ae\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3p\3"+
		"\2\2\2\5r\3\2\2\2\7x\3\2\2\2\t\177\3\2\2\2\13\u0083\3\2\2\2\r\u0085\3"+
		"\2\2\2\17\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u008e\3\2\2\2\25\u0091\3\2"+
		"\2\2\27\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2"+
		"\2\37\u009f\3\2\2\2!\u00aa\3\2\2\2#\u00ba\3\2\2\2%\u00c6\3\2\2\2\'\u00c8"+
		"\3\2\2\2)\u00cd\3\2\2\2+\u00d1\3\2\2\2-\u00d6\3\2\2\2/\u00dc\3\2\2\2\61"+
		"\u00e3\3\2\2\2\63\u00ea\3\2\2\2\65\u00f1\3\2\2\2\67\u00f7\3\2\2\29\u00fa"+
		"\3\2\2\2;\u0102\3\2\2\2=\u0104\3\2\2\2?\u0106\3\2\2\2A\u011a\3\2\2\2C"+
		"\u0125\3\2\2\2E\u0127\3\2\2\2G\u0129\3\2\2\2I\u0141\3\2\2\2K\u0143\3\2"+
		"\2\2M\u0150\3\2\2\2O\u015c\3\2\2\2Q\u015e\3\2\2\2S\u0162\3\2\2\2U\u0167"+
		"\3\2\2\2W\u016f\3\2\2\2Y\u018d\3\2\2\2[\\\7f\2\2\\]\7g\2\2]^\7v\2\2^_"+
		"\7g\2\2_`\7t\2\2`a\7o\2\2ab\7k\2\2bc\7p\2\2cd\7c\2\2de\7p\2\2eq\7v\2\2"+
		"fg\7g\2\2gh\7k\2\2hi\7i\2\2ij\7g\2\2jk\7p\2\2kl\7x\2\2lm\7c\2\2mn\7n\2"+
		"\2no\7w\2\2oq\7g\2\2p[\3\2\2\2pf\3\2\2\2q\4\3\2\2\2rs\7r\2\2st\7t\2\2"+
		"tu\7k\2\2uv\7p\2\2vw\7v\2\2w\6\3\2\2\2xy\7t\2\2yz\7g\2\2z{\7v\2\2{|\7"+
		"w\2\2|}\7t\2\2}~\7p\2\2~\b\3\2\2\2\177\u0080\7h\2\2\u0080\u0081\7q\2\2"+
		"\u0081\u0082\7t\2\2\u0082\n\3\2\2\2\u0083\u0084\7*\2\2\u0084\f\3\2\2\2"+
		"\u0085\u0086\7+\2\2\u0086\16\3\2\2\2\u0087\u0088\7=\2\2\u0088\20\3\2\2"+
		"\2\u0089\u008a\7g\2\2\u008a\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d"+
		"\7g\2\2\u008d\22\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090\7h\2\2\u0090\24"+
		"\3\2\2\2\u0091\u0092\7}\2\2\u0092\26\3\2\2\2\u0093\u0094\7]\2\2\u0094"+
		"\30\3\2\2\2\u0095\u0096\7_\2\2\u0096\32\3\2\2\2\u0097\u0098\7\177\2\2"+
		"\u0098\34\3\2\2\2\u0099\u009a\7y\2\2\u009a\u009b\7j\2\2\u009b\u009c\7"+
		"k\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e\36\3\2\2\2\u009f\u00a0"+
		"\7\61\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\n\2\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\b\20\2\2"+
		"\u00a9 \3\2\2\2\u00aa\u00ab\7x\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7k\2"+
		"\2\u00ad\u00ae\7f\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7"+
		"w\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5"+
		"\7k\2\2\u00b5\u00b6\7q\2\2\u00b6\u00bb\7p\2\2\u00b7\u00b8\7h\2\2\u00b8"+
		"\u00b9\7w\2\2\u00b9\u00bb\7p\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b7\3\2\2"+
		"\2\u00bb$\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7"+
		"v\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c7"+
		"\7u\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c7\7v\2\2\u00c6"+
		"\u00bc\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7&\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7n\2\2\u00cc(\3\2\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0*\3\2\2\2\u00d1"+
		"\u00d2\7v\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5,\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7n\2"+
		"\2\u00d9\u00da\7u\2\2\u00da\u00db\7g\2\2\u00db.\3\2\2\2\u00dc\u00dd\7"+
		"f\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1"+
		"\7n\2\2\u00e1\u00e2\7g\2\2\u00e2\60\3\2\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5"+
		"\7c\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7z\2\2\u00e9\62\3\2\2\2\u00ea\u00eb\7x\2\2\u00eb\u00ec\7g\2\2\u00ec"+
		"\u00ed\7e\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7t\2\2"+
		"\u00f0\64\3\2\2\2\u00f1\u00f2\7d\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7"+
		"g\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7m\2\2\u00f6\66\3\2\2\2\u00f7\u00f8"+
		"\7,\2\2\u00f8\u00f9\7,\2\2\u00f98\3\2\2\2\u00fa\u00fb\7\'\2\2\u00fb\u00fc"+
		"\7\'\2\2\u00fc:\3\2\2\2\u00fd\u00fe\7-\2\2\u00fe\u0103\7-\2\2\u00ff\u0100"+
		"\7/\2\2\u0100\u0103\7/\2\2\u0101\u0103\7#\2\2\u0102\u00fd\3\2\2\2\u0102"+
		"\u00ff\3\2\2\2\u0102\u0101\3\2\2\2\u0103<\3\2\2\2\u0104\u0105\t\3\2\2"+
		"\u0105>\3\2\2\2\u0106\u0107\t\4\2\2\u0107@\3\2\2\2\u0108\u0109\7(\2\2"+
		"\u0109\u011b\7(\2\2\u010a\u010b\7c\2\2\u010b\u010c\7p\2\2\u010c\u011b"+
		"\7f\2\2\u010d\u010e\7~\2\2\u010e\u011b\7~\2\2\u010f\u0110\7q\2\2\u0110"+
		"\u011b\7t\2\2\u0111\u0112\7?\2\2\u0112\u011b\7?\2\2\u0113\u011b\t\5\2"+
		"\2\u0114\u0115\7>\2\2\u0115\u011b\7?\2\2\u0116\u0117\7@\2\2\u0117\u011b"+
		"\7?\2\2\u0118\u0119\7#\2\2\u0119\u011b\7?\2\2\u011a\u0108\3\2\2\2\u011a"+
		"\u010a\3\2\2\2\u011a\u010d\3\2\2\2\u011a\u010f\3\2\2\2\u011a\u0111\3\2"+
		"\2\2\u011a\u0113\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0116\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011bB\3\2\2\2\u011c\u011d\7-\2\2\u011d\u0126\7?\2\2\u011e"+
		"\u011f\7/\2\2\u011f\u0126\7?\2\2\u0120\u0121\7,\2\2\u0121\u0126\7?\2\2"+
		"\u0122\u0123\7\61\2\2\u0123\u0126\7?\2\2\u0124\u0126\7?\2\2\u0125\u011c"+
		"\3\2\2\2\u0125\u011e\3\2\2\2\u0125\u0120\3\2\2\2\u0125\u0122\3\2\2\2\u0125"+
		"\u0124\3\2\2\2\u0126D\3\2\2\2\u0127\u0128\7.\2\2\u0128F\3\2\2\2\u0129"+
		"\u012a\7\60\2\2\u012aH\3\2\2\2\u012b\u012f\t\6\2\2\u012c\u012e\t\7\2\2"+
		"\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0136\7\60\2\2"+
		"\u0133\u0135\t\7\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0142\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013d\t\6\2\2\u013a\u013c\t\7\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0142\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0142\7\62\2\2\u0141\u012b\3\2\2\2\u0141\u0139\3"+
		"\2\2\2\u0141\u0140\3\2\2\2\u0142J\3\2\2\2\u0143\u0144\7i\2\2\u0144\u0145"+
		"\7g\2\2\u0145\u0146\7v\2\2\u0146L\3\2\2\2\u0147\u0148\7k\2\2\u0148\u0149"+
		"\7o\2\2\u0149\u014a\7r\2\2\u014a\u014b\7q\2\2\u014b\u014c\7t\2\2\u014c"+
		"\u0151\7v\2\2\u014d\u014e\7k\2\2\u014e\u014f\7o\2\2\u014f\u0151\7r\2\2"+
		"\u0150\u0147\3\2\2\2\u0150\u014d\3\2\2\2\u0151N\3\2\2\2\u0152\u0153\7"+
		"q\2\2\u0153\u0154\7f\2\2\u0154\u015d\7v\2\2\u0155\u0156\7z\2\2\u0156\u0157"+
		"\7n\2\2\u0157\u0158\7u\2\2\u0158\u015d\7z\2\2\u0159\u015a\7e\2\2\u015a"+
		"\u015b\7u\2\2\u015b\u015d\7x\2\2\u015c\u0152\3\2\2\2\u015c\u0155\3\2\2"+
		"\2\u015c\u0159\3\2\2\2\u015dP\3\2\2\2\u015e\u015f\t\b\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0161\b)\2\2\u0161R\3\2\2\2\u0162\u0163\7h\2\2\u0163\u0164"+
		"\7t\2\2\u0164\u0165\7q\2\2\u0165\u0166\7o\2\2\u0166T\3\2\2\2\u0167\u016b"+
		"\t\t\2\2\u0168\u016a\t\n\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016cV\3\2\2\2\u016d\u016b\3\2\2\2"+
		"\u016e\u0170\t\n\2\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u017b\7\60\2\2"+
		"\u0174\u0175\7e\2\2\u0175\u0176\7u\2\2\u0176\u017c\7x\2\2\u0177\u0178"+
		"\7z\2\2\u0178\u0179\7n\2\2\u0179\u017a\7u\2\2\u017a\u017c\7z\2\2\u017b"+
		"\u0174\3\2\2\2\u017b\u0177\3\2\2\2\u017cX\3\2\2\2\u017d\u017e\t\n\2\2"+
		"\u017e\u017f\7<\2\2\u017f\u0180\7^\2\2\u0180\u0189\3\2\2\2\u0181\u0183"+
		"\t\n\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\7^\2\2\u0187\u0182\3\2"+
		"\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018e\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\7^\2\2\u018d\u017d\3\2"+
		"\2\2\u018d\u018c\3\2\2\2\u018eZ\3\2\2\2\26\2p\u00a5\u00ba\u00c6\u0102"+
		"\u011a\u0125\u012f\u0136\u013d\u0141\u0150\u015c\u016b\u0171\u017b\u0184"+
		"\u0189\u018d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}