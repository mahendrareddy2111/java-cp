package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPeakTest {

    @Test
    public void TestCase1() {
        int[] input = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        int expected = 6;
        int actual = LongestPeak.longestPeak(input);
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void TestCase2() {
        int[] input = new int[] {1, 2, 3, 3, 4, 0, -1, -3, 2, 3};
        int expected = 5;
        int actual = LongestPeak.longestPeak(input);
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void TestCase3() {
        int[] input = new int[] {1, 2, 3};
        int expected = 0;
        int actual = LongestPeak.longestPeak(input);
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void TestCase4() {
        int[] input = new int[] {};
        int expected = 0;
        int actual = LongestPeak.longestPeak(input);
        Assertions.assertTrue(expected == actual);
    }
}
