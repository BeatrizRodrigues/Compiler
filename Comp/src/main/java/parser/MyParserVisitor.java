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
	 * Visit a parse tree produced by {@link MyParserParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(MyParserParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(MyParserParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#run}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun(MyParserParser.RunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MyParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delc}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelc(MyParserParser.DelcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineatr}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineatr(MyParserParser.LineatrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineinp}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineinp(MyParserParser.LineinpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineout}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineout(MyParserParser.LineoutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineexpr}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineexpr(MyParserParser.LineexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineif}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineif(MyParserParser.LineifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code linewhile}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinewhile(MyParserParser.LinewhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code linefor}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinefor(MyParserParser.LineforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineret}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineret(MyParserParser.LineretContext ctx);
	/**
	 * Visit a parse tree produced by the {@code linecfunc}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinecfunc(MyParserParser.LinecfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(MyParserParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atrexpr}
	 * labeled alternative in {@link MyParserParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrexpr(MyParserParser.AtrexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atrstr}
	 * labeled alternative in {@link MyParserParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrstr(MyParserParser.AtrstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(MyParserParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printstr}
	 * labeled alternative in {@link MyParserParser#outprint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstr(MyParserParser.PrintstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printid}
	 * labeled alternative in {@link MyParserParser#outprint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintid(MyParserParser.PrintidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printexpr}
	 * labeled alternative in {@link MyParserParser#outprint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintexpr(MyParserParser.PrintexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprsum}
	 * labeled alternative in {@link MyParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprsum(MyParserParser.ExprsumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprsub}
	 * labeled alternative in {@link MyParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprsub(MyParserParser.ExprsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprfact}
	 * labeled alternative in {@link MyParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprfact(MyParserParser.ExprfactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factmult}
	 * labeled alternative in {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactmult(MyParserParser.FactmultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factdiv}
	 * labeled alternative in {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactdiv(MyParserParser.FactdivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factmod}
	 * labeled alternative in {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactmod(MyParserParser.FactmodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factterm}
	 * labeled alternative in {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactterm(MyParserParser.FacttermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termparexpr}
	 * labeled alternative in {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermparexpr(MyParserParser.TermparexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termnum}
	 * labeled alternative in {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermnum(MyParserParser.TermnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termid}
	 * labeled alternative in {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermid(MyParserParser.TermidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termstr}
	 * labeled alternative in {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermstr(MyParserParser.TermstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifline}
	 * labeled alternative in {@link MyParserParser#uif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfline(MyParserParser.IflineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iflineelse}
	 * labeled alternative in {@link MyParserParser#uif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIflineelse(MyParserParser.IflineelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valtrue}
	 * labeled alternative in {@link MyParserParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValtrue(MyParserParser.ValtrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valfalse}
	 * labeled alternative in {@link MyParserParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValfalse(MyParserParser.ValfalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolexpr}
	 * labeled alternative in {@link MyParserParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(MyParserParser.BoolexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(MyParserParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileline}
	 * labeled alternative in {@link MyParserParser#uwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileline(MyParserParser.WhilelineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forline}
	 * labeled alternative in {@link MyParserParser#ufor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForline(MyParserParser.ForlineContext ctx);
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
	 * Visit a parse tree produced by the {@code returnline}
	 * labeled alternative in {@link MyParserParser#rtrn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnline(MyParserParser.ReturnlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParserParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(MyParserParser.InputContext ctx);
}