// Generated from C:/Users/Vlada/Downloads/pbl-sem-4/antlr/src/antlr\matrixo.g4 by ANTLR 4.9.2
package antlr;

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link matrixoParser}.
 */
public interface matrixoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link matrixoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(matrixoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(matrixoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(matrixoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(matrixoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#nosemicolon_s}.
	 * @param ctx the parse tree
	 */
	void enterNosemicolon_s(matrixoParser.Nosemicolon_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#nosemicolon_s}.
	 * @param ctx the parse tree
	 */
	void exitNosemicolon_s(matrixoParser.Nosemicolon_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#semicolon_s}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon_s(matrixoParser.Semicolon_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#semicolon_s}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon_s(matrixoParser.Semicolon_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#return_s}.
	 * @param ctx the parse tree
	 */
	void enterReturn_s(matrixoParser.Return_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#return_s}.
	 * @param ctx the parse tree
	 */
	void exitReturn_s(matrixoParser.Return_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#ctrlflow_s}.
	 * @param ctx the parse tree
	 */
	void enterCtrlflow_s(matrixoParser.Ctrlflow_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#ctrlflow_s}.
	 * @param ctx the parse tree
	 */
	void exitCtrlflow_s(matrixoParser.Ctrlflow_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#for_s}.
	 * @param ctx the parse tree
	 */
	void enterFor_s(matrixoParser.For_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#for_s}.
	 * @param ctx the parse tree
	 */
	void exitFor_s(matrixoParser.For_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#if_s}.
	 * @param ctx the parse tree
	 */
	void enterIf_s(matrixoParser.If_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#if_s}.
	 * @param ctx the parse tree
	 */
	void exitIf_s(matrixoParser.If_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#else_s}.
	 * @param ctx the parse tree
	 */
	void enterElse_s(matrixoParser.Else_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#else_s}.
	 * @param ctx the parse tree
	 */
	void exitElse_s(matrixoParser.Else_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#while_s}.
	 * @param ctx the parse tree
	 */
	void enterWhile_s(matrixoParser.While_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#while_s}.
	 * @param ctx the parse tree
	 */
	void exitWhile_s(matrixoParser.While_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(matrixoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(matrixoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(matrixoParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(matrixoParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(matrixoParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(matrixoParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(matrixoParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(matrixoParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#function_dec}.
	 * @param ctx the parse tree
	 */
	void enterFunction_dec(matrixoParser.Function_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#function_dec}.
	 * @param ctx the parse tree
	 */
	void exitFunction_dec(matrixoParser.Function_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(matrixoParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(matrixoParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#variable_dec}.
	 * @param ctx the parse tree
	 */
	void enterVariable_dec(matrixoParser.Variable_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#variable_dec}.
	 * @param ctx the parse tree
	 */
	void exitVariable_dec(matrixoParser.Variable_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#variable_init}.
	 * @param ctx the parse tree
	 */
	void enterVariable_init(matrixoParser.Variable_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#variable_init}.
	 * @param ctx the parse tree
	 */
	void exitVariable_init(matrixoParser.Variable_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(matrixoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(matrixoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#scalar_type}.
	 * @param ctx the parse tree
	 */
	void enterScalar_type(matrixoParser.Scalar_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#scalar_type}.
	 * @param ctx the parse tree
	 */
	void exitScalar_type(matrixoParser.Scalar_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#multidim_type}.
	 * @param ctx the parse tree
	 */
	void enterMultidim_type(matrixoParser.Multidim_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#multidim_type}.
	 * @param ctx the parse tree
	 */
	void exitMultidim_type(matrixoParser.Multidim_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(matrixoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(matrixoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#get_call}.
	 * @param ctx the parse tree
	 */
	void enterGet_call(matrixoParser.Get_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#get_call}.
	 * @param ctx the parse tree
	 */
	void exitGet_call(matrixoParser.Get_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#matrix_init}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_init(matrixoParser.Matrix_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#matrix_init}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_init(matrixoParser.Matrix_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(matrixoParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(matrixoParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(matrixoParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(matrixoParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#prefix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_expr(matrixoParser.Prefix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#prefix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_expr(matrixoParser.Prefix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#paranthesis_expr}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis_expr(matrixoParser.Paranthesis_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#paranthesis_expr}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis_expr(matrixoParser.Paranthesis_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#bracket_expr}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expr(matrixoParser.Bracket_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#bracket_expr}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expr(matrixoParser.Bracket_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(matrixoParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(matrixoParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#double}.
	 * @param ctx the parse tree
	 */
	void enterDouble(matrixoParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#double}.
	 * @param ctx the parse tree
	 */
	void exitDouble(matrixoParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrixoParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(matrixoParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrixoParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(matrixoParser.IntegerContext ctx);
}