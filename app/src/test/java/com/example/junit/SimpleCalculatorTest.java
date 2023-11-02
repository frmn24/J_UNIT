package com.example.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class SimpleCalculatorTest {
    private SimpleCalculator simpleCalculator = new SimpleCalculator();

    @Test
    public void twoPlusTwoShouldEqualFour() {
        int result = SimpleCalculator.add(2, 2);
        assertEquals(4, result);
    }
}
