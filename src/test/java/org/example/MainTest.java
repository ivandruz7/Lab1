package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void transposition() {

        Main main = new Main();

        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'l'}};
        char[][] correct = {{'a', 'd', 'g'}, {'b', 'e', 'h'}, {'c', 'f', 'l'}};

        char[][] result = main.transposition(matrixb);

        assertArrayEquals(correct, result);

    }

    @Test
    void bigSum() {

        Main main = new Main();

        char[][] matrixb = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'l'}};

        int result = main.bigSum(matrixb);

        assertEquals(309, result);
    }
}