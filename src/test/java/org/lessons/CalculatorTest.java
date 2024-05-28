package org.lessons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd(){
        float newNum = Calculator.add(1, 2);
        assertEquals(3, newNum);
    }

    @Test
    void testSub(){
        float newNum = Calculator.subtract(3, 2);
        assertEquals(1, newNum);
    }

    @Test
    void testMult(){
        float newNum = Calculator.multiply(2, 2);
        assertEquals(4, newNum);
    }

    @Test
    void testDiv(){
        float newNum = Calculator.divide(6, 2);
        assertEquals(3, newNum);
    }
}
