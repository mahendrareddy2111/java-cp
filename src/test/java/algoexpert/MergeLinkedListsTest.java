package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLinkedListsTest {

    public MergeLinkedLists.LinkedList addMany(MergeLinkedLists.LinkedList ll, List<Integer> values) {
        MergeLinkedLists.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new MergeLinkedLists.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(MergeLinkedLists.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        MergeLinkedLists.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    @Test
    public void TestCase1() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(2);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(6, 7, 8)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 9, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedLists(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assertions.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase2() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(2);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(6, 7, 8,10,11,12)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 9, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedLists(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12));
        Assertions.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase3() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(2);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(6)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 9, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedLists(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 9, 10));
        Assertions.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase4() {
        MergeLinkedLists.LinkedList list1 = null;
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 9, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedLists(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<>(Arrays.asList( 1, 3, 4, 5, 9, 10));
        Assertions.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }
}
