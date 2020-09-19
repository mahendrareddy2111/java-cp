package algoexpert;

public class MergeLinkedLists {

    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
        if (headOne == null){
            return headTwo;
        }
        if ( headTwo == null){
            return headOne;
        }
        LinkedList newHead = null;
        LinkedList last = null;
        while( headOne != null && headTwo != null){
            LinkedList tempHeadOne = headOne;
            LinkedList tempHeadTwo = headTwo;
            LinkedList temp = null;
            if ( tempHeadTwo.value >= tempHeadOne.value){
                temp = headOne;
                headOne = headOne.next;
            }else{
                temp = headTwo;
                headTwo = headTwo.next;
            }
            if ( newHead == null){
                newHead = temp;
                last = temp;
            }else{
                last.next = temp;
                last = temp;
            }
        }
        if (headOne == null){
            last.next = headTwo;
        }
        if(headTwo == null){
            last.next = headOne;
        }
        return newHead;
    }
}
