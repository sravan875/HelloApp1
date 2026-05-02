package Day15;

import java.util.*;

class MyBinaryNode<T extends Comparable<T>> {
    T data;
    MyBinaryNode<T> left;
    MyBinaryNode<T> right;

    MyBinaryNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree<T extends Comparable<T>> {
    private MyBinaryNode<T> root;

    // ADD
    public void add(T data) {
        root = addRecursive(root, data);
    }

    private MyBinaryNode<T> addRecursive(MyBinaryNode<T> node, T data) {
        if (node == null)
            return new MyBinaryNode<>(data);

        if (data.compareTo(node.data) < 0)
            node.left = addRecursive(node.left, data);
        else if (data.compareTo(node.data) > 0)
            node.right = addRecursive(node.right, data);

        return node;
    }

    // SIZE
    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(MyBinaryNode<T> node) {
        if (node == null)
            return 0;
        return 1 + sizeRecursive(node.left) + sizeRecursive(node.right);
    }

    // SEARCH
    public boolean search(T key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(MyBinaryNode<T> node, T key) {
        if (node == null)
            return false;

        if (key.compareTo(node.data) == 0)
            return true;
        else if (key.compareTo(node.data) < 0)
            return searchRecursive(node.left, key);
        else
            return searchRecursive(node.right, key);
    }

    // INORDER TRAVERSAL (IMPORTANT)
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

// MAIN CLASS
public class BSTUC {
    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // -------- UC1 --------
        System.out.println("UC1: Create BST with 56, 30, 70");

        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.print("Tree (InOrder): ");
        bst.inOrder();

        // -------- UC2 --------
        System.out.println("\nUC2: Add remaining elements");

        int[] values = {22, 40, 60, 95, 11, 3, 16, 65, 63, 67};
        for (int val : values) {
            bst.add(val);
        }

        System.out.print("Updated Tree (InOrder): ");
        bst.inOrder();

        System.out.println("Tree Size: " + bst.size());

        // -------- UC3 --------
        System.out.println("\nUC3: Search for element 63");

        boolean found = bst.search(63);
        System.out.println("Element 63 found? " + found);
    }
}