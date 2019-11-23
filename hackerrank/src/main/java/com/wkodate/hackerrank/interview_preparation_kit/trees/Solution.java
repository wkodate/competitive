package com.wkodate.hackerrank.interview_preparation_kit.trees;

public class Solution {

    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node lca(Node root, int v1, int v2) {
        if (root.data < v1 && root.data < v2) {
            return lca(root.right, v1, v2);
        }
        if (root.data > v1 && root.data > v2) {
            return lca(root.left, v1, v2);
        }
        return root;
    }

    public static int height(Node root) {
        if (root != null) {
            return 1 + Math.max(height(root.left), height(root.right));
        }
        return -1;
    }

    public static void main(String args[]) {
    }

}
