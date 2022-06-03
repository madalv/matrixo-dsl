package matrixoLang.Domain;
import matrixoLang.*;

import java.util.List;

public class Function {
    private final String name;
    private final List<Parameter> parameters;
    private final String returnType;
    private final matrixoParser.Function_decContext ctx;

    public Function(String name, String returnType, List<Parameter> parameters, matrixoParser.Function_decContext ctx) {
        this.name = name;
        this.parameters = parameters;
        this.returnType = returnType;
        this.ctx = ctx;
    }

    public String getName() {
        return name;
    }

    public matrixoParser.Function_decContext getCtx() {
        return ctx;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public String getReturnType() {
        return returnType;
    }

    @Override
    public String toString() {
        return "Function{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                ", returnType='" + returnType + '\'' +
                ", ctx=" + ctx +
                '}';
    }
}
