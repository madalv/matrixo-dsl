// Generated from C:/Users/Vlada/Downloads/pbl-sem-4/matrixoLang/src/matrixoLang\matrixo.g4 by ANTLR 4.9.2
package matrixoLang;



import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class matrixoParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_nosemicolon_s = 2, RULE_semicolon_s = 3, 
		RULE_return_s = 4, RULE_ctrlflow_s = 5, RULE_for_s = 6, RULE_if_s = 7, 
		RULE_else_s = 8, RULE_while_s = 9, RULE_block = 10, RULE_return_type = 11, 
		RULE_assignment = 12, RULE_function_dec = 13, RULE_parameter = 14, RULE_variable_dec = 15, 
		RULE_variable_init = 16, RULE_type = 17, RULE_expression = 18, RULE_atom = 19, 
		RULE_get_call = 20, RULE_matrix_init = 21, RULE_row = 22, RULE_function_call = 23, 
		RULE_import_call = 24, RULE_paranthesis_expr = 25, RULE_filename = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "nosemicolon_s", "semicolon_s", "return_s", "ctrlflow_s", 
			"for_s", "if_s", "else_s", "while_s", "block", "return_type", "assignment", 
			"function_dec", "parameter", "variable_dec", "variable_init", "type", 
			"expression", "atom", "get_call", "matrix_init", "row", "function_call", 
			"import_call", "paranthesis_expr", "filename"
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

	@Override
	public String getGrammarFileName() { return "matrixo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public matrixoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(matrixoParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INBUILT_FUNCTION) | (1L << RETURN) | (1L << FOR) | (1L << L_PAR) | (1L << IF) | (1L << L_BRAK) | (1L << WHILE) | (1L << COMMENT) | (1L << FUNCTION) | (1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << TRUE) | (1L << FALSE) | (1L << DOUBLE_TYPE) | (1L << MATRIX) | (1L << VECTOR) | (1L << BREAK) | (1L << SQRT) | (1L << PREFIX_OP) | (1L << NUMBER) | (1L << GET) | (1L << IMPORT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(54);
				statement();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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

	public static class StatementContext extends ParserRuleContext {
		public Nosemicolon_sContext nosemicolon_s() {
			return getRuleContext(Nosemicolon_sContext.class,0);
		}
		public Semicolon_sContext semicolon_s() {
			return getRuleContext(Semicolon_sContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(matrixoParser.SEMICOL, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case IF:
			case L_BRAK:
			case WHILE:
			case COMMENT:
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				nosemicolon_s();
				}
				break;
			case INBUILT_FUNCTION:
			case RETURN:
			case L_PAR:
			case BOOL_TYPE:
			case INT_TYPE:
			case TRUE:
			case FALSE:
			case DOUBLE_TYPE:
			case MATRIX:
			case VECTOR:
			case BREAK:
			case SQRT:
			case PREFIX_OP:
			case NUMBER:
			case GET:
			case IMPORT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(63);
				semicolon_s();
				setState(64);
				match(SEMICOL);
				}
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

	public static class Nosemicolon_sContext extends ParserRuleContext {
		public Ctrlflow_sContext ctrlflow_s() {
			return getRuleContext(Ctrlflow_sContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(matrixoParser.COMMENT, 0); }
		public Function_decContext function_dec() {
			return getRuleContext(Function_decContext.class,0);
		}
		public Nosemicolon_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nosemicolon_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitNosemicolon_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nosemicolon_sContext nosemicolon_s() throws RecognitionException {
		Nosemicolon_sContext _localctx = new Nosemicolon_sContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nosemicolon_s);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				ctrlflow_s();
				}
				break;
			case L_BRAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				block();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(COMMENT);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				function_dec();
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

	public static class Semicolon_sContext extends ParserRuleContext {
		public Variable_decContext variable_dec() {
			return getRuleContext(Variable_decContext.class,0);
		}
		public Return_sContext return_s() {
			return getRuleContext(Return_sContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(matrixoParser.BREAK, 0); }
		public Semicolon_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitSemicolon_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolon_sContext semicolon_s() throws RecognitionException {
		Semicolon_sContext _localctx = new Semicolon_sContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_semicolon_s);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				variable_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				return_s();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(BREAK);
				}
				break;
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

	public static class Return_sContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(matrixoParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitReturn_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_sContext return_s() throws RecognitionException {
		Return_sContext _localctx = new Return_sContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_return_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(RETURN);
			setState(82);
			expression(0);
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

	public static class Ctrlflow_sContext extends ParserRuleContext {
		public For_sContext for_s() {
			return getRuleContext(For_sContext.class,0);
		}
		public If_sContext if_s() {
			return getRuleContext(If_sContext.class,0);
		}
		public While_sContext while_s() {
			return getRuleContext(While_sContext.class,0);
		}
		public Ctrlflow_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrlflow_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitCtrlflow_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctrlflow_sContext ctrlflow_s() throws RecognitionException {
		Ctrlflow_sContext _localctx = new Ctrlflow_sContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ctrlflow_s);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				for_s();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				if_s();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				while_s();
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

	public static class For_sContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(matrixoParser.FOR, 0); }
		public TerminalNode L_PAR() { return getToken(matrixoParser.L_PAR, 0); }
		public Variable_decContext variable_dec() {
			return getRuleContext(Variable_decContext.class,0);
		}
		public List<TerminalNode> SEMICOL() { return getTokens(matrixoParser.SEMICOL); }
		public TerminalNode SEMICOL(int i) {
			return getToken(matrixoParser.SEMICOL, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_PAR() { return getToken(matrixoParser.R_PAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitFor_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_sContext for_s() throws RecognitionException {
		For_sContext _localctx = new For_sContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(FOR);
			setState(90);
			match(L_PAR);
			setState(91);
			variable_dec();
			setState(92);
			match(SEMICOL);
			setState(93);
			expression(0);
			setState(94);
			match(SEMICOL);
			setState(95);
			expression(0);
			setState(96);
			match(R_PAR);
			setState(97);
			statement();
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

	public static class If_sContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(matrixoParser.IF, 0); }
		public TerminalNode L_PAR() { return getToken(matrixoParser.L_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(matrixoParser.R_PAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_sContext else_s() {
			return getRuleContext(Else_sContext.class,0);
		}
		public If_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitIf_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_sContext if_s() throws RecognitionException {
		If_sContext _localctx = new If_sContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IF);
			setState(100);
			match(L_PAR);
			setState(101);
			expression(0);
			setState(102);
			match(R_PAR);
			setState(103);
			statement();
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(104);
				else_s();
				}
				break;
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

	public static class Else_sContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(matrixoParser.ELSE, 0); }
		public If_sContext if_s() {
			return getRuleContext(If_sContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitElse_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_sContext else_s() throws RecognitionException {
		Else_sContext _localctx = new Else_sContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ELSE);
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(108);
				if_s();
				}
				break;
			case 2:
				{
				setState(109);
				statement();
				}
				break;
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

	public static class While_sContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(matrixoParser.WHILE, 0); }
		public TerminalNode L_PAR() { return getToken(matrixoParser.L_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(matrixoParser.R_PAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitWhile_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_sContext while_s() throws RecognitionException {
		While_sContext _localctx = new While_sContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(WHILE);
			setState(113);
			match(L_PAR);
			setState(114);
			expression(0);
			setState(115);
			match(R_PAR);
			setState(116);
			statement();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_BRAK() { return getToken(matrixoParser.L_BRAK, 0); }
		public TerminalNode R_BRAK() { return getToken(matrixoParser.R_BRAK, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(L_BRAK);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INBUILT_FUNCTION) | (1L << RETURN) | (1L << FOR) | (1L << L_PAR) | (1L << IF) | (1L << L_BRAK) | (1L << WHILE) | (1L << COMMENT) | (1L << FUNCTION) | (1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << TRUE) | (1L << FALSE) | (1L << DOUBLE_TYPE) | (1L << MATRIX) | (1L << VECTOR) | (1L << BREAK) | (1L << SQRT) | (1L << PREFIX_OP) | (1L << NUMBER) | (1L << GET) | (1L << IMPORT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(119);
				statement();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(R_BRAK);
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

	public static class Return_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(matrixoParser.VOID, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return_type);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TYPE:
			case INT_TYPE:
			case DOUBLE_TYPE:
			case MATRIX:
			case VECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(VOID);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(matrixoParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(matrixoParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENTIFIER);
			setState(132);
			match(ASSIGN_OP);
			setState(133);
			expression(0);
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

	public static class Function_decContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(matrixoParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(matrixoParser.IDENTIFIER, 0); }
		public TerminalNode L_PAR() { return getToken(matrixoParser.L_PAR, 0); }
		public TerminalNode R_PAR() { return getToken(matrixoParser.R_PAR, 0); }
		public TerminalNode RETURNS() { return getToken(matrixoParser.RETURNS, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Function_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitFunction_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_decContext function_dec() throws RecognitionException {
		Function_decContext _localctx = new Function_decContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FUNCTION);
			setState(136);
			match(IDENTIFIER);
			setState(137);
			match(L_PAR);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << MATRIX) | (1L << VECTOR))) != 0)) {
				{
				{
				setState(138);
				parameter();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(R_PAR);
			setState(145);
			match(RETURNS);
			setState(146);
			return_type();
			setState(147);
			block();
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(matrixoParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(matrixoParser.COMMA, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			type();
			setState(150);
			match(IDENTIFIER);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(151);
				match(COMMA);
				}
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

	public static class Variable_decContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(matrixoParser.IDENTIFIER, 0); }
		public Variable_initContext variable_init() {
			return getRuleContext(Variable_initContext.class,0);
		}
		public Variable_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitVariable_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_decContext variable_dec() throws RecognitionException {
		Variable_decContext _localctx = new Variable_decContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			type();
			setState(155);
			match(IDENTIFIER);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(156);
				variable_init();
				}
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

	public static class Variable_initContext extends ParserRuleContext {
		public TerminalNode ASSIGN_OP() { return getToken(matrixoParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitVariable_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_initContext variable_init() throws RecognitionException {
		Variable_initContext _localctx = new Variable_initContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ASSIGN_OP);
			setState(160);
			expression(0);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode DOUBLE_TYPE() { return getToken(matrixoParser.DOUBLE_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(matrixoParser.BOOL_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(matrixoParser.INT_TYPE, 0); }
		public TerminalNode MATRIX() { return getToken(matrixoParser.MATRIX, 0); }
		public TerminalNode VECTOR() { return getToken(matrixoParser.VECTOR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << MATRIX) | (1L << VECTOR))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode PREFIX_OP() { return getToken(matrixoParser.PREFIX_OP, 0); }
		public TerminalNode SQRT() { return getToken(matrixoParser.SQRT, 0); }
		public Matrix_initContext matrix_init() {
			return getRuleContext(Matrix_initContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Get_callContext get_call() {
			return getRuleContext(Get_callContext.class,0);
		}
		public Import_callContext import_call() {
			return getRuleContext(Import_callContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(matrixoParser.POWER, 0); }
		public TerminalNode FIRST_ORDER_OP() { return getToken(matrixoParser.FIRST_ORDER_OP, 0); }
		public TerminalNode SECOND_ORDER_OP() { return getToken(matrixoParser.SECOND_ORDER_OP, 0); }
		public TerminalNode BOOL_OP() { return getToken(matrixoParser.BOOL_OP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(165);
				atom();
				}
				break;
			case 2:
				{
				setState(166);
				match(PREFIX_OP);
				setState(167);
				atom();
				}
				break;
			case 3:
				{
				setState(168);
				match(SQRT);
				setState(169);
				atom();
				}
				break;
			case 4:
				{
				setState(170);
				matrix_init();
				}
				break;
			case 5:
				{
				setState(171);
				function_call();
				}
				break;
			case 6:
				{
				setState(172);
				get_call();
				}
				break;
			case 7:
				{
				setState(173);
				import_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(177);
						match(POWER);
						setState(178);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(180);
						match(FIRST_ORDER_OP);
						setState(181);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(183);
						match(SECOND_ORDER_OP);
						setState(184);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(186);
						match(BOOL_OP);
						setState(187);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(matrixoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(matrixoParser.FALSE, 0); }
		public TerminalNode NUMBER() { return getToken(matrixoParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(matrixoParser.IDENTIFIER, 0); }
		public Paranthesis_exprContext paranthesis_expr() {
			return getRuleContext(Paranthesis_exprContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_atom);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				paranthesis_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				function_call();
				}
				break;
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

	public static class Get_callContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(matrixoParser.GET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(matrixoParser.IDENTIFIER, 0); }
		public TerminalNode INBUILT_OPERATION() { return getToken(matrixoParser.INBUILT_OPERATION, 0); }
		public Get_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitGet_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_callContext get_call() throws RecognitionException {
		Get_callContext _localctx = new Get_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_get_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(GET);
			setState(202);
			match(IDENTIFIER);
			setState(203);
			match(INBUILT_OPERATION);
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

	public static class Matrix_initContext extends ParserRuleContext {
		public TerminalNode L_PAR() { return getToken(matrixoParser.L_PAR, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public Matrix_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitMatrix_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matrix_initContext matrix_init() throws RecognitionException {
		Matrix_initContext _localctx = new Matrix_initContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_matrix_init);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(L_PAR);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					row();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class RowContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(matrixoParser.COMMA, 0); }
		public TerminalNode R_PAR() { return getToken(matrixoParser.R_PAR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(matrixoParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(matrixoParser.NUMBER, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(212);
				match(NUMBER);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==R_PAR || _la==COMMA) ) {
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode L_PAR() { return getToken(matrixoParser.L_PAR, 0); }
		public TerminalNode R_PAR() { return getToken(matrixoParser.R_PAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(matrixoParser.IDENTIFIER, 0); }
		public TerminalNode INBUILT_FUNCTION() { return getToken(matrixoParser.INBUILT_FUNCTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(matrixoParser.COMMA, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==INBUILT_FUNCTION || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(221);
			match(L_PAR);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INBUILT_FUNCTION) | (1L << L_PAR) | (1L << TRUE) | (1L << FALSE) | (1L << SQRT) | (1L << PREFIX_OP) | (1L << NUMBER) | (1L << GET) | (1L << IMPORT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(222);
				expression(0);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(223);
					match(COMMA);
					}
				}

				}
			}

			setState(228);
			match(R_PAR);
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

	public static class Import_callContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(matrixoParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(matrixoParser.FROM, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public TerminalNode MATRIX() { return getToken(matrixoParser.MATRIX, 0); }
		public TerminalNode VECTOR() { return getToken(matrixoParser.VECTOR, 0); }
		public Import_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitImport_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_callContext import_call() throws RecognitionException {
		Import_callContext _localctx = new Import_callContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_import_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(IMPORT);
			setState(231);
			_la = _input.LA(1);
			if ( !(_la==MATRIX || _la==VECTOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(232);
			match(FROM);
			setState(233);
			filename();
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

	public static class Paranthesis_exprContext extends ParserRuleContext {
		public TerminalNode L_PAR() { return getToken(matrixoParser.L_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(matrixoParser.R_PAR, 0); }
		public Paranthesis_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paranthesis_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitParanthesis_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paranthesis_exprContext paranthesis_expr() throws RecognitionException {
		Paranthesis_exprContext _localctx = new Paranthesis_exprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_paranthesis_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(L_PAR);
			setState(236);
			expression(0);
			setState(237);
			match(R_PAR);
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

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(matrixoParser.NAME, 0); }
		public TerminalNode PATH() { return getToken(matrixoParser.PATH, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_filename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATH) {
				{
				setState(239);
				match(PATH);
				}
			}

			setState(242);
			match(NAME);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\5\5"+
		"R\n\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\5\nq\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f{\n\f\f\f\16\f~\13\f\3\f\3\f\3\r\3"+
		"\r\5\r\u0084\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u008e\n"+
		"\17\f\17\16\17\u0091\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20"+
		"\u009b\n\20\3\21\3\21\3\21\5\21\u00a0\n\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b1\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00bf\n\24"+
		"\f\24\16\24\u00c2\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ca\n\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u00d2\n\27\f\27\16\27\u00d5\13\27"+
		"\3\30\7\30\u00d8\n\30\f\30\16\30\u00db\13\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\5\31\u00e3\n\31\5\31\u00e5\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\5\34\u00f3\n\34\3\34\3\34\3\34\2\3&\35\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\6\4\2\25"+
		"\26\31\33\4\2\b\b$$\4\2\4\4,,\3\2\32\33\2\u0101\2;\3\2\2\2\4D\3\2\2\2"+
		"\6J\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\fY\3\2\2\2\16[\3\2\2\2\20e\3\2\2\2\22"+
		"m\3\2\2\2\24r\3\2\2\2\26x\3\2\2\2\30\u0083\3\2\2\2\32\u0085\3\2\2\2\34"+
		"\u0089\3\2\2\2\36\u0097\3\2\2\2 \u009c\3\2\2\2\"\u00a1\3\2\2\2$\u00a4"+
		"\3\2\2\2&\u00b0\3\2\2\2(\u00c9\3\2\2\2*\u00cb\3\2\2\2,\u00cf\3\2\2\2."+
		"\u00d9\3\2\2\2\60\u00de\3\2\2\2\62\u00e8\3\2\2\2\64\u00ed\3\2\2\2\66\u00f2"+
		"\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2="+
		";\3\2\2\2>?\7\2\2\3?\3\3\2\2\2@E\5\6\4\2AB\5\b\5\2BC\7\t\2\2CE\3\2\2\2"+
		"D@\3\2\2\2DA\3\2\2\2E\5\3\2\2\2FK\5\f\7\2GK\5\26\f\2HK\7\21\2\2IK\5\34"+
		"\17\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\7\3\2\2\2LR\5 \21\2MR\5"+
		"\n\6\2NR\5\32\16\2OR\5&\24\2PR\7\34\2\2QL\3\2\2\2QM\3\2\2\2QN\3\2\2\2"+
		"QO\3\2\2\2QP\3\2\2\2R\t\3\2\2\2ST\7\5\2\2TU\5&\24\2U\13\3\2\2\2VZ\5\16"+
		"\b\2WZ\5\20\t\2XZ\5\24\13\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\r\3\2\2\2["+
		"\\\7\6\2\2\\]\7\7\2\2]^\5 \21\2^_\7\t\2\2_`\5&\24\2`a\7\t\2\2ab\5&\24"+
		"\2bc\7\b\2\2cd\5\4\3\2d\17\3\2\2\2ef\7\13\2\2fg\7\7\2\2gh\5&\24\2hi\7"+
		"\b\2\2ik\5\4\3\2jl\5\22\n\2kj\3\2\2\2kl\3\2\2\2l\21\3\2\2\2mp\7\n\2\2"+
		"nq\5\20\t\2oq\5\4\3\2pn\3\2\2\2po\3\2\2\2q\23\3\2\2\2rs\7\20\2\2st\7\7"+
		"\2\2tu\5&\24\2uv\7\b\2\2vw\5\4\3\2w\25\3\2\2\2x|\7\f\2\2y{\5\4\3\2zy\3"+
		"\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\7\17\2\2\u0080\27\3\2\2\2\u0081\u0084\5$\23\2\u0082\u0084\7\22\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\31\3\2\2\2\u0085\u0086\7,\2\2"+
		"\u0086\u0087\7#\2\2\u0087\u0088\5&\24\2\u0088\33\3\2\2\2\u0089\u008a\7"+
		"\23\2\2\u008a\u008b\7,\2\2\u008b\u008f\7\7\2\2\u008c\u008e\5\36\20\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\b\2\2\u0093"+
		"\u0094\7\24\2\2\u0094\u0095\5\30\r\2\u0095\u0096\5\26\f\2\u0096\35\3\2"+
		"\2\2\u0097\u0098\5$\23\2\u0098\u009a\7,\2\2\u0099\u009b\7$\2\2\u009a\u0099"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\37\3\2\2\2\u009c\u009d\5$\23\2\u009d"+
		"\u009f\7,\2\2\u009e\u00a0\5\"\22\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0!\3\2\2\2\u00a1\u00a2\7#\2\2\u00a2\u00a3\5&\24\2\u00a3#\3\2"+
		"\2\2\u00a4\u00a5\t\2\2\2\u00a5%\3\2\2\2\u00a6\u00a7\b\24\1\2\u00a7\u00b1"+
		"\5(\25\2\u00a8\u00a9\7\37\2\2\u00a9\u00b1\5(\25\2\u00aa\u00ab\7\36\2\2"+
		"\u00ab\u00b1\5(\25\2\u00ac\u00b1\5,\27\2\u00ad\u00b1\5\60\31\2\u00ae\u00b1"+
		"\5*\26\2\u00af\u00b1\5\62\32\2\u00b0\u00a6\3\2\2\2\u00b0\u00a8\3\2\2\2"+
		"\u00b0\u00aa\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00c0\3\2\2\2\u00b2\u00b3\f\n\2\2\u00b3"+
		"\u00b4\7\35\2\2\u00b4\u00bf\5&\24\13\u00b5\u00b6\f\t\2\2\u00b6\u00b7\7"+
		"!\2\2\u00b7\u00bf\5&\24\n\u00b8\u00b9\f\b\2\2\u00b9\u00ba\7 \2\2\u00ba"+
		"\u00bf\5&\24\t\u00bb\u00bc\f\7\2\2\u00bc\u00bd\7\"\2\2\u00bd\u00bf\5&"+
		"\24\b\u00be\u00b2\3\2\2\2\u00be\u00b5\3\2\2\2\u00be\u00b8\3\2\2\2\u00be"+
		"\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\'\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00ca\7\27\2\2\u00c4\u00ca"+
		"\7\30\2\2\u00c5\u00ca\7&\2\2\u00c6\u00ca\7,\2\2\u00c7\u00ca\5\64\33\2"+
		"\u00c8\u00ca\5\60\31\2\u00c9\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5"+
		"\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		")\3\2\2\2\u00cb\u00cc\7\'\2\2\u00cc\u00cd\7,\2\2\u00cd\u00ce\7\3\2\2\u00ce"+
		"+\3\2\2\2\u00cf\u00d3\7\7\2\2\u00d0\u00d2\5.\30\2\u00d1\u00d0\3\2\2\2"+
		"\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4-\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\7&\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\t\3\2\2\u00dd/\3\2\2\2\u00de\u00df"+
		"\t\4\2\2\u00df\u00e4\7\7\2\2\u00e0\u00e2\5&\24\2\u00e1\u00e3\7$\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\b\2\2\u00e7"+
		"\61\3\2\2\2\u00e8\u00e9\7(\2\2\u00e9\u00ea\t\5\2\2\u00ea\u00eb\7+\2\2"+
		"\u00eb\u00ec\5\66\34\2\u00ec\63\3\2\2\2\u00ed\u00ee\7\7\2\2\u00ee\u00ef"+
		"\5&\24\2\u00ef\u00f0\7\b\2\2\u00f0\65\3\2\2\2\u00f1\u00f3\7.\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7-"+
		"\2\2\u00f5\67\3\2\2\2\27;DJQYkp|\u0083\u008f\u009a\u009f\u00b0\u00be\u00c0"+
		"\u00c9\u00d3\u00d9\u00e2\u00e4\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}