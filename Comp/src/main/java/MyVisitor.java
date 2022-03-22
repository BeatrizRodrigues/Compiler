import Simbolos.Symbol;
import Simbolos.Table;
import parser.MyParserBaseVisitor;
import parser.MyParserParser;

import java.util.Scanner;

public class MyVisitor extends MyParserBaseVisitor<Object>
{
    @Override public Object visitVar(MyParserParser.VarContext ctx) {
        String type = ctx.TYPE().getText();
        for(int i = 0; i < ctx.ID().size(); i++){
            String name;
            String value = "null";
            if(!ctx.ID().isEmpty()){
                name = ctx.ID().get(i).getText();
                if(!ctx.expr().isEmpty()) {
                    value = ctx.expr().toString();
                }
            }else{
                name = "fail";
            }
            Symbol newEntry = new Symbol((Table.getInstance().size() + 1), name, type, value);
        }
        return visitChildren(ctx);
    }

    @Override public Object visitAtrexpr(MyParserParser.AtrexprContext ctx
    ) {

        Double aux = (Double) visit(ctx.expr());
        int aux1 = 0;
        Integer aux2 = 0;
        String valor = null;

        for (int i = 0; i < Table.getInstance().size(); i++) {
            String name = Table.getInstance().get(i).getNome();
            if (ctx.ID().getText().equals(name)) {
                Symbol e = Table.getInstance().get(i);
                if (Table.getInstance().get(i).getTipo().equals("int")) {
                    aux1 = aux.intValue();
                    aux2 = aux1;
                    valor = aux2.toString();
                } else if (Table.getInstance().get(i).getTipo().equals("float")) {
                    valor = aux.toString();
                }

                e.setVal(valor);
                Table.getInstance().set(i, e);
                break;
            }
        }
        return null;
    }

    @Override public Object visitAtrstr(MyParserParser.AtrstrContext ctx
    ) {
        String aux = ctx.STR().getText();
        aux = aux.replace("\"", "");
        for (int i = 0; i < Table.getInstance().size(); i++) {
            String name = Table.getInstance().get(i).getNome();
            if (ctx.ID().getText().equals(name)) {
                if (Table.getInstance().get(i).getTipo().equals("string")) {
                    Symbol e = Table.getInstance().get(i);
                    e.setVal(aux);
                    Table.getInstance().set(i, e);
                    break;
                }
            }
        }
        return visitChildren(ctx);
    }

    @Override public Object visitIfline(MyParserParser.IflineContext ctx) {
        Boolean cond = (Boolean) visit(ctx.condition());

        if (cond) {
            return visitChildren(ctx);
        } else {
            return null;
        }
    }

    @Override public Object visitIflineelse(MyParserParser.IflineelseContext ctx) {
        Boolean cond = (Boolean) visit(ctx.condition());

        if (cond) {
            return visitChildren(ctx.block(0));
        } else {
            return visitChildren(ctx.block(1));
        }
    }

    @Override public Object visitPrintid(MyParserParser.PrintidContext ctx
    ) {

        for (int i = 0; i < Table.getInstance().size(); i++) {
            String name = Table.getInstance().get(i).getNome();
            if (ctx.ID().getText().equals(name)) {
                Symbol e = Table.getInstance().get(i);
                System.out.println(e.getVal());
                break;
            }
        }
        return null;
    }

    @Override public Object visitInput(MyParserParser.InputContext ctx) {
        Double oi = 0.0;
        String fl = "";
        Scanner s = new Scanner(System.in);
        String value = s.nextLine();

        for (int i = 0; i < Table.getInstance().size(); i++) {
            String name = Table.getInstance().get(i).getNome();
            if (ctx.ID().getText().equals(name)) {
                if (value.length() == 1) {
                    Symbol e = Table.getInstance().get(i);
                    e.setVal(value);
                    break;
                } else if (value.matches("[+¬]?[0-9]+(\\.[0-9]+)?")
                        && (Table.getInstance().get(i).getTipo().equals("int")
                        || Table.getInstance().get(i).getTipo().equals("float"))) {
                    Symbol e = Table.getInstance().get(i);
                    e.setVal(value);
                    break;
                } else if (value.matches("(~[\"\\\\\\r\\n])*")
                        && Table.getInstance().get(i).getTipo().equals("string")) {
                    Symbol e = Table.getInstance().get(i);
                    e.setVal(value);
                    break;
                }

            }
        }
        return null;
    }

