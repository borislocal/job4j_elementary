package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOfAnother5elements() {
        int[] data = new int[] {13, 14, 11, 12, 15};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {11, 12, 13, 14, 15};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {5, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 5, 5};
        Assert.assertArrayEquals(expected, result);
    }
}