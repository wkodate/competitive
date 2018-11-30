package com.wkodate.procon.aoj.alds1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class LinearSearch {

    private Integer sNum;
    private List<Integer> sList;
    private Integer gNum;
    private List<Integer> gList;

    public LinearSearch(int n, Integer[] s, int g, Integer[] t) {
        this.sNum = n;
        this.sList = Arrays.asList(s);
        this.gNum = g;
        this.gList = Arrays.asList(t);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer sNum = Integer.parseInt(br.readLine());
        String[] sStr = br.readLine().split(" ");
        Integer[] s = new Integer[sNum];
        for (int i = 0; i < sNum; i++) {
            s[i] = Integer.parseInt(sStr[i]);
        }
        Integer gNum = Integer.parseInt(br.readLine());
        String[] gStr = br.readLine().split(" ");
        int[] g = new int[gNum];
        for (int i = 0; i < gNum; i++) {
            g[i] = Integer.parseInt(sStr[i]);
        }
        LinearSearch linearSearch = new LinearSearch(sNum, s, gNum, g);

    }
}
