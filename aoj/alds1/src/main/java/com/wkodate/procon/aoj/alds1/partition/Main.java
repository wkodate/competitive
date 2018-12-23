package com.wkodate.procon.aoj.alds1.partition;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j] <= x) {
                i += 1;
                // a[i]とa[j]を交換
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        // 最後にa[i+1]とa[r]を交換
        int tmp = a[i + 1];
        a[i + 1] = a[r];
        a[r] = tmp;
        StringJoiner sj = new StringJoiner(" ");
        for (int k = 0; k < r + 1; k++) {
            if (k == i + 1) {
                sj.add("[" + String.valueOf(a[k]) + "]");
                continue;
            }
            sj.add(String.valueOf(a[k]));
        }
        System.out.println(sj.toString());
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        partition(input, 0, n - 1);
    }

}
