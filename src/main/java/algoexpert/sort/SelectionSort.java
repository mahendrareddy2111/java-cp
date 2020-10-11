package algoexpert.sort;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        // Write your code here.
        for(int i = 0 ; i < array.length ; i++){
            int min = array[i];
            int minIdx = -1;
            for(int j = i+1 ; j < array.length ; j++){
                if(array[j] < min){
                    min = array[j];
                    minIdx = j;
                }
            }
            if(minIdx != -1)
                swap(array,i,minIdx);
        }
        return array;
    }

    private static void swap(int[] array, int i, int minIdx) {
        int temp = array[i];
        array[i] = array[minIdx];
        array[minIdx] = temp;
    }
}
