package matrixoLang.Domain;


import matrixoLang.Exceptions.ColumnsRowsMismatchException;
import matrixoLang.Exceptions.DeterminantUnevenMatrixException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
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

    // Gauss Elimination, added
    public static Vector GaussElimination(Matrix A, Vector V) {
        ArrayList<Double> B = V.getValue();
        int N = B.size();

        for (int k = 0; k < N; k++) {
            int max = k;
            for (int i = k + 1; i < N; i++)
                if (Math.abs(A.getValue().get(i).get(k)) > Math.abs(A.getValue().get(max).get(k)))
                    max = i;

            ArrayList<Double> temp = A.getValue().get(k);
            A.getValue().set(k, A.getValue().get(max));
            A.getValue().set(max, temp);

            Double t = B.get(k);
            B.set(k, B.get(max));
            B.set(max, t);

            for (int i = k + 1; i < N; i++) {
                double factor = A.getValue().get(i).get(k) / A.getValue().get(k).get(k);
                B.set(i, B.get(i) - factor * B.get(k));
                for (int j = k; j < N; j++)
                    A.getValue().get(i).set(j, A.getValue().get(i).get(j) - factor * A.getValue().get(k).get(j));
            }
        }

        Double[] solution = new Double[N];
        for (int i = N - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < N; j++)
                sum += A.getValue().get(i).get(j) * solution[j];
            solution[i] = (B.get(i) - sum) / A.getValue().get(i).get(i);
        }

        ArrayList<Double> s = new ArrayList<>();
        Collections.addAll(s, solution);
        return new Vector(s);
    }

    // used by MatrixMultiplication
    private static Double multiplyMatricesCell(Matrix A, Matrix B, int row, int col) {
        double cell = 0;
        for (int i = 0; i < B.getValue().size(); i++) {
            cell += A.getValue().get(row).get(i) * B.getValue().get(i).get(col);
        }
        return cell;
    }

    // Matrix multiplication added
    public static Matrix MatrixMultiplication(Matrix A, Matrix B, int line) {
        int first_dim_A = A.getValue().size();
        int second_dim_A = A.getValue().get(0).size();

        int first_dim_B = B.getValue().size();
        int second_dim_B = B.getValue().get(0).size();

        Double[][] result = new Double[first_dim_A][second_dim_B];

        if (second_dim_A != first_dim_B) {
            throw new ColumnsRowsMismatchException(line, second_dim_A, first_dim_B);
        } else {
            for (int i = 0; i < first_dim_A; i++) {
                for (int j = 0; j < second_dim_B; j++) {
                    result[i][j] = multiplyMatricesCell(A, B, i, j);
                }
            }
        }
        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
        for (Double[] row: result) matrix.add(new ArrayList<>(Arrays.asList(row)));
        return new Matrix(matrix);
    }

    // used by determinantOfMatrix
    private static void getCofactor(Matrix mat, Matrix temp, int p, int q, int n) {
        int i = 0, j = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != p && col != q) {
                    temp.getValue().get(i).set(j++, mat.getValue().get(row).get(col));
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    // Matrix determinant, added to get call
    public static Double determinant(Matrix A) throws DeterminantUnevenMatrixException {
        int n = A.getValue().size();
        int m = A.getValue().get(0).size();

        if (n != m) throw new DeterminantUnevenMatrixException();

        return determinantOfMatrix(A, n);
    }

    // used by determinant
    private static Double determinantOfMatrix(Matrix first_value, int n) {
        int first_dim = first_value.getValue().size();
        double D = 0;

        if (n == 1)
            return first_value.getValue().get(0).get(0);

        Matrix temp = new Matrix();

        for (int i = 0; i < first_dim; i++) {
            ArrayList<Double> row = new ArrayList<>(Collections.nCopies(first_dim, 0.0));
            temp.add(row);
        }

        int sign = 1;

        for (int f = 0; f < n; f++) {
            getCofactor(first_value, temp, 0, f, n);
            D += sign * first_value.getValue().get(0).get(f) * determinantOfMatrix(temp, n - 1);

            sign = -sign;
        }
        return D;
    }

    // do NOT change the name of this function pls, I need it like this for the reflection invoke!
    public static Double rowsize(Matrix m) {
        return (double) m.getValue().size();
    }

    // do NOT change the name of this function pls, I need it like this for the reflection invoke!
    public static Double colsize(Matrix m) {
        return (double) m.getValue().get(0).size();
    }

    public Boolean checkRowsEqual() {
        int colSize = value.get(0).size();
        AtomicBoolean res = new AtomicBoolean(true);
        value.forEach(row -> {
            if (row.size() != colSize) {
                res.set(false);
            }
        });
        return res.get();
    }


    @Override
    public String toString() {
        return  value.stream().map(r -> r.stream().map(String::valueOf).collect(Collectors.joining(" ", "", ",\n")))
                .collect(Collectors.joining("", "( \n", ")")).replaceFirst(",\n\\)", "\n)");
    }

}
