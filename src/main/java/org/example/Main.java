package org.example;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        //Номер моєї залкової книжки 5206 тоді С5 = 1 (транспонування матриці),
        //С7 = 5 (тип змінних char), С11 = 3 (обчислитит суму найбільших елементів
        // кожно рядка матрці)

        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'l'}};
        //char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
        //char[][] matrixb = {{'a', 'b'}, {'d', 'e'}};

        System.out.println("Початкова матриця.");
        main.printer(matrixb);

        char[][] c;
        c = main.transposition(matrixb);
        System.out.println("Транспонована матриця.");
        main.printer(c);

        System.out.println("Сума найбільших елементів кожного рядка.");
        System.out.println(main.bigSum(c));



    }

    public char[][] transposition(char[][] b){

        int row = b.length;
        int col = b[0].length;
        char[][] c = new char[col][row];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                c[j][i] = b[i][j];
            }
        }

        return c;
    }

    public int bigSum(char[][] c){

        int row = c.length;
        int col = c[0].length;
        char dd;
        int sum = 0;

        for (int i = 0; i < row; i++){
            dd = c[i][0];
            for (int j = 0; j < col; j++){
                if (c[i][j] > dd) {
                    dd = c[i][j];
                }
            }
            sum += dd;

        }
        return sum;
    }

    public void printer(char[][] p){

        int row = p.length;
        int col = p[0].length;

        for (int i = 0; i < row ; i++){
            for (int j = 0; j < col; j++){
                if (j == col - 1){
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