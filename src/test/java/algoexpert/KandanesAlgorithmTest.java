package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.stream.IntStream;

public class KandanesAlgorithmTest {
    @Test
    public void TestCase1() {
        int[] input = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
        Assertions.assertTrue(KandanesAlgorithm.kadanesAlgorithm(input) == 19);
    }

    @Test
    public void TestCase2() {
        int[] input = IntStream.range(0,11).toArray();
        Assertions.assertTrue(KandanesAlgorithm.kadanesAlgorithm(input) == 55);
    }

    @Test
    public void TestCase3() {
        int[] input = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        Assertions.assertTrue(KandanesAlgorithm.kadanesAlgorithm(input) == -1);
    }

    @Test
    public void TestCase4() {
        int[] input = {-10,-2,-9,-4,-8,-6,-7,-1,-3,-5};
        Assertions.assertTrue(KandanesAlgorithm.kadanesAlgorithm(input) == -1);
    }

    @Test
    public void TestCase5() {
        int[] input = {1,2,3,4,5,6,-20,7,8,9,10};
        Assertions.assertTrue(KandanesAlgorithm.kadanesAlgorithm(input) == 35);
    }

    @Test
    public void TestCase6() {
        int[] input = {1,2,3,4,5,6,-22,7,8,9,10};
        Assertions.assertTrue(KandanesAlgorithm.kadanesAlgorithm(input) == 34);
    }
}
