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
	 * Enter a parse tree produced by {@link MyParserParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(MyParserParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(MyParserParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(MyParserParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(MyParserParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(MyParserParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(MyParserParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MyParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MyParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code delc}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterDelc(MyParserParser.DelcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code delc}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitDelc(MyParserParser.DelcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineatr}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineatr(MyParserParser.LineatrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineatr}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineatr(MyParserParser.LineatrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineinp}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineinp(MyParserParser.LineinpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineinp}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineinp(MyParserParser.LineinpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineout}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineout(MyParserParser.LineoutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineout}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineout(MyParserParser.LineoutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineexpr}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineexpr(MyParserParser.LineexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineexpr}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineexpr(MyParserParser.LineexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineif}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineif(MyParserParser.LineifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineif}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineif(MyParserParser.LineifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code linewhile}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLinewhile(MyParserParser.LinewhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code linewhile}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLinewhile(MyParserParser.LinewhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code linefor}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLinefor(MyParserParser.LineforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code linefor}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLinefor(MyParserParser.LineforContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineret}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineret(MyParserParser.LineretContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineret}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineret(MyParserParser.LineretContext ctx);
	/**
	 * Enter a parse tree produced by the {@code linecfunc}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLinecfunc(MyParserParser.LinecfuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code linecfunc}
	 * labeled alternative in {@link MyParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLinecfunc(MyParserParser.LinecfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(MyParserParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(MyParserParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atrexpr}
	 * labeled alternative in {@link MyParserParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtrexpr(MyParserParser.AtrexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atrexpr}
	 * labeled alternative in {@link MyParserParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtrexpr(MyParserParser.AtrexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atrstr}
	 * labeled alternative in {@link MyParserParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtrstr(MyParserParser.AtrstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atrstr}
	 * labeled alternative in {@link MyParserParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtrstr(MyParserParser.AtrstrContext ctx);
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
	 * Enter a parse tree produced by the {@code printstr}
	 * labeled alternative in {@link MyParserParser#outprint}.
	 * @param ctx the parse tree
	 */
	void enterPrintstr(MyParserParser.PrintstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printstr}
	 * labeled alternative in {@link MyParserParser#outprint}.
	 * @param ctx the parse tree
	 */
	void exitPrintstr(MyParserParser.PrintstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printid}
	 * labeled alternative in {@link MyParserParser#outprint}.
	 * @param ctx the parse tree
	 */
	void enterPrintid(MyParserParser.PrintidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printid}
	 * labeled alternative in {@link MyParserParser#outprint}.
	 * @param ctx the parse tree
	 */
	void exitPrintid(MyParserParser.PrintidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printexpr}
	 * labeled alternative in {@link MyParserParser#outprint}.
	 * @param ctx the parse tree
	 */
	void enterPrintexpr(MyParserParser.PrintexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printexpr}
	 * labeled alternative in {@link MyParserParser#outprint}.
	 * @param ctx the parse tree
	 */
	void exitPrintexpr(MyParserParser.PrintexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprsum}
	 * labeled alternative in {@link MyParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprsum(MyParserParser.ExprsumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprsum}
	 * labeled alternative in {@link MyParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprsum(MyParserParser.ExprsumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprsub}
	 * labeled alternative in {@link MyParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprsub(MyParserParser.ExprsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprsub}
	 * labeled alternative in {@link MyParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprsub(MyParserParser.ExprsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprfact}
	 * labeled alternative in {@link MyParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprfact(MyParserParser.ExprfactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprfact}
	 * labeled alternative in {@link MyParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprfact(MyParserParser.ExprfactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factmult}
	 * labeled alternative in {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactmult(MyParserParser.FactmultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factmult}
	 * labeled alternative in {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactmult(MyParserParser.FactmultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factdiv}
	 * labeled alternative in {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactdiv(MyParserParser.FactdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factdiv}
	 * labeled alternative in {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactdiv(MyParserParser.FactdivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factmod}
	 * labeled alternative in {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactmod(MyParserParser.FactmodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factmod}
	 * labeled alternative in {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactmod(MyParserParser.FactmodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factterm}
	 * labeled alternative in {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactterm(MyParserParser.FacttermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factterm}
	 * labeled alternative in {@link MyParserParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactterm(MyParserParser.FacttermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termparexpr}
	 * labeled alternative in {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermparexpr(MyParserParser.TermparexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termparexpr}
	 * labeled alternative in {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermparexpr(MyParserParser.TermparexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termnum}
	 * labeled alternative in {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermnum(MyParserParser.TermnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termnum}
	 * labeled alternative in {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermnum(MyParserParser.TermnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termid}
	 * labeled alternative in {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermid(MyParserParser.TermidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termid}
	 * labeled alternative in {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermid(MyParserParser.TermidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termstr}
	 * labeled alternative in {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermstr(MyParserParser.TermstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termstr}
	 * labeled alternative in {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermstr(MyParserParser.TermstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifline}
	 * labeled alternative in {@link MyParserParser#uif}.
	 * @param ctx the parse tree
	 */
	void enterIfline(MyParserParser.IflineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifline}
	 * labeled alternative in {@link MyParserParser#uif}.
	 * @param ctx the parse tree
	 */
	void exitIfline(MyParserParser.IflineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iflineelse}
	 * labeled alternative in {@link MyParserParser#uif}.
	 * @param ctx the parse tree
	 */
	void enterIflineelse(MyParserParser.IflineelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iflineelse}
	 * labeled alternative in {@link MyParserParser#uif}.
	 * @param ctx the parse tree
	 */
	void exitIflineelse(MyParserParser.IflineelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valtrue}
	 * labeled alternative in {@link MyParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterValtrue(MyParserParser.ValtrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valtrue}
	 * labeled alternative in {@link MyParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitValtrue(MyParserParser.ValtrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valfalse}
	 * labeled alternative in {@link MyParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterValfalse(MyParserParser.ValfalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valfalse}
	 * labeled alternative in {@link MyParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitValfalse(MyParserParser.ValfalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolexpr}
	 * labeled alternative in {@link MyParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(MyParserParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolexpr}
	 * labeled alternative in {@link MyParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(MyParserParser.BoolexprContext ctx);
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
	 * Enter a parse tree produced by the {@code whileline}
	 * labeled alternative in {@link MyParserParser#uwhile}.
	 * @param ctx the parse tree
	 */
	void enterWhileline(MyParserParser.WhilelineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileline}
	 * labeled alternative in {@link MyParserParser#uwhile}.
	 * @param ctx the parse tree
	 */
	void exitWhileline(MyParserParser.WhilelineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forline}
	 * labeled alternative in {@link MyParserParser#ufor}.
	 * @param ctx the parse tree
	 */
	void enterForline(MyParserParser.ForlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forline}
	 * labeled alternative in {@link MyParserParser#ufor}.
	 * @param ctx the parse tree
	 */
	void exitForline(MyParserParser.ForlineContext ctx);
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
	 * Enter a parse tree produced by the {@code returnline}
	 * labeled alternative in {@link MyParserParser#rtrn}.
	 * @param ctx the parse tree
	 */
	void enterReturnline(MyParserParser.ReturnlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnline}
	 * labeled alternative in {@link MyParserParser#rtrn}.
	 * @param ctx the parse tree
	 */
	void exitReturnline(MyParserParser.ReturnlineContext ctx);
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
}