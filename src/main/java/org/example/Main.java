package org.example;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'l'}};

        main.printer(matrixb);

        char[][] c = new char[3][3];
        c = main.transposition(matrixb);
        main.printer(c);

        System.out.println(main.bigSum(c));



    }

    public char[][] transposition(char[][] b){

        char[][] c = new char[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                c[j][i] = b[i][j];
            }
        }

        return c;
    }

    public char bigSum(char[][] c){

        char dd;
        char[] sum = new char[3];

        for (int i = 0; i < 3; i++){
            dd = c[i][0];
            for (int j = 0; j < 3; j++){
                if (c[i][j] > dd) {
                    dd = c[i][j];
                }
            }
            sum[i] = dd;
            dd = 0;

        }
        char suum = sum[0] + sum[1] +sum[2];
        return suum;
    }

    public void printer(char[][] p){

        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 3; j++){
                if (j == 2){
                    System.out.println(p[i][j] + " ");
                }
                else {
                    System.out.print(p[i][j] + " ");
                }
            }
        }
        System.out.println(" ");
    }

}