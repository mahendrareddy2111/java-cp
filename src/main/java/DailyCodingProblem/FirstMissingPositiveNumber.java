package DailyCodingProblem;

public class FirstMissingPositiveNumber {

    public static int firstMissingPositiveNumber(int[] input){
        boolean[] values = new boolean[input.length];

       for(int i = 0 ; i < input.length ; i++){
           int a = input[i];
           if(a-1 >= 0 && a-1 < input.length){
               values[a-1] = true;
           }
       }

       for(int i = 0 ; i < values.length ; i++){
           if(values[i] == false){
               return i+1;
           }
       }
       return input.length;
    }
}
