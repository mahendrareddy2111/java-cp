package algoexpert;

import java.util.Arrays;

public class MinRewards {
    public static int minRewards(int[] scores) {
        // Write your code here.
        int result = -1;
        if(scores.length <= 2){
            return solveForTwoOrLessScores(scores);
        }
        int[] rewardsArr = new int[scores.length];
        if( scores[1] > scores[0]){
            rewardsArr[0] = 1;
        }
        if( scores[scores.length-2] > scores[scores.length-1]){
            rewardsArr[scores.length-1] = 1;
        }
        for(int i = 1 ; i < scores.length-1 ; i++){

            if(scores[i-1] > scores[i] && scores[i] < scores[i+1]){
                rewardsArr[i] = 1;
                int a = i-1;
                int b = i+1;
                while(a >= 0 && scores[a] > scores[a+1] ){
                    rewardsArr[a] = Math.max(rewardsArr[a],1+rewardsArr[a+1]);
                    a--;
                }
                while(b < scores.length && scores[b]> scores[b-1]){
                    rewardsArr[b] = Math.max(rewardsArr[b],1+rewardsArr[b-1]);
                    b++;
                }
            }
        }
        return Arrays.stream(rewardsArr).sum();
    }

    private static int solveForTwoOrLessScores(int[] scores) {
        if(scores.length == 1){
            return 1;
        }else{
            return 3;
        }
    }


}
