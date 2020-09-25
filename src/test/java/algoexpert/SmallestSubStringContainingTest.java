package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestSubStringContainingTest {

    @Test
    public void TestCase1() {
        String bigString = "abcd$ef$axb$c$";
        String smallString = "$$abf";
        String expected = "f$axb$";
        Assertions.assertTrue(SmallestSubStringContaining.smallestSubstringContaining(bigString, smallString).equals(expected));
    }

    @Test
    public void TestCase2() {
        String bigString = "abcdef";
        String smallString = "fa";
        String expected = "abcdef";
        Assertions.assertTrue(SmallestSubStringContaining.smallestSubstringContaining(bigString, smallString).equals(expected));
    }

    @Test
    public void TestCase3() {
        String bigString = "abcdef";
        String smallString = "d";
        String expected = "d";
        Assertions.assertTrue(SmallestSubStringContaining.smallestSubstringContaining(bigString, smallString).equals(expected));
    }

    @Test
    public void TestCase4() {
        String bigString = "abcdefghijklmnopqrstuvwxyz";
        String smallString = "aajjttwwxxzz";
        String expected = "";
        Assertions.assertTrue(SmallestSubStringContaining.smallestSubstringContaining(bigString, smallString).equals(expected));
    }

    @Test
    public void TestCase5() {
        String bigString = "a$fuu+afff+affaffa+a$Affab+a+a+$a$";
        String smallString = "a+$aaAaaaa$++";
        String expected = "affa+a$Affab+a+a+$a";
        Assertions.assertTrue(SmallestSubStringContaining.smallestSubstringContaining(bigString, smallString).equals(expected));
    }

    @Test
    public void TestCase6() {
        String bigString = "1456243561288281932363365412356789901!";
        String smallString = "123!";
        String expected = "2356789901!";
        Assertions.assertTrue(SmallestSubStringContaining.smallestSubstringContaining(bigString, smallString).equals(expected));
    }

    @Test
    public void TestCase7() {
        String bigString = "abcdefg";
        String smallString = "zx";
        String expected = "";
        Assertions.assertTrue(SmallestSubStringContaining.smallestSubstringContaining(bigString, smallString).equals(expected));
    }
}
