package matrixoLang;

import java.util.ArrayList;

public class Vector<T>{
    private ArrayList<T> value;

    public Vector(ArrayList<T>a) {
        value = a;
    }

    public ArrayList<T> getValue() {
        return value;
    }



    public void setValue(ArrayList<T> value) {
        this.value = value;
    }

    public void setValue() {
        this.value = new ArrayList<T>();
    }

    @Override
    public String toString() {
        return value.toString();

    }
}
