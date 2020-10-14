package dailycodingproblem;

import DailyCodingProblem.Problem_10_11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem_10_11_Test {

    @Test
    public  void test1(){
        int[] input = {1,2,3,4,5};
        int[] result = Problem_10_11.getProductArray(input);
        Assertions.assertTrue(verify(input,result));
    }

    @Test
    public  void test2(){
        int[] input = {2,2,3,4,5};
        int[] result = Problem_10_11.getProductArray(input);
        Assertions.assertTrue(verify(input,result));
    }

    @Test
    public  void test3(){
        int[] input = {-1,2,3,4,5};
        int[] result = Problem_10_11.getProductArray(input);
        Assertions.assertTrue(verify(input,result));
    }

    @Test
    public  void test4(){
        int[] input = {-1,2,0,4,5};
        int[] result = Problem_10_11.getProductArray(input);
        Assertions.assertTrue(verify(input,result));
    }

    private boolean verify(int[] input, int[] result){
        for(int i = 0 ; i < input.length;i++){
            int product = 1;
            for(int j = 0 ; j < input.length ; j++){
                if(i == j ){
                    continue;
                }
                product *= input[j];
            }
            if(result[i] != product){
                return false;
            }
        }

        return true;
    }
}
