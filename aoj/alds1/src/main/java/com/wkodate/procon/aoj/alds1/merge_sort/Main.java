package com.wkodate.procon.aoj.alds1.merge_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Main {

    private Integer s[];

    private int count = 0;

    public Main(Integer[] s) {
        this.s = s;
    }

    public void mergeSort(int left, int right) {
        if ((left + 1) < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid, right);
            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        Integer[] l = new Integer[n1 + 1];
        Integer[] r = new Integer[n2 + 1];
        for (int i = 0; i < n1; i++) {
            l[i] = s[left + i];
        }
        for (int i = 0; i < n2; i++) {
            r[i] = s[mid + i];
        }
        l[n1] = Integer.MAX_VALUE;
        r[n2] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int k = left; k < right; k++) {
            count++;
            if (l[i] <= r[j]) {
                s[k] = l[i];
                i = i + 1;
            } else {
                s[k] = r[j];
                j = j + 1;
            }
        }
    }

    public void print() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < s.length; i++) {
            sj.add(String.valueOf(s[i]));
        }
        System.out.println(sj.toString());
        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        String[] sArr = br.readLine().split(" ");
        Integer[] s = new Integer[n];
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(sArr[i]);
        }
        Main main = new Main(s);
        main.mergeSort(0, n );
        main.print();
    }

}
