package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class InvertedBisectionTest {

    @Test
    public void TestCase1() {
        InvertedBisection.LinkedList test = addMany(new InvertedBisection.LinkedList(0), new int[] {1, 2, 3, 4, 5});
        List<Integer> result = getNodesInArray(InvertedBisection.invertedBisection(test));
        List<Integer>  expected = getNodesInArray(addMany(new InvertedBisection.LinkedList(2), new int[] {1, 0, 5, 4, 3}));
        Assertions.assertTrue(result.equals(expected));
    }

    @Test
    public void TestCase2() {
        InvertedBisection.LinkedList test = addMany(new InvertedBisection.LinkedList(0), new int[] {1, 2});
        List<Integer> result = getNodesInArray(InvertedBisection.invertedBisection(test));
        List<Integer>  expected = getNodesInArray(addMany(new InvertedBisection.LinkedList(0), new int[] {1, 2}));
        Assertions.assertTrue(result.equals(expected));
    }

    @Test
    public void TestCase3() {
        InvertedBisection.LinkedList test = addMany(new InvertedBisection.LinkedList(0), new int[] {});
        List<Integer> result = getNodesInArray(InvertedBisection.invertedBisection(test));
        List<Integer>  expected = getNodesInArray(addMany(new InvertedBisection.LinkedList(0), new int[] {}));
        Assertions.assertTrue(result.equals(expected));
    }

    public InvertedBisection.LinkedList addMany(InvertedBisection.LinkedList linkedList, int[] values) {
        InvertedBisection.LinkedList current = linkedList;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new InvertedBisection.LinkedList(value);
            current = current.next;
        }
        return linkedList;
    }

    public List<Integer> getNodesInArray(InvertedBisection.LinkedList linkedList) {
        List<Integer> nodes = new ArrayList<Integer>();
        InvertedBisection.LinkedList current = linkedList;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }
}
