package com.wkodate.hackerrank.interview_preparation_kit.miscellaneous;

public class Solution {

    static long flippingBits(long n) {
        return (long) Math.pow(2, 32) - 1 - n;
    }

    public static void main(String args[]) {
    }

}
