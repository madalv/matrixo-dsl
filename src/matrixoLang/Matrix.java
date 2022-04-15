package matrixoLang;


import java.util.ArrayList;

public class Matrix<T>{
    private ArrayList<ArrayList<T>> value;

    public Matrix() {
        value = new ArrayList<>();
    }

    public Matrix(ArrayList<ArrayList<T>> a) {
        value = a;
    }

    public void add(ArrayList<T> a) {
        value.add(a);
    }

    public ArrayList<ArrayList<T>> getValue() {
        return value;
    }

    public void setValue(ArrayList<ArrayList<T>> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  value.toString();
    }

    //    public Double getDeterminant(Matrix<T> m) {
//        //TODO: ERROR HANDLING -- uneven matrix / boolean generic
//    }
}
