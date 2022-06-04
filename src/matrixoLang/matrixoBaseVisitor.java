package matrixoLang;

import matrixoLang.Domain.*;
import matrixoLang.Domain.Vector;
import matrixoLang.Exceptions.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;


public class matrixoBaseVisitor<V> extends AbstractParseTreeVisitor<Value> implements matrixoVisitor<Value> {


	protected final Memory globalMemory;
	protected final List<String> inbuiltFunctions = new ArrayList<>(List.of("print"));

	public matrixoBaseVisitor() {
		this.globalMemory = new Memory();
	}


	@Override public Value visitProgram(matrixoParser.ProgramContext ctx) {
		return visitChildren(ctx);
	}


	@Override public Value visitStatement(matrixoParser.StatementContext ctx) {

//		matrixoStatementVisitor SV = new matrixoStatementVisitor(globalMemory);
		if (ctx.semicolon_s() != null) return visitSemicolon_s(ctx.semicolon_s());
		else return visitNosemicolon_s(ctx.nosemicolon_s());

	}


	@Override public Value visitNosemicolon_s(matrixoParser.Nosemicolon_sContext ctx) {
		matrixoStatementVisitor SV = new matrixoStatementVisitor(globalMemory);
		return SV.visitNosemicolon_s(ctx);
	}


	@Override public Value visitSemicolon_s(matrixoParser.Semicolon_sContext ctx) {
		matrixoStatementVisitor SV = new matrixoStatementVisitor(globalMemory);
		return SV.visitSemicolon_s(ctx);
	}


	@Override public Value visitReturn_s(matrixoParser.Return_sContext ctx) { return visit(ctx.expression()); }

	@Override public Value visitCtrlflow_s(matrixoParser.Ctrlflow_sContext ctx) {
		return visitChildren(ctx); }

	//TODO visitFor_s
	@Override public Value visitFor_s(matrixoParser.For_sContext ctx) { return visitChildren(ctx); }

	//TODO visitIf_s
	@Override public Value visitIf_s(matrixoParser.If_sContext ctx) {
		return visitChildren(ctx); }

	//TODO visitElse_S
	@Override public Value visitElse_s(matrixoParser.Else_sContext ctx) { return visitChildren(ctx); }

	@Override public Value visitWhile_s(matrixoParser.While_sContext ctx) { return visitChildren(ctx); }

	//TODO visitBlock
	@Override public Value visitBlock(matrixoParser.BlockContext ctx) {
		return visitChildren(ctx);
	}

	@Override public Value visitReturn_type(matrixoParser.Return_typeContext ctx) { return visitChildren(ctx); }

	@Override public Value visitAssignment(matrixoParser.AssignmentContext ctx) {

		matrixoStatementVisitor SV = new matrixoStatementVisitor(globalMemory);
		return SV.visitAssignment(ctx);
	}

	@Override public Value visitFunction_dec(matrixoParser.Function_decContext ctx) {

		matrixoFunctionVisitor FV = new matrixoFunctionVisitor(globalMemory);
		return FV.visitFunction_dec(ctx);
	}

	@Override public Value visitParameter_list(matrixoParser.Parameter_listContext ctx) {

		ArrayList<Parameter> ps = new ArrayList<>();
		for (ParseTree child : ctx.children) {
			ps.add(visit(child).getParameter());
		}
		return new Value(ps);
	}

	@Override public Value visitParameter(matrixoParser.ParameterContext ctx) {
		return new Value(new Parameter(ctx.IDENTIFIER().getText(), ctx.type().getText()));
	}

	@Override public Value visitVariable_dec(matrixoParser.Variable_decContext ctx) {
		matrixoStatementVisitor SV = new matrixoStatementVisitor(globalMemory);
		return SV.visitVariable_dec(ctx);
	}

	@Override public Value visitVariable_init(matrixoParser.Variable_initContext ctx) {
		return visit(ctx.expression());
	}

