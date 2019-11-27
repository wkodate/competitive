package com.wkodate.hackerrank.thirtydays_of_code.day5;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            String[] target = s[i].split("");
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();
            for (int j = 0; j < target.length; j++) {
                if (j % 2 == 0) {
                    even.append(target[j]);
                } else {
                    odd.append(target[j]);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(even.toString());
            sb.append(" ");
            sb.append(odd.toString());
            System.out.println(sb.toString());
        }
    }

}