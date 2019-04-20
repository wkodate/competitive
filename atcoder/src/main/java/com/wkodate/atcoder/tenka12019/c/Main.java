package com.wkodate.atcoder.tenka12019.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String[] str = s.split("");

        int allBlackCount = 0;
        for (int i = 0; i < str.length; i++) {
            if (".".equals(str[i])) {
                allBlackCount++;
            }
        }
        int allWhiteCount = 0;
        for (int i = 0; i < str.length - 1; i++) {
            if ("#".equals(str[i])) {
                allWhiteCount++;
            }
        }
        int whiteBlackCount = 0;
        for (int i = 0; i < str.length; i++) {
            // TODO
        }

        System.out.println(allWhiteCount);
        System.out.println(allBlackCount);
        System.out.println(whiteBlackCount);
        System.out.println(Math.min(whiteBlackCount, Math.min(allWhiteCount, allBlackCount)));
    }

}
