package com.wkodate.procon.aoj.alds1.exhaustive_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private Integer[] a;

    public Main(Integer[] a) {
        this.a = a;
    }

    public boolean solve(int i, int m) {
        if (m == 0) {
            return true;
        }
        if (i >= a.length) {
            return false;
        }
        return solve(i + 1, m) || solve(i + 1, m - a[i]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        String[] aStr = br.readLine().split(" ");
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(aStr[i]);
        }
        Integer q = Integer.parseInt(br.readLine());
        String[] mStr = br.readLine().split(" ");
        Integer[] m = new Integer[q];
        for (int i = 0; i < q; i++) {
            m[i] = Integer.parseInt(mStr[i]);
        }

        Main main = new Main(a);
        for (int i = 0; i < m.length; i++) {
            if (main.solve(0, m[i])) {
                System.out.println("yes");
                continue;
            }
            System.out.println("no");
        }

    }
}
