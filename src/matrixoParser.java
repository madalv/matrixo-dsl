// Generated from C:/Users/Vlada/Downloads/pbl-sem-4/matrixoLang/src\matrixo.g4 by ANTLR 4.9.2



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
		WHILE=14, COMMENT=15, VOID=16, FUNCTION=17, RETURNS=18, INT_TYPE=19, LONGINT=20, 
		BOOL=21, DOUBLE_TYPE=22, MATRIX=23, VECTOR=24, BREAK=25, PREFIX_OP=26, 
		INFIX_OP=27, ASSIGN_OP=28, COMMA=29, DOT=30, INTEGER=31, DOUBLE=32, GET=33, 
		IMPORT=34, FILE_TYPE=35, SPACE=36, FROM=37, IDENTIFIER=38, NAME=39, PATH=40;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_nosemicolon_s = 2, RULE_semicolon_s = 3, 
		RULE_return_s = 4, RULE_ctrlflow_s = 5, RULE_for_s = 6, RULE_if_s = 7, 
		RULE_else_s = 8, RULE_while_s = 9, RULE_block = 10, RULE_return_type = 11, 
		RULE_assignment = 12, RULE_declaration = 13, RULE_function_dec = 14, RULE_parameter = 15, 
		RULE_variable_dec = 16, RULE_variable_init = 17, RULE_type = 18, RULE_scalar_type = 19, 
		RULE_multidim_type = 20, RULE_expression = 21, RULE_get_call = 22, RULE_matrix_init = 23, 
		RULE_row = 24, RULE_function_call = 25, RULE_import_call = 26, RULE_paranthesis_expr = 27, 
		RULE_bracket_expr = 28, RULE_filename = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "nosemicolon_s", "semicolon_s", "return_s", "ctrlflow_s", 
			"for_s", "if_s", "else_s", "while_s", "block", "return_type", "assignment", 
			"declaration", "function_dec", "parameter", "variable_dec", "variable_init", 
			"type", "scalar_type", "multidim_type", "expression", "get_call", "matrix_init", 
			"row", "function_call", "import_call", "paranthesis_expr", "bracket_expr", 
			"filename"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'print'", "'return'", "'for'", "'('", "')'", "';'", "'else'", 
			"'if'", "'{'", "'['", "']'", "'}'", "'while'", null, "'void'", null, 
			null, "'int'", "'longint'", "'bool'", "'double'", "'matrix'", "'vector'", 
			"'break'", null, null, null, "','", "'.'", null, null, "'get'", null, 
			null, null, "'from'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INBUILT_OPERATION", "INBUILT_FUNCTION", "RETURN", "FOR", "L_PAR", 
			"R_PAR", "SEMICOL", "ELSE", "IF", "L_BRAK", "L_SQBRAK", "R_SQBRAK", "R_BRAK", 
			"WHILE", "COMMENT", "VOID", "FUNCTION", "RETURNS", "INT_TYPE", "LONGINT", 
			"BOOL", "DOUBLE_TYPE", "MATRIX", "VECTOR", "BREAK", "PREFIX_OP", "INFIX_OP", 
			"ASSIGN_OP", "COMMA", "DOT", "INTEGER", "DOUBLE", "GET", "IMPORT", "FILE_TYPE", 
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					statement();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(66);
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				nosemicolon_s();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(69);
				semicolon_s();
				setState(70);
				match(SEMICOL);
				}
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

	public static class Nosemicolon_sContext extends ParserRuleContext {
		public Ctrlflow_sContext ctrlflow_s() {
			return getRuleContext(Ctrlflow_sContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(matrixoParser.COMMENT, 0); }
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				ctrlflow_s();
				}
				break;
			case L_BRAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				block();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(COMMENT);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				return_s();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
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
			setState(86);
			match(RETURN);
			setState(87);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				for_s();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				if_s();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
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
			setState(94);
			match(FOR);
			setState(95);
			match(L_PAR);
			setState(96);
			variable_dec();
			setState(97);
			match(SEMICOL);
			setState(98);
			expression(0);
			setState(99);
			match(SEMICOL);
			setState(100);
			expression(0);
			setState(101);
			match(R_PAR);
			setState(102);
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
			setState(104);
			match(IF);
			setState(105);
			match(L_PAR);
			setState(106);
			expression(0);
			setState(107);
			match(R_PAR);
			setState(108);
			statement();
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(109);
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
			setState(112);
			match(ELSE);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(113);
				if_s();
				}
				break;
			case 2:
				{
				setState(114);
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
			setState(117);
			match(WHILE);
			setState(118);
			match(L_PAR);
			setState(119);
			expression(0);
			setState(120);
			match(R_PAR);
			setState(121);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(L_BRAK);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					statement();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(130);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case LONGINT:
			case BOOL:
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
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
			setState(136);
			match(IDENTIFIER);
			setState(137);
			match(ASSIGN_OP);
			setState(138);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Function_decContext function_dec() {
			return getRuleContext(Function_decContext.class,0);
		}
		public Variable_decContext variable_dec() {
			return getRuleContext(Variable_decContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				function_dec();
				}
				break;
			case INT_TYPE:
			case LONGINT:
			case BOOL:
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				variable_dec();
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
		enterRule(_localctx, 28, RULE_function_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(FUNCTION);
			setState(145);
			match(IDENTIFIER);
			setState(146);
			match(L_PAR);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << LONGINT) | (1L << BOOL) | (1L << DOUBLE_TYPE))) != 0)) {
				{
				{
				setState(147);
				parameter();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(R_PAR);
			setState(154);
			match(RETURNS);
			setState(155);
			return_type();
			setState(156);
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
		enterRule(_localctx, 30, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			type();
			setState(159);
			match(IDENTIFIER);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(160);
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
		enterRule(_localctx, 32, RULE_variable_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			type();
			setState(164);
			match(IDENTIFIER);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(165);
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
			setState(168);
			match(ASSIGN_OP);
			setState(169);
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
		public Scalar_typeContext scalar_type() {
			return getRuleContext(Scalar_typeContext.class,0);
		}
		public Multidim_typeContext multidim_type() {
			return getRuleContext(Multidim_typeContext.class,0);
		}
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
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				scalar_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				multidim_type();
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

	public static class Scalar_typeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(matrixoParser.INT_TYPE, 0); }
		public TerminalNode LONGINT() { return getToken(matrixoParser.LONGINT, 0); }
		public TerminalNode BOOL() { return getToken(matrixoParser.BOOL, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(matrixoParser.DOUBLE_TYPE, 0); }
		public Scalar_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitScalar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_typeContext scalar_type() throws RecognitionException {
		Scalar_typeContext _localctx = new Scalar_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_scalar_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << LONGINT) | (1L << BOOL) | (1L << DOUBLE_TYPE))) != 0)) ) {
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

	public static class Multidim_typeContext extends ParserRuleContext {
		public Scalar_typeContext scalar_type() {
			return getRuleContext(Scalar_typeContext.class,0);
		}
		public TerminalNode MATRIX() { return getToken(matrixoParser.MATRIX, 0); }
		public TerminalNode VECTOR() { return getToken(matrixoParser.VECTOR, 0); }
		public List<Bracket_exprContext> bracket_expr() {
			return getRuleContexts(Bracket_exprContext.class);
		}
		public Bracket_exprContext bracket_expr(int i) {
			return getRuleContext(Bracket_exprContext.class,i);
		}
		public Multidim_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multidim_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitMultidim_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multidim_typeContext multidim_type() throws RecognitionException {
		Multidim_typeContext _localctx = new Multidim_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multidim_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			scalar_type();
			setState(178);
			_la = _input.LA(1);
			if ( !(_la==MATRIX || _la==VECTOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_SQBRAK) {
				{
				{
				setState(179);
				bracket_expr();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public TerminalNode INTEGER() { return getToken(matrixoParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(matrixoParser.DOUBLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(matrixoParser.IDENTIFIER, 0); }
		public TerminalNode PREFIX_OP() { return getToken(matrixoParser.PREFIX_OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Bracket_exprContext bracket_expr() {
			return getRuleContext(Bracket_exprContext.class,0);
		}
		public Matrix_initContext matrix_init() {
			return getRuleContext(Matrix_initContext.class,0);
		}
		public Paranthesis_exprContext paranthesis_expr() {
			return getRuleContext(Paranthesis_exprContext.class,0);
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
		public TerminalNode INFIX_OP() { return getToken(matrixoParser.INFIX_OP, 0); }
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(186);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(187);
				match(DOUBLE);
				}
				break;
			case 3:
				{
				setState(188);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(189);
				match(PREFIX_OP);
				setState(190);
				expression(8);
				}
				break;
			case 5:
				{
				}
				break;
			case 6:
				{
				setState(192);
				bracket_expr();
				}
				break;
			case 7:
				{
				setState(193);
				matrix_init();
				}
				break;
			case 8:
				{
				setState(194);
				paranthesis_expr();
				}
				break;
			case 9:
				{
				setState(195);
				function_call();
				}
				break;
			case 10:
				{
				setState(196);
				get_call();
				}
				break;
			case 11:
				{
				setState(197);
				import_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(200);
					if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
					setState(201);
					match(INFIX_OP);
					setState(202);
					expression(11);
					}
					} 
				}
				setState(207);
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
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 44, RULE_get_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(GET);
			setState(209);
			match(IDENTIFIER);
			setState(210);
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
		enterRule(_localctx, 46, RULE_matrix_init);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(L_PAR);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213);
					row();
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public List<TerminalNode> INTEGER() { return getTokens(matrixoParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(matrixoParser.INTEGER, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(matrixoParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(matrixoParser.DOUBLE, i);
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
		enterRule(_localctx, 48, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTEGER || _la==DOUBLE) {
				{
				{
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==INTEGER || _la==DOUBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
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
		enterRule(_localctx, 50, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !(_la==INBUILT_FUNCTION || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(228);
			match(L_PAR);
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(229);
				expression(0);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(230);
					match(COMMA);
					}
				}

				}
				break;
			}
			setState(235);
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
		enterRule(_localctx, 52, RULE_import_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(IMPORT);
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==MATRIX || _la==VECTOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(239);
			match(FROM);
			setState(240);
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
			setState(242);
			match(L_PAR);
			setState(243);
			expression(0);
			setState(244);
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

	public static class Bracket_exprContext extends ParserRuleContext {
		public List<TerminalNode> L_SQBRAK() { return getTokens(matrixoParser.L_SQBRAK); }
		public TerminalNode L_SQBRAK(int i) {
			return getToken(matrixoParser.L_SQBRAK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> R_SQBRAK() { return getTokens(matrixoParser.R_SQBRAK); }
		public TerminalNode R_SQBRAK(int i) {
			return getToken(matrixoParser.R_SQBRAK, i);
		}
		public Bracket_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitBracket_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracket_exprContext bracket_expr() throws RecognitionException {
		Bracket_exprContext _localctx = new Bracket_exprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bracket_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(L_SQBRAK);
			setState(247);
			expression(0);
			setState(248);
			match(R_SQBRAK);
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(249);
				match(L_SQBRAK);
				setState(250);
				expression(0);
				setState(251);
				match(R_SQBRAK);
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
		enterRule(_localctx, 58, RULE_filename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATH) {
				{
				setState(255);
				match(PATH);
				}
			}

			setState(258);
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
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0107\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\5\4P"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7_\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t"+
		"\3\n\3\n\3\n\5\nv\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u0080"+
		"\n\f\f\f\16\f\u0083\13\f\3\f\3\f\3\r\3\r\5\r\u0089\n\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\5\17\u0091\n\17\3\20\3\20\3\20\3\20\7\20\u0097\n\20\f"+
		"\20\16\20\u009a\13\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00a4"+
		"\n\21\3\22\3\22\3\22\5\22\u00a9\n\22\3\23\3\23\3\23\3\24\3\24\5\24\u00b0"+
		"\n\24\3\25\3\25\3\26\3\26\3\26\7\26\u00b7\n\26\f\26\16\26\u00ba\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u00c9\n\27\3\27\3\27\3\27\7\27\u00ce\n\27\f\27\16\27\u00d1\13\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\7\31\u00d9\n\31\f\31\16\31\u00dc\13\31\3\32"+
		"\7\32\u00df\n\32\f\32\16\32\u00e2\13\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\5\33\u00ea\n\33\5\33\u00ec\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0100\n\36"+
		"\3\37\5\37\u0103\n\37\3\37\3\37\3\37\2\3, \2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\7\3\2\25\30\3\2\31\32\3\2!\"\4"+
		"\2\b\b\37\37\4\2\4\4((\2\u010d\2A\3\2\2\2\4J\3\2\2\2\6O\3\2\2\2\bV\3\2"+
		"\2\2\nX\3\2\2\2\f^\3\2\2\2\16`\3\2\2\2\20j\3\2\2\2\22r\3\2\2\2\24w\3\2"+
		"\2\2\26}\3\2\2\2\30\u0088\3\2\2\2\32\u008a\3\2\2\2\34\u0090\3\2\2\2\36"+
		"\u0092\3\2\2\2 \u00a0\3\2\2\2\"\u00a5\3\2\2\2$\u00aa\3\2\2\2&\u00af\3"+
		"\2\2\2(\u00b1\3\2\2\2*\u00b3\3\2\2\2,\u00c8\3\2\2\2.\u00d2\3\2\2\2\60"+
		"\u00d6\3\2\2\2\62\u00e0\3\2\2\2\64\u00e5\3\2\2\2\66\u00ef\3\2\2\28\u00f4"+
		"\3\2\2\2:\u00f8\3\2\2\2<\u0102\3\2\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A"+
		"?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\2\2\3E\3\3\2\2\2FK\5\6\4\2"+
		"GH\5\b\5\2HI\7\t\2\2IK\3\2\2\2JF\3\2\2\2JG\3\2\2\2K\5\3\2\2\2LP\5\f\7"+
		"\2MP\5\26\f\2NP\7\21\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QW\5"+
		"\34\17\2RW\5\n\6\2SW\5\32\16\2TW\5,\27\2UW\7\33\2\2VQ\3\2\2\2VR\3\2\2"+
		"\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\t\3\2\2\2XY\7\5\2\2YZ\5,\27\2Z\13\3"+
		"\2\2\2[_\5\16\b\2\\_\5\20\t\2]_\5\24\13\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2"+
		"\2_\r\3\2\2\2`a\7\6\2\2ab\7\7\2\2bc\5\"\22\2cd\7\t\2\2de\5,\27\2ef\7\t"+
		"\2\2fg\5,\27\2gh\7\b\2\2hi\5\4\3\2i\17\3\2\2\2jk\7\13\2\2kl\7\7\2\2lm"+
		"\5,\27\2mn\7\b\2\2np\5\4\3\2oq\5\22\n\2po\3\2\2\2pq\3\2\2\2q\21\3\2\2"+
		"\2ru\7\n\2\2sv\5\20\t\2tv\5\4\3\2us\3\2\2\2ut\3\2\2\2v\23\3\2\2\2wx\7"+
		"\20\2\2xy\7\7\2\2yz\5,\27\2z{\7\b\2\2{|\5\4\3\2|\25\3\2\2\2}\u0081\7\f"+
		"\2\2~\u0080\5\4\3\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085"+
		"\7\17\2\2\u0085\27\3\2\2\2\u0086\u0089\5&\24\2\u0087\u0089\7\22\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\31\3\2\2\2\u008a\u008b\7(\2\2"+
		"\u008b\u008c\7\36\2\2\u008c\u008d\5,\27\2\u008d\33\3\2\2\2\u008e\u0091"+
		"\5\36\20\2\u008f\u0091\5\"\22\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2"+
		"\2\u0091\35\3\2\2\2\u0092\u0093\7\23\2\2\u0093\u0094\7(\2\2\u0094\u0098"+
		"\7\7\2\2\u0095\u0097\5 \21\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009c\7\b\2\2\u009c\u009d\7\24\2\2\u009d\u009e\5\30\r\2\u009e"+
		"\u009f\5\26\f\2\u009f\37\3\2\2\2\u00a0\u00a1\5&\24\2\u00a1\u00a3\7(\2"+
		"\2\u00a2\u00a4\7\37\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"!\3\2\2\2\u00a5\u00a6\5&\24\2\u00a6\u00a8\7(\2\2\u00a7\u00a9\5$\23\2\u00a8"+
		"\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9#\3\2\2\2\u00aa\u00ab\7\36\2\2"+
		"\u00ab\u00ac\5,\27\2\u00ac%\3\2\2\2\u00ad\u00b0\5(\25\2\u00ae\u00b0\5"+
		"*\26\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\'\3\2\2\2\u00b1\u00b2"+
		"\t\2\2\2\u00b2)\3\2\2\2\u00b3\u00b4\5(\25\2\u00b4\u00b8\t\3\2\2\u00b5"+
		"\u00b7\5:\36\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9+\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc"+
		"\b\27\1\2\u00bc\u00c9\7!\2\2\u00bd\u00c9\7\"\2\2\u00be\u00c9\7(\2\2\u00bf"+
		"\u00c0\7\34\2\2\u00c0\u00c9\5,\27\n\u00c1\u00c9\3\2\2\2\u00c2\u00c9\5"+
		":\36\2\u00c3\u00c9\5\60\31\2\u00c4\u00c9\58\35\2\u00c5\u00c9\5\64\33\2"+
		"\u00c6\u00c9\5.\30\2\u00c7\u00c9\5\66\34\2\u00c8\u00bb\3\2\2\2\u00c8\u00bd"+
		"\3\2\2\2\u00c8\u00be\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c8"+
		"\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cf\3\2\2\2\u00ca"+
		"\u00cb\f\f\2\2\u00cb\u00cc\7\35\2\2\u00cc\u00ce\5,\27\r\u00cd\u00ca\3"+
		"\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"-\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7#\2\2\u00d3\u00d4\7(\2\2\u00d4"+
		"\u00d5\7\3\2\2\u00d5/\3\2\2\2\u00d6\u00da\7\7\2\2\u00d7\u00d9\5\62\32"+
		"\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\61\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\t\4\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\t\5\2\2\u00e4"+
		"\63\3\2\2\2\u00e5\u00e6\t\6\2\2\u00e6\u00eb\7\7\2\2\u00e7\u00e9\5,\27"+
		"\2\u00e8\u00ea\7\37\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\7\b\2\2\u00ee\65\3\2\2\2\u00ef\u00f0\7$\2\2\u00f0\u00f1"+
		"\t\3\2\2\u00f1\u00f2\7\'\2\2\u00f2\u00f3\5<\37\2\u00f3\67\3\2\2\2\u00f4"+
		"\u00f5\7\7\2\2\u00f5\u00f6\5,\27\2\u00f6\u00f7\7\b\2\2\u00f79\3\2\2\2"+
		"\u00f8\u00f9\7\r\2\2\u00f9\u00fa\5,\27\2\u00fa\u00ff\7\16\2\2\u00fb\u00fc"+
		"\7\r\2\2\u00fc\u00fd\5,\27\2\u00fd\u00fe\7\16\2\2\u00fe\u0100\3\2\2\2"+
		"\u00ff\u00fb\3\2\2\2\u00ff\u0100\3\2\2\2\u0100;\3\2\2\2\u0101\u0103\7"+
		"*\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\7)\2\2\u0105=\3\2\2\2\31AJOV^pu\u0081\u0088\u0090\u0098\u00a3\u00a8"+
		"\u00af\u00b8\u00c8\u00cf\u00da\u00e0\u00e9\u00eb\u00ff\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}