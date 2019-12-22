package com.wkodate.hackerrank.tendays_of_statistics.day0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            sum += x[i];
            if (map.containsKey(x[i])) {
                map.put(x[i], map.get(x[i]) + 1);
            } else {
                map.put(x[i], 1);
            }
        }

        Arrays.sort(x);
        // mean
        System.out.println((float) sum / n);
        // median
        if (n != 0 && n % 2 == 0) {
            System.out.println((float) (x[(n - 1) / 2] + x[n / 2]) / 2);
        } else {
            System.out.println(x[n / 2]);
        }
        // mode
        int modeNum = Integer.MAX_VALUE;
        int modeMax = 0;
        for (int num : map.keySet()) {
            if (modeMax <= map.get(num)) {
                if (modeMax == map.get(num) && num > modeNum) {
                    continue;
                }
                modeNum = num;
                modeMax = map.get(num);
            }

        }
        System.out.println(modeNum);
    }
}
