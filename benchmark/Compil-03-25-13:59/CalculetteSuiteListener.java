// Generated from CalculetteSuite.g4 by ANTLR 4.9

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculetteSuiteParser}.
 */
public interface CalculetteSuiteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculetteSuiteParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculetteSuiteParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(CalculetteSuiteParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(CalculetteSuiteParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CalculetteSuiteParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CalculetteSuiteParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(CalculetteSuiteParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(CalculetteSuiteParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CalculetteSuiteParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CalculetteSuiteParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CalculetteSuiteParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CalculetteSuiteParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculetteSuiteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculetteSuiteParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#bloc}.
	 * @param ctx the parse tree
	 */
	void enterBloc(CalculetteSuiteParser.BlocContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#bloc}.
	 * @param ctx the parse tree
	 */
	void exitBloc(CalculetteSuiteParser.BlocContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#branchement}.
	 * @param ctx the parse tree
	 */
	void enterBranchement(CalculetteSuiteParser.BranchementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#branchement}.
	 * @param ctx the parse tree
	 */
	void exitBranchement(CalculetteSuiteParser.BranchementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#fonction}.
	 * @param ctx the parse tree
	 */
	void enterFonction(CalculetteSuiteParser.FonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#fonction}.
	 * @param ctx the parse tree
	 */
	void exitFonction(CalculetteSuiteParser.FonctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CalculetteSuiteParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CalculetteSuiteParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CalculetteSuiteParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CalculetteSuiteParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteSuiteParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(CalculetteSuiteParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteSuiteParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(CalculetteSuiteParser.FinInstructionContext ctx);
}