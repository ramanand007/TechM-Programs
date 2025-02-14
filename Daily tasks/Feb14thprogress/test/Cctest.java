package org.anurag.test;

import org.junit.Assert;
import org.junit.Test;
import org.anurag.Calculator;

public class Cctest {

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }
}
