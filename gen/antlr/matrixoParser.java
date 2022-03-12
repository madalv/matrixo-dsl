// Generated from C:/Users/Vlada/Downloads/pbl-sem-4/antlr/src/antlr\matrixo.g4 by ANTLR 4.9.2
package antlr;

package antlr;

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
		T__0=1, INBUILT_OPERATION=2, RETURN=3, FOR=4, L_PAR=5, R_PAR=6, SEMICOL=7, 
		ELSE=8, IF=9, L_BRAK=10, L_SQBRAK=11, R_SQBRAK=12, R_BRAK=13, WHILE=14, 
		COMMENT=15, VOID=16, FUNCTION=17, RETURNS=18, INT=19, LONGINT=20, BOOL=21, 
		DOUBLE=22, MATRIX=23, VECTOR=24, BREAK=25, PREFIX_OP=26, INFIX_OP=27, 
		ASSIGN_OP=28, COMMA=29, DOT=30, CHARACTER=31, NONZERO_DIGIT=32, GET=33, 
		IMPORT=34, FILE_TYPE=35, BACKSLASH=36, SPACE=37, FROM=38;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_nosemicolon_s = 2, RULE_semicolon_s = 3, 
		RULE_return_s = 4, RULE_ctrlflow_s = 5, RULE_for_s = 6, RULE_if_s = 7, 
		RULE_else_s = 8, RULE_while_s = 9, RULE_block = 10, RULE_return_type = 11, 
		RULE_assignment = 12, RULE_declaration = 13, RULE_function_dec = 14, RULE_parameter = 15, 
		RULE_variable_dec = 16, RULE_variable_init = 17, RULE_type = 18, RULE_scalar_type = 19, 
		RULE_multidim_type = 20, RULE_expression = 21, RULE_get_call = 22, RULE_matrix_init = 23, 
		RULE_row = 24, RULE_function_call = 25, RULE_prefix_expr = 26, RULE_paranthesis_expr = 27, 
		RULE_bracket_expr = 28, RULE_identifier = 29, RULE_double = 30, RULE_integer = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "nosemicolon_s", "semicolon_s", "return_s", "ctrlflow_s", 
			"for_s", "if_s", "else_s", "while_s", "block", "return_type", "assignment", 
			"declaration", "function_dec", "parameter", "variable_dec", "variable_init", 
			"type", "scalar_type", "multidim_type", "expression", "get_call", "matrix_init", 
			"row", "function_call", "prefix_expr", "paranthesis_expr", "bracket_expr", 
			"identifier", "double", "integer"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitProgram(this);
		}
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
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					statement();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(70);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitStatement(this);
		}
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				nosemicolon_s();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(73);
				semicolon_s();
				setState(74);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterNosemicolon_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitNosemicolon_s(this);
		}
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
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				ctrlflow_s();
				}
				break;
			case L_BRAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				block();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterSemicolon_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitSemicolon_s(this);
		}
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				return_s();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterReturn_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitReturn_s(this);
		}
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
			setState(90);
			match(RETURN);
			setState(91);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterCtrlflow_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitCtrlflow_s(this);
		}
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				for_s();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				if_s();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterFor_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitFor_s(this);
		}
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
			setState(98);
			match(FOR);
			setState(99);
			match(L_PAR);
			setState(100);
			variable_dec();
			setState(101);
			match(SEMICOL);
			setState(102);
			expression(0);
			setState(103);
			match(SEMICOL);
			setState(104);
			expression(0);
			setState(105);
			match(R_PAR);
			setState(106);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterIf_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitIf_s(this);
		}
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
			setState(108);
			match(IF);
			setState(109);
			match(L_PAR);
			setState(110);
			expression(0);
			setState(111);
			match(R_PAR);
			setState(112);
			statement();
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(113);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterElse_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitElse_s(this);
		}
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
			setState(116);
			match(ELSE);
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(117);
				if_s();
				}
				break;
			case 2:
				{
				setState(118);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterWhile_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitWhile_s(this);
		}
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
			setState(121);
			match(WHILE);
			setState(122);
			match(L_PAR);
			setState(123);
			expression(0);
			setState(124);
			match(R_PAR);
			setState(125);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitBlock(this);
		}
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
			setState(127);
			match(L_BRAK);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					statement();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(134);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitReturn_type(this);
		}
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case LONGINT:
			case BOOL:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(matrixoParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitAssignment(this);
		}
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
			setState(140);
			identifier();
			setState(141);
			match(ASSIGN_OP);
			setState(142);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitDeclaration(this);
		}
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				function_dec();
				}
				break;
			case INT:
			case LONGINT:
			case BOOL:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterFunction_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitFunction_dec(this);
		}
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
			setState(148);
			match(FUNCTION);
			setState(149);
			identifier();
			setState(150);
			match(L_PAR);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LONGINT) | (1L << BOOL) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(151);
				parameter();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(R_PAR);
			setState(158);
			match(RETURNS);
			setState(159);
			return_type();
			setState(160);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(matrixoParser.COMMA, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitParameter(this);
		}
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
			setState(162);
			type();
			setState(163);
			identifier();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(164);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_initContext variable_init() {
			return getRuleContext(Variable_initContext.class,0);
		}
		public Variable_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterVariable_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitVariable_dec(this);
		}
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
			setState(167);
			type();
			setState(168);
			identifier();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(169);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterVariable_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitVariable_init(this);
		}
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
			setState(172);
			match(ASSIGN_OP);
			setState(173);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitType(this);
		}
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				scalar_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
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
		public TerminalNode INT() { return getToken(matrixoParser.INT, 0); }
		public TerminalNode LONGINT() { return getToken(matrixoParser.LONGINT, 0); }
		public TerminalNode BOOL() { return getToken(matrixoParser.BOOL, 0); }
		public TerminalNode DOUBLE() { return getToken(matrixoParser.DOUBLE, 0); }
		public Scalar_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterScalar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitScalar_type(this);
		}
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
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LONGINT) | (1L << BOOL) | (1L << DOUBLE))) != 0)) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterMultidim_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitMultidim_type(this);
		}
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
			setState(181);
			scalar_type();
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==MATRIX || _la==VECTOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_SQBRAK) {
				{
				{
				setState(183);
				bracket_expr();
				}
				}
				setState(188);
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public DoubleContext double() {
			return getRuleContext(DoubleContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Prefix_exprContext prefix_expr() {
			return getRuleContext(Prefix_exprContext.class,0);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INFIX_OP() { return getToken(matrixoParser.INFIX_OP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitExpression(this);
		}
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
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(190);
				integer();
				}
				break;
			case 2:
				{
				setState(191);
				double();
				}
				break;
			case 3:
				{
				setState(192);
				identifier();
				}
				break;
			case 4:
				{
				setState(193);
				prefix_expr();
				}
				break;
			case 5:
				{
				}
				break;
			case 6:
				{
				setState(195);
				bracket_expr();
				}
				break;
			case 7:
				{
				setState(196);
				matrix_init();
				}
				break;
			case 8:
				{
				setState(197);
				paranthesis_expr();
				}
				break;
			case 9:
				{
				setState(198);
				function_call();
				}
				break;
			case 10:
				{
				setState(199);
				get_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
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
					setState(202);
					if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
					setState(203);
					match(INFIX_OP);
					setState(204);
					expression(10);
					}
					} 
				}
				setState(209);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INBUILT_OPERATION() { return getToken(matrixoParser.INBUILT_OPERATION, 0); }
		public Get_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterGet_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitGet_call(this);
		}
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
			setState(210);
			match(GET);
			setState(211);
			identifier();
			setState(212);
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
		public TerminalNode R_PAR() { return getToken(matrixoParser.R_PAR, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterMatrix_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitMatrix_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitMatrix_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matrix_initContext matrix_init() throws RecognitionException {
		Matrix_initContext _localctx = new Matrix_initContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_matrix_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(L_PAR);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==NONZERO_DIGIT) {
				{
				{
				setState(215);
				row();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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

	public static class RowContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(matrixoParser.COMMA, 0); }
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<DoubleContext> double() {
			return getRuleContexts(DoubleContext.class);
		}
		public DoubleContext double(int i) {
			return getRuleContext(DoubleContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitRow(this);
		}
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
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NONZERO_DIGIT) {
				{
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(223);
					integer();
					}
					break;
				case 2:
					{
					setState(224);
					double();
					}
					break;
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(COMMA);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode L_PAR() { return getToken(matrixoParser.L_PAR, 0); }
		public TerminalNode R_PAR() { return getToken(matrixoParser.R_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(matrixoParser.COMMA, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			identifier();
			setState(233);
			match(L_PAR);
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(234);
				expression(0);
				setState(235);
				match(COMMA);
				}
				break;
			}
			setState(239);
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

	public static class Prefix_exprContext extends ParserRuleContext {
		public TerminalNode PREFIX_OP() { return getToken(matrixoParser.PREFIX_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Prefix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterPrefix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitPrefix_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitPrefix_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_exprContext prefix_expr() throws RecognitionException {
		Prefix_exprContext _localctx = new Prefix_exprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_prefix_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(PREFIX_OP);
			setState(242);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterParanthesis_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitParanthesis_expr(this);
		}
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
			setState(244);
			match(L_PAR);
			setState(245);
			expression(0);
			setState(246);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterBracket_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitBracket_expr(this);
		}
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
			setState(248);
			match(L_SQBRAK);
			setState(249);
			expression(0);
			setState(250);
			match(R_SQBRAK);
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(251);
				match(L_SQBRAK);
				setState(252);
				expression(0);
				setState(253);
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTER() { return getTokens(matrixoParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(matrixoParser.CHARACTER, i);
		}
		public List<TerminalNode> NONZERO_DIGIT() { return getTokens(matrixoParser.NONZERO_DIGIT); }
		public TerminalNode NONZERO_DIGIT(int i) {
			return getToken(matrixoParser.NONZERO_DIGIT, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(CHARACTER);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CHARACTER) | (1L << NONZERO_DIGIT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class DoubleContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode DOT() { return getToken(matrixoParser.DOT, 0); }
		public List<TerminalNode> NONZERO_DIGIT() { return getTokens(matrixoParser.NONZERO_DIGIT); }
		public TerminalNode NONZERO_DIGIT(int i) {
			return getToken(matrixoParser.NONZERO_DIGIT, i);
		}
		public DoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleContext double() throws RecognitionException {
		DoubleContext _localctx = new DoubleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_double);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			integer();
			setState(265);
			match(DOT);
			setState(267); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(266);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==NONZERO_DIGIT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(269); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> NONZERO_DIGIT() { return getTokens(matrixoParser.NONZERO_DIGIT); }
		public TerminalNode NONZERO_DIGIT(int i) {
			return getToken(matrixoParser.NONZERO_DIGIT, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrixoListener ) ((matrixoListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrixoVisitor ) return ((matrixoVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_integer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(NONZERO_DIGIT);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(272);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==NONZERO_DIGIT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0119\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3"+
		"\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\7\3\7\3\7\5"+
		"\7c\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\tu\n\t\3\n\3\n\3\n\5\nz\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\7\f\u0084\n\f\f\f\16\f\u0087\13\f\3\f\3\f\3\r\3\r\5\r\u008d\n\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\5\17\u0095\n\17\3\20\3\20\3\20\3\20\7\20\u009b"+
		"\n\20\f\20\16\20\u009e\13\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5"+
		"\21\u00a8\n\21\3\22\3\22\3\22\5\22\u00ad\n\22\3\23\3\23\3\23\3\24\3\24"+
		"\5\24\u00b4\n\24\3\25\3\25\3\26\3\26\3\26\7\26\u00bb\n\26\f\26\16\26\u00be"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00cb"+
		"\n\27\3\27\3\27\3\27\7\27\u00d0\n\27\f\27\16\27\u00d3\13\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\7\31\u00db\n\31\f\31\16\31\u00de\13\31\3\31\3\31"+
		"\3\32\3\32\7\32\u00e4\n\32\f\32\16\32\u00e7\13\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00f0\n\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0102\n\36\3\37\3\37\7\37"+
		"\u0106\n\37\f\37\16\37\u0109\13\37\3 \3 \3 \6 \u010e\n \r \16 \u010f\3"+
		"!\3!\7!\u0114\n!\f!\16!\u0117\13!\3!\2\3,\"\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\6\3\2\25\30\3\2\31\32\4\2\3\3"+
		"!\"\4\2\3\3\"\"\2\u011e\2E\3\2\2\2\4N\3\2\2\2\6S\3\2\2\2\bZ\3\2\2\2\n"+
		"\\\3\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20n\3\2\2\2\22v\3\2\2\2\24{\3\2\2\2"+
		"\26\u0081\3\2\2\2\30\u008c\3\2\2\2\32\u008e\3\2\2\2\34\u0094\3\2\2\2\36"+
		"\u0096\3\2\2\2 \u00a4\3\2\2\2\"\u00a9\3\2\2\2$\u00ae\3\2\2\2&\u00b3\3"+
		"\2\2\2(\u00b5\3\2\2\2*\u00b7\3\2\2\2,\u00ca\3\2\2\2.\u00d4\3\2\2\2\60"+
		"\u00d8\3\2\2\2\62\u00e5\3\2\2\2\64\u00ea\3\2\2\2\66\u00f3\3\2\2\28\u00f6"+
		"\3\2\2\2:\u00fa\3\2\2\2<\u0103\3\2\2\2>\u010a\3\2\2\2@\u0111\3\2\2\2B"+
		"D\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2"+
		"HI\7\2\2\3I\3\3\2\2\2JO\5\6\4\2KL\5\b\5\2LM\7\t\2\2MO\3\2\2\2NJ\3\2\2"+
		"\2NK\3\2\2\2O\5\3\2\2\2PT\5\f\7\2QT\5\26\f\2RT\7\21\2\2SP\3\2\2\2SQ\3"+
		"\2\2\2SR\3\2\2\2T\7\3\2\2\2U[\5\34\17\2V[\5\n\6\2W[\5\32\16\2X[\5,\27"+
		"\2Y[\7\33\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\t\3\2"+
		"\2\2\\]\7\5\2\2]^\5,\27\2^\13\3\2\2\2_c\5\16\b\2`c\5\20\t\2ac\5\24\13"+
		"\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\r\3\2\2\2de\7\6\2\2ef\7\7\2\2fg\5\""+
		"\22\2gh\7\t\2\2hi\5,\27\2ij\7\t\2\2jk\5,\27\2kl\7\b\2\2lm\5\4\3\2m\17"+
		"\3\2\2\2no\7\13\2\2op\7\7\2\2pq\5,\27\2qr\7\b\2\2rt\5\4\3\2su\5\22\n\2"+
		"ts\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vy\7\n\2\2wz\5\20\t\2xz\5\4\3\2yw\3\2"+
		"\2\2yx\3\2\2\2z\23\3\2\2\2{|\7\20\2\2|}\7\7\2\2}~\5,\27\2~\177\7\b\2\2"+
		"\177\u0080\5\4\3\2\u0080\25\3\2\2\2\u0081\u0085\7\f\2\2\u0082\u0084\5"+
		"\4\3\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\17"+
		"\2\2\u0089\27\3\2\2\2\u008a\u008d\5&\24\2\u008b\u008d\7\22\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008b\3\2\2\2\u008d\31\3\2\2\2\u008e\u008f\5<\37\2\u008f"+
		"\u0090\7\36\2\2\u0090\u0091\5,\27\2\u0091\33\3\2\2\2\u0092\u0095\5\36"+
		"\20\2\u0093\u0095\5\"\22\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\35\3\2\2\2\u0096\u0097\7\23\2\2\u0097\u0098\5<\37\2\u0098\u009c\7\7\2"+
		"\2\u0099\u009b\5 \21\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\7\b\2\2\u00a0\u00a1\7\24\2\2\u00a1\u00a2\5\30\r\2\u00a2\u00a3\5"+
		"\26\f\2\u00a3\37\3\2\2\2\u00a4\u00a5\5&\24\2\u00a5\u00a7\5<\37\2\u00a6"+
		"\u00a8\7\37\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8!\3\2\2\2"+
		"\u00a9\u00aa\5&\24\2\u00aa\u00ac\5<\37\2\u00ab\u00ad\5$\23\2\u00ac\u00ab"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad#\3\2\2\2\u00ae\u00af\7\36\2\2\u00af"+
		"\u00b0\5,\27\2\u00b0%\3\2\2\2\u00b1\u00b4\5(\25\2\u00b2\u00b4\5*\26\2"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\'\3\2\2\2\u00b5\u00b6\t"+
		"\2\2\2\u00b6)\3\2\2\2\u00b7\u00b8\5(\25\2\u00b8\u00bc\t\3\2\2\u00b9\u00bb"+
		"\5:\36\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd+\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\b\27\1\2"+
		"\u00c0\u00cb\5@!\2\u00c1\u00cb\5> \2\u00c2\u00cb\5<\37\2\u00c3\u00cb\5"+
		"\66\34\2\u00c4\u00cb\3\2\2\2\u00c5\u00cb\5:\36\2\u00c6\u00cb\5\60\31\2"+
		"\u00c7\u00cb\58\35\2\u00c8\u00cb\5\64\33\2\u00c9\u00cb\5.\30\2\u00ca\u00bf"+
		"\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c3\3\2\2\2\u00ca"+
		"\u00c4\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00d1\3\2\2\2\u00cc"+
		"\u00cd\f\13\2\2\u00cd\u00ce\7\35\2\2\u00ce\u00d0\5,\27\f\u00cf\u00cc\3"+
		"\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"-\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6\5<\37\2\u00d6"+
		"\u00d7\7\4\2\2\u00d7/\3\2\2\2\u00d8\u00dc\7\7\2\2\u00d9\u00db\5\62\32"+
		"\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\b\2\2\u00e0"+
		"\61\3\2\2\2\u00e1\u00e4\5@!\2\u00e2\u00e4\5> \2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\37\2\2\u00e9"+
		"\63\3\2\2\2\u00ea\u00eb\5<\37\2\u00eb\u00ef\7\7\2\2\u00ec\u00ed\5,\27"+
		"\2\u00ed\u00ee\7\37\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\b\2\2\u00f2\65\3\2\2"+
		"\2\u00f3\u00f4\7\34\2\2\u00f4\u00f5\5,\27\2\u00f5\67\3\2\2\2\u00f6\u00f7"+
		"\7\7\2\2\u00f7\u00f8\5,\27\2\u00f8\u00f9\7\b\2\2\u00f99\3\2\2\2\u00fa"+
		"\u00fb\7\r\2\2\u00fb\u00fc\5,\27\2\u00fc\u0101\7\16\2\2\u00fd\u00fe\7"+
		"\r\2\2\u00fe\u00ff\5,\27\2\u00ff\u0100\7\16\2\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00fd\3\2\2\2\u0101\u0102\3\2\2\2\u0102;\3\2\2\2\u0103\u0107\7!\2\2\u0104"+
		"\u0106\t\4\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108=\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b"+
		"\5@!\2\u010b\u010d\7 \2\2\u010c\u010e\t\5\2\2\u010d\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110?\3\2\2\2"+
		"\u0111\u0115\7\"\2\2\u0112\u0114\t\5\2\2\u0113\u0112\3\2\2\2\u0114\u0117"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116A\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\33ENSZbty\u0085\u008c\u0094\u009c\u00a7\u00ac\u00b3\u00bc"+
		"\u00ca\u00d1\u00dc\u00e3\u00e5\u00ef\u0101\u0107\u010f\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}