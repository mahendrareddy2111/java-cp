package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PowerSetTest {

    @Test
    public void TestCase1() {
        List<List<Integer>> output = PowerSet.powerset(new ArrayList<>(Arrays.asList(1, 2, 3)));
        Assertions.assertTrue(output.size() == 8);
        Assertions.assertTrue(contains(output, new int[] {}));
        Assertions.assertTrue(contains(output, new int[] {1}));
        Assertions.assertTrue(contains(output, new int[] {2}));
        Assertions.assertTrue(contains(output, new int[] {1, 2}));
        Assertions.assertTrue(contains(output, new int[] {3}));
        Assertions.assertTrue(contains(output, new int[] {1, 3}));
        Assertions.assertTrue(contains(output, new int[] {2, 3}));
        Assertions.assertTrue(contains(output, new int[] {1, 2, 3}));
    }

    @Test
    public void TestCase2() {
        List<List<Integer>> output = PowerSet.powerset(new ArrayList<>());
        Assertions.assertTrue(output.size() == 1);
        Assertions.assertTrue(contains(output, new int[] {}));
    }

    @Test
    public void TestCase3() {
        List<List<Integer>> output = PowerSet.powerset(new ArrayList<>(1));
        Assertions.assertTrue(output.size() == 2);
        Assertions.assertTrue(contains(output, new int[] {}));
        Assertions.assertTrue(contains(output, new int[] {1}));
    }


    public boolean contains(List<List<Integer>> arr1, int[] arr2) {
        for (List<Integer> subArr : arr1) {
            Collections.sort(subArr);
            if (compare(subArr, arr2)) {
                return true;
            }
        }
        return false;
    }

    public boolean compare(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
