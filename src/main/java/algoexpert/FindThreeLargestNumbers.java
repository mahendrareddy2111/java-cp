package algoexpert;

import java.util.Arrays;

public class FindThreeLargestNumbers {

    public static int[] findThreeLargestNumbers(int[] array) {
        if(array.length < 3){
            return array;
        }
        int[] result = {array[0],array[1],array[2]};
        Arrays.sort(result);
        for(int i = 3 ; i < array.length ; i++){
            if(array[i] < result[0]){
                continue;
            }
            if(array[i] > result[2]){
                result[0] = result[1];
                result[1] = result[2];
                result[2] = array[i];
            }else if(array[i] > result[1]){
                result[0] = result[1];
                result[1] = array[i];
            }else if(array[i] > result[0]){
                result[0] = array[i];
            }
        }
        //Arrays.sort(result);
        return result;
    }
}
