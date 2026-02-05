package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void transposition3x3() {

        Main main = new Main();

        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'l'}};
        char[][] correct = {{'a', 'd', 'g'}, {'b', 'e', 'h'}, {'c', 'f', 'l'}};

        char[][] result = main.transposition(matrixb);

        assertArrayEquals(correct, result);

    }

    @Test
    void transposition2x2() {

        Main main = new Main();

        char[][] matrixb = {{'a', 'b'}, {'d', 'e'}};
        char[][] correct = {{'a', 'd'}, {'b', 'e'}};

        char[][] result = main.transposition(matrixb);

        assertArrayEquals(correct, result);

    }

    @Test
    void bigSum3x3() {

        Main main = new Main();

        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'l'}};

        int result = main.bigSum(matrixb);

        assertEquals(309, result);
    }

    @Test
    void bigSum2x2() {

        Main main = new Main();

        char[][] matrixb = {{'a', 'b'}, {'d', 'e'}};

        int result = main.bigSum(matrixb);

        assertEquals(199, result);
    }
}