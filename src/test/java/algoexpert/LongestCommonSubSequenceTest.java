package algoexpert;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonSubSequenceTest {

    @Test
    public void TestCase1() {
        char[] expected = {'X', 'Y', 'Z', 'W'};
        assertTrue(compare(LongestCommonSubSequence.longestCommonSubsequence("ZXVVYZW", "XKYKZPW"), expected));
    }

    @Test
    public void TestCase2() {
        char[] expected = {'X', 'Y', 'Z', 'W','P'};
        assertTrue(compare(LongestCommonSubSequence.longestCommonSubsequence("ZXVVYZWP", "XKYKZPWP"), expected));
    }

    @Test
    public void TestCase3() {
        char[] expected = {'C','D', 'E', 'G', 'H','J','K','L','W'};
        assertTrue(compare(LongestCommonSubSequence.longestCommonSubsequence("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "CCCDDEGDHAGKGLWAJWKJAWGKGWJAKLGGWAFWLFFWAGJWKAG"), expected));
    }

    @Test
    public void TestCase4() {
        char[] expected = {'C','D', 'E', 'G', 'H','J','K','L','T','U','V'};
        assertTrue(compare(LongestCommonSubSequence.longestCommonSubsequence("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "CCCDDEGDHAGKGLWAJWKJAWGKGWJAKLGGWAFWLFFWAGJWKAGTUV"), expected));
    }

    private static boolean compare(List<Character> arr1, char[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
