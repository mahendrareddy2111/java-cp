package algoexpert.sort;

public class QuickSort {

    public static int[] quickSort(int[] array) {
        // Write your code here.
        if(array.length > 1){
            quickSortHelper(array,0,array.length-1);
        }
        return array;
    }

    private static void quickSortHelper(int[] array, int startIdx , int endIdx){
        if(startIdx > endIdx){
            return;
        }
        int pivot = array[startIdx];
        int left = startIdx+1;
        int right = endIdx;
        while(left <= right){
            while(left <= right && array[left] <= pivot){
               left++;
            }
            while(left <= right && array[right] > pivot){
                right--;
            }
           if(left <= right){
                swap(array,left,right);
                left++;
                right--;
            }
        }
        swap(array,startIdx,right);
        quickSortHelper(array,startIdx,right-1);
        quickSortHelper(array,right+1,endIdx);
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
