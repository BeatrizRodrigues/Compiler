import Simbolos.Table;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) throws IOException {
        CharStream input = new ANTLRFileStream("C:\\Users\\Usuario\\IdeaProjects\\Comp\\src\\main\\java\\Tests\\Media");
        MyParserLexer lexer = new MyParserLexer(input);
        TokenStream tokens = new BufferedTokenStream(lexer);
        MyParserParser parser = new MyParserParser(tokens);
        MyParserParser.ProgContext lang = parser.prog();

        Table symbolTable = Table.getInstance();

        MyVisitor visitor = new MyVisitor();
        visitor.visit(lang);

        showParseTreeFrame(lang, parser); //lang

        for (int i = 0; i < symbolTable.size(); i++) {
            System.out.println(
                    "ID: " + symbolTable.get(i).getId()
                            + " Tipo: " + symbolTable.get(i).getTipo()
                            + " Nome: " + symbolTable.get(i).getNome()
                            + " Valor: " + symbolTable.get(i).getVal()
            );
        }
    }

    private static void showParseTreeFrame(ParseTree tree, MyParserParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewr.setScale(1);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

