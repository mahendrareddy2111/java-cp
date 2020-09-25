package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubStringTest {
    @Test
    public void TestCase1() {
        Assertions.assertTrue(LongestPalindromicSubString.longestPalindromicSubstring("abaxyzzyxf").equals("xyzzyx"));
    }

    @Test
    public void TestCase2() {
        Assertions.assertTrue(LongestPalindromicSubString.longestPalindromicSubstring("abaxyzzyxaba").equals("abaxyzzyxaba"));
    }

    @Test
    public void TestCase3() {
        Assertions.assertTrue(LongestPalindromicSubString.longestPalindromicSubstring("").equals(""));
    }

    @Test
    public void TestCase4() {
        Assertions.assertTrue(LongestPalindromicSubString.longestPalindromicSubstring("its highnoon").equals("noon"));
    }

    @Test
    public void TestCase5() {
        Assertions.assertTrue(LongestPalindromicSubString.longestPalindromicSubstring("noon high it is").equals("noon"));
    }

    @Test
    public void TestCase6() {
        Assertions.assertTrue(LongestPalindromicSubString.longestPalindromicSubstring("abccbaits highnoon").equals("abccba"));
    }
}
