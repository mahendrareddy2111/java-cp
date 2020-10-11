package algoexpert;

public class SingleCycleCheck {

    public static boolean hasSingleCycle(int[] array) {
        // Write your code here.
        int elementsVisted = 0;
        int currentIdx  = 0;
        while( elementsVisted < array.length){
            int value = array[currentIdx];
            int newIdx =currentIdx+value;
            elementsVisted++;
            if(value == 0 || (elementsVisted != array.length &&  newIdx == 0) )
                return false;

            currentIdx = getNextIdx(array,newIdx);
        }
        return currentIdx == 0 && elementsVisted == array.length;
    }

    private static int getNextIdx(int[] array, int newIdx) {
        if(newIdx < 0){
            newIdx = Math.abs(newIdx+array.length);
        }
        if(newIdx >= array.length){
            newIdx = newIdx%array.length;
        }
        return newIdx;
    }
}
