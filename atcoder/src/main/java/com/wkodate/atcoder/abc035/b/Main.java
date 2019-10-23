package com.wkodate.atcoder.abc035.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int t = sc.nextInt();
        int x = 0;
        int y = 0;
        int q = 0;
        for (int i = 0; i < s.length; i++) {
            if ("L".equals(s[i])) {
                x -= 1;
            } else if ("R".equals(s[i])) {
                x += 1;
            } else if ("U".equals(s[i])) {
                y += 1;
            } else if ("D".equals(s[i])) {
                y -= 1;
            } else {
                q++;
            }
        }
        if (t == 1) {
            System.out.println(Math.abs(x) + Math.abs(y) + q);
            return;
        }
        if ((Math.abs(x) + Math.abs(y) - q) % 2 == 0) {
            System.out.println(Math.max(Math.abs(x) + Math.abs(y) - q, 0));
        } else {
            System.out.println(Math.max(Math.abs(x) + Math.abs(y) - q, 1));
        }
    }

}
