package algoexpert;

public class ReverseLinkedList {
    public static LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.
        if( head == null){
            return head;
        }
        LinkedList newHead = null;
        while( head != null){
            LinkedList temp = head;
            head = head.next;
            temp.next = newHead;
            newHead = temp;
        }
        return newHead;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
