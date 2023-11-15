package BinarySearch;

import static BinarySearch.BinarySearch.binarySearchBasic;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void binarySearchBasicTest() {
        int[] a = {5, 16, 24, 29, 45, 66, 68, 72};
        assertEquals(0, binarySearchBasic(a, 5));
        assertEquals(1, binarySearchBasic(a, 16));
        assertEquals(2, binarySearchBasic(a, 24));
        assertEquals(3, binarySearchBasic(a, 29));
        assertEquals(4, binarySearchBasic(a, 45));
        assertEquals(5, binarySearchBasic(a, 66));
        assertEquals(6, binarySearchBasic(a, 68));
        assertEquals(7, binarySearchBasic(a, 72));
        assertEquals(-1, binarySearchBasic(a, 33));
        assertEquals(-1, binarySearchBasic(a, 90));
    }
}