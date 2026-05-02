package Day15;

import java.util.*;

class MyBinaryNode<T extends Comparable<T>> {
    T data;
    MyBinaryNode<T> left, right;

    MyBinaryNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
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

    // InOrder Traversal
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

// UC1 Main
public class BST_UC1 {
    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // UC1: Insert elements
        bst.add(56);
        bst.add(30);
        bst.add(70);

        // Display
        System.out.println("UC1: BST created with 56, 30, 70");
        System.out.print("InOrder Traversal: ");
        bst.inOrder();
    }
}