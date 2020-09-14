package BSTConstruction;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BSTContructionTest {

    @Test
    public void testBSTContructionForContainsMethod(){
        BSTConstruction.BST root = new BSTConstruction.BST(10);
        root.left = new BSTConstruction.BST(5);
        root.left.left = new BSTConstruction.BST(2);
        root.left.left.left = new BSTConstruction.BST(1);
        root.left.right = new BSTConstruction.BST(5);
        root.right = new BSTConstruction.BST(15);
        root.right.left = new BSTConstruction.BST(13);
        root.right.left.right = new BSTConstruction.BST(14);
        root.right.right = new BSTConstruction.BST(22);

        assertTrue(root.contains(10));
        assertFalse(root.contains(87));
    }

    @Test
    public void testBSTContructionForInsertTheLargestNode(){
        BSTConstruction.BST root = new BSTConstruction.BST(10);
        root.left = new BSTConstruction.BST(5);
        root.left.left = new BSTConstruction.BST(2);
        root.left.left.left = new BSTConstruction.BST(1);
        root.left.right = new BSTConstruction.BST(5);
        root.right = new BSTConstruction.BST(15);
        root.right.left = new BSTConstruction.BST(13);
        root.right.left.right = new BSTConstruction.BST(14);
        root.right.right = new BSTConstruction.BST(22);

        assertTrue(root.contains(10));
        assertFalse(root.contains(87));
        root.insert(87);
        assertTrue(root.contains(87));
        assertTrue(root.right.right.right.value == 87);
    }

    @Test
    public void testBSTContructionForInsertTheSecondLargestNode(){
        BSTConstruction.BST root = new BSTConstruction.BST(10);
        root.left = new BSTConstruction.BST(5);
        root.left.left = new BSTConstruction.BST(2);
        root.left.left.left = new BSTConstruction.BST(1);
        root.left.right = new BSTConstruction.BST(5);
        root.right = new BSTConstruction.BST(15);
        root.right.left = new BSTConstruction.BST(13);
        root.right.left.right = new BSTConstruction.BST(14);
        root.right.right = new BSTConstruction.BST(22);

        assertTrue(root.contains(10));
        assertFalse(root.contains(23));
        root.insert(21);
        assertTrue(root.contains(21));
        assertTrue(root.right.right.left.value == 21);
    }

    @Test
    public void testBSTContructionForInsertTheSmallestNode(){
        BSTConstruction.BST root = new BSTConstruction.BST(10);
        root.left = new BSTConstruction.BST(5);
        root.left.left = new BSTConstruction.BST(2);
        root.left.left.left = new BSTConstruction.BST(1);
        root.left.right = new BSTConstruction.BST(5);
        root.right = new BSTConstruction.BST(15);
        root.right.left = new BSTConstruction.BST(13);
        root.right.left.right = new BSTConstruction.BST(14);
        root.right.right = new BSTConstruction.BST(22);

        assertTrue(root.contains(10));
        assertFalse(root.contains(0));
        root.insert(0);
        assertTrue(root.contains(0));
        assertTrue(root.left.left.left.left.value == 0);
    }

    @Test
    public void testBSTContructionForInsertTheSecondSmallestNode(){
        BSTConstruction.BST root = new BSTConstruction.BST(10);
        root.left = new BSTConstruction.BST(5);
        root.left.left = new BSTConstruction.BST(4);
        root.left.left.left = new BSTConstruction.BST(1);
        root.left.right = new BSTConstruction.BST(5);
        root.right = new BSTConstruction.BST(15);
        root.right.left = new BSTConstruction.BST(13);
        root.right.left.right = new BSTConstruction.BST(14);
        root.right.right = new BSTConstruction.BST(22);

        assertTrue(root.contains(10));
        assertFalse(root.contains(3));
        root.insert(3);
        assertTrue(root.contains(3));
        assertTrue(root.left.left.left.right.value == 3);
    }

    @Test
    public void testBSTContructionForInsertTheDuplicateNode(){
        BSTConstruction.BST root = new BSTConstruction.BST(10);
        root.left = new BSTConstruction.BST(5);
        root.left.left = new BSTConstruction.BST(2);
        root.left.left.left = new BSTConstruction.BST(1);
        root.left.right = new BSTConstruction.BST(5);
        root.right = new BSTConstruction.BST(15);
        root.right.left = new BSTConstruction.BST(13);
        root.right.left.right = new BSTConstruction.BST(14);
        root.right.right = new BSTConstruction.BST(22);

        assertTrue(root.contains(10));
        root.insert(15);
        assertTrue(root.contains(15));
        assertTrue(root.right.right.left.value == 15);
    }

    @Test
    public void testBSTContructionForRemovingTheLeafNode(){
        BSTConstruction.BST root = new BSTConstruction.BST(10);
        root.left = new BSTConstruction.BST(5);
        root.left.left = new BSTConstruction.BST(2);
        root.left.left.left = new BSTConstruction.BST(1);
        root.left.right = new BSTConstruction.BST(5);
        root.right = new BSTConstruction.BST(15);
        root.right.left = new BSTConstruction.BST(13);
        root.right.left.right = new BSTConstruction.BST(14);
        root.right.right = new BSTConstruction.BST(22);

        assertTrue(root.contains(1));
        root.remove(1);
        assertFalse(root.contains(1));
    }

    @Test
    public void testBSTContructionForRemovingTheNonExistingNode(){
        BSTConstruction.BST root = new BSTConstruction.BST(10);
        root.left = new BSTConstruction.BST(5);
        root.left.left = new BSTConstruction.BST(2);
        root.left.left.left = new BSTConstruction.BST(1);
        root.left.right = new BSTConstruction.BST(5);
        root.right = new BSTConstruction.BST(15);
        root.right.left = new BSTConstruction.BST(13);
        root.right.left.right = new BSTConstruction.BST(14);
        root.right.right = new BSTConstruction.BST(22);

        assertFalse(root.contains(100));
        root.remove(100);
        assertFalse(root.contains(100));
    }

    @Test
    public void testBSTContructionForRemovingRightLeafNode(){
        BSTConstruction.BST root = new BSTConstruction.BST(10);
        root.left = new BSTConstruction.BST(5);
        root.left.left = new BSTConstruction.BST(2);
        root.left.left.left = new BSTConstruction.BST(1);
        root.left.right = new BSTConstruction.BST(5);
        root.right = new BSTConstruction.BST(15);
        root.right.left = new BSTConstruction.BST(13);
        root.right.left.right = new BSTConstruction.BST(14);
        root.right.right = new BSTConstruction.BST(22);

        assertTrue(root.contains(14));
        root.remove(14);
        assertTrue(root.contains(14));
    }
}
