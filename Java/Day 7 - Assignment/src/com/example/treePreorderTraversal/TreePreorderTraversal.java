package com.example.treePreorderTraversal;

public class TreePreorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(6);
        root.right.right.left.right = new Node(4);
        BinaryTree tree = new BinaryTree();
        tree.preOrder(root);
    }
}
