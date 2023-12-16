package LinkedList;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void loopTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        singlyLinkedList.addFirst(2);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(4);

        singlyLinkedList.loop1(value ->{
            System.out.println(value);
        });

        singlyLinkedList.loop2(value ->{
            System.out.println(value);
        });
    }

    @Test
    void iteratorTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        singlyLinkedList.addFirst(2);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(4);

        for(Integer value : singlyLinkedList){
            System.out.println(value);
        }

        assertIterableEquals(List.of(4, 3, 2, 1), singlyLinkedList);
    }

    @Test
    void addLastTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.addLast(4);

        assertIterableEquals(List.of(1, 2, 3, 4), singlyLinkedList);
    }

    @Test
    void getValueTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.addLast(4);

        assertEquals(3, singlyLinkedList.getValue(2));
        assertThrows(IllegalArgumentException.class, () ->{
            singlyLinkedList.getValue(10);
        });
    }

    @Test
    void insertTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.addLast(4);

        singlyLinkedList.insert(2, 5);
        assertIterableEquals(List.of(1, 2, 5, 3, 4), singlyLinkedList);

        singlyLinkedList.insert(0, 0);
        assertIterableEquals(List.of(0, 1, 2, 5, 3, 4), singlyLinkedList);

        singlyLinkedList.insert(6, 8);
//        assertThrows(IllegalArgumentException.class, () ->{
//            for (Integer i : singlyLinkedList) {
//            }
//        });
    }


    @Test
    void removeFirstTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.addLast(4);

        singlyLinkedList.removeFirst();
        assertIterableEquals(List.of(2, 3, 4), singlyLinkedList);

        singlyLinkedList.removeFirst();
        assertIterableEquals(List.of(3, 4), singlyLinkedList);

        singlyLinkedList.removeFirst();
        assertIterableEquals(List.of(4), singlyLinkedList);

        singlyLinkedList.removeFirst();
        assertIterableEquals(List.of(), singlyLinkedList);

        assertThrows(NullPointerException.class, singlyLinkedList::removeFirst);
    }


    @Test
    void removeTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.addLast(4);

        singlyLinkedList.remove(2);
        assertIterableEquals(List.of(1, 2, 4), singlyLinkedList);

        singlyLinkedList.remove(0);
        assertIterableEquals(List.of(2, 4), singlyLinkedList);


        assertThrows(IllegalArgumentException.class, () ->{
            singlyLinkedList.remove(5);
        });

        assertThrows(IllegalArgumentException.class, () ->{
            singlyLinkedList.remove(2);
        });
    }
}