package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinRewardsTest {

    @Test
    public void TestCase1() {
        Assertions.assertTrue(MinRewards.minRewards(new int[] {8, 4, 2, 1, 3, 6, 7, 9, 5}) == 25);
    }

    @Test
    public void TestCase2() {
        Assertions.assertTrue(MinRewards.minRewards(new int[] {5,10}) == 3);
    }

    @Test
    public void TestCase3() {
        Assertions.assertTrue(MinRewards.minRewards(new int[] {5}) == 1);
    }
}
