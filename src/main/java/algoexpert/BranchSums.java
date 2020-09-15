package algoexpert;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        return branchSumsHelper(root,root.value,new ArrayList<>());
    }

    public static List<Integer> branchSumsHelper(BinaryTree root,int sum , List<Integer> branchSums) {
        // Write your code here.

        if ( root == null){
            return branchSums;
        }

        BinaryTree left = root.left;
        BinaryTree right = root.right;

        if ( left == null && right == null){
            branchSums.add(sum);
        }

       if ( left != null){
           int tempSum = sum + left.value;
           branchSumsHelper(left,tempSum,branchSums);
       }
       if (right != null){
           int tempSum = sum + right.value;
           branchSumsHelper(right,tempSum,branchSums);
       }


        return branchSums;
    }
}
