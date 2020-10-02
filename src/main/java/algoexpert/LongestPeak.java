package algoexpert;

public class LongestPeak {
    public static int longestPeak(int[] array) {
        int longestPeak = 0;
        boolean longestPeakAvail = false;
        for(int i = 1 ; i < array.length-1 ; i++){
            if(array[i-1] < array[i] && array[i] > array[i+1]){
                longestPeakAvail = true;
                int a = i-1;
                int b = i+1;
                while( a >= 0 && array[a] < array[a+1] ){
                    a--;
                }
                while( b < array.length && array[b] < array[b-1] ){
                    b++;
                }
                longestPeak = Math.max(longestPeak,b-a);

            }
        }
        return longestPeakAvail ? longestPeak-1 : longestPeak;
    }

}
