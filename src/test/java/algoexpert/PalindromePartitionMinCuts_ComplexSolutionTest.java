package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromePartitionMinCuts_ComplexSolutionTest {
    @Test
    public void TestCase1() {
        Assertions.assertTrue(PalindromePartitioningMinCuts_ComplexSolution.palindromePartitioningMinCuts("noonabbad") == 2);
    }

    @Test
    public void TestCase2() {
        Assertions.assertTrue(PalindromePartitioningMinCuts_ComplexSolution.palindromePartitioningMinCuts("a") == 0);
    }

    @Test
    public void TestCase3() {
        Assertions.assertTrue(PalindromePartitioningMinCuts_ComplexSolution.palindromePartitioningMinCuts("abba") == 0);
    }

    @Test
    public void TestCase4() {
        Assertions.assertTrue(PalindromePartitioningMinCuts_ComplexSolution.palindromePartitioningMinCuts("abbba") == 0);
    }

    @Test
    public void TestCase5() {
        Assertions.assertTrue(PalindromePartitioningMinCuts_ComplexSolution.palindromePartitioningMinCuts("abb") == 1);
    }

    @Test
    public void TestCase6() {
        Assertions.assertTrue(PalindromePartitioningMinCuts_ComplexSolution.palindromePartitioningMinCuts("abbb") == 1);
    }

    @Test
    public void TestCase7() {
        Assertions.assertTrue(PalindromePartitioningMinCuts_ComplexSolution.palindromePartitioningMinCuts("abcbm") == 2);
    }

    @Test
    public void TestCase8() {
        Assertions.assertTrue(PalindromePartitioningMinCuts_ComplexSolution.palindromePartitioningMinCuts("ababbbabbababa") == 3);
    }

    @Test
    public void TestCase9() {
        Assertions.assertTrue(PalindromePartitioningMinCuts_ComplexSolution.palindromePartitioningMinCuts("abbbacecffgbgffab") == 4);
    }

    @Test
    public void TestCase10() {
        Assertions.assertTrue(PalindromePartitioningMinCuts_ComplexSolution.palindromePartitioningMinCuts("abcdefghijklmonpqrstuvwxyz") == 25);
    }

    @Test
    public void TestCase11() {
        Assertions.assertTrue(PalindromePartitioningMinCuts_ComplexSolution.palindromePartitioningMinCuts("abcdefghijklmracecaronpqrstuvwxyz") == 26);
    }
}

