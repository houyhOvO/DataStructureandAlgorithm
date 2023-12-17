package LinkedList;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListWithSentinelTest {

    private DoublyLinkedListWithSentinel getLinkedList(){
        DoublyLinkedListWithSentinel list = new DoublyLinkedListWithSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        return list;
    }
    @Test
    void insertTest() {
        DoublyLinkedListWithSentinel list = getLinkedList();
        list.insert(2, 5);
        assertIterableEquals(List.of(1, 2, 5, 3, 4), list);

        list.insert(5, 6);
        assertIterableEquals(List.of(1, 2, 5, 3, 4, 6), list);

        assertThrows(IllegalArgumentException.class, () -> list.insert(10, 10));
    }

    @Test
    void removeTest() {
        DoublyLinkedListWithSentinel list = getLinkedList();
        list.remove(1);
        assertIterableEquals(List.of(1, 3, 4), list);

        assertThrows(IllegalArgumentException.class, () -> list.remove(5));
        assertThrows(IllegalArgumentException.class, () -> list.remove(3));
    }
}