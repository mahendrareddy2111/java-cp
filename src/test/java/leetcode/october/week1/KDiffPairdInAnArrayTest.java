package leetcode.october.week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KDiffPairdInAnArrayTest {

    @Test
    public void test1(){
        int[] input = {3,1,4,1,5};
        int k = 2;
        int result = KDiffPairdInAnArray.findPairs(input,k);
        Assertions.assertTrue(result == 2);
    }

    @Test
    public void test2(){
        int[] input = {1,2,3,4,5};
        int k = 1;
        int result = KDiffPairdInAnArray.findPairs(input,k);
        Assertions.assertTrue(result == 4);
    }

    @Test
    public void test3(){
        int[] input = {1,2,3,4,5};
        int k = 0;
        int result = KDiffPairdInAnArray.findPairs(input,k);
        Assertions.assertTrue(result == 0);
    }

    @Test
    public void test4(){
        int[] input = {1,2,4,4,3,3,0,9,2,3};
        int k = 3;
        int result = KDiffPairdInAnArray.findPairs(input,k);
        Assertions.assertTrue(result == 2);
    }
}
