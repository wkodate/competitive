package com.wkodate.hackerrank.thirtydays_of_code.day23;

import com.wkodate.hackerrank.thirtydays_of_code.Node;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;

public class Solution {

    static void levelOrder(Node root) {
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        StringJoiner sj = new StringJoiner(" ");
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            sj.add(String.valueOf(node.data));
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        System.out.println(sj.toString());
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

}
