package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenFactorialOf5Then120() {
        int n = 5;
        int expected = 120;
        int result = Factorial.calc(n);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFactorialOfZeroThenOne() {
        int n = 0;
        int expected = 1;
        int result = Factorial.calc(n);
        Assert.assertEquals(expected, result);
    }

}