package com.wkodate.hackerrank.thirtydays_of_code;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.StringJoiner;

public class Solution {

    static void array(int[] arr) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            sj.add(String.valueOf(arr[arr.length - i - 1]));
        }
        System.out.println(sj.toString());
    }

    static void loop(int n) {
        for (int i = 0; i < 10; i++) {
            System.out.println(n + " x " + (i + 1) + " = " + n * (i + 1));
        }
    }

    static void conditionalStatement(int n) {
        if (n % 2 == 1 || (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        System.out.println(Math.round(meal_cost * (1 + 0.01 * (tip_percent + tax_percent))));
    }

    public static void main(String args[]) {
    }

}
