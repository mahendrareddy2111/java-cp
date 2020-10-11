package algoexpert.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void TestCase1() {
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        Assertions.assertTrue(compare(SelectionSort.selectionSort(input), expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {1};
        int[] input = {1};
        Assertions.assertTrue(compare(SelectionSort.selectionSort(input), expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {1,2};
        int[] input = {1,2};
        Assertions.assertTrue(compare(SelectionSort.selectionSort(input), expected));
    }

    public boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
