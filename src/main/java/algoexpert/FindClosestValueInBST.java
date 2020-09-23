package algoexpert;

public class FindClosestValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        if(tree == null) {
            return -1;
        }
        return findClosestValueInBSTHelper(tree,target,Integer.MAX_VALUE,Integer.MAX_VALUE);
    }

    private static int findClosestValueInBSTHelper(BST bst , int target, int ref,int result){
        if(bst == null){
            return result;
        }
        int temp = bst.value;
        int abs = Math.abs(target-temp);
        if( abs < ref) {
            result = temp;
            ref = abs;
        }
        if (target == temp){
            return temp;
        }else if( target > temp ){
            result = findClosestValueInBSTHelper(bst.right , target, ref,result);
        }else{
            result = findClosestValueInBSTHelper(bst.left , target, ref,result);
        }
        return result;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
