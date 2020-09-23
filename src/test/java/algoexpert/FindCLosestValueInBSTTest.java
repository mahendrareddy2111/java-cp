package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindCLosestValueInBSTTest {

    @Test
    public void TestCase1() {
        FindClosestValueInBST.BST root = new FindClosestValueInBST.BST(10);
        root.left = new FindClosestValueInBST.BST(5);
        root.left.left = new FindClosestValueInBST.BST(2);
        root.left.left.left = new FindClosestValueInBST.BST(1);
        root.left.right = new FindClosestValueInBST.BST(5);
        root.right = new FindClosestValueInBST.BST(15);
        root.right.left = new FindClosestValueInBST.BST(13);
        root.right.left.right = new FindClosestValueInBST.BST(14);
        root.right.right = new FindClosestValueInBST.BST(22);

        int expected = 13;
        int actual = FindClosestValueInBST.findClosestValueInBst(root, 12);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestCase2() {
        FindClosestValueInBST.BST root = new FindClosestValueInBST.BST(10);
        root.left = new FindClosestValueInBST.BST(5);
        root.left.left = new FindClosestValueInBST.BST(2);
        root.left.left.left = new FindClosestValueInBST.BST(1);
        root.left.right = new FindClosestValueInBST.BST(5);
        root.right = new FindClosestValueInBST.BST(15);
        root.right.left = new FindClosestValueInBST.BST(12);
        root.right.left.right = new FindClosestValueInBST.BST(14);
        root.right.right = new FindClosestValueInBST.BST(22);

        int expected = 12;
        int actual = FindClosestValueInBST.findClosestValueInBst(root, 12);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestCase3() {
        FindClosestValueInBST.BST root = new FindClosestValueInBST.BST(12);
        root.left = new FindClosestValueInBST.BST(5);
        root.left.left = new FindClosestValueInBST.BST(2);
        root.left.left.left = new FindClosestValueInBST.BST(1);
        root.left.right = new FindClosestValueInBST.BST(5);
        root.right = new FindClosestValueInBST.BST(15);
        root.right.left = new FindClosestValueInBST.BST(13);
        root.right.left.right = new FindClosestValueInBST.BST(14);
        root.right.right = new FindClosestValueInBST.BST(22);

        int expected = 12;
        int actual = FindClosestValueInBST.findClosestValueInBst(root, 12);
        Assertions.assertEquals(expected, actual);
    }
}
