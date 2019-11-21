package com.wkodate.hackerrank.interview_preparation_kit.trees;

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

public class Solution {

    public static int height(Node root) {
        if (root != null) {
            return 1 + Math.max(height(root.left), height(root.right));
        }
        return -1;
    }

    public static void main(String args[]) {
    }

}
