package com.wkodate.procon.aoj.alds1.counting_sort;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Count Sort.
 * 配列の各要素が何回現れるかをカウント、累積和を求めて配列を更新.
 * その後要素を別の配列に追加してカウントを減らしていく.
 */
public class Main {

    public static int[] countingSort(int[] a, int[] b, int k) {
        int[] counter = new int[k + 1];

        // C[i] に i の出現数を記録する
        for (int i = 0; i < a.length; i++) {
            counter[a[i]]++;
        }

        // C[i] に i 以下の数の出現数を記録する
        for (int i = 1; i < k + 1; i++) {
            counter[i] += counter[i - 1];
        }
        for (int i = a.length - 1; i >= 0; i--) {
            b[counter[a[i]] - 1] = a[i];
            counter[a[i]]--;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] output = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (max < array[i]) {
                max = array[i];
            }
        }
        output = countingSort(array, output, max);
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < output.length; i++) {
            sj.add(String.valueOf(output[i]));
        }
        System.out.println(sj.toString());
    }

}
