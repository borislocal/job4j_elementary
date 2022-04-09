package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when9317264turnBackThen4627139() {
        int[] input = {9, 3, 1, 7, 2, 6, 4};
        int[] result = Turn.back(input);
        int[] expected = {4, 6, 2, 7, 1, 3, 9};
        Assert.assertArrayEquals(expected, result);
    }
}
