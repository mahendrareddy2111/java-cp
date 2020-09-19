package algoexpert;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int i = 0;
        int j = array.size()-1;
        while( i < j){
            while( i < j && array.get(i) != toMove){
                i++;
            }
            if ( i == j){
                return array;
            }
            while ( j >= i && array.get(j) == toMove){
                j--;
            }
            if ( j < i){
                return array;
            }
            Collections.swap(array,i,j);
        }
        return array;
    }
}
