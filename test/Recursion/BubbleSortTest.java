package Recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sortTest() {
        int[] expected = {1, 2, 3, 4, 5};
        int[] a1 = {5, 4, 3, 2, 1};
        BubbleSort.sort(a1);
        assertArrayEquals(expected, a1);

        int[] a2 = {4, 5, 3, 2, 1};
        BubbleSort.sort(a2);
        assertArrayEquals(expected, a2);

        int[] a3 = {3, 1, 4, 2, 5};
        BubbleSort.sort(a3);
        assertArrayEquals(expected, a3);

        int[] a4 = {1, 2, 3, 4, 5};
        BubbleSort.sort(a4);
        assertArrayEquals(expected, a4);
    }
}