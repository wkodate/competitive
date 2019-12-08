package com.wkodate.hackerrank.thirtydays_of_code.day17;

public class Calculator {

    public int power(int n, int p) {
        if (n < 0 || p < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }

}
