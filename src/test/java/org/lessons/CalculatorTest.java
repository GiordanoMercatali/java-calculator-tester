package org.lessons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd(){
        float newNum = Calculator.add(1, 2);
        assertEquals(3, newNum);
    }
}
