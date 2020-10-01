package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SubSortArrayTest {
    @Test
    public void TestCase1() {
        int[] expected = {3, 9};
        Assertions.assertTrue(
                Arrays.equals(
                        SubSortArray.subarraySort(new int[] {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19}),
                        expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {0,1};
        Assertions.assertTrue(
                Arrays.equals(
                        SubSortArray.subarraySort(new int[] {2,1}),
                        expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {0,12};
        Assertions.assertTrue(
                Arrays.equals(
                        SubSortArray.subarraySort(new int[] {4,8,7,12,11,9,-1,3,9,16,-15,51,7}),
                        expected));
    }

    @Test
    public void TestCase4() {
        int[] expected = {0,11};
        Assertions.assertTrue(
                Arrays.equals(
                        SubSortArray.subarraySort(new int[] {4,8,7,12,11,9,-1,3,9,16,-15,11,57}),
                        expected));
    }
}
