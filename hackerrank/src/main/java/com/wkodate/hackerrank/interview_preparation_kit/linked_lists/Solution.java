package com.wkodate.hackerrank.interview_preparation_kit.linked_lists;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    static class Node {
        int data;
        Node next;
    }

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static boolean hasCycle(Node head) {
        Set<Node> set = new HashSet<>();
        Node node = head;
        while (node != null) {
            set.add(node);
            node = node.next;
            if (set.contains(node)) {
                return true;
            }
        }
        return false;
    }

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode current1 = head1;
        SinglyLinkedListNode current2 = head2;
        while (current1 != current2) {
            System.out.println(current1.data);
            System.out.println(current2.data);
            if (current1.next == null) {
                current1 = head2;
            } else {
                current1 = current1.next;
            }
            if (current2.next == null) {
                current2 = head1;
            } else {
                current2 = current2.next;
            }
        }
        return current1.data;
    }

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode node = head;
        DoublyLinkedListNode tmp = head;
        while (tmp != null) {
            DoublyLinkedListNode prev = tmp.prev;
            tmp.prev = tmp.next;
            tmp.next = prev;
            node = tmp;

            tmp = tmp.prev;
        }
        return node;
    }

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode prevNode = null;
        DoublyLinkedListNode nextNode = head;
        while (nextNode != null && nextNode.data < data) {
            prevNode = nextNode;
            nextNode = nextNode.next;
        }
        DoublyLinkedListNode target = new DoublyLinkedListNode(data);
        if (nextNode != null) {
            nextNode.prev = target;
        }
        target.next = nextNode;
        target.prev = prevNode;
        if (prevNode != null) {
            prevNode.next = target;
        } else {
            head = target;
        }
        return head;
    }

    static SinglyLinkedListNode insertNodeAtPosition(
            SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode prevNode = head;
        int idx = 1;
        while (idx < position) {
            prevNode = prevNode.next;
            idx++;
        }
        SinglyLinkedListNode target = new SinglyLinkedListNode(data);
        target.next = prevNode.next;
        prevNode.next = target;
        return head;
    }

    public static void main(String args[]) {
    }

}
