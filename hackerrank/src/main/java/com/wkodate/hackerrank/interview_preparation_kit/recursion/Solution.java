package com.wkodate.hackerrank.interview_preparation_kit.recursion;

public class Solution {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String args[]) {
    }

}
