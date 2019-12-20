package com.wkodate.hackerrank.thirtydays_of_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Solution {

    static void regexPatternsAndIntroToDatabases(int n, String[][] firstNameEmailID) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String firstName = firstNameEmailID[i][0];
            String emailID = firstNameEmailID[i][1];
            if (!emailID.endsWith("@gmail.com")) {
                continue;
            }
            list.add(firstName);
        }
        Collections.sort(list);
        for(String name : list) {
            System.out.println(name);
        }
    }

    static void sorting(int[] a) {
        int swaps = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    swaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }

    static void exceptionStringToInteger(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }

    static int twoDemensionArrays(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    static int binaryNumbers(int n) {
        String bin = Integer.toBinaryString(n);
        int max = 0;
        int count = 0;
        for (int i = 0; i < bin.length(); i++) {
            char c = bin.charAt(i);
            if (c == '1') {
                count++;
                max = Math.max(max, count);
                continue;
            }
            count = 0;
        }
        return max;
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

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
        sorting(new int[]{3, 2, 1});
    }

}
