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
		RETURN=1, FOR=2, L_PAR=3, R_PAR=4, SEMICOL=5, ELSE=6, IF=7, L_BRAK=8, 
		L_SQBRAK=9, R_SQBRAK=10, R_BRAK=11, WHILE=12, COMMENT=13, VOID=14, FUNCTION=15, 
		RETURNS=16, BOOL_TYPE=17, INT_TYPE=18, TRUE=19, FALSE=20, DOUBLE_TYPE=21, 
		MATRIX=22, VECTOR=23, BREAK=24, POWER=25, SQRT=26, PREFIX_OP=27, SECOND_ORDER_OP=28, 
		FIRST_ORDER_OP=29, BOOL_OP=30, ASSIGN_OP=31, COMMA=32, DOT=33, NUMBER=34, 
		GET=35, IMPORT=36, FILE_TYPE=37, SPACE=38, FROM=39, TO=40, IDENTIFIER=41, 
		NAME=42, PATH=43;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_nosemicolon_s = 2, RULE_semicolon_s = 3, 
		RULE_return_s = 4, RULE_ctrlflow_s = 5, RULE_for_s = 6, RULE_if_s = 7, 
		RULE_else_s = 8, RULE_while_s = 9, RULE_block = 10, RULE_return_type = 11, 
		RULE_assignment = 12, RULE_function_dec = 13, RULE_parameter_list = 14, 
		RULE_parameter = 15, RULE_variable_dec = 16, RULE_variable_init = 17, 
		RULE_type = 18, RULE_expression = 19, RULE_atom = 20, RULE_get_call = 21, 
		RULE_matrix_init = 22, RULE_row = 23, RULE_function_call = 24, RULE_argument_list = 25, 
		RULE_import_call = 26, RULE_paranthesis_expr = 27, RULE_filename = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "nosemicolon_s", "semicolon_s", "return_s", "ctrlflow_s", 
			"for_s", "if_s", "else_s", "while_s", "block", "return_type", "assignment", 
			"function_dec", "parameter_list", "parameter", "variable_dec", "variable_init", 
			"type", "expression", "atom", "get_call", "matrix_init", "row", "function_call", 
			"argument_list", "import_call", "paranthesis_expr", "filename"
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FOR) | (1L << L_PAR) | (1L << IF) | (1L << L_BRAK) | (1L << WHILE) | (1L << COMMENT) | (1L << FUNCTION) | (1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << TRUE) | (1L << FALSE) | (1L << DOUBLE_TYPE) | (1L << MATRIX) | (1L << VECTOR) | (1L << BREAK) | (1L << SQRT) | (1L << PREFIX_OP) | (1L << NUMBER) | (1L << GET) | (1L << IMPORT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
			setState(70);
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
				setState(66);
				nosemicolon_s();
				}
				break;
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
				setState(67);
				semicolon_s();
				setState(68);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				ctrlflow_s();
				}
				break;
			case L_BRAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				block();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(COMMENT);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				variable_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				return_s();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
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
			setState(85);
			match(RETURN);
			setState(86);
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				for_s();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				if_s();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
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
		public TerminalNode IDENTIFIER() { return getToken(matrixoParser.IDENTIFIER, 0); }
		public TerminalNode FROM() { return getToken(matrixoParser.FROM, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(matrixoParser.TO, 0); }
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
			setState(93);
			match(FOR);
			setState(94);
			match(L_PAR);
			setState(95);
			match(IDENTIFIER);
			setState(96);
			match(FROM);
			setState(97);
			expression(0);
			setState(98);
			match(TO);
			setState(99);
			expression(0);
			setState(100);
			match(R_PAR);
			setState(101);
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
			setState(103);
			match(IF);
			setState(104);
			match(L_PAR);
			setState(105);
			expression(0);
			setState(106);
			match(R_PAR);
			setState(107);
			statement();
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(108);
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
			setState(111);
			match(ELSE);
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(112);
				if_s();
				}
				break;
			case 2:
				{
				setState(113);
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
			setState(116);
			match(WHILE);
			setState(117);
			match(L_PAR);
			setState(118);
			expression(0);
			setState(119);
			match(R_PAR);
			setState(120);
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
			setState(122);
			match(L_BRAK);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << FOR) | (1L << L_PAR) | (1L << IF) | (1L << L_BRAK) | (1L << WHILE) | (1L << COMMENT) | (1L << FUNCTION) | (1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << TRUE) | (1L << FALSE) | (1L << DOUBLE_TYPE) | (1L << MATRIX) | (1L << VECTOR) | (1L << BREAK) | (1L << SQRT) | (1L << PREFIX_OP) | (1L << NUMBER) | (1L << GET) | (1L << IMPORT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(123);
				statement();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TYPE:
			case INT_TYPE:
			case DOUBLE_TYPE:
			case MATRIX:
			case VECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
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
			setState(135);
			match(IDENTIFIER);
			setState(136);
			match(ASSIGN_OP);
			setState(137);
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
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(matrixoParser.R_PAR, 0); }
		public TerminalNode RETURNS() { return getToken(matrixoParser.RETURNS, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(FUNCTION);
			setState(140);
			match(IDENTIFIER);
			setState(141);
			match(L_PAR);
			setState(142);
			parameter_list();
			setState(143);
			match(R_PAR);
			setState(144);
			match(RETURNS);
			setState(145);
			return_type();
			setState(146);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(matrixoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(matrixoParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << MATRIX) | (1L << VECTOR))) != 0)) {
				{
				setState(148);
				parameter();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(149);
					match(COMMA);
					setState(150);
					parameter();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(matrixoParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 30, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			type();
			setState(159);
			match(IDENTIFIER);
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
		enterRule(_localctx, 32, RULE_variable_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			type();
			setState(162);
			match(IDENTIFIER);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(163);
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
		enterRule(_localctx, 34, RULE_variable_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ASSIGN_OP);
			setState(167);
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
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BOOL_OP() { return getToken(matrixoParser.BOOL_OP, 0); }
		public BoolOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExpContext extends ExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitAtomExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtExpContext extends ExpressionContext {
		public TerminalNode SQRT() { return getToken(matrixoParser.SQRT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SqrtExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitSqrtExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixExpContext extends ExpressionContext {
		public TerminalNode PREFIX_OP() { return getToken(matrixoParser.PREFIX_OP, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PrefixExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitPrefixExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(matrixoParser.POWER, 0); }
		public PowerExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitPowerExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportCallContext extends ExpressionContext {
		public Import_callContext import_call() {
			return getRuleContext(Import_callContext.class,0);
		}
		public ImportCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitImportCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetCallContext extends ExpressionContext {
		public Get_callContext get_call() {
			return getRuleContext(Get_callContext.class,0);
		}
		public GetCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) {
				try {
					return ((matrixoVisitor<? extends T>)visitor).visitGetCall(this);
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				}
			}
			else return visitor.visitChildren(this);
			return visitor.visitChildren(this);
		}
	}
	public static class FirstOrdExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FIRST_ORDER_OP() { return getToken(matrixoParser.FIRST_ORDER_OP, 0); }
		public FirstOrdExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitFirstOrdExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrixInitContext extends ExpressionContext {
		public Matrix_initContext matrix_init() {
			return getRuleContext(Matrix_initContext.class,0);
		}
		public MatrixInitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitMatrixInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SecondOrdExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SECOND_ORDER_OP() { return getToken(matrixoParser.SECOND_ORDER_OP, 0); }
		public SecondOrdExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitSecondOrdExp(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new AtomExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(172);
				atom();
				}
				break;
			case 2:
				{
				_localctx = new PrefixExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(PREFIX_OP);
				setState(174);
				atom();
				}
				break;
			case 3:
				{
				_localctx = new SqrtExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(SQRT);
				setState(176);
				atom();
				}
				break;
			case 4:
				{
				_localctx = new MatrixInitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				matrix_init();
				}
				break;
			case 5:
				{
				_localctx = new GetCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				get_call();
				}
				break;
			case 6:
				{
				_localctx = new ImportCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				import_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(183);
						match(POWER);
						setState(184);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new FirstOrdExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(186);
						match(FIRST_ORDER_OP);
						setState(187);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new SecondOrdExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(189);
						match(SECOND_ORDER_OP);
						setState(190);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new BoolOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(192);
						match(BOOL_OP);
						setState(193);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(198);
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
		enterRule(_localctx, 40, RULE_atom);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				paranthesis_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(matrixoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(matrixoParser.IDENTIFIER, i);
		}
		public Get_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) {
				try {
					return ((matrixoVisitor<? extends T>)visitor).visitGet_call(this);
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				}
			}
			else return visitor.visitChildren(this);
			return visitor.visitChildren(this);
		}
	}

	public final Get_callContext get_call() throws RecognitionException {
		Get_callContext _localctx = new Get_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_get_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(GET);
			setState(208);
			match(IDENTIFIER);
			setState(209);
			match(IDENTIFIER);
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
		enterRule(_localctx, 44, RULE_matrix_init);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(L_PAR);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					row();
					}
					} 
				}
				setState(217);
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
		enterRule(_localctx, 46, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(218);
				match(NUMBER);
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
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
		public TerminalNode IDENTIFIER() { return getToken(matrixoParser.IDENTIFIER, 0); }
		public TerminalNode L_PAR() { return getToken(matrixoParser.L_PAR, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(matrixoParser.R_PAR, 0); }
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
		enterRule(_localctx, 48, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(IDENTIFIER);
			setState(227);
			match(L_PAR);
			setState(228);
			argument_list();
			setState(229);
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

	public static class Argument_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(matrixoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(matrixoParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAR) | (1L << TRUE) | (1L << FALSE) | (1L << SQRT) | (1L << PREFIX_OP) | (1L << NUMBER) | (1L << GET) | (1L << IMPORT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(231);
				expression(0);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(232);
					match(COMMA);
					setState(233);
					expression(0);
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 52, RULE_import_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(IMPORT);
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==MATRIX || _la==VECTOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(243);
			match(FROM);
			setState(244);
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
		enterRule(_localctx, 54, RULE_paranthesis_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(L_PAR);
			setState(247);
			expression(0);
			setState(248);
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
		enterRule(_localctx, 56, RULE_filename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATH) {
				{
				setState(250);
				match(PATH);
				}
			}

			setState(253);
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
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0102\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\3\4\3\4\5\4O\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n"+
		"\3\n\5\nu\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f\177\n\f\f\f\16"+
		"\f\u0082\13\f\3\f\3\f\3\r\3\r\5\r\u0088\n\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u009a\n\20"+
		"\f\20\16\20\u009d\13\20\5\20\u009f\n\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\5\22\u00a7\n\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00b7\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u00c5\n\25\f\25\16\25\u00c8\13\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00d0\n\26\3\27\3\27\3\27\3\27\3\30\3\30\7\30"+
		"\u00d8\n\30\f\30\16\30\u00db\13\30\3\31\7\31\u00de\n\31\f\31\16\31\u00e1"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u00ed\n"+
		"\33\f\33\16\33\u00f0\13\33\5\33\u00f2\n\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\36\5\36\u00fe\n\36\3\36\3\36\3\36\2\3(\37\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\4\2\23\24\27"+
		"\31\4\2\6\6\"\"\3\2\30\31\2\u0109\2?\3\2\2\2\4H\3\2\2\2\6N\3\2\2\2\bU"+
		"\3\2\2\2\nW\3\2\2\2\f]\3\2\2\2\16_\3\2\2\2\20i\3\2\2\2\22q\3\2\2\2\24"+
		"v\3\2\2\2\26|\3\2\2\2\30\u0087\3\2\2\2\32\u0089\3\2\2\2\34\u008d\3\2\2"+
		"\2\36\u009e\3\2\2\2 \u00a0\3\2\2\2\"\u00a3\3\2\2\2$\u00a8\3\2\2\2&\u00ab"+
		"\3\2\2\2(\u00b6\3\2\2\2*\u00cf\3\2\2\2,\u00d1\3\2\2\2.\u00d5\3\2\2\2\60"+
		"\u00df\3\2\2\2\62\u00e4\3\2\2\2\64\u00f1\3\2\2\2\66\u00f3\3\2\2\28\u00f8"+
		"\3\2\2\2:\u00fd\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@B\3\2\2\2A?\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DI\5\6\4\2EF\5\b\5\2FG\7"+
		"\7\2\2GI\3\2\2\2HD\3\2\2\2HE\3\2\2\2I\5\3\2\2\2JO\5\f\7\2KO\5\26\f\2L"+
		"O\7\17\2\2MO\5\34\17\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\7\3\2"+
		"\2\2PV\5\"\22\2QV\5\n\6\2RV\5\32\16\2SV\5(\25\2TV\7\32\2\2UP\3\2\2\2U"+
		"Q\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\t\3\2\2\2WX\7\3\2\2XY\5(\25\2"+
		"Y\13\3\2\2\2Z^\5\16\b\2[^\5\20\t\2\\^\5\24\13\2]Z\3\2\2\2][\3\2\2\2]\\"+
		"\3\2\2\2^\r\3\2\2\2_`\7\4\2\2`a\7\5\2\2ab\7+\2\2bc\7)\2\2cd\5(\25\2de"+
		"\7*\2\2ef\5(\25\2fg\7\6\2\2gh\5\4\3\2h\17\3\2\2\2ij\7\t\2\2jk\7\5\2\2"+
		"kl\5(\25\2lm\7\6\2\2mo\5\4\3\2np\5\22\n\2on\3\2\2\2op\3\2\2\2p\21\3\2"+
		"\2\2qt\7\b\2\2ru\5\20\t\2su\5\4\3\2tr\3\2\2\2ts\3\2\2\2u\23\3\2\2\2vw"+
		"\7\16\2\2wx\7\5\2\2xy\5(\25\2yz\7\6\2\2z{\5\4\3\2{\25\3\2\2\2|\u0080\7"+
		"\n\2\2}\177\5\4\3\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\r\2\2\u0084"+
		"\27\3\2\2\2\u0085\u0088\5&\24\2\u0086\u0088\7\20\2\2\u0087\u0085\3\2\2"+
		"\2\u0087\u0086\3\2\2\2\u0088\31\3\2\2\2\u0089\u008a\7+\2\2\u008a\u008b"+
		"\7!\2\2\u008b\u008c\5(\25\2\u008c\33\3\2\2\2\u008d\u008e\7\21\2\2\u008e"+
		"\u008f\7+\2\2\u008f\u0090\7\5\2\2\u0090\u0091\5\36\20\2\u0091\u0092\7"+
		"\6\2\2\u0092\u0093\7\22\2\2\u0093\u0094\5\30\r\2\u0094\u0095\5\26\f\2"+
		"\u0095\35\3\2\2\2\u0096\u009b\5 \21\2\u0097\u0098\7\"\2\2\u0098\u009a"+
		"\5 \21\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u0096\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\37\3\2\2\2\u00a0\u00a1\5&\24\2\u00a1\u00a2"+
		"\7+\2\2\u00a2!\3\2\2\2\u00a3\u00a4\5&\24\2\u00a4\u00a6\7+\2\2\u00a5\u00a7"+
		"\5$\23\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7#\3\2\2\2\u00a8"+
		"\u00a9\7!\2\2\u00a9\u00aa\5(\25\2\u00aa%\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac"+
		"\'\3\2\2\2\u00ad\u00ae\b\25\1\2\u00ae\u00b7\5*\26\2\u00af\u00b0\7\35\2"+
		"\2\u00b0\u00b7\5*\26\2\u00b1\u00b2\7\34\2\2\u00b2\u00b7\5*\26\2\u00b3"+
		"\u00b7\5.\30\2\u00b4\u00b7\5,\27\2\u00b5\u00b7\5\66\34\2\u00b6\u00ad\3"+
		"\2\2\2\u00b6\u00af\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00c6\3\2\2\2\u00b8\u00b9\f\t"+
		"\2\2\u00b9\u00ba\7\33\2\2\u00ba\u00c5\5(\25\n\u00bb\u00bc\f\b\2\2\u00bc"+
		"\u00bd\7\37\2\2\u00bd\u00c5\5(\25\t\u00be\u00bf\f\7\2\2\u00bf\u00c0\7"+
		"\36\2\2\u00c0\u00c5\5(\25\b\u00c1\u00c2\f\6\2\2\u00c2\u00c3\7 \2\2\u00c3"+
		"\u00c5\5(\25\7\u00c4\u00b8\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00be\3\2"+
		"\2\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7)\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00d0\7\25\2\2"+
		"\u00ca\u00d0\7\26\2\2\u00cb\u00d0\7$\2\2\u00cc\u00d0\7+\2\2\u00cd\u00d0"+
		"\58\35\2\u00ce\u00d0\5\62\32\2\u00cf\u00c9\3\2\2\2\u00cf\u00ca\3\2\2\2"+
		"\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0+\3\2\2\2\u00d1\u00d2\7%\2\2\u00d2\u00d3\7+\2\2\u00d3\u00d4"+
		"\7+\2\2\u00d4-\3\2\2\2\u00d5\u00d9\7\5\2\2\u00d6\u00d8\5\60\31\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da/\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\7$\2\2\u00dd\u00dc"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\t\3\2\2\u00e3\61\3\2\2"+
		"\2\u00e4\u00e5\7+\2\2\u00e5\u00e6\7\5\2\2\u00e6\u00e7\5\64\33\2\u00e7"+
		"\u00e8\7\6\2\2\u00e8\63\3\2\2\2\u00e9\u00ee\5(\25\2\u00ea\u00eb\7\"\2"+
		"\2\u00eb\u00ed\5(\25\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00e9\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\65\3\2\2\2\u00f3\u00f4\7&\2\2"+
		"\u00f4\u00f5\t\4\2\2\u00f5\u00f6\7)\2\2\u00f6\u00f7\5:\36\2\u00f7\67\3"+
		"\2\2\2\u00f8\u00f9\7\5\2\2\u00f9\u00fa\5(\25\2\u00fa\u00fb\7\6\2\2\u00fb"+
		"9\3\2\2\2\u00fc\u00fe\7-\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\7,\2\2\u0100;\3\2\2\2\27?HNU]ot\u0080\u0087"+
		"\u009b\u009e\u00a6\u00b6\u00c4\u00c6\u00cf\u00d9\u00df\u00ee\u00f1\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}