package algoexpert;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean balancedBrackets(String str) {
        // Write your code here.
        Map<Character,Character> charMap = new HashMap<>();
        charMap.put(')','(');
        charMap.put(']','[');
        charMap.put('}','{');
        Collection<Character> values = charMap.values();
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if(charMap.containsKey(c)){
                if(stack.isEmpty()){
                    return false;
                }
                char temp = stack.pop();
                System.out.println(temp);
                System.out.println(charMap.get(c));
                if(temp != charMap.get(c)){
                    return false;
                }
            }else if(values.contains(c)){
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
