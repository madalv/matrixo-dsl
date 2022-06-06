package matrixoLang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;


import java.io.IOException;
public class matrixoInterpreter {

    public void interpret(CharStream program) throws IOException {

        matrixoLexer lexer = new matrixoLexer(program);
        TokenStream tokens = new CommonTokenStream(lexer);
        matrixoParser parser = new matrixoParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        try {
            ParseTree AST = parser.program();
            matrixoBaseVisitor evaluator = new matrixoBaseVisitor();
            evaluator.visit(AST);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}