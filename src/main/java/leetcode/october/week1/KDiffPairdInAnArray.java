package leetcode.october.week1;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairdInAnArray {

    public static int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if( i != j){
                    if(Math.abs(nums[i]-nums[j]) == k){
                        map.put(Math.min(nums[i],nums[j]),Math.max(nums[i],nums[j]));
                    }
                }

            }
        }

        return map.size();
    }
}
