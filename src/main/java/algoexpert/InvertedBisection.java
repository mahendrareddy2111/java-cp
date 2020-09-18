package algoexpert;

import java.util.Stack;

public class InvertedBisection {
    public static LinkedList invertedBisection(LinkedList head) {
        // Write your code here.
        LinkedList mid = null;
        LinkedList temp = head;
        LinkedList first = head;
        LinkedList last = head;
        int size = 0;
        while(last != null){

            last = last.next;
            size++;
            if (size %2 == 0 && last != null){
                first = first.next;
            }
        }
        if (size == 1){
            return head;
        }
        mid = first;
        LinkedList secondHalf = mid.next;
        if(size %2 == 0){
            head = reverse(head,mid.next);
            LinkedList tempHead = reverse(secondHalf,null);
            temp = head;
            while( temp != null && temp.next != null){
                temp = temp.next;
            }
            temp.next = tempHead;
        }else{
            head = reverse(head,mid);
            LinkedList tempHead = reverse(secondHalf,null);
            temp = head;
            while( temp != null && temp.next != null){
                temp = temp.next;
            }
            temp.next = mid;
            mid.next = tempHead;
        }
        return head;
    }

    private static LinkedList reverse(LinkedList head, LinkedList mid) {

       LinkedList newHead = null;
       while( head != mid){
           LinkedList temp = head;
           head = head.next;
           temp.next = newHead;
           newHead = temp;
       }
       return newHead;
    }

    // This is an input class. Do not edit.
    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
