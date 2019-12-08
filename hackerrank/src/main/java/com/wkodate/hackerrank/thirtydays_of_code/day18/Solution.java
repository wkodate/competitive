package com.wkodate.hackerrank.thirtydays_of_code.day18;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    Deque<Character> stack = new ArrayDeque<>();
    Deque<Character> queue = new ArrayDeque<>();

    public void pushCharacter(char c) {
        stack.offerFirst(c);
    }

    public char popCharacter() {
        return stack.pollFirst();
    }

    public void enqueueCharacter(char c) {
        queue.offerLast(c);
    }


    public char dequeueCharacter() {
        return queue.pollFirst();
    }

    public static void main(String[] args) {

    }
}

