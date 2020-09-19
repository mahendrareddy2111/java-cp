package algoexpert;

public interface KandanesAlgorithm {

    public static int kadanesAlgorithm(int[] array) {
        // Write your code here.
        if ( array.length == 0){
            return -1;
        }
        int maxSumSoFar = array[0];
        int maxSum = array[0];
        for(int i = 1 ; i < array.length ; i++){
            maxSumSoFar = Math.max(array[i], array[i]+maxSumSoFar);
            maxSum = Math.max(maxSum,maxSumSoFar);
        }
        return maxSum;
    }
}
