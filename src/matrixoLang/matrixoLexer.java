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
		RETURN=1, FOR=2, L_PAR=3, R_PAR=4, SEMICOL=5, ELSE=6, IF=7, L_BRAK=8, 
		L_SQBRAK=9, R_SQBRAK=10, R_BRAK=11, WHILE=12, COMMENT=13, VOID=14, FUNCTION=15, 
		RETURNS=16, BOOL_TYPE=17, INT_TYPE=18, TRUE=19, FALSE=20, DOUBLE_TYPE=21, 
		MATRIX=22, VECTOR=23, BREAK=24, POWER=25, SQRT=26, PREFIX_OP=27, SECOND_ORDER_OP=28, 
		FIRST_ORDER_OP=29, BOOL_OP=30, ASSIGN_OP=31, COMMA=32, DOT=33, NUMBER=34, 
		GET=35, IMPORT=36, FILE_TYPE=37, SPACE=38, FROM=39, TO=40, IDENTIFIER=41, 
		NAME=42, PATH=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RETURN", "FOR", "L_PAR", "R_PAR", "SEMICOL", "ELSE", "IF", "L_BRAK", 
			"L_SQBRAK", "R_SQBRAK", "R_BRAK", "WHILE", "COMMENT", "VOID", "FUNCTION", 
			"RETURNS", "BOOL_TYPE", "INT_TYPE", "TRUE", "FALSE", "DOUBLE_TYPE", "MATRIX", 
			"VECTOR", "BREAK", "POWER", "SQRT", "PREFIX_OP", "SECOND_ORDER_OP", "FIRST_ORDER_OP", 
			"BOOL_OP", "ASSIGN_OP", "COMMA", "DOT", "NUMBER", "GET", "IMPORT", "FILE_TYPE", 
			"SPACE", "FROM", "TO", "IDENTIFIER", "NAME", "PATH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'for'", "'('", "')'", "';'", "'else'", "'if'", "'{'", 
			"'['", "']'", "'}'", "'while'", null, "'void'", null, null, "'bool'", 
			"'int'", "'true'", "'false'", "'double'", "'matrix'", "'vector'", "'break'", 
			"'**'", "'%%'", null, null, null, null, null, "','", "'.'", null, "'get'", 
			null, null, null, "'from'", "'to'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RETURN", "FOR", "L_PAR", "R_PAR", "SEMICOL", "ELSE", "IF", "L_BRAK", 
			"L_SQBRAK", "R_SQBRAK", "R_BRAK", "WHILE", "COMMENT", "VOID", "FUNCTION", 
			"RETURNS", "BOOL_TYPE", "INT_TYPE", "TRUE", "FALSE", "DOUBLE_TYPE", "MATRIX", 
			"VECTOR", "BREAK", "POWER", "SQRT", "PREFIX_OP", "SECOND_ORDER_OP", "FIRST_ORDER_OP", 
			"BOOL_OP", "ASSIGN_OP", "COMMA", "DOT", "NUMBER", "GET", "IMPORT", "FILE_TYPE", 
			"SPACE", "FROM", "TO", "IDENTIFIER", "NAME", "PATH"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0179\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0085\n\16\f\16\16\16"+
		"\u0088\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009c\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a8\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u00e4\n\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00fc\n\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \5 \u0107\n \3!\3!\3\"\3\"\3#\5#\u010e\n#\3#\3#\7#\u0112"+
		"\n#\f#\16#\u0115\13#\3#\3#\7#\u0119\n#\f#\16#\u011c\13#\3#\5#\u011f\n"+
		"#\3#\3#\7#\u0123\n#\f#\16#\u0126\13#\3#\5#\u0129\n#\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\5%\u0138\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0144"+
		"\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\7*\u0154\n*\f*\16*\u0157"+
		"\13*\3+\6+\u015a\n+\r+\16+\u015b\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0166\n+\3"+
		",\3,\3,\3,\3,\6,\u016d\n,\r,\16,\u016e\3,\7,\u0172\n,\f,\16,\u0175\13"+
		",\3,\5,\u0178\n,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\f\4\2\f\f\17\17"+
		"\4\2--//\5\2\'\',,\61\61\4\2>>@@\3\2//\3\2\63;\3\2\62;\5\2\13\f\17\17"+
		"\"\"\5\2C\\aac|\6\2\62;C\\aac|\2\u0199\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5"+
		"`\3\2\2\2\7d\3\2\2\2\tf\3\2\2\2\13h\3\2\2\2\rj\3\2\2\2\17o\3\2\2\2\21"+
		"r\3\2\2\2\23t\3\2\2\2\25v\3\2\2\2\27x\3\2\2\2\31z\3\2\2\2\33\u0080\3\2"+
		"\2\2\35\u008b\3\2\2\2\37\u009b\3\2\2\2!\u00a7\3\2\2\2#\u00a9\3\2\2\2%"+
		"\u00ae\3\2\2\2\'\u00b2\3\2\2\2)\u00b7\3\2\2\2+\u00bd\3\2\2\2-\u00c4\3"+
		"\2\2\2/\u00cb\3\2\2\2\61\u00d2\3\2\2\2\63\u00d8\3\2\2\2\65\u00db\3\2\2"+
		"\2\67\u00e3\3\2\2\29\u00e5\3\2\2\2;\u00e7\3\2\2\2=\u00fb\3\2\2\2?\u0106"+
		"\3\2\2\2A\u0108\3\2\2\2C\u010a\3\2\2\2E\u0128\3\2\2\2G\u012a\3\2\2\2I"+
		"\u0137\3\2\2\2K\u0143\3\2\2\2M\u0145\3\2\2\2O\u0149\3\2\2\2Q\u014e\3\2"+
		"\2\2S\u0151\3\2\2\2U\u0159\3\2\2\2W\u0177\3\2\2\2YZ\7t\2\2Z[\7g\2\2[\\"+
		"\7v\2\2\\]\7w\2\2]^\7t\2\2^_\7p\2\2_\4\3\2\2\2`a\7h\2\2ab\7q\2\2bc\7t"+
		"\2\2c\6\3\2\2\2de\7*\2\2e\b\3\2\2\2fg\7+\2\2g\n\3\2\2\2hi\7=\2\2i\f\3"+
		"\2\2\2jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2n\16\3\2\2\2op\7k\2\2pq\7h\2"+
		"\2q\20\3\2\2\2rs\7}\2\2s\22\3\2\2\2tu\7]\2\2u\24\3\2\2\2vw\7_\2\2w\26"+
		"\3\2\2\2xy\7\177\2\2y\30\3\2\2\2z{\7y\2\2{|\7j\2\2|}\7k\2\2}~\7n\2\2~"+
		"\177\7g\2\2\177\32\3\2\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7\61\2\2\u0082"+
		"\u0086\3\2\2\2\u0083\u0085\n\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\b\16\2\2\u008a\34\3\2\2\2\u008b\u008c\7x\2"+
		"\2\u008c\u008d\7q\2\2\u008d\u008e\7k\2\2\u008e\u008f\7f\2\2\u008f\36\3"+
		"\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\7w\2\2\u0092\u0093\7p\2\2\u0093"+
		"\u0094\7e\2\2\u0094\u0095\7v\2\2\u0095\u0096\7k\2\2\u0096\u0097\7q\2\2"+
		"\u0097\u009c\7p\2\2\u0098\u0099\7h\2\2\u0099\u009a\7w\2\2\u009a\u009c"+
		"\7p\2\2\u009b\u0090\3\2\2\2\u009b\u0098\3\2\2\2\u009c \3\2\2\2\u009d\u009e"+
		"\7t\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7w\2\2\u00a1"+
		"\u00a2\7t\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a8\7u\2\2\u00a4\u00a5\7t\2\2"+
		"\u00a5\u00a6\7g\2\2\u00a6\u00a8\7v\2\2\u00a7\u009d\3\2\2\2\u00a7\u00a4"+
		"\3\2\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7d\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac"+
		"\7q\2\2\u00ac\u00ad\7n\2\2\u00ad$\3\2\2\2\u00ae\u00af\7k\2\2\u00af\u00b0"+
		"\7p\2\2\u00b0\u00b1\7v\2\2\u00b1&\3\2\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4"+
		"\7t\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7g\2\2\u00b6(\3\2\2\2\u00b7\u00b8"+
		"\7h\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7u\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc*\3\2\2\2\u00bd\u00be\7f\2\2\u00be\u00bf\7q\2\2\u00bf"+
		"\u00c0\7w\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7g\2\2"+
		"\u00c3,\3\2\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7v\2"+
		"\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7z\2\2\u00ca.\3\2"+
		"\2\2\u00cb\u00cc\7x\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf"+
		"\7v\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7t\2\2\u00d1\60\3\2\2\2\u00d2\u00d3"+
		"\7d\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7c\2\2\u00d6"+
		"\u00d7\7m\2\2\u00d7\62\3\2\2\2\u00d8\u00d9\7,\2\2\u00d9\u00da\7,\2\2\u00da"+
		"\64\3\2\2\2\u00db\u00dc\7\'\2\2\u00dc\u00dd\7\'\2\2\u00dd\66\3\2\2\2\u00de"+
		"\u00df\7-\2\2\u00df\u00e4\7-\2\2\u00e0\u00e1\7/\2\2\u00e1\u00e4\7/\2\2"+
		"\u00e2\u00e4\7#\2\2\u00e3\u00de\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e2"+
		"\3\2\2\2\u00e48\3\2\2\2\u00e5\u00e6\t\3\2\2\u00e6:\3\2\2\2\u00e7\u00e8"+
		"\t\4\2\2\u00e8<\3\2\2\2\u00e9\u00ea\7(\2\2\u00ea\u00fc\7(\2\2\u00eb\u00ec"+
		"\7c\2\2\u00ec\u00ed\7p\2\2\u00ed\u00fc\7f\2\2\u00ee\u00ef\7~\2\2\u00ef"+
		"\u00fc\7~\2\2\u00f0\u00f1\7q\2\2\u00f1\u00fc\7t\2\2\u00f2\u00f3\7?\2\2"+
		"\u00f3\u00fc\7?\2\2\u00f4\u00fc\t\5\2\2\u00f5\u00f6\7>\2\2\u00f6\u00fc"+
		"\7?\2\2\u00f7\u00f8\7@\2\2\u00f8\u00fc\7?\2\2\u00f9\u00fa\7#\2\2\u00fa"+
		"\u00fc\7?\2\2\u00fb\u00e9\3\2\2\2\u00fb\u00eb\3\2\2\2\u00fb\u00ee\3\2"+
		"\2\2\u00fb\u00f0\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fb"+
		"\u00f5\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc>\3\2\2\2"+
		"\u00fd\u00fe\7-\2\2\u00fe\u0107\7?\2\2\u00ff\u0100\7/\2\2\u0100\u0107"+
		"\7?\2\2\u0101\u0102\7,\2\2\u0102\u0107\7?\2\2\u0103\u0104\7\61\2\2\u0104"+
		"\u0107\7?\2\2\u0105\u0107\7?\2\2\u0106\u00fd\3\2\2\2\u0106\u00ff\3\2\2"+
		"\2\u0106\u0101\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0105\3\2\2\2\u0107@"+
		"\3\2\2\2\u0108\u0109\7.\2\2\u0109B\3\2\2\2\u010a\u010b\7\60\2\2\u010b"+
		"D\3\2\2\2\u010c\u010e\t\6\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2"+
		"\u010e\u010f\3\2\2\2\u010f\u0113\t\7\2\2\u0110\u0112\t\b\2\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011a\7\60\2\2\u0117\u0119\t"+
		"\b\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u0129\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\t\6"+
		"\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0124\t\7\2\2\u0121\u0123\t\b\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0129\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127\u0129\7\62\2\2\u0128\u010d\3\2\2\2\u0128\u011e\3"+
		"\2\2\2\u0128\u0127\3\2\2\2\u0129F\3\2\2\2\u012a\u012b\7i\2\2\u012b\u012c"+
		"\7g\2\2\u012c\u012d\7v\2\2\u012dH\3\2\2\2\u012e\u012f\7k\2\2\u012f\u0130"+
		"\7o\2\2\u0130\u0131\7r\2\2\u0131\u0132\7q\2\2\u0132\u0133\7t\2\2\u0133"+
		"\u0138\7v\2\2\u0134\u0135\7k\2\2\u0135\u0136\7o\2\2\u0136\u0138\7r\2\2"+
		"\u0137\u012e\3\2\2\2\u0137\u0134\3\2\2\2\u0138J\3\2\2\2\u0139\u013a\7"+
		"q\2\2\u013a\u013b\7f\2\2\u013b\u0144\7v\2\2\u013c\u013d\7z\2\2\u013d\u013e"+
		"\7n\2\2\u013e\u013f\7u\2\2\u013f\u0144\7z\2\2\u0140\u0141\7e\2\2\u0141"+
		"\u0142\7u\2\2\u0142\u0144\7x\2\2\u0143\u0139\3\2\2\2\u0143\u013c\3\2\2"+
		"\2\u0143\u0140\3\2\2\2\u0144L\3\2\2\2\u0145\u0146\t\t\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u0148\b\'\2\2\u0148N\3\2\2\2\u0149\u014a\7h\2\2\u014a\u014b"+
		"\7t\2\2\u014b\u014c\7q\2\2\u014c\u014d\7o\2\2\u014dP\3\2\2\2\u014e\u014f"+
		"\7v\2\2\u014f\u0150\7q\2\2\u0150R\3\2\2\2\u0151\u0155\t\n\2\2\u0152\u0154"+
		"\t\13\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2"+
		"\u0155\u0156\3\2\2\2\u0156T\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015a\t"+
		"\13\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0165\7\60\2\2\u015e\u015f\7"+
		"e\2\2\u015f\u0160\7u\2\2\u0160\u0166\7x\2\2\u0161\u0162\7z\2\2\u0162\u0163"+
		"\7n\2\2\u0163\u0164\7u\2\2\u0164\u0166\7z\2\2\u0165\u015e\3\2\2\2\u0165"+
		"\u0161\3\2\2\2\u0166V\3\2\2\2\u0167\u0168\t\13\2\2\u0168\u0169\7<\2\2"+
		"\u0169\u016a\7^\2\2\u016a\u0173\3\2\2\2\u016b\u016d\t\13\2\2\u016c\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0172\7^\2\2\u0171\u016c\3\2\2\2\u0172\u0175\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0178\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0178\7^\2\2\u0177\u0167\3\2\2\2\u0177\u0176\3\2"+
		"\2\2\u0178X\3\2\2\2\27\2\u0086\u009b\u00a7\u00e3\u00fb\u0106\u010d\u0113"+
		"\u011a\u011e\u0124\u0128\u0137\u0143\u0155\u015b\u0165\u016e\u0173\u0177"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}