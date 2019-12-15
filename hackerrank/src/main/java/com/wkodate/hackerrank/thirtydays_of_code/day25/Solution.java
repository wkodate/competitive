package com.wkodate.hackerrank.thirtydays_of_code.day25;

import java.util.Scanner;

public class Solution {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n == 1 || n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] n = new int[t];
        for (int i = 0; i < t; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            if (isPrime(n[i])) {
                System.out.println("Prime");
                continue;
            }
            System.out.println("Not prime");
        }
    }

}
