package matrixoLang;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;

public class MatrixoMain {
    public static void main(String[] args) {
        try {
            CharStream in = CharStreams.fromFileName("C:\\Users\\Vlada\\Downloads\\pbl-sem-4\\matrixoLang\\src\\tests\\test.mo");
            matrixoInterpreter interpreter = new matrixoInterpreter(System.in, System.out, System.err);
            interpreter.interpret(in);
            interpreter.clear();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(-1);
        }
    }
}
