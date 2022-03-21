package parser;// Generated from MyParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParserParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MyParserParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MyParserParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(MyParserParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(MyParserParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(MyParserParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(MyParserParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(MyParserParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(MyParserParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(MyParserParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(MyParserParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(MyParserParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(MyParserParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#follow}.
	 * @param ctx the parse tree
	 */
	void enterFollow(MyParserParser.FollowContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#follow}.
	 * @param ctx the parse tree
	 */
	void exitFollow(MyParserParser.FollowContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(MyParserParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(MyParserParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#cont}.
	 * @param ctx the parse tree
	 */
	void enterCont(MyParserParser.ContContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#cont}.
	 * @param ctx the parse tree
	 */
	void exitCont(MyParserParser.ContContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MyParserParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MyParserParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#rest}.
	 * @param ctx the parse tree
	 */
	void enterRest(MyParserParser.RestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#rest}.
	 * @param ctx the parse tree
	 */
	void exitRest(MyParserParser.RestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(MyParserParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(MyParserParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#more}.
	 * @param ctx the parse tree
	 */
	void enterMore(MyParserParser.MoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#more}.
	 * @param ctx the parse tree
	 */
	void exitMore(MyParserParser.MoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MyParserParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MyParserParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#uif}.
	 * @param ctx the parse tree
	 */
	void enterUif(MyParserParser.UifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#uif}.
	 * @param ctx the parse tree
	 */
	void exitUif(MyParserParser.UifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MyParserParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MyParserParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(MyParserParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(MyParserParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(MyParserParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(MyParserParser.OtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#uelse}.
	 * @param ctx the parse tree
	 */
	void enterUelse(MyParserParser.UelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#uelse}.
	 * @param ctx the parse tree
	 */
	void exitUelse(MyParserParser.UelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#uwhile}.
	 * @param ctx the parse tree
	 */
	void enterUwhile(MyParserParser.UwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#uwhile}.
	 * @param ctx the parse tree
	 */
	void exitUwhile(MyParserParser.UwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#ufor}.
	 * @param ctx the parse tree
	 */
	void enterUfor(MyParserParser.UforContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#ufor}.
	 * @param ctx the parse tree
	 */
	void exitUfor(MyParserParser.UforContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MyParserParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MyParserParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#incr}.
	 * @param ctx the parse tree
	 */
	void enterIncr(MyParserParser.IncrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#incr}.
	 * @param ctx the parse tree
	 */
	void exitIncr(MyParserParser.IncrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MyParserParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MyParserParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#par}.
	 * @param ctx the parse tree
	 */
	void enterPar(MyParserParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#par}.
	 * @param ctx the parse tree
	 */
	void exitPar(MyParserParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#cfunction}.
	 * @param ctx the parse tree
	 */
	void enterCfunction(MyParserParser.CfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#cfunction}.
	 * @param ctx the parse tree
	 */
	void exitCfunction(MyParserParser.CfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#cpar}.
	 * @param ctx the parse tree
	 */
	void enterCpar(MyParserParser.CparContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#cpar}.
	 * @param ctx the parse tree
	 */
	void exitCpar(MyParserParser.CparContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(MyParserParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(MyParserParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#umath}.
	 * @param ctx the parse tree
	 */
	void enterUmath(MyParserParser.UmathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#umath}.
	 * @param ctx the parse tree
	 */
	void exitUmath(MyParserParser.UmathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#mathpar}.
	 * @param ctx the parse tree
	 */
	void enterMathpar(MyParserParser.MathparContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#mathpar}.
	 * @param ctx the parse tree
	 */
	void exitMathpar(MyParserParser.MathparContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#floor}.
	 * @param ctx the parse tree
	 */
	void enterFloor(MyParserParser.FloorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#floor}.
	 * @param ctx the parse tree
	 */
	void exitFloor(MyParserParser.FloorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#ceil}.
	 * @param ctx the parse tree
	 */
	void enterCeil(MyParserParser.CeilContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#ceil}.
	 * @param ctx the parse tree
	 */
	void exitCeil(MyParserParser.CeilContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void enterSqrt(MyParserParser.SqrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void exitSqrt(MyParserParser.SqrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#pot}.
	 * @param ctx the parse tree
	 */
	void enterPot(MyParserParser.PotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#pot}.
	 * @param ctx the parse tree
	 */
	void exitPot(MyParserParser.PotContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#fmax}.
	 * @param ctx the parse tree
	 */
	void enterFmax(MyParserParser.FmaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#fmax}.
	 * @param ctx the parse tree
	 */
	void exitFmax(MyParserParser.FmaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#fmin}.
	 * @param ctx the parse tree
	 */
	void enterFmin(MyParserParser.FminContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#fmin}.
	 * @param ctx the parse tree
	 */
	void exitFmin(MyParserParser.FminContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#rint}.
	 * @param ctx the parse tree
	 */
	void enterRint(MyParserParser.RintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#rint}.
	 * @param ctx the parse tree
	 */
	void exitRint(MyParserParser.RintContext ctx);
}