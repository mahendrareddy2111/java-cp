package algoexpert;

public class FindLoop {
    public static LinkedList findLoop(LinkedList head) {
        // Write your code here.
        LinkedList first = head;
        LinkedList second = head;
        while( second != null){
            if(second.visited){
                return second;
            }
            first.visited = true;
           first = first.next;
           //first.visited = true;
           second = second.next;
           if (second.visited){
               return second;
           }
           if (second != null){
               second = second.next;
           }

        }
        return null;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;
        boolean visited = false;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
