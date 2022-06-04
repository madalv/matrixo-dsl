package matrixoLang.Domain;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Vector{
    private ArrayList<Double> value;

    public Vector(ArrayList<Double> a) {
        value = a;
    }

    public ArrayList<Double> getValue() {
        return value;
    }


    public void setValue(ArrayList<Double> value) {
        this.value = value;
    }

    public void setValue() {
        this.value = new ArrayList<Double>();
    }

    @Override
    public String toString() {
        return value.stream().map(String::valueOf).collect(Collectors.joining(" ", "(", ")"));
    }
}
