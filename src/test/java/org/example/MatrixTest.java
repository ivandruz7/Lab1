package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void constructorShouldThrowExceptionOnNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Matrix(null);
        });
    }

    @Test
    void transposition3x3() {

        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'l'}};
        char[][] correct = {{'a', 'd', 'g'}, {'b', 'e', 'h'}, {'c', 'f', 'l'}};

        Matrix matrix = new Matrix(matrixb);

        matrix.transposition();

        assertArrayEquals(correct, matrix.getMatrix());

    }

    @Test
    void transposition2x2() {

        char[][] matrixb = {{'a', 'b'}, {'d', 'e'}};
        char[][] correct = {{'a', 'd'}, {'b', 'e'}};

        Matrix matrix = new Matrix(matrixb);

        matrix.transposition();

        assertArrayEquals(correct, matrix.getMatrix());

    }

    @Test
    void transposition2x3() {

        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
        char[][] correct = {{'a', 'd'}, {'b', 'e'}, {'c', 'f'}};

        Matrix matrix = new Matrix(matrixb);

        matrix.transposition();

        assertArrayEquals(correct, matrix.getMatrix());

    }

    @Test
    void bigSum3x3() {

        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'l'}};

        Matrix matrix = new Matrix(matrixb);

        int result = matrix.bigSum();

        assertEquals(309, result);
    }

    @Test
    void bigSum2x2() {


        char[][] matrixb = {{'a', 'b'}, {'d', 'e'}};

        Matrix matrix = new Matrix(matrixb);

        int result = matrix.bigSum();

        assertEquals(199, result);
    }

    @Test
    void bigSum2x3() {

        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};

        Matrix matrix = new Matrix(matrixb);

        int result = matrix.bigSum();

        assertEquals(201, result);
    }
}