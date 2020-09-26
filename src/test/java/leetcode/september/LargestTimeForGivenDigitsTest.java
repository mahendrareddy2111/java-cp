package leetcode.september;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestTimeForGivenDigitsTest {

    @Test
    public void test1(){
        int[] arr = {1,2,3,4};
        Assertions.assertTrue(LargestTimeForGivenDigits.largestTimeFromDigits(arr).equals("23:41"));
    }

    @Test
    public void test2(){
        int[] arr = {5,5,5,5};
        Assertions.assertTrue(LargestTimeForGivenDigits.largestTimeFromDigits(arr).equals(""));
    }

    @Test
    public void test3(){
        int[] arr = {3,0,0,0};
        Assertions.assertTrue(LargestTimeForGivenDigits.largestTimeFromDigits(arr).equals("03:00"));
    }

    @Test
    public void test4(){
        int[] arr = {0,0,0,0};
        Assertions.assertTrue(LargestTimeForGivenDigits.largestTimeFromDigits(arr).equals("00:00"));
    }
}
