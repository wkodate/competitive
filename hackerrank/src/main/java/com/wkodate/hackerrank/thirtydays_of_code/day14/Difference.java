package com.wkodate.hackerrank.thirtydays_of_code.day14;

import java.util.Arrays;

public class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        elements = a;
    }

    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = elements[elements.length - 1] - elements[0];
    }

}
