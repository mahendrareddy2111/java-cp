package algoexpert;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < array.length ; i++){
            if( map.containsKey(array[i])){
                result[0] = targetSum - array[i];
                result[1] = array[i];
                return result;
            }
            map.put(targetSum-array[i], array[i]);
        }
        return new int[0];
    }
}
