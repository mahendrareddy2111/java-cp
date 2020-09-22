package algoexpert;

public class NodeDepths {

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        if ( root == null){
            return -1;
        }
        return nodeDepthsHelper(root,0);
    }

    private static int nodeDepthsHelper(BinaryTree root , int depth){
        if(root == null){
            return 0;
        }
        return depth+nodeDepthsHelper(root.left,depth+1)+nodeDepthsHelper(root.right,depth+1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
