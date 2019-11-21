package com.wkodate.hackerrank.interview_preparation_kit.greedy_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    static int luckBalance(int k, int[][] contests) {
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        for (int i = 0; i < contests.length; i++) {
            if (contests[i][1] == 1) {
                one.add(contests[i][0]);
            } else {
                zero.add(contests[i][0]);
            }
        }
        one.sort(Collections.reverseOrder());
        int count = 0;
        int sum = 0;
        for (Integer integer : one) {
            count++;
            if (count <= k) {
                sum += integer;
            } else {
                sum -= integer;
            }
        }
        for (Integer integer : zero) {
            sum += integer;
        }
        return sum;
    }

    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i + 1]));
        }
        return min;
    }

    public static void main(String args[]) {
    }

}
