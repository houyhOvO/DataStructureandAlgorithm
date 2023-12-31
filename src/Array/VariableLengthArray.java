package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class VariableLengthArray implements Iterable<Integer>{

    private int size = 0;
    private int capacity = 8;
    private int[] array = {};

    /**
     * Add an element to the end of the variable-length array
     * @param element the element to be added
     */
    public void addLast(int element){
//        array[size] = element;
//        size++;
        add(size, element);
    }

    /**
     * Add an element to any position in the array
     * @param index the index of the new element, assume it is valid
     * @param element the element to be added
     */
    public void add(int index, int element){
        checkAndGrow();

        if(index >= 0 && index < size){
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = element;
        size++;
    }

    private void checkAndGrow() {
        //check the capacity
        if(size == 0){
            array = new int[capacity];
        }else if(size == capacity){
            capacity += capacity >>> 1;
            int[] newArray = new int[capacity];
            System.arraycopy(array,0, newArray,0, size);
            array = newArray;
        }
    }

    public int getElement(int index){
        return array[index];
    }

    /**
     * Traversal method 1
     * @param consumer a functional interface that accepts a single input parameter but returns nothing.
     */
    public void forEachElement(Consumer<Integer> consumer){
        for(int i = 0; i < size; i++){
            consumer.accept(array[i]);
        }
    }

    /**
     * Traversal method 2: Traverse using iterator
     * @return an iterator
     */
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int i = 0;
            /*
             * Is there any next element?
             * @return true if there is a next element, otherwise, false
             */
            @Override
            public boolean hasNext() {
                return i < size;
            }
            /*
             * Returns the next element and points the pointer to the next element.
             * @return next element
             */
            @Override
            public Integer next() {
                return array[i++];
            }
        };
    }

    /**
     * Traversal method 2: Traversal using stream
     */
    public IntStream stream(){
        return IntStream.of(Arrays.copyOfRange(array, 0, size));
    }

    /**
     * Remove an element from the array
     * @param index the index of the element to be removed, assume it is valid
     * @return the element to be removed
     */
    public int remove(int index){
        int removed = array[index];
        if(index < size - 1){
            System.arraycopy(array, index + 1, array, index, size - index - 1);
        }
        size--;
        return removed;
    }
}
