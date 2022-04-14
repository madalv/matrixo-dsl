package matrixoLang;


public class Matrix<T>{
    private T[][] value;


    public T[][] getValue() {
        return value;
    }

    public void setValue(T[][] value) {
        this.value = value;
    }

//    public Double getDeterminant(Matrix<T> m) {
//        //TODO: ERROR HANDLING -- uneven matrix / boolean generic
//    }
}
