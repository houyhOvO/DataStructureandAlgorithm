package Recursion;

import org.junit.jupiter.api.Test;

import static Recursion.BinarySearch.search;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void searchTest() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, search(a, 7));
        assertEquals(1, search(a, 13));
        assertEquals(2, search(a, 21));
        assertEquals(6, search(a, 52));
        assertEquals(7, search(a, 53));

        assertEquals(-1, search(a, 15));
        assertEquals(-1, search(a, 50));
    }
}