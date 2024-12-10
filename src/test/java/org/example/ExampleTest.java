package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExampleTest
{
    @Test
    public void testAdd()
    {
        assertEquals(30,Integer.sum(10,20));
    }
    @Test public void testDivide()
    {
        assertThrows(ArithmeticException.class,()->Integer.divideUnsigned(42,0));
    }
}
