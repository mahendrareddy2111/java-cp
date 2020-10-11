package leetcode.september;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {

    public static List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        Map<Character,Integer> charMap = new HashMap<>();
        int i = 0 ;
        for ( char c : S.toCharArray()){
            charMap.put(c,i);
            i++;
        }
        int startIdx = 0;
        int endIdx = charMap.get(S.charAt(0));
        int totalLength = 0;
        for(int j  = 0 ; j < S.length() ; j++){
            char c = S.charAt(j);
            int idx = charMap.get(c);
            if( idx == j){
                result.add(1);
                continue;
            }
            if( idx > endIdx){
                endIdx = idx;
            }
            if(j == endIdx){
                int temp = endIdx-(startIdx-1);
                result.add(temp);
                startIdx = -1;
                totalLength += temp;
                continue;
            }
            if(startIdx == -1){
                startIdx = j;
            }
        }
        if(totalLength != S.length() ){
            result.add(1);
        }
        return result;
    }
}
