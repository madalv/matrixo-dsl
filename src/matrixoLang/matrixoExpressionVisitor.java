package matrixoLang;


import org.apache.poi.ss.*;
import matrixoLang.Domain.*;
import matrixoLang.Exceptions.*;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class matrixoExpressionVisitor extends matrixoBaseVisitor {
    private final Memory localMemory;
    public static final double SMALL_VALUE = 0.00000000001;
    public static final String COMMA_DELIMITER = ",";
    private final HashMap<Class, String> returnTypes =new HashMap<>() {{
        put(Matrix.class, Type.MATRIX.value);
        put(Vector.class, Type.VECTOR.value);
        put(Double.class, Type.DOUBLE.value);
        put(Boolean.class, Type.BOOLEAN.value);
    }};

    public matrixoExpressionVisitor(Memory localMemory) {
        super();
        this.localMemory = localMemory;
    }

    @Override public Value visitBoolOp(matrixoParser.BoolOpContext ctx) {

        Value left = visit(ctx.expression(0));
        Value right = visit(ctx.expression(1));

        try {
            switch (ctx.BOOL_OP().getText()) {
                case "==":
                    if (left.getType().equals(right.getType()) && left.getType().equals(Type.DOUBLE.value)) {
                        Boolean res = Math.abs(left.getDouble() - right.getDouble()) < SMALL_VALUE;
                        return new Value(res, Type.BOOLEAN.value);
                    } else if (left.getType().equals(right.getType()) && left.getType().equals(Type.MATRIX.value)) {
                        return new Value(left.getMatrix().getValue().equals(right.getMatrix().getValue()), Type.BOOLEAN.value);
                    } else if (left.getType().equals(right.getType()) && left.getType().equals(Type.VECTOR.value)) {
                    return new Value(left.getVector().getValue().equals(right.getVector().getValue()), Type.BOOLEAN.value);
                    }
                    break;
                case "!=":
                    if (left.getType().equals(right.getType()) && left.getType().equals(Type.DOUBLE.value)) {
                        Boolean res = Math.abs(left.getDouble() - right.getDouble()) >= SMALL_VALUE;
                        return new Value(res, Type.BOOLEAN.value);
                    } else if (left.getType().equals(right.getType()))
                        return new Value(!left.equals(right), Type.BOOLEAN.value);
                    break;
                case "&&":
                case "and":
                    return new Value(left.getBoolean() && right.getBoolean(), Type.BOOLEAN.value);
                case "||":
                case "or":
                    return new Value(left.getBoolean() || right.getBoolean(), Type.BOOLEAN.value);
                case "<":
                    return new Value(left.getDouble() < right.getDouble(), Type.BOOLEAN.value);
                case ">":
                    return new Value(left.getDouble() > right.getDouble(), Type.BOOLEAN.value);
                case ">=":
                    return new Value(left.getDouble() >= right.getDouble(), Type.BOOLEAN.value);
                case "<=":
                    return new Value(left.getDouble() <= right.getDouble(), Type.BOOLEAN.value);
                default: throw new UnknownOperatorException(ctx.start.getLine(), ctx.BOOL_OP().getText());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return visitChildren(ctx);
    }

    @Override public Value visitAtomExp(matrixoParser.AtomExpContext ctx) { return visitAtom(ctx.atom()); }

    @Override public Value visitSqrtExp(matrixoParser.SqrtExpContext ctx) {
        Value v = visitAtom(ctx.atom());
        if (!v.getType().equals(Type.DOUBLE.value)) throw new IllegalOperationException(new ArrayList<>(List.of(v)), ctx.start.getLine(), "%% (sqrt)");
        return new Value(Math.sqrt(v.getDouble()), Type.DOUBLE.value);
    }

    @Override public Value visitPrefixExp(matrixoParser.PrefixExpContext ctx) {

        switch (ctx.PREFIX_OP().getText()) {
            case "++":
                Value val = this.visitAtom(ctx.atom());
                if (!val.getType().equals(Type.DOUBLE.value)) throw new IllegalOperationException(new ArrayList<>(List.of(val)), ctx.start.getLine(), ctx.PREFIX_OP().getText());
                return new Value(val.getDouble() + 1, Type.DOUBLE.value);
            case "--":
                val = this.visitAtom(ctx.atom());
                if (!val.getType().equals(Type.DOUBLE.value)) throw new IllegalOperationException(new ArrayList<>(List.of(val)), ctx.start.getLine(), ctx.PREFIX_OP().getText());
                return new Value(val.getDouble() - 1, Type.DOUBLE.value);
            default: throw new UnknownOperatorException(ctx.start.getLine(), ctx.PREFIX_OP().getText());
        }
    }

    @Override public Value visitPowerExp(matrixoParser.PowerExpContext ctx) {
        Value base = this.visit(ctx.expression(0));
        Value exp = this.visit(ctx.expression(1));
        if (!base.getType().equals(Type.DOUBLE.value) || !base.getType().equals(exp.getType()))
            throw new IllegalOperationException(new ArrayList<>(List.of(base)), ctx.start.getLine(), "** (power)");
        return new Value(Math.pow(base.getDouble(), exp.getDouble()), Type.DOUBLE.value);
    }

    @Override public Value visitFirstOrdExp(matrixoParser.FirstOrdExpContext ctx) {
        Value v1 = this.visit(ctx.expression(0));
        Value v2 = this.visit(ctx.expression(1));
        String type1 = v1.getType();
        String type2 = v2.getType();


        switch (ctx.FIRST_ORDER_OP().getText()){
            case "*":
                if (type1.equals(type2)) {
                    if (type1.equals(Type.MATRIX.value)) {
                        Matrix result = Matrix.MatrixMultiplication(v1.getMatrix(), v2.getMatrix(), ctx.start.getLine());
                        return new Value(result, Type.MATRIX.value);
                    }
                    if (type1.equals(Type.VECTOR.value)) {
                        //todo vector * vector (dot product)
                    }
                    if (type1.equals(Type.DOUBLE.value)) {
                        return new Value(v1.getDouble() * v2.getDouble(), Type.DOUBLE.value);
                    }
                } else if (type1.equals(Type.MATRIX.value) && type2.equals(Type.DOUBLE.value)) {
                    return new Value(Matrix.MultiplicationScalar(v1.getMatrix(), v2.getDouble()), Type.MATRIX.value);
                } else if (type1.equals(Type.MATRIX.value) && type2.equals(Type.VECTOR.value)) {
                    int cols = v1.getMatrix().getValue().get(0).size();
                    int rows = v2.getVector().getValue().size();
                    if (cols != rows) throw new ColumnsRowsMismatchException(ctx.start.getLine(), cols, rows);
                    return new Value(Matrix.VectorMultiplication(v1.getMatrix(), v2.getVector()), Type.MATRIX.value);
                } else if (type1.equals(Type.VECTOR.value) && type2.equals(Type.DOUBLE.value)) {
                    //todo vector * scalar
                }
                else throw new IllegalOperationException(new ArrayList<>(List.of(v1, v2)), ctx.start.getLine(), ctx.FIRST_ORDER_OP().getText());
                break;
            case "/":
                if (type1.equals(type2) && type1.equals(Type.DOUBLE.value))
                    return new Value(v1.getDouble() / v2.getDouble(), Type.DOUBLE.value);
                 else if (type1.equals(Type.MATRIX.value) && type2.equals(Type.DOUBLE.value)) {
                    return new Value(Matrix.MultiplicationScalar(v1.getMatrix(), 1/v2.getDouble()), Type.MATRIX.value);
                } else if (type1.equals(Type.VECTOR.value) && type2.equals(Type.DOUBLE.value)){
                    //todo vector / scalar
                }
                else throw new IllegalOperationException(new ArrayList<>(List.of(v1, v2)), ctx.start.getLine(), ctx.FIRST_ORDER_OP().getText());
                break;
            case "%":
                if (type1.equals(type2) && type1.equals(Type.DOUBLE.value))
                    return new Value(v1.getDouble() % v2.getDouble(), Type.DOUBLE.value);
                else throw new IllegalOperationException(new ArrayList<>(List.of(v1, v2)), ctx.start.getLine(), ctx.FIRST_ORDER_OP().getText());
            default: throw new UnknownOperatorException(ctx.start.getLine(), ctx.FIRST_ORDER_OP().getText());
        }

        return null;
    }

    @Override public Value visitSecondOrdExp(matrixoParser.SecondOrdExpContext ctx) {
        Value v1 = this.visit(ctx.expression(0));
        Value v2 = this.visit(ctx.expression(1));
        String type1 = v1.getType();
        String type2 = v2.getType();

        switch (ctx.SECOND_ORDER_OP().getText()){
            case "+":
                if (type1.equals(type2)) {
                    if (type1.equals(Type.MATRIX.value)) {
                        return new Value(Matrix.Addition(v1.getMatrix(), v2.getMatrix()), Type.MATRIX.value);
                    }
                    if (type1.equals(Type.VECTOR.value)) {
                        //todo vector + vector
                    }
                    if (type1.equals(Type.DOUBLE.value)) {
                        return new Value(v1.getDouble() + v2.getDouble(), Type.DOUBLE.value);
                    }
                } else if (type1.equals(Type.MATRIX.value) && type2.equals(Type.DOUBLE.value)) {
                    return new Value(Matrix.AdditionScalar(v1.getMatrix(), v2.getDouble()), Type.MATRIX.value);
                } else if (type1.equals(Type.VECTOR.value) && type2.equals(Type.DOUBLE.value)) {
                    //todo vector + scalar
                }
                else throw new IllegalOperationException(new ArrayList<>(List.of(v1, v2)), ctx.start.getLine(), ctx.SECOND_ORDER_OP().getText());
                break;
            case "-":
                if (type1.equals(type2)) {
                    if (type1.equals(Type.MATRIX.value)) {
                        return new Value(Matrix.Subtraction(v1.getMatrix(), v2.getMatrix()), Type.MATRIX.value);
                    }
                    if (type1.equals(Type.VECTOR.value)) {
                        //todo vector - vector
                    }
                    if (type1.equals(Type.DOUBLE.value)) {
                        return new Value(v1.getDouble() - v2.getDouble(), Type.DOUBLE.value);
                    }
                } else if (type1.equals(Type.MATRIX.value) && type2.equals(Type.DOUBLE.value)) {
                    return new Value(Matrix.AdditionScalar(v1.getMatrix(), -v2.getDouble()), Type.MATRIX.value);
                } else if (type1.equals(Type.VECTOR.value) && type2.equals(Type.DOUBLE.value)) {
                    //todo vector - scalar
                }
                else throw new IllegalOperationException(new ArrayList<>(List.of(v1, v2)), ctx.start.getLine(), ctx.SECOND_ORDER_OP().getText());
                break;
            default: throw new UnknownOperatorException(ctx.start.getLine(), ctx.SECOND_ORDER_OP().getText());
        }

        return null;
    }

    @Override public Value visitParanthesis_expr(matrixoParser.Paranthesis_exprContext ctx) { return this.visit(ctx.expression()); }

    @Override public Value visitAtom(matrixoParser.AtomContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            if (localMemory.getVariables().containsKey(ctx.IDENTIFIER().getText())) return localMemory.getLocalVar(ctx.IDENTIFIER().getText());
            else throw new AttemptToAccessNonDefinedVarException(ctx.IDENTIFIER().getText(), ctx.start.getLine());
        } else if (ctx.TRUE() != null) return new Value(Boolean.TRUE, Type.BOOLEAN.value);
        else if (ctx.FALSE() != null) return new Value(Boolean.FALSE, Type.BOOLEAN.value);
        else if (ctx.NUMBER() != null) return new Value(Double.parseDouble(ctx.NUMBER().getText()), Type.DOUBLE.value);
        else if (ctx.paranthesis_expr() != null) return visitParanthesis_expr(ctx.paranthesis_expr());
        else {
            matrixoFunctionVisitor FV = new matrixoFunctionVisitor(localMemory);
            return FV.visitFunction_call(ctx.function_call());
        }
    }

    @Override public Value visitMatrixInit(matrixoParser.MatrixInitContext ctx) {
        return visit(ctx.matrix_init());
    }

    @Override public Value visitMatrix_init(matrixoParser.Matrix_initContext ctx) {

        if (ctx.getChildCount() == 2) {
            Vector v = new Vector(visitRow(ctx.row(0)).getList());
            return new Value(v, "vector");
        } else {
            Matrix m = new Matrix();
            int rowSize = visitRow(ctx.row(0)).getList().size();
            for (int i = 0; i < ctx.getChildCount() - 1; i++) { // get the rows
                ArrayList<Double> row = visitRow(ctx.row(i)).getList();
                if (row.size() != rowSize) throw new RowNotOfEqualLengthException(ctx.start.getLine());
                m.add(row);
            }
            return new Value(m, Type.MATRIX.value);
        }
    }

    @Override public Value visitRow(matrixoParser.RowContext ctx) {
        ArrayList<Double> v = new ArrayList<>();
        for (var node : ctx.children) {
            String text = node.getText();
            if (text.equals(",") || text.equals(")")) continue;
            Double d = Double.parseDouble(text);
            v.add(d);
        }
        return new Value(v);
    }

    @Override public Value visitImportCall(matrixoParser.ImportCallContext ctx) { return visitImport_call(ctx.import_call()); }

    @Override public Value visitGetCall(matrixoParser.GetCallContext ctx) throws NoSuchMethodException { return visitGet_call(ctx.get_call()); }

    @Override public Value visitGet_call(matrixoParser.Get_callContext ctx) throws NoSuchMethodException {
        String varName = ctx.IDENTIFIER(0).getText();
        String fnName = ctx.IDENTIFIER(1).getText();
        Value var;


        if (localMemory.getVariables().containsKey(varName)) var = localMemory.getLocalVar(varName);
        else throw new AttemptToAccessNonDefinedVarException(varName, ctx.start.getLine());

        if (!inbuiltFunctions.contains(fnName)) throw new AttemptToGetUnknownFunctionException(ctx.start.getLine(), fnName);

        if (var.getType().equals(Type.MATRIX.value)) {
            try {
                Matrix v = var.getMatrix();
                Method getMethod = var.getMatrix().getClass().getDeclaredMethod(fnName, Matrix.class);
                Object m = getMethod.invoke(v, v);
                return new Value(m, returnTypes.get(getMethod.getReturnType()));
            } catch (DeterminantUnevenMatrixException | IllegalAccessException | InvocationTargetException e) {
                System.err.println(e.getCause());
                System.exit(-1);
            }
        }
        return null;
    }



    @Override public Value visitImport_call(matrixoParser.Import_callContext ctx) {

        String filename = visitFilename(ctx.filename()).getString();
        String ext = getFileExtension(filename);
        String type = ctx.MATRIX() != null ? Type.MATRIX.value : Type.VECTOR.value;


        switch (ext) {
            case "csv":
                Matrix m = readMatrixFromCSV(filename, ctx.start.getLine());
                if (m.getValue().size() == 1 && type.equalsIgnoreCase(Type.VECTOR.value))
                    return new Value(new Vector(m.getValue().get(0)), Type.VECTOR.value);
                else return new Value(m, Type.MATRIX.value);
            case "xlsx":
                m = readMatrixFromExcel(filename, ctx.start.getLine());
                assert m != null;
                if (m.getValue().size() == 1 && type.equalsIgnoreCase(Type.VECTOR.value))
                    return new Value(new Vector(m.getValue().get(0)), Type.VECTOR.value);
                else if (m.getValue().size() > 1 && type.equalsIgnoreCase(Type.MATRIX.value))
                    return new Value(m, Type.MATRIX.value);
                else throw new ImportMismatchException(ctx.start.getLine(), type,
                            m.getValue().size() > 1 ? Type.MATRIX.value : Type.VECTOR.value);

            default: throw new UnsupportedFileException(ctx.start.getLine(), ext);
        }
    }
    @Override public Value visitFilename(matrixoParser.FilenameContext ctx) {
        String path = "";
        if (ctx.PATH() != null) path = ctx.PATH().getText();
        String filename = ctx.NAME().getText();

        return new Value(path + filename); }

    private static Matrix readMatrixFromCSV(String filename, int lineNr) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                ArrayList<Double> row = new ArrayList<>();
                for (String v : values) {
                    row.add(Double.parseDouble(v));
                }
                matrix.add(row);
            }
            Matrix m = new Matrix(matrix);
            if (!m.checkRowsEqual()) throw new RowNotOfEqualLengthException(lineNr);
            return m;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private static Matrix readMatrixFromExcel(String filename, int line) {
        try {
            FileInputStream file = new FileInputStream(filename);
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            ArrayList<ArrayList<Double>> data = new ArrayList<>();

            for (Row row : sheet) {
                ArrayList<Double> r = new ArrayList<>();
                for (Cell cell : row) {
                    if (cell.getCellType() == CellType.NUMERIC) {
                        r.add(cell.getNumericCellValue());
                    } else {
                        throw new NonNumericValueException(line);
                    }
                }
                data.add(r);
            }
            Matrix m = new Matrix(data);
            if (!m.checkRowsEqual()) throw new RowNotOfEqualLengthException(line);
            return m;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private static String getFileExtension(String fullName) {
        int dotIndex = fullName.lastIndexOf('.');
        return (dotIndex == -1) ? "" : fullName.substring(dotIndex + 1);
    }
}
