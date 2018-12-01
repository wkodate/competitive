package com.wkodate.procon.aoj.alds1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class LinearSearch {

    private Integer sNum;
    private List<Integer> sList;
    private Integer count = 0;

    public LinearSearch(int n, Integer[] s) {
        this.sNum = n;
        this.sList = Arrays.asList(s);
    }

    public void search(int g) {
        for (int i = 0; i < sNum; i++) {
            if (g != sList.get(i)) {
                continue;
            }
            count++;
            return;
        }
    }

    public void print() {
        System.out.println(count);
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

        LinearSearch linearSearch = new LinearSearch(sNum, s);
        for (int i = 0; i < gNum; i++) {
            linearSearch.search(Integer.parseInt(gStr[i]));
        }
        linearSearch.print();
    }
}
