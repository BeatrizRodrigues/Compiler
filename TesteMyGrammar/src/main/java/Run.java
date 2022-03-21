import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) throws IOException {
        MyParserLexer lexer;

        lexer = new MyParserLexer(CharStreams.fromFileName("teste.src")) ;
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        //LEXER
        //CharStream charInput = new ANTLRFileStream(filename);
        //CharStream charInput = CharStreams.fromFileName(filename);
        //MyParserLexer lexer = new MyParserLexer(charInput);
        //----
        TokenStream input = new BufferedTokenStream(lexer);
        //----
        //PARSER
        MyParserParser parser = new MyParserParser(input);
        MyParserListener listener = new MyParserListener() {
            @Override
            public void enterProg(MyParserParser.ProgContext ctx) {

            }

            @Override
            public void exitProg(MyParserParser.ProgContext ctx) {

            }

            @Override
            public void enterLine(MyParserParser.LineContext ctx) {

            }

            @Override
            public void exitLine(MyParserParser.LineContext ctx) {

            }

            @Override
            public void enterCode(MyParserParser.CodeContext ctx) {

            }

            @Override
            public void exitCode(MyParserParser.CodeContext ctx) {

            }

            @Override
            public void enterElement(MyParserParser.ElementContext ctx) {

            }

            @Override
            public void exitElement(MyParserParser.ElementContext ctx) {

            }

            @Override
            public void enterOutput(MyParserParser.OutputContext ctx) {

            }

            @Override
            public void exitOutput(MyParserParser.OutputContext ctx) {

            }

            @Override
            public void enterShow(MyParserParser.ShowContext ctx) {

            }

            @Override
            public void exitShow(MyParserParser.ShowContext ctx) {

            }

            @Override
            public void enterFollow(MyParserParser.FollowContext ctx) {

            }

            @Override
            public void exitFollow(MyParserParser.FollowContext ctx) {

            }

            @Override
            public void enterTipo(MyParserParser.TipoContext ctx) {

            }

            @Override
            public void exitTipo(MyParserParser.TipoContext ctx) {

            }

            @Override
            public void enterEquals(MyParserParser.EqualsContext ctx) {

            }

            @Override
            public void exitEquals(MyParserParser.EqualsContext ctx) {

            }

            @Override
            public void enterCont(MyParserParser.ContContext ctx) {

            }

            @Override
            public void exitCont(MyParserParser.ContContext ctx) {

            }

            @Override
            public void enterExpr(MyParserParser.ExprContext ctx) {

            }

            @Override
            public void exitExpr(MyParserParser.ExprContext ctx) {

            }

            @Override
            public void enterRest(MyParserParser.RestContext ctx) {

            }

            @Override
            public void exitRest(MyParserParser.RestContext ctx) {

            }

            @Override
            public void enterFact(MyParserParser.FactContext ctx) {

            }

            @Override
            public void exitFact(MyParserParser.FactContext ctx) {

            }

            @Override
            public void enterMore(MyParserParser.MoreContext ctx) {

            }

            @Override
            public void exitMore(MyParserParser.MoreContext ctx) {

            }

            @Override
            public void enterTerm(MyParserParser.TermContext ctx) {

            }

            @Override
            public void exitTerm(MyParserParser.TermContext ctx) {

            }

            @Override
            public void enterUif(MyParserParser.UifContext ctx) {

            }

            @Override
            public void exitUif(MyParserParser.UifContext ctx) {

            }

            @Override
            public void enterCondition(MyParserParser.ConditionContext ctx) {

            }

            @Override
            public void exitCondition(MyParserParser.ConditionContext ctx) {

            }

            @Override
            public void enterComp(MyParserParser.CompContext ctx) {

            }

            @Override
            public void exitComp(MyParserParser.CompContext ctx) {

            }

            @Override
            public void enterOther(MyParserParser.OtherContext ctx) {

            }

            @Override
            public void exitOther(MyParserParser.OtherContext ctx) {

            }

            @Override
            public void enterUelse(MyParserParser.UelseContext ctx) {

            }

            @Override
            public void exitUelse(MyParserParser.UelseContext ctx) {

            }

            @Override
            public void enterUwhile(MyParserParser.UwhileContext ctx) {

            }

            @Override
            public void exitUwhile(MyParserParser.UwhileContext ctx) {

            }

            @Override
            public void enterUfor(MyParserParser.UforContext ctx) {

            }

            @Override
            public void exitUfor(MyParserParser.UforContext ctx) {

            }

            @Override
            public void enterDecl(MyParserParser.DeclContext ctx) {

            }

            @Override
            public void exitDecl(MyParserParser.DeclContext ctx) {

            }

            @Override
            public void enterIncr(MyParserParser.IncrContext ctx) {

            }

            @Override
            public void exitIncr(MyParserParser.IncrContext ctx) {

            }

            @Override
            public void enterFunction(MyParserParser.FunctionContext ctx) {

            }

            @Override
            public void exitFunction(MyParserParser.FunctionContext ctx) {

            }

            @Override
            public void enterPar(MyParserParser.ParContext ctx) {

            }

            @Override
            public void exitPar(MyParserParser.ParContext ctx) {

            }

            @Override
            public void enterCfunction(MyParserParser.CfunctionContext ctx) {

            }

            @Override
            public void exitCfunction(MyParserParser.CfunctionContext ctx) {

            }

            @Override
            public void enterCpar(MyParserParser.CparContext ctx) {

            }

            @Override
            public void exitCpar(MyParserParser.CparContext ctx) {

            }

            @Override
            public void enterInput(MyParserParser.InputContext ctx) {

            }

            @Override
            public void exitInput(MyParserParser.InputContext ctx) {

            }

            @Override
            public void enterUmath(MyParserParser.UmathContext ctx) {

            }

            @Override
            public void exitUmath(MyParserParser.UmathContext ctx) {

            }

            @Override
            public void enterMathpar(MyParserParser.MathparContext ctx) {

            }

            @Override
            public void exitMathpar(MyParserParser.MathparContext ctx) {

            }

            @Override
            public void enterFloor(MyParserParser.FloorContext ctx) {

            }

            @Override
            public void exitFloor(MyParserParser.FloorContext ctx) {

            }

            @Override
            public void enterCeil(MyParserParser.CeilContext ctx) {

            }

            @Override
            public void exitCeil(MyParserParser.CeilContext ctx) {

            }

            @Override
            public void enterSqrt(MyParserParser.SqrtContext ctx) {

            }

            @Override
            public void exitSqrt(MyParserParser.SqrtContext ctx) {

            }

            @Override
            public void enterPot(MyParserParser.PotContext ctx) {

            }

            @Override
            public void exitPot(MyParserParser.PotContext ctx) {

            }

            @Override
            public void enterFmax(MyParserParser.FmaxContext ctx) {

            }

            @Override
            public void exitFmax(MyParserParser.FmaxContext ctx) {

            }

            @Override
            public void enterFmin(MyParserParser.FminContext ctx) {

            }

            @Override
            public void exitFmin(MyParserParser.FminContext ctx) {

            }

            @Override
            public void enterRint(MyParserParser.RintContext ctx) {

            }

            @Override
            public void exitRint(MyParserParser.RintContext ctx) {

            }

            @Override
            public void visitTerminal(TerminalNode node) {

            }

            @Override
            public void visitErrorNode(ErrorNode node) {

            }

            @Override
            public void enterEveryRule(ParserRuleContext ctx) {

            }

            @Override
            public void exitEveryRule(ParserRuleContext ctx) {

            }
        };
        parser.addParseListener(listener);
        //----
        MyParserParser.ProgContext prog = parser.prog();
        showParseTreeFrame(prog, parser);
        MyParserVisitor v = new MyParserBaseVisitor();
        v.visit(prog);
    }

    private static void showParseTreeFrame(ParseTree tree, MyParserParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.setScale(1);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
