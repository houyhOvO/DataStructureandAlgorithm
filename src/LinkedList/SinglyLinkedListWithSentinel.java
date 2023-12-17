package LinkedList;

import java.util.Iterator;
import java.util.function.Consumer;

public class SinglyLinkedListWithSentinel implements Iterable<Integer>{
    private Node head = new Node(666, null);  // head pointer

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
        insert(0, value);
    }

    /**
     * Traversal the linked list
     */
    public void loop1(Consumer<Integer> consumer){
        Node pointer = head.next;
        while (pointer != null){
            consumer.accept(pointer.value);
            pointer = pointer.next;
        }
    }

    /**
     * Use "for" statement to traversal the linked list
     */
    public void loop2(Consumer<Integer> consumer){
        for(Node pointer = head.next; pointer != null; pointer = pointer.next){
            consumer.accept(pointer.value);
        }
    }

    /**
     * Use Iterable interface to traversal the linked list
     */
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node pointer = head.next; // Start traversing from the first node after the sentinel node.
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
        Node pointer;
        for(pointer = head; pointer.next != null; pointer = pointer.next){}
        return pointer;
    }

    /**
     * add a node to the end of the linked list
     * @param value the value of the node to be added
     */
    public void addLast(int value){
        Node last = findLast();
        last.next = new Node(value, null);
    }

    /**
     * Given an index, then find the corresponding node
     * @param index the index of a node
     * @return the node with the index
     */
    private Node findNode(int index){
        int i = -1;
        for(Node pointer = head; pointer != null; pointer = pointer.next, i++){
            if(i == index){
                return pointer;
            }
        }
        return null;
    }

    /**
     * Given an index, then find the value of the corresponding node
     * @param index the index of a node
     * @return the value of the node
     */
    public int getValue(int index) throws IllegalArgumentException{
        Node node = findNode(index);
        if(node == null){
            throw new IllegalArgumentException(String.format("index [%d] is not valid\n", index));
        }
        return node.value;
    }

    /**
     * Insert a node into the linked list
     * @param index the insert position
     * @param value the value of the node to be inserted
     */
    public void insert(int index, int value){
        Node previousNode = findNode(index - 1);
        if(previousNode == null){
            throw new IllegalArgumentException(String.format("index [%d] is not valid\n", index));
        }

        previousNode.next = new Node(value, previousNode.next);

    }

    /**
     * Remove the first node from the linked list
     */
    public void removeFirst() throws NullPointerException{
        remove(0);
    }

    /**
     * Remove a node from the linked list
     * @param index the index of the node removed
     */
    public void remove(int index){
        Node previousNode = findNode(index - 1);
        if(previousNode == null){
            throw new IllegalArgumentException(String.format("index [%d] is not valid\n", index));
        }

        Node removedNode = previousNode.next;
        if(removedNode == null){
            throw new IllegalArgumentException(String.format("index [%d] is not valid\n", index));
        }
        previousNode.next = removedNode.next;
    }
}
