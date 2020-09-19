package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftedLinkedListTest {

    public List<Integer> linkedListToArray(ShiftLinkedList.LinkedList head) {
        List<Integer> array = new ArrayList<>();
        ShiftLinkedList.LinkedList current = head;
        while (current != null) {
            array.add(current.value);
            current = current.next;
        }
        return array;
    }

    @Test
    public void TestCase1() {
        ShiftLinkedList.LinkedList head = new ShiftLinkedList.LinkedList(0);
        head.next = new ShiftLinkedList.LinkedList(1);
        head.next.next = new ShiftLinkedList.LinkedList(2);
        head.next.next.next = new ShiftLinkedList.LinkedList(3);
        head.next.next.next.next = new ShiftLinkedList.LinkedList(4);
        head.next.next.next.next.next = new ShiftLinkedList.LinkedList(5);
        ShiftLinkedList.LinkedList result = ShiftLinkedList.shiftLinkedList(head, 2);
        List<Integer> array = this.linkedListToArray(result);

        List<Integer> expected = Arrays.asList(new Integer[] {4, 5, 0, 1, 2, 3});
        Assertions.assertTrue(expected.equals(array));
    }

    @Test
    public void TestCase2() {
        ShiftLinkedList.LinkedList head = new ShiftLinkedList.LinkedList(0);
        head.next = new ShiftLinkedList.LinkedList(1);
        head.next.next = new ShiftLinkedList.LinkedList(2);
        head.next.next.next = new ShiftLinkedList.LinkedList(3);
        head.next.next.next.next = new ShiftLinkedList.LinkedList(4);
        head.next.next.next.next.next = new ShiftLinkedList.LinkedList(5);
        ShiftLinkedList.LinkedList result = ShiftLinkedList.shiftLinkedList(head, 3);
        List<Integer> array = this.linkedListToArray(result);

        List<Integer> expected = Arrays.asList(new Integer[] {3,4, 5, 0, 1, 2});
        Assertions.assertTrue(expected.equals(array));
    }

    @Test
    public void TestCase3() {
        ShiftLinkedList.LinkedList head = new ShiftLinkedList.LinkedList(0);
        head.next = new ShiftLinkedList.LinkedList(1);
        head.next.next = new ShiftLinkedList.LinkedList(2);
        head.next.next.next = new ShiftLinkedList.LinkedList(3);
        head.next.next.next.next = new ShiftLinkedList.LinkedList(4);
        head.next.next.next.next.next = new ShiftLinkedList.LinkedList(5);
        ShiftLinkedList.LinkedList result = ShiftLinkedList.shiftLinkedList(head, 3);
        List<Integer> array = this.linkedListToArray(result);

        List<Integer> expected = Arrays.asList(new Integer[] {3,4, 5, 0, 1, 2});
        Assertions.assertTrue(expected.equals(array));
    }

    @Test
    public void TestCase4() {
        ShiftLinkedList.LinkedList head = new ShiftLinkedList.LinkedList(0);
        head.next = new ShiftLinkedList.LinkedList(1);
        head.next.next = new ShiftLinkedList.LinkedList(2);
        head.next.next.next = new ShiftLinkedList.LinkedList(3);
        head.next.next.next.next = new ShiftLinkedList.LinkedList(4);
        head.next.next.next.next.next = new ShiftLinkedList.LinkedList(5);
        ShiftLinkedList.LinkedList result = ShiftLinkedList.shiftLinkedList(head, -2);
        List<Integer> array = this.linkedListToArray(result);

        List<Integer> expected = Arrays.asList(new Integer[] {2,3,4, 5, 0, 1});
        Assertions.assertTrue(expected.equals(array));
    }
}
