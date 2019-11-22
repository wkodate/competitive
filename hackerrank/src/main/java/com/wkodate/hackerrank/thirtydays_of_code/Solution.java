package com.wkodate.hackerrank.thirtydays_of_code;

public class Solution {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        System.out.println(Math.round(meal_cost * (1 + 0.01 * (tip_percent + tax_percent))));
    }

    public static void main(String args[]) {
    }

}
