package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<>();
        for ( int i = 0 ; i < array.length ; i++){
            int left = i+1;
            int right = array.length-1;
            while( left < right){
                int sum = array[i]+array[left]+array[right];
                if( sum == targetSum) {
                    Integer[] temp = new Integer[3];
                    temp[0] = array[i];
                    temp[1] = array[left];
                    temp[2] = array[right];
                    result.add(temp);
                    left++;
                }else if ( sum > targetSum){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
