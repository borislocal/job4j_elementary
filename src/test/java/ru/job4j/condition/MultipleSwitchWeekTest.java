package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void whenVtornikThen2() {
        int expected = 2;
        int actual = MultipleSwitchWeek.numberOfDay("Вторник");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenSundayThen7() {
        int expected = 7;
        int actual = MultipleSwitchWeek.numberOfDay("Sunday");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenBlaThenMinus1() {
        int expected = -1;
        int actual = MultipleSwitchWeek.numberOfDay("Bla");
        Assert.assertEquals(expected, actual);
    }
}