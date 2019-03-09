package com.wkodate.atcoder.abc104.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int g = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            p.add(sc.nextInt());
            c.add(sc.nextInt());
        }

        int minProgram = Integer.MAX_VALUE;
        for (int i = 0; i < Math.pow(2, d); i++) {
            int score = 0;
            int program = 0;
            // 完全に解く問題と全く解かない問題を決定
            for (int j = 0; j <= d; j++) {
                if (((i >> j) & 1) == 1) {
                    score += 100 * (j + 1) * p.get(j) + c.get(j);
                    program += p.get(j);
                }
            }
            // スコアがGより小さい場合、中途半端に解く問題が必要になる
            // 解いてない問題のうち、もっとも高い配点の問題を加点する
            if (score < g) {
                for (int j = d - 1; j >= 0; j--) {
                    if (((i >> j) & 1) == 1) {
                        continue;
                    }
                    for (int k = 0; k < p.get(j) - 1; k++) {
                        score += 100 * (j + 1);
                        program++;
                        if (score >= g) {
                            break;
                        }
                    }
                    break;
                }
            }
            if (score >= g && program < minProgram) {
                minProgram = program;
            }
        }
        System.out.println(minProgram);
    }

}
