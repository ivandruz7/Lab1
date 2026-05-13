package org.example;

public class Matrix {

    private char[][] matrix;

    public Matrix(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Матриця не може бути порожньою");
        }
        char[][] a = new char[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                a[i][j] = matrix[i][j];
            }
        }
        this.matrix = a;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void transposition(){

        int row = matrix.length;
        int col = matrix[0].length;
        char[][] a = new char[col][row];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                a[j][i] = matrix[i][j];
            }
        }
        this.matrix = a;
    }

    public int bigSum(){

        int row = matrix.length;
        int col = matrix[0].length;
        char dd;
        int sum = 0;

        for (int i = 0; i < row; i++){
            dd = matrix[i][0];
            for (int j = 1; j < col; j++){
                if (matrix[i][j] > dd) {
                    dd = matrix[i][j];
                }
            }
            sum += dd;

        }
        return sum;
    }

    public void printer(){

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row ; i++){
            for (int j = 0; j < col; j++){
                if (j == col - 1){
                    System.out.println(matrix[i][j] + " ");
                }
                else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println(" ");
    }
}