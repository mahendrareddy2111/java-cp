package dailycodingproblem;

import DailyCodingProblem.FirstMissingPositiveNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstMissingPositiveNumberTest {

    @Test
    public void test1(){
        int[] input = {3,4,-1,1,0};
        int result = FirstMissingPositiveNumber.firstMissingPositiveNumber(input);
        Assertions.assertTrue(result==2);
    }

    @Test
    public void test2(){
        int[] input = {3,4,-1,2,1,0};
        int result = FirstMissingPositiveNumber.firstMissingPositiveNumber(input);
        Assertions.assertTrue(result==5);
    }

    @Test
    public void test3(){
        int[] input = {-1,-1,-1,-1,-1};
        int result = FirstMissingPositiveNumber.firstMissingPositiveNumber(input);
        Assertions.assertTrue(result==1);
    }

    @Test
    public void test4(){
        int[] input = {-1,-1,-1,-1,-1,0};
        int result = FirstMissingPositiveNumber.firstMissingPositiveNumber(input);
        Assertions.assertTrue(result==1);
    }

    @Test
    public void test5(){
        int[] input = {-1,-1,-1,-1,-1,0,1};
        int result = FirstMissingPositiveNumber.firstMissingPositiveNumber(input);
        Assertions.assertTrue(result==2);
    }

    @Test
    public void test6(){
        int[] input = {-1,-1,-1,-1,-1,0,1};
        int result = FirstMissingPositiveNumber.firstMissingPositiveNumber(input);
        Assertions.assertTrue(result==2);
    }

    @Test
    public void test7(){
        int[] input = {1,2,3,4,5,6,7,8,9,10,10,10,1,1,1,1,1,1,-1};
        int result = FirstMissingPositiveNumber.firstMissingPositiveNumber(input);
        Assertions.assertTrue(result==11);
    }

    @Test
    public void test8(){
        int[] input = {34,67,43,21,4,3,2,7,8,9,1,2,3,4,5,6,7,8,11,13,16,12,17,9,10,10,10,1,14,1,1,1,1,-1};
        int result = FirstMissingPositiveNumber.firstMissingPositiveNumber(input);
        Assertions.assertTrue(result==15);
    }
}
