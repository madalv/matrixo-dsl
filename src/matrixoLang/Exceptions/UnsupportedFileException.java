package matrixoLang.Exceptions;

public class UnsupportedFileException extends RuntimeException{
    public UnsupportedFileException(int line, String ext) {
        super("Line " + line + ". Extenstion " + ext + " is currently unsupported.");
    }
}
