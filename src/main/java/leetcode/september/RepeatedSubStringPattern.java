package leetcode.september;

public class RepeatedSubStringPattern {

    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        if(length == 1){
            return false;
        }
        int max = length/2;

        for(int i = 1 ; i <= max ; i++){
            if(length % i != 0){
                continue;
            }
            int j = length/i;
            String subString = s.substring(0,i);
            String temp = s.replaceAll(subString,"");
            if(temp.equals("")){
                return  true;
            }
        }
        return false;
    }
}
