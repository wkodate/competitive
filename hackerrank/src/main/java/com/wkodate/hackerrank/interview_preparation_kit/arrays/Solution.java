package com.wkodate.hackerrank.interview_preparation_kit.arrays;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    static int[] rotLeft(int[] a, int d) {
        int[] rotated = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            rotated[(a.length - d + i) % a.length] = a[i];
        }
        return rotated;
    }

    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        System.out.println();
    }

}
