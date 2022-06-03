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
		return visitChildren(ctx); }


	@Override public Value visitNosemicolon_s(matrixoParser.Nosemicolon_sContext ctx) { return visitChildren(ctx); }


	@Override public Value visitSemicolon_s(matrixoParser.Semicolon_sContext ctx) { return visitChildren(ctx); }


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
		System.out.println(ctx.getText());
		String varName = ctx.IDENTIFIER().getText();
		String op = ctx.ASSIGN_OP().getText();
		if (globalMemory.getVariables().containsKey(varName)) {
			// case =
			// double - double, matrix - matrix
			// case all else
			// double - double, matrix - double, matrix - matrix
			Value val = globalMemory.getLocalVar(varName);
			Value assigned = visit(ctx.expression());
			String type1 = val.getType().toLowerCase();
			String type2 = assigned.getType().toLowerCase();


			// TODO: implement other assignment ops than =
			if (val == null ||type2.equals(type1) && op.equals("=")) {
				globalMemory.getVariables().replace(varName, assigned);
			} else throw new AssignmentMismatchException(type1, type2, varName, ctx.start.getLine());

		} else throw new AssignToNonExistentVarException(varName, ctx.start.getLine());
		return null;
	}

	@Override public Value visitFunction_dec(matrixoParser.Function_decContext ctx) {

		Function fn = new Function(ctx.IDENTIFIER().getText(), ctx.return_type().getText(), visit(ctx.parameter_list()).getParameters(), ctx);
		globalMemory.assignFunction(ctx.IDENTIFIER().getText(), fn);

		return null;
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
		if (ctx.variable_init() != null) {
			Value v = visit(ctx.variable_init());
			if (v.getType().equalsIgnoreCase(ctx.type().getText())) {
				globalMemory.assignLocalVar(ctx.IDENTIFIER().getText(), v);
			}
			else throw new AssignmentMismatchException(ctx.type().getText(), v.getType(), ctx.IDENTIFIER().getText(), ctx.start.getLine());
		} else globalMemory.assignLocalVar(ctx.IDENTIFIER().getText(), null);

		return null;
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
		String fnName = ctx.IDENTIFIER().getText();
		if (globalMemory.getFunctions().containsKey(fnName)) {
			// get values of arguments, pass them to local scope of function block
			Map<String, Value> localVars = new LinkedHashMap<>();
			List<Parameter> params = globalMemory.getFunction(fnName).getParameters();
			ArrayList<Value> args = visitArgument_list(ctx.argument_list()).getArgList();

			try {
				if (params.size() == args.size()) {
					for (int i = 0; i < params.size(); i++) {
						Parameter p = params.get(i);
						Value v = args.get(i);
						if (!p.getType().equals(v.getType())) throw new ParameterArgumentTypeMismatchException(ctx.getText(), p, v, ctx.start.getLine());
						else localVars.put(params.get(i).getName(), v);
					}
				} else throw new ParameterArgumentNumberMismatchException(ctx.getText(), ctx.start.getLine());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			Memory localMem = new Memory(localVars, globalMemory.getFunctions());
			matrixoFunctionVisitor FV = new matrixoFunctionVisitor(localMem);
			//System.out.println(globalMemory.getFunction(fnName));
			return FV.visitFunction_call(ctx);
		}
		// todo add inbuilt func
		else if (inbuiltFunctions.contains(fnName)) {
			// do stuff
			return null;
		}
		else throw new CallNonDefinedFunctionException(fnName, ctx.start.getLine());
	}

	@Override public Value visitArgument_list(matrixoParser.Argument_listContext ctx) {
		ArrayList<Value> args = new ArrayList<>();
		for (ParseTree child : ctx.children) {
			if (!child.getText().equals(","))
				args.add(visit(child));
		}
		return new Value(args);
	}

	//todo remove placeholders in get, import
	@Override public Value visitGet_call(matrixoParser.Get_callContext ctx) { return visitChildren(ctx); }

	@Override public Value visitImport_call(matrixoParser.Import_callContext ctx) { return visitChildren(ctx); }

	@Override public Value visitParanthesis_expr(matrixoParser.Paranthesis_exprContext ctx) { return visit(ctx.expression()); }

	@Override public Value visitFilename(matrixoParser.FilenameContext ctx) { return visitChildren(ctx); }
}