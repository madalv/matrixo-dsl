package matrixoLang.Exceptions;

import matrixoLang.Domain.Parameter;
import matrixoLang.Domain.Value;

public class ParameterArgumentTypeMismatchException extends RuntimeException{
    public ParameterArgumentTypeMismatchException(String call, Parameter p, Value v) {
        super("In call " + call + ": parameter " + p.getName() + "is of " + p.getType() + " type, but " +
         v.getType() + " is passed instead.");
    }
}
