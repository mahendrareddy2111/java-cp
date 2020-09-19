package algoexpert;

public class ShiftLinkedList {

    public static LinkedList shiftLinkedList(LinkedList head, int k) {
        // Write your code here.

        int size = getSize(head);
        k = k % size;
        if (k < 0){
            k = size+k;
        }
        if ( k == 0 ){
            return head;
        }
        LinkedList first = head;
        LinkedList second = head;
        while(  k != 0 && second != null){
            second = second.next;
            k--;
        }
        LinkedList tempF = first;
        LinkedList tempS = second;
        while( second != null){
            tempF = first;
            first = first.next;
            tempS = second;
            second = second.next;
        }
        LinkedList temp = head;
        head = first;
        tempF.next = null;
        tempS.next = temp;
        return head;
    }

    private static int getSize(LinkedList head) {
        int size = 0 ;
        while( head != null){
            head = head.next;
            size++;
        }
        return size;
    }

    static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            next = null;
        }
    }
}
