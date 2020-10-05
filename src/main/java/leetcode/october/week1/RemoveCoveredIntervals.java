package leetcode.october.week1;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveCoveredIntervals {
    public static int removeCoveredIntervals(int[][] intervals) {
        int result = intervals.length;
        for(int i = 0 ; i < intervals.length ; i++){
            int a = intervals[i][0];
            int b = intervals[i][1];
            if(a == -1 || b == -1){
                continue;
            }
            for(int j = 0 ; j < intervals.length ; j++){
                int c = intervals[j][0];
                int d = intervals[j][1];
                if(c == -1 || d == -1 || i == j){
                    continue;
                }
                if(a <= c && b >= d){
                    intervals[j][0] = -1;
                    intervals[j][1] = -1;
                    result--;
                }
            }
        }

        return result;
    }


}
