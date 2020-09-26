package algoexpert;

public class PalindromePartitioningMinCuts_ComplexSolution {
    public static int palindromePartitioningMinCuts(String str) {

        int[][] result = new int[str.length()][str.length()];
        for ( int i = 0 ; i < result.length ; i++){
            for ( int j = i ; j < result[i].length ; j++){
                String subStr = str.substring(i,j+1);
                if ( isPalindrome(subStr)){
                    result[i][j] = 1;
                }
            }
        }

//        for ( int i = 0 ; i < result.length ; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                System.out.print(result[i][j]+"\t");
//            }
//            System.out.println();
//        }

        int[] cuts = new int[str.length()];
        for ( int i = 0 ; i < str.length() ; i++){
            cuts[i] = Integer.MAX_VALUE;
        }
        cuts[0] = 0;
        //cuts[1] = 0;
        for(int i = 1 ; i < str.length() ; i++){
            boolean isPalindrome = false;
            int j = 0;
            for (  ; j < i ; j++){
                if( result[j][i] == 1 ){
                    isPalindrome = true;
                    break;
                }
            }
            if ( j == 0 ){
                cuts[i] = 0;
            }else if(isPalindrome){
                cuts[i] = cuts[j-1]+1;
            }else{
                cuts[i] = cuts[i-1]+1;
            }
        }



        return cuts[str.length()-1];
    }

    private static boolean isPalindrome(String str){
        StringBuffer sb = new StringBuffer(str).reverse();
        return str.equals(sb.toString());
    }
}
