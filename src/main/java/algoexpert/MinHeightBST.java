package algoexpert;

import java.util.List;

public class MinHeightBST {

    public static BST minHeightBst(List<Integer> array) {
        // Write your code here.
        int mid = array.size()/2;
        BST root = new BST(array.get(mid));
        root.left = minHeightBstHelper(array,0,mid-1);
        root.right = minHeightBstHelper(array,mid+1,array.size()-1);
        return root;
    }
    private static BST minHeightBstHelper(List<Integer> array,int startIdx, int endIdx){
        if(endIdx < startIdx){
            return null;
        }
        if(startIdx == endIdx){
            return new BST(array.get(startIdx));
        }
        if( endIdx == startIdx+1){
            BST temp =  new BST(array.get(startIdx));
            temp.right = new BST(array.get(endIdx));
            return temp;
        }
        int mid = (startIdx+endIdx)/2;
        BST root = new BST(array.get(mid));
        root.left = minHeightBstHelper(array,startIdx,mid-1);
        root.right = minHeightBstHelper(array,mid+1,endIdx);
        return root;

    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
