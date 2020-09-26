package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MaxPathSumInBinaryTree {
    public static int maxPathSum(BinaryTree tree) {
        List<Integer> result = maxPathSumHelper(tree);
        return result.get(1);
    }

    private static List<Integer> maxPathSumHelper(BinaryTree tree){
        if(tree == null){
            return new ArrayList<>(Arrays.asList(0,Integer.MIN_VALUE));
        }
        List<Integer> leftSum = maxPathSumHelper(tree.left);
        int leftBranchSum = leftSum.get(0);
        int leftMaxPathSum = leftSum.get(1);

        List<Integer> rightSum = maxPathSumHelper(tree.right);
        int rightBranchSum = rightSum.get(0);
        int rightMaxPathSum = rightSum.get(1);

        int maxChildSum = Math.max(leftBranchSum,rightBranchSum);
        int maxBranchSum = Math.max(maxChildSum+tree.value,tree.value);

        int maxSumAsRoot = Math.max(leftBranchSum+rightBranchSum+tree.value,maxBranchSum);
        int maxPathSum = Math.max(leftMaxPathSum,Math.max(rightMaxPathSum,maxSumAsRoot));

        return new ArrayList<>(Arrays.asList(maxBranchSum,maxPathSum));
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
