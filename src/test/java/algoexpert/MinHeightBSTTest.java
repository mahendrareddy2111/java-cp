package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinHeightBSTTest {

    @Test
    public void TestCase1() {
        List<Integer> array = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        MinHeightBST.BST tree = MinHeightBST.minHeightBst(array);

        Assertions.assertTrue(validateBst(tree));
        Assertions.assertEquals(4, getTreeHeight(tree));

        List<Integer> inOrder = inOrderTraverse(tree, new ArrayList<>());
        List<Integer> expected = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        Assertions.assertTrue(expected.equals(inOrder));
    }

    @Test
    public void TestCase2() {
        List<Integer> array = Arrays.asList(1, 2, 5, 7, 10, 13, 14);
        MinHeightBST.BST tree = MinHeightBST.minHeightBst(array);

        Assertions.assertTrue(validateBst(tree));
        Assertions.assertEquals(3, getTreeHeight(tree));

        List<Integer> inOrder = inOrderTraverse(tree, new ArrayList<>());
        List<Integer> expected = Arrays.asList(1, 2, 5, 7, 10, 13, 14);
        Assertions.assertTrue(expected.equals(inOrder));
    }

    @Test
    public void TestCase3() {
        List<Integer> array = Arrays.asList(1);
        MinHeightBST.BST tree = MinHeightBST.minHeightBst(array);

        Assertions.assertTrue(validateBst(tree));
        Assertions.assertEquals(1, getTreeHeight(tree));

        List<Integer> inOrder = inOrderTraverse(tree, new ArrayList<>());
        List<Integer> expected = Arrays.asList(1);
        Assertions.assertTrue(expected.equals(inOrder));
    }

    @Test
    public void TestCase4() {
        List<Integer> array = Arrays.asList(1,2,5,7,8,9,12,23,34,45,56,67);
        MinHeightBST.BST tree = MinHeightBST.minHeightBst(array);

        Assertions.assertTrue(validateBst(tree));
        Assertions.assertEquals(4, getTreeHeight(tree));

        List<Integer> inOrder = inOrderTraverse(tree, new ArrayList<>());
        List<Integer> expected = Arrays.asList(1,2,5,7,8,9,12,23,34,45,56,67);
        Assertions.assertTrue(expected.equals(inOrder));
    }

    @Test
    public void TestCase5() {
        List<Integer> array = Arrays.asList(1,2,5);
        MinHeightBST.BST tree = MinHeightBST.minHeightBst(array);

        Assertions.assertTrue(validateBst(tree));
        Assertions.assertEquals(2, getTreeHeight(tree));

        List<Integer> inOrder = inOrderTraverse(tree, new ArrayList<>());
        List<Integer> expected = Arrays.asList(1,2,5);
        Assertions.assertTrue(expected.equals(inOrder));
    }
    static boolean validateBst(MinHeightBST.BST tree) {
        return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean validateBst(MinHeightBST.BST tree, int minValue, int maxValue) {
        if (tree.value < minValue || tree.value >= maxValue) {
            return false;
        }
        if (tree.left != null && !validateBst(tree.left, minValue, tree.value)) {
            return false;
        }
        if (tree.right != null && !validateBst(tree.right, tree.value, maxValue)) {
            return false;
        }
        return true;
    }

    static List<Integer> inOrderTraverse(MinHeightBST.BST tree, List<Integer> array) {
        if (tree.left != null) {
            inOrderTraverse(tree.left, array);
        }
        array.add(tree.value);
        if (tree.right != null) {
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    static int getTreeHeight(MinHeightBST.BST tree) {
        return getTreeHeight(tree, 0);
    }

    static int getTreeHeight(MinHeightBST.BST tree, int height) {
        if (tree == null) return height;
        int leftTreeHeight = getTreeHeight(tree.left, height + 1);
        int rightTreeHeight = getTreeHeight(tree.right, height + 1);
        return Math.max(leftTreeHeight, rightTreeHeight);
    }
}
