package com.wkodate.hackerrank.tendays_of_statistics.day1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {

    public static double calcMedian(int[] nums) {
        if (nums.length % 2 == 0) {
            return (double) (nums[(nums.length - 2) / 2] + nums[nums.length / 2]) / 2;
        }
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int slen = 0;
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
            slen += f[i];
        }
        int[] s = new int[slen];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < f[i]; j++) {
                s[idx++] = x[i];
            }
        }
        Arrays.sort(s);
        int[] lower = new int[slen / 2];
        int[] upper = new int[slen / 2];
        for (int i = 0; i < slen / 2; i++) {
            lower[i] = s[i];
        }
        int startIdx = (int) Math.ceil((double) slen / 2);
        for (int i = startIdx; i < slen; i++) {
            upper[i - startIdx] = s[i];
        }
        System.out.println(new BigDecimal(calcMedian(upper) - calcMedian(lower)).setScale(1, BigDecimal.ROUND_HALF_UP));
    }
}
