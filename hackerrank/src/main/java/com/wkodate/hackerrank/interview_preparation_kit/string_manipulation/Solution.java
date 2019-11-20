package com.wkodate.hackerrank.interview_preparation_kit.string_manipulation;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static int makeAnagram(String a, String b) {
        Map<String, Integer> map = new HashMap<>();
        String[] aarr = a.split("");
        String[] barr = b.split("");
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(aarr[i])) {
                map.put(aarr[i], map.get(aarr[i]) + 1);
            } else {
                map.put(aarr[i], 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(barr[i])) {
                map.put(barr[i], map.get(barr[i]) - 1);
            } else {
                map.put(barr[i], -1);
            }
        }
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            count += Math.abs(entry.getValue());
        }
        return count;
    }

    public static void main(String args[]) {
    }

}
