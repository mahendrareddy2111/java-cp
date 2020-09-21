package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckTest {
    @Test
    public void TestCase1() {
        Assertions.assertTrue(PalindromeCheck.isPalindrome("abcdcba"));
    }

    @Test
    public void TestCase2() {
        Assertions.assertTrue(PalindromeCheck.isPalindrome("abccba"));
    }
}
