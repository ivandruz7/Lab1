package org.example;

public class Main {

    public static void main(String[] args) {

        //Номер моєї залкової книжки 5206 тоді С5 = 1 (транспонування матриці),
        //С7 = 5 (тип змінних char), С11 = 3 (обчислитит суму найбільших елементів
        // кожно рядка матрці)

//        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'l'}};
        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
//        char[][] matrixb = {{'a', 'b'}, {'d', 'e'}};

        Matrix matrix = new Matrix(matrixb);

        System.out.println("Початкова матриця.");
        matrix.printer();

        System.out.println("Транспонована матриця.");
        matrix.transposition();
        matrix.printer();

        System.out.println("Сума найбільших елементів кожного рядка.");
        System.out.println(matrix.bigSum());

    }

}