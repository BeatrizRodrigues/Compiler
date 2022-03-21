public class MyVisitor extends MyParserBaseVisitor<Object>
{

    @Override public Object visitElement(MyParserParser.ElementContext ctx) {
        Object varTipo = visit(ctx.TYPE());
        Object expTipo = visit(ctx.expr().fact().term()

        return visitChildren(ctx);
    }

    @Override public Object visitExpr(MyParserParser.ExprContext ctx) {
        return visitChildren(ctx);
    }
}
