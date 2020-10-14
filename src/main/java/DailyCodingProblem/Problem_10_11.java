package DailyCodingProblem;

public class Problem_10_11 {

    public static int[] getProductArray(int[] input){
        int[] result = new int[input.length];
        result[0] = 1;
        for(int i = 1 ; i < input.length ; i++){
            result[i] = input[i-1]*result[i-1];
        }
        int temp = input[input.length-1];
        for(int i = input.length-2 ; i >= 0 ; i--){
            result[i] = temp * result[i];
            temp *= input[i];
        }
        return result;
    }
}
