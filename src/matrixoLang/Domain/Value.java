package matrixoLang.Domain;

import java.util.ArrayList;

public class Value {
    private Object value;
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public Value(Matrix v, String t) {
            value = v;
            type = t;
    }


    public Value(Parameter v) {
        value = v;
    }

    public Value(Vector v, String t) {
        value = v;
        type = t;
    }

    public Value(Integer v, String t) {
        value = v;
        type = t;
    }

    public Value(Double v, String t) {
        value = v;
        type = t;
    }

    public Value(Boolean v, String t) {
        value = v;
        type = t;
    }


    public Value(ArrayList<?> v) {
        value = v;
    }

    public ArrayList<Value> getArgList() {return (ArrayList<Value>) value;}

    public ArrayList<Double> getList() {
        return (ArrayList<Double>) value;
    }

    public ArrayList<Parameter> getParameters() {
        return (ArrayList<Parameter>) value;
    }

    //todo add error handling
    public Matrix getMatrix() {
        if (value instanceof Matrix) {
            return (Matrix) value;
        }
        return null;
    }

    public Vector getVector() {
        if (value instanceof Vector) {
             return (Vector) value;
        }
        return null;
    }

    public Boolean getBoolean() {return (Boolean) value;}

    public Integer getInteger() { return (Integer) value; }

    public String getString() {
        return (String) value;
    }

    public Double getDouble() { return (Double) value; }

    public Parameter getParameter() {return (Parameter) value;}

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
