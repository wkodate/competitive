package com.wkodate.hackerrank.thirtydays_of_code.day27;

public class Solution {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray {
        public static int[] get_array() {
            return new int[]{};
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            return new int[]{1, 2};
        }

        public static int get_expected_result() {
            return minimum_index(get_array());
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            return new int[]{1, 2, 2, 1};
        }

        public static int get_expected_result() {
            return minimum_index(get_array());
        }
    }

}
