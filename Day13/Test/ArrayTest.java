package Day13.Test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import Day13.JunitPrograms.Array;

public class ArrayTest {
    Array sorter = new Array();

    @Test
    public void testSortArrayWithDuplicates() {
        int[] input = { 5, 3, 8, 3, 2, 5, 1 };
        int[] expected = { 1, 2, 3, 3, 5, 5, 8 };
        int[] result = sorter.sortArray(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortArrayAlreadySorted() {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };
        int[] result = sorter.sortArray(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortEmptyArray() {
        int[] input = {};
        int[] expected = {};
        int[] result = sorter.sortArray(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortArrayWithSingleElement() {
        int[] input = { 7 };
        int[] expected = { 7 };
        int[] result = sorter.sortArray(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortArrayWithNegativeNumbers() {
        int[] input = { 3, -2, 5, -1, 0, -3 };
        int[] expected = { -3, -2, -1, 0, 3, 5 };
        int[] result = sorter.sortArray(input);
        assertArrayEquals(expected, result);
    }
}
