package com.wkodate.hackerrank.tendays_of_statistics.day0;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] w = new int[n];
        int wsum = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            wsum += w[i];
        }

        float xw = 0;
        for (int i = 0; i < n; i++) {
            xw += x[i] * w[i];
        }
        System.out.println(new BigDecimal(xw / wsum).setScale(1, BigDecimal.ROUND_HALF_UP));
    }
}
