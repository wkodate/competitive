package com.wkodate.procon.aoj.alds1.fibonacci_number;

import java.util.Scanner;

public class Main {

    private static int fibonacci(int n) {
        int[] f = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                f[i] = 1;
                continue;
            }
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

}
