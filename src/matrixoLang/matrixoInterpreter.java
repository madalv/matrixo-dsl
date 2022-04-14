package matrixoLang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class matrixoInterpreter {

    private InputStream stdin;
    private OutputStream stdout;
    private OutputStream stderror;
    private PrintStream stdoutPrint;
    private PrintStream stderrorPrint;
    private Memory memory;

    public matrixoInterpreter(InputStream stdin, OutputStream stdout, OutputStream stderr) {
        this.stdin = stdin;
        this.stdout = stdout;
        this.stderror = stderr;
        this.stdoutPrint = new PrintStream(stdout, true);
        this.stderrorPrint = new PrintStream(stderr, true);
    }

    public void interpret(CharStream program) throws IOException {

        matrixoLexer lexer = new matrixoLexer(program);
        TokenStream tokens = new CommonTokenStream(lexer);
        matrixoParser parser = new matrixoParser(tokens);
        //parser.setErrorListener();
        parser.setErrorHandler(new BailErrorStrategy());

        try {
            ParseTree AST = parser.program();
            memory = new Memory();
            matrixoBaseVisitor evaluator = new matrixoBaseVisitor(memory, stdin, stdoutPrint, stderrorPrint);
            evaluator.visit(AST);
        } catch (Exception e) { // TODO: implement error handling
            stderrorPrint.println(e.getMessage());
        }
    }

    public Memory getMemory() {
        return memory;
    }

    public void clear() {
        memory.free();
    }
}
