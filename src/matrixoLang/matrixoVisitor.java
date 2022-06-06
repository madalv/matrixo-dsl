// Generated from C:/Users/Vlada/Downloads/pbl-sem-4/matrixoLang/src/matrixoLang\matrixo.g4 by ANTLR 4.9.2
package matrixoLang;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link matrixoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface matrixoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link matrixoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(matrixoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(matrixoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#nosemicolon_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNosemicolon_s(matrixoParser.Nosemicolon_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#semicolon_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_s(matrixoParser.Semicolon_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#return_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_s(matrixoParser.Return_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#ctrlflow_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrlflow_s(matrixoParser.Ctrlflow_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#for_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_s(matrixoParser.For_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#if_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_s(matrixoParser.If_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#else_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_s(matrixoParser.Else_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#while_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_s(matrixoParser.While_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(matrixoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(matrixoParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(matrixoParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#function_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_dec(matrixoParser.Function_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(matrixoParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(matrixoParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#variable_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_dec(matrixoParser.Variable_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#variable_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_init(matrixoParser.Variable_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(matrixoParser.TypeContext ctx);

	T visitBoolOp(matrixoParser.BoolOpContext ctx);

	T visitAtomExp(matrixoParser.AtomExpContext ctx);

	T visitSqrtExp(matrixoParser.SqrtExpContext ctx);

	T visitPrefixExp(matrixoParser.PrefixExpContext ctx);


	T visitPowerExp(matrixoParser.PowerExpContext ctx);

	T visitImportCall(matrixoParser.ImportCallContext ctx);

	T visitGetCall(matrixoParser.GetCallContext ctx) throws NoSuchMethodException;

	T visitFirstOrdExp(matrixoParser.FirstOrdExpContext ctx);

	T visitMatrixInit(matrixoParser.MatrixInitContext ctx);

	T visitSecondOrdExp(matrixoParser.SecondOrdExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(matrixoParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#get_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_call(matrixoParser.Get_callContext ctx) throws NoSuchMethodException;
	/**
	 * Visit a parse tree produced by {@link matrixoParser#matrix_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix_init(matrixoParser.Matrix_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(matrixoParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(matrixoParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(matrixoParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#import_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_call(matrixoParser.Import_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#paranthesis_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesis_expr(matrixoParser.Paranthesis_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrixoParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(matrixoParser.FilenameContext ctx);
}