package algoexpert;

public class RemoveKthNodeFromEnd {
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        // Write your code here.
        LinkedList first = head;
        LinkedList second = head;
        LinkedList prev = null;
        int count = 0;
            while(second != null && count < k){
                second = second.next;
                count++;
            }
            if(second == null){
                if(count == k) {
                    head.value = head.next.value;
                    head.next = head.next.next;
                }
                return ;
            }
            while(second != null){
                prev = first;
                first = first.next;
                second = second.next;
            }
            if(first != null)
                prev.next = first.next;
            else{
                prev = first.next;
            }
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
