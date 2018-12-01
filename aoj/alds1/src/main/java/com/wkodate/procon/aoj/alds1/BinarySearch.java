package com.wkodate.procon.aoj.alds1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    private Integer sNum;
    private List<Integer> sList;
    private Integer count = 0;

    public BinarySearch(int n, Integer[] s) {
        this.sNum = n;
        this.sList = Arrays.asList(s);
    }

    public void search(int key) {
        int left = 0;
        int right = sNum;
        while (left < right) {
            int mid = (left + right) / 2;
            if (sList.get(mid) == key) {
                count++;
                return;
            } else if (key < sList.get(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
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

        BinarySearch binarySearch = new BinarySearch(sNum, s);
        for (int i = 0; i < gNum; i++) {
            binarySearch.search(Integer.parseInt(gStr[i]));
        }
        binarySearch.print();
    }
}
