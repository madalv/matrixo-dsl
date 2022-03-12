// Generated from C:/Users/Vlada/Downloads/pbl-sem-4/antlr/src/antlr\matrixo.g4 by ANTLR 4.9.2
package antlr;

package antlr;

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
		T__0=1, INBUILT_OPERATION=2, RETURN=3, FOR=4, L_PAR=5, R_PAR=6, SEMICOL=7, 
		ELSE=8, IF=9, L_BRAK=10, L_SQBRAK=11, R_SQBRAK=12, R_BRAK=13, WHILE=14, 
		COMMENT=15, VOID=16, FUNCTION=17, RETURNS=18, INT=19, LONGINT=20, BOOL=21, 
		DOUBLE=22, MATRIX=23, VECTOR=24, BREAK=25, PREFIX_OP=26, INFIX_OP=27, 
		ASSIGN_OP=28, COMMA=29, DOT=30, CHARACTER=31, NONZERO_DIGIT=32, GET=33, 
		IMPORT=34, FILE_TYPE=35, BACKSLASH=36, SPACE=37, FROM=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INBUILT_OPERATION", "RETURN", "FOR", "L_PAR", "R_PAR", "SEMICOL", 
			"ELSE", "IF", "L_BRAK", "L_SQBRAK", "R_SQBRAK", "R_BRAK", "WHILE", "COMMENT", 
			"VOID", "FUNCTION", "RETURNS", "INT", "LONGINT", "BOOL", "DOUBLE", "MATRIX", 
			"VECTOR", "BREAK", "PREFIX_OP", "INFIX_OP", "ASSIGN_OP", "COMMA", "DOT", 
			"CHARACTER", "NONZERO_DIGIT", "GET", "IMPORT", "FILE_TYPE", "BACKSLASH", 
			"SPACE", "FROM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", null, "'return'", "'for'", "'('", "')'", "';'", "'else'", 
			"'if'", "'{'", "'['", "']'", "'}'", "'while'", null, "'void'", null, 
			null, "'int'", "'longint'", "'bool'", "'double'", "'matrix'", "'vector'", 
			"'break'", null, null, null, "','", "'.'", null, null, "'get'", null, 
			null, "'\\'", null, "'from'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INBUILT_OPERATION", "RETURN", "FOR", "L_PAR", "R_PAR", "SEMICOL", 
			"ELSE", "IF", "L_BRAK", "L_SQBRAK", "R_SQBRAK", "R_BRAK", "WHILE", "COMMENT", 
			"VOID", "FUNCTION", "RETURNS", "INT", "LONGINT", "BOOL", "DOUBLE", "MATRIX", 
			"VECTOR", "BREAK", "PREFIX_OP", "INFIX_OP", "ASSIGN_OP", "COMMA", "DOT", 
			"CHARACTER", "NONZERO_DIGIT", "GET", "IMPORT", "FILE_TYPE", "BACKSLASH", 
			"SPACE", "FROM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0136\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"g\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u0094\n\20"+
		"\f\20\16\20\u0097\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ab\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b7\n\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u00ea\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00fb\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0106\n\35\3\36\3\36\3\37\3\37\3 "+
		"\5 \u010d\n \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u011e"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u012a\n$\3%\3%\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\b\4\2\f\f\17\17\4\2--//\4"+
		"\2,,\61\61\5\2C\\aac|\3\2\63;\5\2\13\f\17\17\"\"\2\u0148\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5f\3\2\2\2\7h\3\2\2\2\to\3\2\2\2\13s\3"+
		"\2\2\2\ru\3\2\2\2\17w\3\2\2\2\21y\3\2\2\2\23~\3\2\2\2\25\u0081\3\2\2\2"+
		"\27\u0083\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37"+
		"\u008f\3\2\2\2!\u009a\3\2\2\2#\u00aa\3\2\2\2%\u00b6\3\2\2\2\'\u00b8\3"+
		"\2\2\2)\u00bc\3\2\2\2+\u00c4\3\2\2\2-\u00c9\3\2\2\2/\u00d0\3\2\2\2\61"+
		"\u00d7\3\2\2\2\63\u00de\3\2\2\2\65\u00e9\3\2\2\2\67\u00fa\3\2\2\29\u0105"+
		"\3\2\2\2;\u0107\3\2\2\2=\u0109\3\2\2\2?\u010c\3\2\2\2A\u010e\3\2\2\2C"+
		"\u0110\3\2\2\2E\u011d\3\2\2\2G\u0129\3\2\2\2I\u012b\3\2\2\2K\u012d\3\2"+
		"\2\2M\u0131\3\2\2\2OP\7\62\2\2P\4\3\2\2\2QR\7f\2\2RS\7g\2\2ST\7v\2\2T"+
		"U\7g\2\2UV\7t\2\2VW\7o\2\2WX\7k\2\2XY\7p\2\2YZ\7c\2\2Z[\7p\2\2[g\7v\2"+
		"\2\\]\7g\2\2]^\7k\2\2^_\7i\2\2_`\7g\2\2`a\7p\2\2ab\7x\2\2bc\7c\2\2cd\7"+
		"n\2\2de\7w\2\2eg\7g\2\2fQ\3\2\2\2f\\\3\2\2\2g\6\3\2\2\2hi\7t\2\2ij\7g"+
		"\2\2jk\7v\2\2kl\7w\2\2lm\7t\2\2mn\7p\2\2n\b\3\2\2\2op\7h\2\2pq\7q\2\2"+
		"qr\7t\2\2r\n\3\2\2\2st\7*\2\2t\f\3\2\2\2uv\7+\2\2v\16\3\2\2\2wx\7=\2\2"+
		"x\20\3\2\2\2yz\7g\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2}\22\3\2\2\2~\177\7k\2"+
		"\2\177\u0080\7h\2\2\u0080\24\3\2\2\2\u0081\u0082\7}\2\2\u0082\26\3\2\2"+
		"\2\u0083\u0084\7]\2\2\u0084\30\3\2\2\2\u0085\u0086\7_\2\2\u0086\32\3\2"+
		"\2\2\u0087\u0088\7\177\2\2\u0088\34\3\2\2\2\u0089\u008a\7y\2\2\u008a\u008b"+
		"\7j\2\2\u008b\u008c\7k\2\2\u008c\u008d\7n\2\2\u008d\u008e\7g\2\2\u008e"+
		"\36\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7\61\2\2\u0091\u0095\3\2"+
		"\2\2\u0092\u0094\n\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u0099\b\20\2\2\u0099 \3\2\2\2\u009a\u009b\7x\2\2\u009b\u009c"+
		"\7q\2\2\u009c\u009d\7k\2\2\u009d\u009e\7f\2\2\u009e\"\3\2\2\2\u009f\u00a0"+
		"\7h\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7e\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7q\2\2\u00a6\u00ab\7p\2\2"+
		"\u00a7\u00a8\7h\2\2\u00a8\u00a9\7w\2\2\u00a9\u00ab\7p\2\2\u00aa\u009f"+
		"\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae"+
		"\7g\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7t\2\2\u00b1"+
		"\u00b2\7p\2\2\u00b2\u00b7\7u\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7g\2\2"+
		"\u00b5\u00b7\7v\2\2\u00b6\u00ac\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7&\3\2"+
		"\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7v\2\2\u00bb(\3"+
		"\2\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7p\2\2\u00bf"+
		"\u00c0\7i\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2"+
		"\u00c3*\3\2\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7q\2"+
		"\2\u00c7\u00c8\7n\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7"+
		"q\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf.\3\2\2\2\u00d0\u00d1\7o\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3"+
		"\7v\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7z\2\2\u00d6"+
		"\60\3\2\2\2\u00d7\u00d8\7x\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7e\2\2\u00da"+
		"\u00db\7v\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7t\2\2\u00dd\62\3\2\2\2\u00de"+
		"\u00df\7d\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7c\2\2"+
		"\u00e2\u00e3\7m\2\2\u00e3\64\3\2\2\2\u00e4\u00e5\7-\2\2\u00e5\u00ea\7"+
		"-\2\2\u00e6\u00e7\7/\2\2\u00e7\u00ea\7/\2\2\u00e8\u00ea\7#\2\2\u00e9\u00e4"+
		"\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\66\3\2\2\2\u00eb"+
		"\u00fb\t\3\2\2\u00ec\u00ed\7(\2\2\u00ed\u00fb\7(\2\2\u00ee\u00ef\7c\2"+
		"\2\u00ef\u00f0\7p\2\2\u00f0\u00fb\7f\2\2\u00f1\u00f2\7~\2\2\u00f2\u00fb"+
		"\7~\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00fb\7\'\2\2\u00f7\u00f8\7?\2\2\u00f8\u00fb\7?\2\2\u00f9\u00fb\t\4\2"+
		"\2\u00fa\u00eb\3\2\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa\u00f1"+
		"\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"8\3\2\2\2\u00fc\u00fd\7-\2\2\u00fd\u0106\7?\2\2\u00fe\u00ff\7/\2\2\u00ff"+
		"\u0106\7?\2\2\u0100\u0101\7,\2\2\u0101\u0106\7?\2\2\u0102\u0103\7\61\2"+
		"\2\u0103\u0106\7?\2\2\u0104\u0106\7?\2\2\u0105\u00fc\3\2\2\2\u0105\u00fe"+
		"\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		":\3\2\2\2\u0107\u0108\7.\2\2\u0108<\3\2\2\2\u0109\u010a\7\60\2\2\u010a"+
		">\3\2\2\2\u010b\u010d\t\5\2\2\u010c\u010b\3\2\2\2\u010d@\3\2\2\2\u010e"+
		"\u010f\t\6\2\2\u010fB\3\2\2\2\u0110\u0111\7i\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7v\2\2\u0113D\3\2\2\2\u0114\u0115\7k\2\2\u0115\u0116\7o\2\2\u0116"+
		"\u0117\7r\2\2\u0117\u0118\7q\2\2\u0118\u0119\7t\2\2\u0119\u011e\7v\2\2"+
		"\u011a\u011b\7k\2\2\u011b\u011c\7o\2\2\u011c\u011e\7r\2\2\u011d\u0114"+
		"\3\2\2\2\u011d\u011a\3\2\2\2\u011eF\3\2\2\2\u011f\u0120\7q\2\2\u0120\u0121"+
		"\7f\2\2\u0121\u012a\7v\2\2\u0122\u0123\7z\2\2\u0123\u0124\7n\2\2\u0124"+
		"\u0125\7u\2\2\u0125\u012a\7z\2\2\u0126\u0127\7e\2\2\u0127\u0128\7u\2\2"+
		"\u0128\u012a\7x\2\2\u0129\u011f\3\2\2\2\u0129\u0122\3\2\2\2\u0129\u0126"+
		"\3\2\2\2\u012aH\3\2\2\2\u012b\u012c\7^\2\2\u012cJ\3\2\2\2\u012d\u012e"+
		"\t\7\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b&\2\2\u0130L\3\2\2\2\u0131\u0132"+
		"\7h\2\2\u0132\u0133\7t\2\2\u0133\u0134\7q\2\2\u0134\u0135\7o\2\2\u0135"+
		"N\3\2\2\2\r\2f\u0095\u00aa\u00b6\u00e9\u00fa\u0105\u010c\u011d\u0129\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}