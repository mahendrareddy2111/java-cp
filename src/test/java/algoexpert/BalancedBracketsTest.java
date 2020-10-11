package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedBracketsTest {
    @Test
    public void TestCase1() {
        String input = "([])(){}(())()()";
        Assertions.assertTrue(BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase2() {
        String input = "([])(){}(()()()";
        Assertions.assertFalse(BalancedBrackets.balancedBrackets(input));
    }
}