    @Override public Object visitForline(MyParserParser.ForlineContext ctx) {
        String name = ctx.atr().getText();
        String newValue = ctx.atr().getText();
        Symbol e = null;
        int aux2 = name.length();
        int aux = name.indexOf("=");
        name = name.substring(0, aux);
        newValue = newValue.substring(aux + 1, aux2);
        Double n = 0.0;
        int j = 0;

        for (int i = 0; i < Table.getInstance().size(); i++) {
            if (Table.getInstance().get(i).getNome().equals(name)) {
                if ((Table.getInstance().get(i).getTipo().equals("int") || Table.getInstance().get(i).getTipo().equals("float"))) {
                    e = Table.getInstance().get(i);
                    e.setVal(newValue);
                    Table.getInstance().set(j, e);
                    j = i;
                    n = Double.parseDouble(e.getVal());
                    break;
                }
            }
        }

        Boolean cond = (Boolean) visit(ctx.condition());
        while (cond) {

            if (ctx.incr().getText().equals("+=")) {
                n += Double.parseDouble(ctx.NUM().getText());
            } else if (ctx.incr().getText().equals("-=")) {
                n -= Double.parseDouble(ctx.NUM().getText());
            }
            e.setVal(n.toString());
            Table.getInstance().set(j, e);
            cond = (Boolean) visit(ctx.condition());
            visit(ctx.block());

        }
        return null;
    }

    @Override public Object visitReturnline(MyParserParser.ReturnlineContext ctx) {
        System.out.println("return 0");
        System.exit(0);
        return null;
    }

    @Override public Object visitExprsum(MyParserParser.ExprsumContext ctx) {
        Double x = (Double) visit(ctx.fact());
        Double y = (Double) visit(ctx.expr());
        return x + y;
    }

    @Override public Object visitExprsub(MyParserParser.ExprsubContext ctx) {
        Double x = (Double) visit(ctx.fact());
        Double y = (Double) visit(ctx.expr());
        return x - y;
    }

    @Override public Object visitFactmult(MyParserParser.FactmultContext ctx) {
        Double x = (Double) visit(ctx.fact());
        Double y = (Double) visit(ctx.term());
        return x * y;
    }

    @Override public Object visitFactdiv(MyParserParser.FactdivContext ctx) {
        Double x = (Double) visit(ctx.fact());
        Double y = (Double) visit(ctx.term());
        return x / y;
    }

    @Override public Object visitFactmod(MyParserParser.FactmodContext ctx) {
        Double x = (Double) visit(ctx.fact());
        Double y = (Double) visit(ctx.term());
        return x % y;
    }

    @Override public Object visitTermparexpr(MyParserParser.TermparexprContext ctx) {
        Double x = (Double) visit(ctx.expr());
        return x;
    }

    @Override public Object visitTermnum(MyParserParser.TermnumContext ctx) {
        return Double.parseDouble(ctx.NUM().getText());
    }

    @Override public Object visitTermid(MyParserParser.TermidContext ctx) {
        Object aux = null;
        String nome;
        String tipo;
        String val;

        for (int i = 0; i < Table.getInstance().size(); i++) {
            nome = Table.getInstance().get(i).getNome();
            tipo = Table.getInstance().get(i).getTipo();
            val = Table.getInstance().get(i).getVal();

            if (ctx.ID().getText().equals(nome) && !tipo.equals("string")) {
                aux = Double.parseDouble(val);
                return aux;
            }
        }
        return null;
    }

    @Override public Object visitValtrue(MyParserParser.ValtrueContext ctx) {
        return true;
    }

    @Override public Object visitValfalse(MyParserParser.ValfalseContext ctx) {
        return false;
    }

    @Override public Object visitBoolexpr(MyParserParser.BoolexprContext ctx) {
        Double a = (Double) visit(ctx.term(0));
        Double b = (Double) visit(ctx.term(1));

        String aux = ctx.comp().getText();
        if (aux.equals("==")) {
            return a.equals(b);
        } else if (aux.equals("<")) {
            return a < b;
        } else if (aux.equals(">")) {
            return a > b;
        } else if (aux.equals("<=")) {
            return a <= b;
        } else if (aux.equals(">=")) {
            return a >= b;
        } else if (aux.equals("!=")) {
            return !a.equals(b);
        }
        return null;
    }
}

