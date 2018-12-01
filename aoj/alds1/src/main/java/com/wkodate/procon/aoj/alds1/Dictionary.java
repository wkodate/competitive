package com.wkodate.procon.aoj.alds1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    Map<String, String> dict = new HashMap<>();

    public Dictionary() {
    }

    public void insert(String str) {
        dict.put(str, str);
    }

    public void find(String str) {
        if (dict.containsKey(str)) {
            System.out.println("yes");
            return;
        }
        System.out.println("no");

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        Dictionary dict = new Dictionary();
        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split(" ");
            String instruction = row[0];
            String str = row[1];
            if ("insert".equals(instruction)) {
                dict.insert(str);
                continue;
            }
            if ("find".equals(instruction)) {
                dict.find(str);
            }
        }

    }
}
