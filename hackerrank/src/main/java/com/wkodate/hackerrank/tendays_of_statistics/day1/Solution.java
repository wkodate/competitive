package com.wkodate.hackerrank.tendays_of_statistics.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static int calcMedian(int[] nums) {
        if (nums.length % 2 == 0) {
            return (nums[(nums.length - 2) / 2] + nums[nums.length / 2]) / 2;
        }
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int[] lower = new int[n / 2];
        int[] upper = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            lower[i] = x[i];
        }
        int startIdx = (int) Math.ceil((double) n / 2);
        for (int i = startIdx; i < n; i++) {
            upper[i - startIdx] = x[i];
        }
        System.out.println(calcMedian(lower));
        System.out.println(calcMedian(x));
        System.out.println(calcMedian(upper));
    }
}
