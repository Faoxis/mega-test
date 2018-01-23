package org.someone.megatest;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFirstDecade() {
        assertEquals(Factorial.calculate(0), 1);
        assertEquals(Factorial.calculate(1), 1);
        assertEquals(Factorial.calculate(10), 3628800);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeValue() {
        Factorial.calculate(-1);
    }
}