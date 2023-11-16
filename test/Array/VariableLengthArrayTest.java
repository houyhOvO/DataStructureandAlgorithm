package Array;

import org.junit.jupiter.api.Test;

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
}