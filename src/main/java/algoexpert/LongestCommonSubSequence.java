package algoexpert;

import java.nio.charset.CharacterCodingException;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubSequence {

    public static List<Character> longestCommonSubsequence(String str1, String str2) {
        // Write your code here.
        List<Character> result = new ArrayList<>();
        int[][] matrix = new int[str1.length()+1][str2.length()+1];
        for ( int i = 1 ; i <= str1.length() ; i++){
            for ( int j = 1 ; j <= str2.length() ; j++){
                if( str1.charAt(i-1) == str2.charAt(j-1)){
                    matrix[i][j] = 1 + matrix[i-1][j-1];
                }else{
                    matrix[i][j] = Math.max(matrix[i-1][j-1], Math.max(matrix[i-1][j],matrix[i][j-1]));
                }
            }
        }
        int len = matrix[str1.length()][str2.length()];
        if (len == 0){
            return result;
        }
        for ( int i = 0 ; i < matrix.length ; i++){
             for ( int j = 0 ; j < matrix[i].length ; j++){
                 System.out.print(matrix[i][j]);
             }
            System.out.println();
        }
        int k = matrix[0].length-1;
        for ( int i = matrix.length-1; i >= 1 && len != 0  ; i--){
            for (int j = k ; j >= 1 && len != 0 ; j--){
                if ( matrix[i][j] == len && matrix[i][j] != matrix[i-1][j] && matrix[i][j] != matrix[i][j-1]){
                    result.add(str1.charAt(i-1));
                    len--;
                    k = j;
                    break;
                }
            }
        }

        return reverse(result);
    }

    private static List<Character> reverse(List<Character> result) {
        for (int i = 0 ; i < result.size()/2 ; i++){
                Character temp = result.get(i);
                result.set(i,result.get(result.size()-(i+1)));
                result.set(result.size()-(i+1),temp);
        }
        return result;
    }
}
