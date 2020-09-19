package algoexpert;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        if( array.length <= 1){
            return true;
        }
        boolean isInc = false;
        boolean isDec = false;
        for (int i = 1 ; i < array.length ; i++){
            if(array[i] > array[i-1]){
                isInc = true;
            }else if ( array[i] < array[i-1]){
                isDec = true;
            }
        }
        return !(isInc && isDec);
    }
}
