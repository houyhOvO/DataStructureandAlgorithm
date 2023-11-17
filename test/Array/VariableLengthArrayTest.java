package Array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VariableLengthArrayTest {

    @Test
    void addLastAndAddTest() {
        VariableLengthArray variableLengthArray = new VariableLengthArray();
        variableLengthArray.addLast(1);
        variableLengthArray.addLast(2);
        variableLengthArray.addLast(3);
        variableLengthArray.addLast(4);
        variableLengthArray.addLast(5);
        for(int i = 0; i < 5; i++){
            assertEquals(i + 1,variableLengthArray.getElement(i));
        }
        variableLengthArray.add(2,6);
        assertEquals(6, variableLengthArray.getElement(2));
        assertEquals(3, variableLengthArray.getElement(3));
        assertEquals(4, variableLengthArray.getElement(4));
        assertEquals(5, variableLengthArray.getElement(5));
    }

    @Test
    void forEachTest() {
        VariableLengthArray variableLengthArray = new VariableLengthArray();
        variableLengthArray.addLast(1);
        variableLengthArray.addLast(2);
        variableLengthArray.addLast(3);
        variableLengthArray.addLast(4);
        variableLengthArray.addLast(5);
        variableLengthArray.forEachElement((element)->{
            System.out.println(element);
        });
    }

    @Test
    void iteratorTest() {
        VariableLengthArray variableLengthArray = new VariableLengthArray();
        variableLengthArray.addLast(1);
        variableLengthArray.addLast(2);
        variableLengthArray.addLast(3);
        variableLengthArray.addLast(4);

        for(Integer element : variableLengthArray){
            System.out.println(element);
        }
    }

    @Test
    void removeTest() {
        VariableLengthArray variableLengthArray = new VariableLengthArray();
        variableLengthArray.addLast(1);
        variableLengthArray.addLast(2);
        variableLengthArray.addLast(5);
        variableLengthArray.addLast(8);
        variableLengthArray.addLast(10);

        assertEquals(5, variableLengthArray.remove(2));
        assertIterableEquals(List.of(1, 2, 8, 10), variableLengthArray);
    }

    @Test
    void growTest() {
        VariableLengthArray variableLengthArray = new VariableLengthArray();
        for(int i = 0; i < 9; i++){
            variableLengthArray.addLast(i + 1);
        }
        assertIterableEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), variableLengthArray);
    }
}