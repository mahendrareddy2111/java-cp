package algoexpert;

public class SubSortArray {
    public static int[] subarraySort(int[] array) {
        // Write your code here.
        int maxNumOutOfOrder = Integer.MIN_VALUE;
        int minNumOutOfOrder = Integer.MAX_VALUE;
        int[] result = {-1,-1};
        boolean flag = true;
        for(int i = 1 ; i < array.length ; i++){
            if(array[i] < array[i-1]){
                minNumOutOfOrder = Math.min(minNumOutOfOrder,array[i]);
                maxNumOutOfOrder = Math.max(maxNumOutOfOrder,array[i-1]);
                flag = false;
            }
        }

        if(flag){
            return result;
        }

        int i = 1;
            while( i < array.length  && result[0] == -1 ){
                if(array[i-1] > minNumOutOfOrder) {
                    result[0] = i-1;
                }
                i++;
            }

            int j = array.length-1;
            while(j >= 0 && array[j] >= maxNumOutOfOrder){
                j--;
            }
            result[1] = j;



        return result;
    }
}
