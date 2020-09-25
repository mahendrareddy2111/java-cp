package algoexpert;

public class LongestPalindromicSubString {
    public static String longestPalindromicSubstring(String str) {
        // Write your code here.
        if(str.length() == 0 ){
            return str;
        }
        String longestPalindromicSubString = str.substring(0,1);
        for ( int i = 1 ; i < str.length() ; i++){
            String first = findPalindrome(i-1,i+1,str);
            if(first.length() > longestPalindromicSubString.length()){
                longestPalindromicSubString = first;
            }
            String second = findPalindrome(i-1,i,str);
            if(second.length() > longestPalindromicSubString.length()){
                longestPalindromicSubString = second;
            }
            //System.out.println("i:"+i+ " second:"+second);
        }
        return longestPalindromicSubString;
    }

    private static String findPalindrome(int i, int j, String str) {
        while( i >= 0 && j < str.length() && str.charAt(i) == str.charAt(j)){
            i--;
            j++;
        }
        return str.substring(i+1,j);
    }
}
