package matrixoLang;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;

public class MatrixoMain {
    public static void main(String[] args) {
        try {
            CharStream in = CharStreams.fromFileName(System.getProperty("user.dir") + "\\src\\tests\\test3.mo");
            matrixoInterpreter interpreter = new matrixoInterpreter();
            interpreter.interpret(in);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(-1);
        }
    }
}
