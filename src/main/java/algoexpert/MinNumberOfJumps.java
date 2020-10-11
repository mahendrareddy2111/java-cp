package algoexpert;

public class MinNumberOfJumps {

    public static int minNumberOfJumps(int[] array) {
        if(array.length == 1){
            return 0;
        }
        int numberOfJumps = 0 ;
        int lastJump = array.length-1;
        for(int i = array.length-2 ; i >= 0 ; i++){
            int temp = array[i]+i;
            if(temp >= array.length){
                numberOfJumps = 1;
                lastJump = i;
                continue;
            }
            while(temp < array.length){
                if(temp >= array.length){

                }
            }
        }
        return -1;
    }
}
