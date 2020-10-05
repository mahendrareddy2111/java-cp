package leetcode.october.week1;

import algoexpert.RemoveKthNodeFromEnd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveCoveredIntervalsTest {

    @Test
    public void test1(){
        int[][] input = {{1,4},{2,3}};
        int result = RemoveCoveredIntervals.removeCoveredIntervals(input);
        Assertions.assertTrue(result == 1);
    }

    @Test
    public void test2(){
        int[][] input = {{1,4}, {3,6},{2,8}};
        int result = RemoveCoveredIntervals.removeCoveredIntervals(input);
        Assertions.assertTrue(result == 2);
    }

    @Test
    public void test3(){
        int[][] input = {{0,10},{5,12}};
        int result = RemoveCoveredIntervals.removeCoveredIntervals(input);
        Assertions.assertTrue(result == 2);
    }

    @Test
    public void test4(){
        int[][] input = {{0,10},{3,10},{4,10},{5,12}};
        int result = RemoveCoveredIntervals.removeCoveredIntervals(input);
        Assertions.assertTrue(result == 2);
    }

    @Test
    public void test5(){
        int[][] input = {{0,10},{3,10},{4,10},{5,10}};
        int result = RemoveCoveredIntervals.removeCoveredIntervals(input);
        Assertions.assertTrue(result == 1);
    }
}
