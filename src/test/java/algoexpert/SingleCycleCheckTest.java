package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleCycleCheckTest {

    @Test
    public void TestCase1() {
        Assertions.assertTrue(SingleCycleCheck.hasSingleCycle(new int[] {2, 3, 1, -4, -4, 2}));
    }

    @Test
    public void TestCase2() {
        Assertions.assertTrue(SingleCycleCheck.hasSingleCycle(new int[] {2,2,-1}));
    }

    @Test
    public void TestCase3() {
        Assertions.assertFalse(SingleCycleCheck.hasSingleCycle(new int[] {0,1,1,1,1}));
    }

    @Test
    public void TestCase4() {
        Assertions.assertTrue(SingleCycleCheck.hasSingleCycle(new int[] {1,2,3,4,-2,3,7,8,-26}));
    }

    @Test
    public void TestCase5() {
        Assertions.assertFalse(SingleCycleCheck.hasSingleCycle(new int[] {1,-1,1,-1}));
    }

    @Test
    public void TestCase6() {
        Assertions.assertTrue(SingleCycleCheck.hasSingleCycle(new int[] {10,11,-6,-23,-2,3,88,909,-26}));
    }
}
