package com.wkodate.procon.aoj.alds1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;

public class DoublyLinkedList {

    private static final String INSERT = "insert";
    private static final String DELETE = "delete";
    private static final String DELETE_FIRST = "deleteFirst";
    private static final String DELETE_LAST = "deleteLast";

    private Deque<Integer> deque = new ArrayDeque<>();

    public DoublyLinkedList() {
    }

    public void insert(Integer x) {
        deque.addFirst(x);
    }

    public void delete(Integer x) {
        deque.remove(x);
    }

    public void deleteFirst() {
        deque.removeFirst();
    }

    public void deleteLast() {
        deque.removeLast();
    }

    public void print() {
        StringJoiner sj = new StringJoiner(" ");
        for (Integer n : deque) {
            sj.add(String.valueOf(n));
        }
        System.out.println(sj.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        DoublyLinkedList linkedList = new DoublyLinkedList();
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            if (INSERT.equals(command)) {
                linkedList.insert(Integer.parseInt(input[1]));
            } else if (DELETE.equals(command)) {
                linkedList.delete(Integer.parseInt(input[1]));
            } else if (DELETE_FIRST.equals(command)) {
                linkedList.deleteFirst();
            } else if (DELETE_LAST.equals(command)) {
                linkedList.deleteLast();
            } else {
                throw new IllegalArgumentException();
            }
        }
        linkedList.print();
    }

}
