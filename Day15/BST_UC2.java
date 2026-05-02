package Day15;

import java.util.*;

class MyBinaryNode<T extends Comparable<T>> {
    T data;
    MyBinaryNode<T> left, right;

    MyBinaryNode(T data) {
        this.data = data;
    }
}

class BinarySearchTree<T extends Comparable<T>> {
    private MyBinaryNode<T> root;

    // Insert
    public void add(T data) {
        root = addRecursive(root, data);
    }

    private MyBinaryNode<T> addRecursive(MyBinaryNode<T> node, T data) {
        if (node == null) return new MyBinaryNode<>(data);

        if (data.compareTo(node.data) < 0)
            node.left = addRecursive(node.left, data);
        else if (data.compareTo(node.data) > 0)
            node.right = addRecursive(node.right, data);

        return node;
    }

    // Size
    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(MyBinaryNode<T> node) {
        if (node == null) return 0;
        return 1 + sizeRecursive(node.left) + sizeRecursive(node.right);
    }

    // InOrder Traversal (for verification)
    public void inOrder() {
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(MyBinaryNode<T> node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.data + " ");
            inOrderRecursive(node.right);
        }
    }
}

// UC2 Main
public class BST_UC2 {
    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // UC2: Insert full dataset
        int[] values = {56, 30, 70, 22, 40, 60, 95, 11, 3, 16, 65, 63, 67};

        for (int val : values) {
            bst.add(val);
        }

        // Display tree
        System.out.println("UC2: Full BST Created");

        System.out.print("InOrder Traversal: ");
        bst.inOrder();

        // Size check
        System.out.println("Tree Size: " + bst.size());
    }
}