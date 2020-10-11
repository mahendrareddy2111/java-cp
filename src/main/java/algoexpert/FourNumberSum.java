package algoexpert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourNumberSum {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Map<Integer,Integer[]> sumMap = new HashMap<>();
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0 ; i < array.length ; i++){
            int a = array[i];
            for(int j = i+1 ; j < array.length ; j++){
                int b = array[j];
                int sum = a+b;
                int tempSum = targetSum-sum;
                Integer[] value = new Integer[]{a,b};
//                if(sumMap.containsKey(tempSum)){
//                    Integer[]temp = new Integer[4];
//                    temp[0] =  sumMap.get(tempSum)[0];
//                    temp[1] =  sumMap.get(tempSum)[1];
//                    temp[2] = value[0];
//                    temp[3] = value[1];
//                    result.add(temp);
//                }else {
                    sumMap.put(sum, value);
                //}
            }
        }
        return result;
    }
}
