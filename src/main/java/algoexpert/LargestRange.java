package algoexpert;

import java.util.HashMap;
import java.util.Map;

public class LargestRange {

    public static int[] largestRange(int[] array) {
        // Write your code here.
        int[] result = new int[2];
        int maxRange = Integer.MIN_VALUE;
        Map<Integer,Boolean> inputMap = new HashMap<>();
        for(int i = 0 ; i < array.length ; i++){
            inputMap.put(array[i],false);
        }
        for(int i = 0 ; i < array.length ; i++){
            int temp = array[i];
            inputMap.put(temp,true);
            int t = temp;
            while(inputMap.containsKey(temp)){
                inputMap.put(temp,true);
                temp--;
            }
            while( inputMap.containsKey(t)){
                inputMap.put(t,true);
                t++;
            }
            if (( t-temp+1 ) > maxRange){
                maxRange = t-(temp-1);
                result[0] = temp+1;
                result[1] = t-1;
            }
        }
        return result;
    }
}
