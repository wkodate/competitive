package com.wkodate.hackerrank.warmup;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    static long repeatedString(String s, long n) {
        long sum = 0;
        int incACount = s.length() - s.replace("a", "").length();
        sum += n / s.length() * incACount;
        String remStr = s.substring(0, (int) (n % s.length()));
        sum += remStr.length() - remStr.replace("a", "").length();
        return sum;
    }

    static int jumpingOnClouds(int[] c) {
        int count = 0;
        int pos = 0;
        while (true) {
            if (pos == c.length - 1) {
                return count;
            }
            if (pos < c.length - 2 && c[pos + 2] == 0) {
                pos += 2;
            } else {
                pos++;
            }
            count++;
        }
    }

    static int countingValleys(int n, String s) {
        String[] ud = s.split("");
        int valleysCount = 0;
        int step = 0;
        for (int i = 0; i < n; i++) {
            if ("U".equals(ud[i])) {
                step++;
            } else {
                if (step == 0) {
                    valleysCount++;
                }
                step--;
            }
        }
        return valleysCount;
    }

    static int sockMerchant(int n, int[] ar) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (set.contains(ar[i])) {
                set.remove(ar[i]);
                count++;
                continue;
            }
            set.add(ar[i]);
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
    }

}
