package algoexpert.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

    @Test
    public void TestCase1() {
        int[] input = {-7,2,3,8,-10,4,-6,-10,-2,-7};
        int[] expected = {-10,-10,-7,-7,-6,-2,2,3,4,8};
        Assertions.assertTrue(compare(QuickSort.quickSort(input), expected));
    }

    @Test
    public void TestCase2() {
        int[] input = {8,5,2,9,5,6,3};
        int[] expected = {2,3,5,5,6,8,9};
        Assertions.assertTrue(compare(QuickSort.quickSort(input), expected));
    }

    @Test
    public void TestCase3() {
        int[] input = {8};
        int[] expected = {8};
        Assertions.assertTrue(compare(QuickSort.quickSort(input), expected));
    }

    @Test
    public void TestCase4() {
        int[] input = {8,9,10,11,34,45,56};
        int[] expected = {8,9,10,11,34,45,56};
        Assertions.assertTrue(compare(QuickSort.quickSort(input), expected));
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
