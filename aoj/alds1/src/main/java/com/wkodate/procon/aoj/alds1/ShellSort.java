package com.wkodate.procon.aoj.alds1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class ShellSort {

    private int m = 0;
    private int count = 0;
    private int[] G = new int[15];

    private int[] a;
    private int n;

    public ShellSort(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public void sort() {
        for (int i = 1; i <= n; i = i * 3 + 1) {
            G[m] = i;
            m++;
        }
        for (int i = m - 1; i >= 0; i--) {
            insertionSort(G[i]);
        }
    }

    private void insertionSort(int g) {
        for (int i = g; i < n; i++) {
            int v = a[i];
            int j = i - g;
            while (j >= 0 && a[j] > v) {
                a[j + g] = a[j];
                j = j - g;
                count++;
            }
            a[j + g] = v;
        }
    }

    public void print() {
        System.out.println(m);
        StringJoiner sj = new StringJoiner(" ");
        for (int i = m - 1; i >= 0; i--) {
            sj.add(String.valueOf(G[i]));
        }
        System.out.println(sj.toString());
        System.out.println(count);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] input = new int[num];
        for (int i = 0; i < num; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        ShellSort shellSort = new ShellSort(input, num);
        shellSort.sort();
        shellSort.print();
    }

}
