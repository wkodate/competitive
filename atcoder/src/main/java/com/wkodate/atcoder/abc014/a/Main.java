package com.wkodate.atcoder.abc014.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % b == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(b - (a % b));
    }

}