	@Override public Value visitType(matrixoParser.TypeContext ctx) { return visitChildren(ctx); }

	//todo expressions
	@Override public Value visitBoolOp(matrixoParser.BoolOpContext ctx) {
		//stdout.println(ctx.getText());

		return visitChildren(ctx); }

	@Override public Value visitAtomExp(matrixoParser.AtomExpContext ctx) { return visit(ctx.atom()); }

	@Override public Value visitSqrtExp(matrixoParser.SqrtExpContext ctx) { return visitChildren(ctx); }

	@Override public Value visitPrefixExp(matrixoParser.PrefixExpContext ctx) { return visitChildren(ctx); }

	@Override public Value visitPowerExp(matrixoParser.PowerExpContext ctx) { return visitChildren(ctx); }

	//todo remove placeholder
	@Override public Value visitImportCall(matrixoParser.ImportCallContext ctx) { return new Value(new Matrix(), "matrix"); }

	//todo getCall
	@Override public Value visitGetCall(matrixoParser.GetCallContext ctx) { return visit(ctx.get_call()); }

	@Override public Value visitFirstOrdExp(matrixoParser.FirstOrdExpContext ctx) { return visitChildren(ctx); }

	@Override public Value visitMatrixInit(matrixoParser.MatrixInitContext ctx) {
		return visit(ctx.matrix_init());
	}

	@Override public Value visitSecondOrdExp(matrixoParser.SecondOrdExpContext ctx) { return visitChildren(ctx); }

	@Override public Value visitAtom(matrixoParser.AtomContext ctx) {
		if (ctx.IDENTIFIER() != null) {
			if (globalMemory.getVariables().containsKey(ctx.IDENTIFIER().getText())) return globalMemory.getLocalVar(ctx.IDENTIFIER().getText());
			else throw new AttemptToAccessNonDefinedVarException(ctx.IDENTIFIER().getText(), ctx.start.getLine());
		} else if (ctx.TRUE() != null) return new Value(Boolean.TRUE, "bool");
		else if (ctx.FALSE() != null) return new Value(Boolean.FALSE, "bool");
		else if (ctx.NUMBER() != null) return new Value(Double.parseDouble(ctx.NUMBER().getText()), "double");
		else if (ctx.paranthesis_expr() != null) return visitParanthesis_expr(ctx.paranthesis_expr());
		else return visitFunction_call(ctx.function_call());
	}

	@Override public Value visitMatrix_init(matrixoParser.Matrix_initContext ctx) {

		if (ctx.getChildCount() == 2) {
			Vector v = new Vector(visitRow(ctx.row(0)).getList());
			return new Value(v, "vector");
		} else {
			Matrix m = new Matrix();
			for (int i = 0; i < ctx.getChildCount() - 1; i++) { // get the rows
				ArrayList<Double> row = visitRow(ctx.row(i)).getList();
				m.add(row);
			}
			return new Value(m, "matrix");
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

	@Override
	public Value visitFunction_call(matrixoParser.Function_callContext ctx) {
		matrixoFunctionVisitor FV = new matrixoFunctionVisitor(globalMemory);
		return FV.visitFunction_call(ctx);
	}

	@Override public Value visitArgument_list(matrixoParser.Argument_listContext ctx) {
		matrixoFunctionVisitor FV = new matrixoFunctionVisitor(globalMemory);
		return FV.visitArgument_list(ctx);
	}

	//todo remove placeholders in get, import
	@Override public Value visitGet_call(matrixoParser.Get_callContext ctx) { return visitChildren(ctx); }

	@Override public Value visitImport_call(matrixoParser.Import_callContext ctx) { return visitChildren(ctx); }

	@Override public Value visitParanthesis_expr(matrixoParser.Paranthesis_exprContext ctx) { return visit(ctx.expression()); }

	@Override public Value visitFilename(matrixoParser.FilenameContext ctx) { return visitChildren(ctx); }
}