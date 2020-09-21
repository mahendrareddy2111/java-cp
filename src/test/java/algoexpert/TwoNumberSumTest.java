package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoNumberSumTest {

    @Test
    public void TestCase1() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        Assertions.assertTrue(output.length == 2);
        Assertions.assertTrue(contains(output, -1));
        Assertions.assertTrue(contains(output, 11));
    }

    @Test
    public void TestCase2() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {4,6}, 10);
        Assertions.assertTrue(output.length == 2);
        Assertions.assertTrue(contains(output, 4));
        Assertions.assertTrue(contains(output, 6));
    }

    public boolean contains(int[] output, int val) {
        for (int el : output) {
            if (el == val) return true;
        }
        return false;
    }
}
