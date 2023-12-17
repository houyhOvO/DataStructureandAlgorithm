package LinkedList;

import java.util.Iterator;

public class DoublyLinkedListWithSentinel implements Iterable<Integer>{
    static class Node{
        Node prev;
        int value;
        Node next;

        public Node(Node prev, int value, Node next){
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    public DoublyLinkedListWithSentinel(){
        head = new Node(null, 666, null);
        tail = new Node(null, 888, null);
        head.next = tail;
        tail.prev = head;
    }

    /**
     * Given an index, then find the corresponding node
     * @param index the index of a node
     * @return the node with the index
     */
    private Node findNode(int index){
        int i = -1;
        for(Node p = head; p != tail; p = p.next, i++){
            if(i == index){
                return p;
            }
        }
        return null;
    }

    /**
     * Insert a node into the linked list
     * @param index the insert position
     * @param value the value of the node to be inserted
     */
    public void insert(int index, int value){
        Node prev = findNode(index - 1);
        if(prev == null){
            throw new IllegalArgumentException(String.format("index [%d] is not valid\n", index));
        }
        Node next = prev.next;
        Node inserted = new Node(prev, value, next);
        prev.next = inserted;
        next.prev = inserted;
    }

    public void addFirst(int value){
        insert(0, value);
    }

    public void remove(int index){
        Node prev = findNode(index - 1);
        if(prev == null){
            throw new IllegalArgumentException(String.format("index [%d] is not valid\n", index));
        }
        Node removed = prev.next;
        if(removed == tail){
            throw new IllegalArgumentException(String.format("index [%d] is not valid, because the tail sentinel cannot be removed\n", index));
        }
        Node next = removed.next;

        prev.next = next;
        next.prev = prev;
    }


    /**
     * add a node to the end of the linked list
     * @param value the value of the node to be added
     */
    public void addLast(int value){
        Node last = tail.prev;
        Node added = new Node(last, value, tail);
        last.next = added;
        tail.prev = added;
    }

    public void removeLast(){
        Node removed = tail.prev;
        if(removed == head){
            throw new IllegalArgumentException("The linked list is already empty!");
        }
        Node prev = removed.prev;
        prev.next = tail;
        tail.prev = prev;

    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head.next;
            @Override
            public boolean hasNext() {
                return p != tail;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }
}
