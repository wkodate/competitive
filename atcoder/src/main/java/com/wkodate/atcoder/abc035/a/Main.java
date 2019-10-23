package com.wkodate.atcoder.abc035.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        if (h / w == 0.75) {
            System.out.println("4:3");
            return;
        }
        System.out.println("16:9");
    }

}
