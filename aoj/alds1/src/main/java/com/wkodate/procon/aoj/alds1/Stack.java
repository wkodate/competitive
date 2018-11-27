package com.wkodate.procon.aoj.alds1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

    private final String[] input;

    public Stack(String[] input) {
        this.input = input;
    }

    public int calculate() {
        Deque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            String str = input[i];
            if ("+".equals(str)) {
                Integer n1 = Integer.parseInt(deque.pop());
                Integer n2 = Integer.parseInt(deque.pop());
                deque.push(String.valueOf(n2 + n1));
            } else if ("-".equals(str)) {
                Integer n1 = Integer.parseInt(deque.pop());
                Integer n2 = Integer.parseInt(deque.pop());
                deque.push(String.valueOf(n2 - n1));
            } else if ("*".equals(str)) {
                Integer n1 = Integer.parseInt(deque.pop());
                Integer n2 = Integer.parseInt(deque.pop());
                deque.push(String.valueOf(n2 * n1));
            } else {
                deque.push(str);
            }
        }
        return Integer.parseInt(deque.pop());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Stack stack = new Stack(input);
        System.out.println(stack.calculate());
    }

}