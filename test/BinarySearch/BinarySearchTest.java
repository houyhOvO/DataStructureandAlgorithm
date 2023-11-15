package BinarySearch;

import static BinarySearch.BinarySearch.*;
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

    @Test
    void binarySearchAlternativeTest() {
        int[] b = {4, 31, 34, 56, 80, 109, 458, 2043};
        assertEquals(0, binarySearchAlternative(b, 4));
        assertEquals(1, binarySearchAlternative(b, 31));
        assertEquals(2, binarySearchAlternative(b, 34));
        assertEquals(3, binarySearchAlternative(b, 56));
        assertEquals(4, binarySearchAlternative(b, 80));
        assertEquals(5, binarySearchAlternative(b, 109));
        assertEquals(6, binarySearchAlternative(b, 458));
        assertEquals(7, binarySearchAlternative(b, 2043));
        assertEquals(-1, binarySearchAlternative(b, 123));
        assertEquals(-1, binarySearchAlternative(b, 0));

    }

    @Test
    void binarySearchLeftRightmostTest() {
        int[] a = {1, 2, 4, 4, 4, 5, 6, 6};
        assertEquals(0, binarySearchLeftmost(a, 1));
        assertEquals(1, binarySearchLeftmost(a, 2));
        assertEquals(2, binarySearchLeftmost(a, 4));
        assertEquals(3, binarySearchRightmost(a, 4));
        assertEquals(5, binarySearchLeftmost(a, 5));
        assertEquals(6, binarySearchLeftmost(a, 6));
        assertEquals(7, binarySearchRightmost(a, 6));
        assertEquals(-1, binarySearchLeftmost(a, 8));
        assertEquals(-1, binarySearchRightmost(a, 10));

    }
}