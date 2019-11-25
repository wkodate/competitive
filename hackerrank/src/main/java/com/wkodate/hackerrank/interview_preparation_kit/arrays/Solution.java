package com.wkodate.hackerrank.interview_preparation_kit.arrays;

import java.io.IOException;

public class Solution {

    static int minimumSwaps(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i < arr[i] - 1) {
                swap(arr, i, Math.min(arr.length - 1, arr[i] - 1));
                count++;
                i--;
            }
        }
        return count;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static void minimumBribes(int[] q) {
        int overtake = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            // Has this person moved more than two positions
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            // count the number of people who overtake a person
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) {
                    overtake++;
                }
            }
        }
        System.out.println(overtake);
    }

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
        System.out.println(minimumSwaps(new int[]{4, 3, 1, 2}));
    }

}
