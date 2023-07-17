package com.github.hbvit7zoom;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();

        int actual = calculator.add(2, 3);

        Assert.assertEquals(5, actual);

    }
}