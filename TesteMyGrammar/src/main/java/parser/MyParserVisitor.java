package parser;// Generated from MyParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyParserParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MyParserParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(MyParserParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(MyParserParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(MyParserParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(MyParserParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(MyParserParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#follow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFollow(MyParserParser.FollowContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(MyParserParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#cont}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont(MyParserParser.ContContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MyParserParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest(MyParserParser.RestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(MyParserParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore(MyParserParser.MoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MyParserParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#uif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUif(MyParserParser.UifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MyParserParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(MyParserParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther(MyParserParser.OtherContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#uelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUelse(MyParserParser.UelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#uwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUwhile(MyParserParser.UwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#ufor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUfor(MyParserParser.UforContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MyParserParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#incr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncr(MyParserParser.IncrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MyParserParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(MyParserParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#cfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCfunction(MyParserParser.CfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#cpar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpar(MyParserParser.CparContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(MyParserParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#umath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUmath(MyParserParser.UmathContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#mathpar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathpar(MyParserParser.MathparContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#floor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloor(MyParserParser.FloorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#ceil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCeil(MyParserParser.CeilContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#sqrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(MyParserParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#pot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPot(MyParserParser.PotContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#fmax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFmax(MyParserParser.FmaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#fmin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFmin(MyParserParser.FminContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#rint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRint(MyParserParser.RintContext ctx);
}