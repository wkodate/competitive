package com.wkodate.hackerrank.interview_preparation_kit.dictionaries_and_hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

    static int sherlockAndAnagrams(String s) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        // generate all substrings(N^2)
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                // sort all strings e.g. ab & ba both == ab
                char[] chs = s.substring(i, j).toCharArray();
                Arrays.sort(chs);
                String currentSubString = String.valueOf(chs);

                if (map.containsKey(currentSubString)) {
                    int value = map.get(currentSubString);
                    count += value;
                    map.put(currentSubString, value + 1);
                } else {
                    map.put(currentSubString, 1);
                }
            }
        }
        return count;
    }

    static String twoStrings(String s1, String s2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(s1.split("")));
        Set<String> set2 = new HashSet<>(Arrays.asList(s2.split("")));
        for (String word : set1) {
            if (set2.contains(word)) {
                return "YES";
            }
        }
        return "NO";
    }

    static void checkMagazine(String[] magazine, String[] note) {
        List<String> list = new ArrayList<>(Arrays.asList(magazine));
        for (String word : note) {
            if (!list.contains(word)) {
                System.out.println("No");
                return;
            }
            list.remove(word);
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("kkkk"));

    }

}
