package algoexpert;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.
        Map<String,List<String>> anagramMap = new HashMap<>();
        for(String word : words){
            char[] cArray = word.toCharArray();
            Arrays.sort(cArray);
            String newWord = new String(cArray);
            if(anagramMap.containsKey(newWord)){
                anagramMap.get(newWord).add(word);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(word);
                anagramMap.put(word,temp);
            }
        }

        return new ArrayList<>(anagramMap.values());
    }
}
