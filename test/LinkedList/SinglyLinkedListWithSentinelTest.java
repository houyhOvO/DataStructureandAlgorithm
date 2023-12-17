package LinkedList;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListWithSentinelTest {

    private SinglyLinkedListWithSentinel getLinkedList(){
        SinglyLinkedListWithSentinel list = new SinglyLinkedListWithSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        return list;
    }

    @Test
    void addLastTest() {
        SinglyLinkedListWithSentinel list = getLinkedList();
        assertIterableEquals(List.of(1, 2, 3, 4), list);
    }

    @Test
    void getValueTest() {
        SinglyLinkedListWithSentinel list = getLinkedList();
        assertEquals(3, list.getValue(2));
        assertThrows(IllegalArgumentException.class, () -> list.getValue(10));
    }

    @Test
    void insertTest() {
        SinglyLinkedListWithSentinel list = getLinkedList();
        list.insert(0, 5);
        assertIterableEquals(List.of(5, 1, 2, 3, 4), list);

        list.insert(5, 6);
        assertIterableEquals(List.of(5, 1, 2, 3, 4, 6), list);

        assertThrows(IllegalArgumentException.class, () -> list.insert(7, 7));
    }

    @Test
    void addFirstTest() {
        SinglyLinkedListWithSentinel list = getLinkedList();
        list.addFirst(5);
        assertIterableEquals(List.of(5, 1, 2, 3, 4), list);
    }

    @Test
    void removeTest() {
        SinglyLinkedListWithSentinel list = getLinkedList();
        list.remove(2);
        assertIterableEquals(List.of(1, 2, 4), list);

        assertThrows(IllegalArgumentException.class, () -> list.remove(4));
        assertThrows(IllegalArgumentException.class, () -> list.remove(3));
    }
}