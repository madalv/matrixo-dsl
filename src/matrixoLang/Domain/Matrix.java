package matrixoLang.Domain;


import matrixoLang.Exceptions.ColumnsRowsMismatchException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Matrix{
    private ArrayList<ArrayList<Double>> value;

    public Matrix() {
        value = new ArrayList<>();
    }

    public Matrix(ArrayList<ArrayList<Double>> a) {
        value = a;
    }

    public void add(ArrayList<Double> a) {
        value.add(a);
    }

    public ArrayList<ArrayList<Double>> getValue() {
        return value;
    }

    public void setValue(ArrayList<ArrayList<Double>> value) {
        this.value = value;
    }

    // Addition, added
    public static Matrix Addition(Matrix first_value, Matrix second_value) {
        int first_dim = first_value.getValue().size();
        int second_dim = first_value.getValue().get(0).size();

        Matrix newMatrix = new Matrix();

        for (int i = 0; i < first_dim; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < second_dim; j++) {
                row.add(first_value.getValue().get(i).get(j) + second_value.getValue().get(i).get(j));
            }
            newMatrix.add(row);
        }
        return newMatrix;
    }

    // Subtraction, added
    public static Matrix Subtraction(Matrix first_value, Matrix second_value) {
        int first_dim = first_value.getValue().size();
        int second_dim = first_value.getValue().get(0).size();

        Matrix newMatrix = new Matrix();

        for (int i = 0; i < first_dim; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < second_dim; j++) {
                row.add(first_value.getValue().get(i).get(j) - second_value.getValue().get(i).get(j));
            }
            newMatrix.add(row);
        }
        return newMatrix;
    }

    // Multiplication by scalar, added
    public static Matrix MultiplicationScalar(Matrix first_value, Double scalar) {
        int first_dim = first_value.getValue().size();
        int second_dim = first_value.getValue().get(0).size();

        Matrix newMatrix = new Matrix();

        for (int i = 0; i < first_dim; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < second_dim; j++) {
                row.add(first_value.getValue().get(i).get(j) * scalar);
            }
            newMatrix.add(row);
        }

        return newMatrix;
    }

    // Addition with scalar, added
    public static Matrix AdditionScalar(Matrix first_value, Double scalar) {
        int first_dim = first_value.getValue().size();
        int second_dim = first_value.getValue().get(0).size();

        Matrix newMatrix = new Matrix();

        for (int i = 0; i < first_dim; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < second_dim; j++) {
                row.add(first_value.getValue().get(i).get(j) + scalar);
            }
            newMatrix.add(row);
        }

        return newMatrix;
    }

    // Vector multiplication, added
    public static Vector VectorMultiplication(Matrix first_value, Vector vector) {
        int first_dim = first_value.getValue().size();
        int second_dim = first_value.getValue().get(0).size();

        ArrayList<Double> row = new ArrayList<>(Collections.nCopies(first_dim, 0.0));

        for (int i = 0; i < first_dim; i++) {
            for (int j = 0; j < second_dim; j++) {
                row.set(i, row.get(i) + (vector.getValue().get(i) * first_value.getValue().get(i).get(j)));
            }
        }
        return new Vector(row);
    }

    // Matrix transpose, added to get call
    // do NOT change the name of this function pls, I need it like this for the reflection invoke!
    public static Matrix transpose(Matrix first_value) {
        int first_dim = first_value.getValue().size();
        int second_dim = first_value.getValue().get(0).size();

        Matrix newMatrix = new Matrix();

        for (int i = 0; i < first_dim; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < second_dim; j++) {
                row.add(first_value.getValue().get(j).get(i));
            }
            newMatrix.add(row);
        }

        return newMatrix;
    }

//    public static ArrayList<Double> GaussElimination (Matrix first_value) {
//        int first_dim = first_value.getValue().size();
//        int second_dim = first_value.getValue().get(0).size();
//
//        Matrix newMatrix = new Matrix();
//        ArrayList<ArrayList<Double>> newList = new ArrayList<>(first_value.getValue());
//
//        for (int i = 0; i < first_dim; i++) {
//            for (int j = 0; j < first_dim; j++) {
//                if (i != j) {
//                    double b = newList.get(j).get(i) / newList.get(i).get(i);
//                    for (int k = 0; k < first_dim + 1; k++) {
//                        newList.get(j).set(k, newList.get(j).get(k) - b * newList.get(i).get(k));
//                    }
//                }
//            }
//        }
//
//
//        ArrayList<Double> row = new ArrayList<>();
//
//        for (int i = 0; i < first_dim; i++) {
//            row.add(newList.get(i).get(second_dim + 1) / newList.get(i).get(i));
//        }
//
//        return row;
//    }

//    public ArrayList<Double> Eigenvalues(Matrix first_value) {
//        int first_dim = first_value.getValue().size();
//        int second_dim = first_value.getValue().get(0).size();
//
//        ArrayList<Double> eigenvalues = new ArrayList<>();
//
//        if (first_dim == 2) {
//            double b = -1 * (first_value.getValue().get(0).get(0) + first_value.getValue().get(1).get(1));
//            double c = first_value.getValue().get(0).get(0) * first_value.getValue().get(1).get(1) - first_value.getValue().get(1).get(0) * first_value.getValue().get(0).get(1);
//            eigenvalues.addAll(Operations.quadraticSolver(1, b, c));
//        } else if (getNumRows() == 3) {
//            long trace = (long) Operations.trace(this);
//            long determinant = (long) determinant(matrix, (int) getNumRows());
//            long squaresTrace = (long) Operations.trace(squareTheMatrix());
//
//
//            //now use the characteristic polynomial to solve for the eigenvalues
//        }
//        return eigenvalues;
//    }

    @Override
    public String toString() {
        return  value.stream().map(r -> r.stream().map(String::valueOf).collect(Collectors.joining(" ", "", ",\n")))
                .collect(Collectors.joining("", "( \n", ")")).replaceFirst(",\n\\)", "\n)");
    }

}
