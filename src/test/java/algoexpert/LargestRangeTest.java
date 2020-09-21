package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LargestRangeTest {

    @Test
    public void TestCase1() {
        int[] expected = {0, 7};
        Assertions.assertTrue(
                Arrays.equals(
                        LargestRange.largestRange(new int[] {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6}), expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {1,1};
        Assertions.assertTrue(
                Arrays.equals(
                        LargestRange.largestRange(new int[] {1}), expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {1,2};
        Assertions.assertTrue(
                Arrays.equals(
                        LargestRange.largestRange(new int[] {1,2}), expected));
    }

    @Test
    public void TestCase4() {
        int[] expected = {1,4};
        Assertions.assertTrue(
                Arrays.equals(
                        LargestRange.largestRange(new int[] {4,2,1,3}), expected));
    }
}
