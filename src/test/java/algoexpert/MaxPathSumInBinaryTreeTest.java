package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;

public class MaxPathSumInBinaryTreeTest {
    @Test
    public void TestCase1() {
        TestBinaryTree test = new TestBinaryTree(1);
        test.insert(new int[] {2, 3, 4, 5, 6, 7}, 0);
        Assertions.assertTrue(MaxPathSumInBinaryTree.maxPathSum(test) == 18);
    }

    @Test
    public void TestCase2() {
        TestBinaryTree test = new TestBinaryTree(1);
        test.insert(new int[] {2,-1}, 0);
        Assertions.assertTrue(MaxPathSumInBinaryTree.maxPathSum(test) == 3);
    }

    @Test
    public void TestCase3() {
        TestBinaryTree test = new TestBinaryTree(1);
        test.insert(new int[] {-5,3,6}, 0);
        Assertions.assertTrue(MaxPathSumInBinaryTree.maxPathSum(test) == 6);
    }

    class TestBinaryTree extends MaxPathSumInBinaryTree.BinaryTree {
        public TestBinaryTree(int value) {
            super(value);
        }

        public void insert(int[] values, int i) {
            if (i >= values.length) {
                return;
            }
            ArrayDeque<MaxPathSumInBinaryTree.BinaryTree> queue = new ArrayDeque<MaxPathSumInBinaryTree.BinaryTree>();
            queue.addLast(this);
            while (queue.size() > 0) {
                MaxPathSumInBinaryTree.BinaryTree current = queue.pollFirst();
                if (current.left == null) {
                    current.left = new MaxPathSumInBinaryTree.BinaryTree(values[i]);
                    break;
                }
                queue.addLast(current.left);
                if (current.right == null) {
                    current.right = new MaxPathSumInBinaryTree.BinaryTree(values[i]);
                    break;
                }
                queue.addLast(current.right);
            }
            insert(values, i + 1);
        }
    }
}
