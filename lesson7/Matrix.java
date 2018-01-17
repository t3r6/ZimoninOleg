package lesson7;

public class Matrix {
    private double[][] twoDimensionalArray;
    private int matrixRows;
    private int matrixColumns;


    public Matrix(double[][] elseTwoDimensionalArray) {
        twoDimensionalArray = elseTwoDimensionalArray;
        matrixRows = twoDimensionalArray.length;
        matrixColumns = twoDimensionalArray[0].length;
    }

    public double getPartofArray(int x, int y) {
        return twoDimensionalArray[x][y];
    }

    public void setPartofArray(int x, int y, double part) {
        twoDimensionalArray[x][y] = part;
    }

    public int getMatrixRows() {
        return matrixRows;
    }

    public void setMatrixRows(int matrixRows) {
        this.matrixRows = matrixRows;
    }

    public int getMatrixColumns() {
        return matrixColumns;
    }

    public void setMatrixColumns(int matrixColumns) {
        this.matrixColumns = matrixColumns;
    }

    public double[][] getTwoDimensionalArray() {
        return twoDimensionalArray;
    }

    public void setTwoDimensionalArray(double[][] twoDimArray) {
        this.twoDimensionalArray = twoDimArray;
    }

    public void additionOfMatrix(Matrix otherMatrix) {
        if (matrixRows == otherMatrix.getMatrixRows() && matrixColumns == otherMatrix.getMatrixColumns()) {
            for (int k = 0; k < matrixRows; k++) {
                for (int j = 0; j < twoDimensionalArray[0].length; j++) {
                    twoDimensionalArray[k][j] += otherMatrix.getPartofArray(k, j);
                }
            }
        } else {
            System.out.println("Something is wrong!");
        }
    }

    public void multiplyByTheNumber(int number) {
        for (int k = 0; k < matrixRows; k++) {
            for (int j = 0; j < matrixColumns; j++) {
                twoDimensionalArray[k][j] *= number;
            }
        }
    }

    public void matrixMultiplication(Matrix otherMatrix) {
        if (matrixRows == otherMatrix.getMatrixColumns()) {
            for (int k = 0; k < twoDimensionalArray.length; k++) {
                for (int j = 0; j < twoDimensionalArray[0].length; j++) {
                    int temp = 0;
                    for (int g = 0; g < otherMatrix.matrixRows; g++) {
                        temp += twoDimensionalArray[k][j] * otherMatrix.getPartofArray(g, k);
                    }
                    twoDimensionalArray[k][j] = temp;
                }
            }
        } else {
            System.out.println("Something is wrong!");
        }
    }

    public void printMatrix() {
        for (int k = 0; k < matrixRows; k++) {
            for (int j = 0; j < matrixColumns; j++) {
                System.out.print(twoDimensionalArray[k][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Matrix matrixPrint = new Matrix(new double[][]{{1, 2}, {1, 2}});
        matrixPrint.printMatrix();
        matrixPrint.matrixMultiplication(new Matrix(new double[][]{{1, 3}, {1, 3}}));
        matrixPrint.printMatrix();
        matrixPrint.multiplyByTheNumber(9);
        matrixPrint.printMatrix();
        matrixPrint.additionOfMatrix(matrixPrint);
        matrixPrint.printMatrix();
    }
}
