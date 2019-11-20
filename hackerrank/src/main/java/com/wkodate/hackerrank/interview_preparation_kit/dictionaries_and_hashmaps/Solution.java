package com.wkodate.hackerrank.interview_preparation_kit.dictionaries_and_hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

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
        String[] magazine = new String[]{"two", "times", "three", "is", "not", "four"};
        String[] note = new String[]{"two", "times", "two", "is", "four"};
        checkMagazine(magazine, note);
    }

}
