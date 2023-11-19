package LinkedList;

import java.util.Iterator;
import java.util.function.Consumer;

public class SinglyLinkedList implements Iterable<Integer>{
    private Node head = null;  // head pointer

    private static class Node{
        int value;
        Node next;
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    /**
     * Add a node as the first node
     * @param value the value of the node to be added
     */
    public void addFirst(int value){
        // the linked list is empty
        //head = new Node(value, null);

        /* This line of code can handle both
         * the situation when the linked list is empty
         * and the situation when the linked list is not empty.
         */
        head = new Node(value, head);
    }

    /**
     * Traversal the linked list
     */
    public void loop1(Consumer<Integer> consumer){
        Node pointer = head;
        while (pointer != null){
            consumer.accept(pointer.value);
            pointer = pointer.next;
        }
    }

    /**
     * Use "for" statement to traversal the linked list
     */
    public void loop2(Consumer<Integer> consumer){
        for(Node pointer = head; pointer != null; pointer = pointer.next){
            consumer.accept(pointer.value);
        }
    }

    /**
     * Use Iterable interface to traversal the linked list
     */
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node pointer = head;
            @Override
            public boolean hasNext() {
                return pointer != null;
            }

            @Override
            public Integer next() {
                int v = pointer.value;
                pointer = pointer.next;
                return v;
            }
        };
    }

    /**
     * find the last node in order to add a node to the end of the linked list
     * @return the last node
     */
    private Node findLast(){
        //The case of empty linked list
        if(head == null){
            return null;
        }

        Node pointer;
        for(pointer = head; pointer.next != null; pointer = pointer.next){

        }
        return pointer;
    }

    /**
     * add a node to the end of the linked list
     * @param value the value of the node to be added
     */
    public void addLast(int value){
        Node last = findLast();
        //The case of empty linked list, adding a node to the end equals to adding a node to the start
        if(last == null){
            addFirst(value);
            return;
        }

        last.next = new Node(value, null);
    }


}
