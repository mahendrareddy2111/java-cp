package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonotonicArrayTest {
    @Test
    public void TestCase1() {
        int[] array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        boolean expected = true;
        boolean actual = MonotonicArray.isMonotonic(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestCase2() {
        int[] array = new int[] {};
        boolean expected = true;
        boolean actual = MonotonicArray.isMonotonic(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestCase3() {
        int[] array = new int[] {1};
        boolean expected = true;
        boolean actual = MonotonicArray.isMonotonic(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestCase4() {
        int[] array = new int[] {1,2,1};
        boolean expected = false;
        boolean actual = MonotonicArray.isMonotonic(array);
        Assertions.assertEquals(expected, actual);
    }
}
