package algoexpert;

import java.util.HashMap;
import java.util.Map;

public class SmallestSubStringContaining {

    public static String smallestSubstringContaining(String bigString, String smallString) {
        // Write your code here.
        Map<Character, Integer> smallStringMap = new HashMap<>();
        for (int i = 0; i < smallString.length(); i++) {
            Character c = smallString.charAt(i);
            if (smallStringMap.containsKey(c)) {
                smallStringMap.put(c, smallStringMap.get(c) + 1);
                continue;
            }
            smallStringMap.put(c, 1);
        }
        String smallestSubString = bigString;
        int i = 0, j = 0;
        int count = 0;
        Map<Character, Integer> bigStringMap = new HashMap<>();
        while (j < bigString.length()) {
            while (j < bigString.length() && count != smallStringMap.size()) {
                count = moveJ(bigString, smallStringMap, j, count, bigStringMap);
                j++;
            }
            if (j == bigString.length() && i == 0 && count != smallStringMap.size()) {
                return "";
            }
            while (i < j && count == smallStringMap.size()) {
                Character c = bigString.charAt(i);
                if (bigStringMap.containsKey(c)) {
                    if (bigStringMap.get(c) == 1) {
                        bigStringMap.remove(c);
                        count--;
                    } else {
                        bigStringMap.put(c, bigStringMap.get(c) - 1);
                        if (bigStringMap.get(c) < smallStringMap.get(c)) {
                            count--;
                        }
                    }

                }
                i++;
            }
            String temp = bigString.substring(i - 1, j);
            if (temp.length() < smallestSubString.length()) {
                smallestSubString = temp;
            }
            System.out.println();

        }
        return smallestSubString;
    }

    private static int moveJ(String bigString, Map<Character, Integer> smallStringMap, int j, int count, Map<Character, Integer> bigStringMap) {
        Character c = bigString.charAt(j);
        if (smallStringMap.containsKey(c)) {
            if (!bigStringMap.containsKey(c)) {
                bigStringMap.put(c, 1);
            } else {
                bigStringMap.put(c, bigStringMap.get(c) + 1);
            }
            if (bigStringMap.get(c) == smallStringMap.get(c)) {

                count++;
            }

        }
        return count;
    }
}
