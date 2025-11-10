package com.example.binarysearchthree;

class BinarySearchTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void remove(int value) {
        root = removeRec(root, value);
    }

    private Node removeRec(Node root, int value) {
        if (root == null)
            return root;
        if (value < root.data) {
            root.left = removeRec(root.left, value);
        } else if (value > root.data) {
            root.right = removeRec(root.right, value);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = removeRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    public Node search(int value) {
        return searchRec(root, value);
    }

    private Node searchRec(Node root, int value) {
        if (root == null || root.data == value)
            return root;
        if (value < root.data)
            return searchRec(root.left, value);
        return searchRec(root.right, value);
    }

    public void transversal(String format) {
        if (format.equals("preorden")) {
            preorden(root);
        } else if (format.equals("postorden")) {
            postorden(root);
        } else {
            inorden(root);
        }
    }

    private void inorden(Node node) {
        if (node != null) {
            inorden(node.left);
            System.out.print(node.data + " ");
            inorden(node.right);
        }
    }

    private void preorden(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorden(node.left);
            preorden(node.right);
        }
    }

    private void postorden(Node node) {
        if (node != null) {
            postorden(node.left);
            postorden(node.right);
            System.out.print(node.data + " ");
        }
    }
}
