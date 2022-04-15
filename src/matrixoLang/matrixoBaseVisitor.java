// Generated from C:/Users/Vlada/Downloads/pbl-sem-4/matrixoLang/src\matrixo.g4 by ANTLR 4.9.2

package matrixoLang;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import javax.management.ValueExp;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class matrixoBaseVisitor extends AbstractParseTreeVisitor<Value> implements matrixoVisitor<Value> {

	private InputStream stdin;
	private PrintStream stdout;
	private PrintStream stderr;
	private Memory memory;
	private PrintStream printStream;
	private BufferedReader inputStream;

	public matrixoBaseVisitor(Memory memory, InputStream stdin, PrintStream stdoutPrint, PrintStream stderrorPrint) {
		this.stdin = stdin;
		this.stdout = stdoutPrint;
		this.stderr = stderrorPrint;
		this.memory = memory;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 * @return
	 */
	@Override public Value visitProgram(matrixoParser.ProgramContext ctx) {
		init();
		return visitChildren(ctx);
	}

	private void init() {
		printStream = new PrintStream(stdout, true);
		inputStream = new BufferedReader(new InputStreamReader(stdin));
	}

	private void cleanup() {
		printStream.close();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitStatement(matrixoParser.StatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitNosemicolon_s(matrixoParser.Nosemicolon_sContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitSemicolon_s(matrixoParser.Semicolon_sContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitReturn_s(matrixoParser.Return_sContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitCtrlflow_s(matrixoParser.Ctrlflow_sContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitFor_s(matrixoParser.For_sContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitIf_s(matrixoParser.If_sContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitElse_s(matrixoParser.Else_sContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitWhile_s(matrixoParser.While_sContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitBlock(matrixoParser.BlockContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitReturn_type(matrixoParser.Return_typeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitAssignment(matrixoParser.AssignmentContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitDeclaration(matrixoParser.DeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitFunction_dec(matrixoParser.Function_decContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitParameter(matrixoParser.ParameterContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitVariable_dec(matrixoParser.Variable_decContext ctx) {
		Value v = visitScalar_type(ctx.type().multidim_type().scalar_type());
		System.out.println(v.getString());
		return visitChildren(ctx);
	}

	@Override public Value visitVariable_init(matrixoParser.Variable_initContext ctx) {
		return visitExpression(ctx.expression());
	}


	@Override public Value visitType(matrixoParser.TypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitScalar_type(matrixoParser.Scalar_typeContext ctx) {
		if (ctx.INT_TYPE() != null) return new Value(ctx.INT_TYPE().getText());
		else if (ctx.LONGINT() != null) return new Value(ctx.LONGINT().getText());
		else if (ctx.BOOL() != null) return new Value(ctx.BOOL().getText());
		else if (ctx.DOUBLE_TYPE() != null) return new Value(ctx.DOUBLE_TYPE().getText());
		else return visitChildren(ctx);
	}

	@Override public Value visitMultidim_type(matrixoParser.Multidim_typeContext ctx) {
		return visitChildren(ctx);
	}


	@Override public Value visitExpression(matrixoParser.ExpressionContext ctx) {
		if (ctx.getChildCount() == 1) {
			if (ctx.IDENTIFIER() != null) return new Value(ctx.IDENTIFIER().getText());
			else if (ctx.INTEGER() != null) return new Value(Integer.parseInt(ctx.INTEGER().getText()));
			else if (ctx.DOUBLE() != null) return new Value(Double.parseDouble(ctx.DOUBLE().getText()));
			else if (ctx.matrix_init() != null) return visitMatrix_init(ctx.matrix_init());

			// TODO: add rest of expression derivations
		}
		return visitChildren(ctx);
	}



	@Override public Value visitGet_call(matrixoParser.Get_callContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitMatrix_init(matrixoParser.Matrix_initContext ctx) {

		if (ctx.getChildCount() == 2) {
			Vector<Double> v = new Vector<>((ArrayList<Double>) visitRow(ctx.row(0)).getList());
			return new Value(v);
		} else {
			Matrix<Double> m = new Matrix<>();
			for (int i = 0; i < ctx.getChildCount() - 1; i++) { // get the rows
				ArrayList<Double> row = (ArrayList<Double>) visitRow(ctx.row(i)).getList();
				m.add(row);
			}
			return new Value(m);
		}
	}

	@Override public Value visitRow(matrixoParser.RowContext ctx) {
		ArrayList<Double> v = new ArrayList<>();
		for (var node : ctx.children) {
			String text = node.getText();
			if (text.equals(",") || text.equals(")")) continue;
			Double d = Double.parseDouble(text);
			v.add(d);
		}
		return new Value(v);
	}

	@Override public Value visitFunction_call(matrixoParser.Function_callContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitImport_call(matrixoParser.Import_callContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitParanthesis_expr(matrixoParser.Paranthesis_exprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitBracket_expr(matrixoParser.Bracket_exprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitFilename(matrixoParser.FilenameContext ctx) { return visitChildren(ctx); }
}