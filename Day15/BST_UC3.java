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

    // Search
    public boolean search(T key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(MyBinaryNode<T> node, T key) {
        if (node == null) return false;

        if (key.compareTo(node.data) == 0)
            return true;
        else if (key.compareTo(node.data) < 0)
            return searchRecursive(node.left, key);
        else
            return searchRecursive(node.right, key);
    }

    // Optional: traversal for verification
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

// UC3 Main
public class BST_UC3 {
    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Build full tree (same as UC2)
        int[] values = {56, 30, 70, 22, 40, 60, 95, 11, 3, 16, 65, 63, 67};

        for (int val : values) {
            bst.add(val);
        }

        // Verify tree (optional but smart)
        System.out.print("Tree (InOrder): ");
        bst.inOrder();

        // UC3: Search
        int key = 63;
        boolean found = bst.search(key);

        System.out.println("Search " + key + ": " + found);
    }
}