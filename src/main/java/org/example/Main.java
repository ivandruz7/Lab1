package org.example;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        //Номер моєї залкової книжки 5206 тоді С5 = 1 (транспонування матриці),
        //С7 = 5 (тип змінних char), С11 = 3 (обчислитит суму найбільших елементів
        // кожно рядка матрці)

        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'l'}};

        System.out.println("Початкова матриця.");
        main.printer(matrixb);

        char[][] c = new char[3][3];
        c = main.transposition(matrixb);
        System.out.println("Транспонована матриця.");
        main.printer(c);

        System.out.println("Сума найбільших елементів кожного рядка.");
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

    public int bigSum(char[][] c){

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

        }
        int suum = sum[0] + sum[1] + sum[2];
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