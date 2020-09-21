package algoexpert;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int i = 0 ;
        int j = str.length()-1;
        boolean flag= false;
        while( i <= j  && !flag){
            if ( str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                flag = true;
            }
        }
        return !flag;
    }
}
