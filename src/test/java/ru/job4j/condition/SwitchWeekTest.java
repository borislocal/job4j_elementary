package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when7ThenSunday() {
        String result = SwitchWeek.nameOfDay(7);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when9ThenNotExist() {
        String result = SwitchWeek.nameOfDay(9);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }
}