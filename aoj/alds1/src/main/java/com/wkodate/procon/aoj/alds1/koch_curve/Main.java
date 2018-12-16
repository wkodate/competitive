package com.wkodate.procon.aoj.alds1.koch_curve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        System.out.println(0d + " " + 0d);
        kock(n, new Position(0, 0), new Position(100, 0));
        System.out.println(100d + " " + 0d);
    }

    private static void kock(int n, Position p1, Position p2) {
        if (n == 0) {
            return;
        }
        Position s = new Position(0d, 0d);
        Position t = new Position(0d, 0d);
        Position u = new Position(0d, 0d);

        s.x = (2 * p1.x + 1 * p2.x) / 3;
        s.y = (2 * p1.y + 1 * p2.y) / 3;
        t.x = (1 * p1.x + 2 * p2.x) / 3;
        t.y = (1 * p1.y + 2 * p2.y) / 3;
        u.x = (t.x - s.x) * Math.cos(Math.toRadians(60))
                - (t.y - s.y) * Math.sin(Math.toRadians(60))
                + s.x;
        u.y = (t.x - s.x) * Math.sin(Math.toRadians(60))
                + (t.y - s.y) * Math.cos(Math.toRadians(60))
                + s.y;

        kock(n - 1, p1, s);
        System.out.println(s.x + " " + s.y);
        kock(n - 1, s, u);
        System.out.println(u.x + " " + u.y);
        kock(n - 1, u, t);
        System.out.println(t.x + " " + t.y);
        kock(n - 1, t, p2);
    }

    public static class Position {
        private double x;
        private double y;

        public Position(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

}
