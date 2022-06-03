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
		GET=35, IMPORT=36, FILE_TYPE=37, SPACE=38, FROM=39, IDENTIFIER=40, NAME=41, 
		PATH=42;
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
			"SPACE", "FROM", "IDENTIFIER", "NAME", "PATH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'for'", "'('", "')'", "';'", "'else'", "'if'", "'{'", 
			"'['", "']'", "'}'", "'while'", null, "'void'", null, null, "'bool'", 
			"'int'", "'true'", "'false'", "'double'", "'matrix'", "'vector'", "'break'", 
			"'**'", "'%%'", null, null, null, null, null, "','", "'.'", null, "'get'", 
			null, null, null, "'from'"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u016e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0083\n\16\f\16\16\16\u0086"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u009a\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00a6\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u00e2\n\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00fa\n\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \5 \u0105\n \3!\3!\3\"\3\"\3#\3#\7#\u010d\n#\f#\16#\u0110\13#\3#\3"+
		"#\7#\u0114\n#\f#\16#\u0117\13#\3#\3#\7#\u011b\n#\f#\16#\u011e\13#\3#\5"+
		"#\u0121\n#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0130\n%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\5&\u013c\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3"+
		")\7)\u0149\n)\f)\16)\u014c\13)\3*\6*\u014f\n*\r*\16*\u0150\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u015b\n*\3+\3+\3+\3+\3+\6+\u0162\n+\r+\16+\u0163\3+\7"+
		"+\u0167\n+\f+\16+\u016a\13+\3+\5+\u016d\n+\2\2,\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,\3\2\13\4\2\f\f\17\17\4\2--//\5\2\'\',,\61\61\4\2>>@@\3\2\63;\3"+
		"\2\62;\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\2\u018c\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3"+
		"W\3\2\2\2\5^\3\2\2\2\7b\3\2\2\2\td\3\2\2\2\13f\3\2\2\2\rh\3\2\2\2\17m"+
		"\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33"+
		"~\3\2\2\2\35\u0089\3\2\2\2\37\u0099\3\2\2\2!\u00a5\3\2\2\2#\u00a7\3\2"+
		"\2\2%\u00ac\3\2\2\2\'\u00b0\3\2\2\2)\u00b5\3\2\2\2+\u00bb\3\2\2\2-\u00c2"+
		"\3\2\2\2/\u00c9\3\2\2\2\61\u00d0\3\2\2\2\63\u00d6\3\2\2\2\65\u00d9\3\2"+
		"\2\2\67\u00e1\3\2\2\29\u00e3\3\2\2\2;\u00e5\3\2\2\2=\u00f9\3\2\2\2?\u0104"+
		"\3\2\2\2A\u0106\3\2\2\2C\u0108\3\2\2\2E\u0120\3\2\2\2G\u0122\3\2\2\2I"+
		"\u012f\3\2\2\2K\u013b\3\2\2\2M\u013d\3\2\2\2O\u0141\3\2\2\2Q\u0146\3\2"+
		"\2\2S\u014e\3\2\2\2U\u016c\3\2\2\2WX\7t\2\2XY\7g\2\2YZ\7v\2\2Z[\7w\2\2"+
		"[\\\7t\2\2\\]\7p\2\2]\4\3\2\2\2^_\7h\2\2_`\7q\2\2`a\7t\2\2a\6\3\2\2\2"+
		"bc\7*\2\2c\b\3\2\2\2de\7+\2\2e\n\3\2\2\2fg\7=\2\2g\f\3\2\2\2hi\7g\2\2"+
		"ij\7n\2\2jk\7u\2\2kl\7g\2\2l\16\3\2\2\2mn\7k\2\2no\7h\2\2o\20\3\2\2\2"+
		"pq\7}\2\2q\22\3\2\2\2rs\7]\2\2s\24\3\2\2\2tu\7_\2\2u\26\3\2\2\2vw\7\177"+
		"\2\2w\30\3\2\2\2xy\7y\2\2yz\7j\2\2z{\7k\2\2{|\7n\2\2|}\7g\2\2}\32\3\2"+
		"\2\2~\177\7\61\2\2\177\u0080\7\61\2\2\u0080\u0084\3\2\2\2\u0081\u0083"+
		"\n\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\b\16"+
		"\2\2\u0088\34\3\2\2\2\u0089\u008a\7x\2\2\u008a\u008b\7q\2\2\u008b\u008c"+
		"\7k\2\2\u008c\u008d\7f\2\2\u008d\36\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090"+
		"\7w\2\2\u0090\u0091\7p\2\2\u0091\u0092\7e\2\2\u0092\u0093\7v\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7q\2\2\u0095\u009a\7p\2\2\u0096\u0097\7h\2\2"+
		"\u0097\u0098\7w\2\2\u0098\u009a\7p\2\2\u0099\u008e\3\2\2\2\u0099\u0096"+
		"\3\2\2\2\u009a \3\2\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7v\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7p\2\2\u00a1"+
		"\u00a6\7u\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a6\7v\2\2"+
		"\u00a5\u009b\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\"\3\2\2\2\u00a7\u00a8\7"+
		"d\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7n\2\2\u00ab$"+
		"\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af"+
		"&\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7w\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7g\2\2\u00ba*\3\2\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7d\2\2"+
		"\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7o\2"+
		"\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7"+
		"\7k\2\2\u00c7\u00c8\7z\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7x\2\2\u00ca\u00cb"+
		"\7g\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7q\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7m\2\2\u00d5\62\3\2\2\2\u00d6"+
		"\u00d7\7,\2\2\u00d7\u00d8\7,\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7\'\2\2"+
		"\u00da\u00db\7\'\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd\u00e2\7"+
		"-\2\2\u00de\u00df\7/\2\2\u00df\u00e2\7/\2\2\u00e0\u00e2\7#\2\2\u00e1\u00dc"+
		"\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e28\3\2\2\2\u00e3"+
		"\u00e4\t\3\2\2\u00e4:\3\2\2\2\u00e5\u00e6\t\4\2\2\u00e6<\3\2\2\2\u00e7"+
		"\u00e8\7(\2\2\u00e8\u00fa\7(\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7p\2\2"+
		"\u00eb\u00fa\7f\2\2\u00ec\u00ed\7~\2\2\u00ed\u00fa\7~\2\2\u00ee\u00ef"+
		"\7q\2\2\u00ef\u00fa\7t\2\2\u00f0\u00f1\7?\2\2\u00f1\u00fa\7?\2\2\u00f2"+
		"\u00fa\t\5\2\2\u00f3\u00f4\7>\2\2\u00f4\u00fa\7?\2\2\u00f5\u00f6\7@\2"+
		"\2\u00f6\u00fa\7?\2\2\u00f7\u00f8\7#\2\2\u00f8\u00fa\7?\2\2\u00f9\u00e7"+
		"\3\2\2\2\u00f9\u00e9\3\2\2\2\u00f9\u00ec\3\2\2\2\u00f9\u00ee\3\2\2\2\u00f9"+
		"\u00f0\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f5\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa>\3\2\2\2\u00fb\u00fc\7-\2\2\u00fc\u0105"+
		"\7?\2\2\u00fd\u00fe\7/\2\2\u00fe\u0105\7?\2\2\u00ff\u0100\7,\2\2\u0100"+
		"\u0105\7?\2\2\u0101\u0102\7\61\2\2\u0102\u0105\7?\2\2\u0103\u0105\7?\2"+
		"\2\u0104\u00fb\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0101"+
		"\3\2\2\2\u0104\u0103\3\2\2\2\u0105@\3\2\2\2\u0106\u0107\7.\2\2\u0107B"+
		"\3\2\2\2\u0108\u0109\7\60\2\2\u0109D\3\2\2\2\u010a\u010e\t\6\2\2\u010b"+
		"\u010d\t\7\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0115\7\60\2\2\u0112\u0114\t\7\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3"+
		"\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0121\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u011c\t\6\2\2\u0119\u011b\t\7\2\2\u011a\u0119\3\2"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u0121\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\7\62\2\2\u0120\u010a\3"+
		"\2\2\2\u0120\u0118\3\2\2\2\u0120\u011f\3\2\2\2\u0121F\3\2\2\2\u0122\u0123"+
		"\7i\2\2\u0123\u0124\7g\2\2\u0124\u0125\7v\2\2\u0125H\3\2\2\2\u0126\u0127"+
		"\7k\2\2\u0127\u0128\7o\2\2\u0128\u0129\7r\2\2\u0129\u012a\7q\2\2\u012a"+
		"\u012b\7t\2\2\u012b\u0130\7v\2\2\u012c\u012d\7k\2\2\u012d\u012e\7o\2\2"+
		"\u012e\u0130\7r\2\2\u012f\u0126\3\2\2\2\u012f\u012c\3\2\2\2\u0130J\3\2"+
		"\2\2\u0131\u0132\7q\2\2\u0132\u0133\7f\2\2\u0133\u013c\7v\2\2\u0134\u0135"+
		"\7z\2\2\u0135\u0136\7n\2\2\u0136\u0137\7u\2\2\u0137\u013c\7z\2\2\u0138"+
		"\u0139\7e\2\2\u0139\u013a\7u\2\2\u013a\u013c\7x\2\2\u013b\u0131\3\2\2"+
		"\2\u013b\u0134\3\2\2\2\u013b\u0138\3\2\2\2\u013cL\3\2\2\2\u013d\u013e"+
		"\t\b\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b\'\2\2\u0140N\3\2\2\2\u0141"+
		"\u0142\7h\2\2\u0142\u0143\7t\2\2\u0143\u0144\7q\2\2\u0144\u0145\7o\2\2"+
		"\u0145P\3\2\2\2\u0146\u014a\t\t\2\2\u0147\u0149\t\n\2\2\u0148\u0147\3"+
		"\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"R\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014f\t\n\2\2\u014e\u014d\3\2\2\2"+
		"\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u015a\7\60\2\2\u0153\u0154\7e\2\2\u0154\u0155\7u\2\2\u0155"+
		"\u015b\7x\2\2\u0156\u0157\7z\2\2\u0157\u0158\7n\2\2\u0158\u0159\7u\2\2"+
		"\u0159\u015b\7z\2\2\u015a\u0153\3\2\2\2\u015a\u0156\3\2\2\2\u015bT\3\2"+
		"\2\2\u015c\u015d\t\n\2\2\u015d\u015e\7<\2\2\u015e\u015f\7^\2\2\u015f\u0168"+
		"\3\2\2\2\u0160\u0162\t\n\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\7^"+
		"\2\2\u0166\u0161\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016d\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d\7^"+
		"\2\2\u016c\u015c\3\2\2\2\u016c\u016b\3\2\2\2\u016dV\3\2\2\2\25\2\u0084"+
		"\u0099\u00a5\u00e1\u00f9\u0104\u010e\u0115\u011c\u0120\u012f\u013b\u014a"+
		"\u0150\u015a\u0163\u0168\u016c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}