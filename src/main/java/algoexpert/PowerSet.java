package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {
    public static List<List<Integer>> powerset(List<Integer> array) {
        // Write your code here.
        List<List<Integer>> result = new ArrayList<>();
        if(array.size() != 0 ) {
            powerSetHelper(array, result);
        }
        result.add(new ArrayList<>());
        return result;
    }

    private static void powerSetHelper(List<Integer> array, List<List<Integer>> result) {
        if ( array.size() == 1){
            result.add(array);
            return ;
        }
        powerSetHelper(array.subList(1,array.size()),result);
        List<Integer> current  = Arrays.asList(array.get(0));
        List<List<Integer>> tempResult = new ArrayList<>();
        for( List<Integer> res : result){
            List<Integer> temp = new ArrayList<>(res);
            temp.add(0,array.get(0));
            tempResult.add(temp);
        }
        result.addAll(tempResult);
        result.add(current);
        //System.out.println();
        //return result;
    }
}
