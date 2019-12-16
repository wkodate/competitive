package com.wkodate.hackerrank.thirtydays_of_code.day26;

import java.time.LocalDate;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int returnedD = sc.nextInt();
        int returnedM = sc.nextInt();
        int returnedY = sc.nextInt();
        int dueD = sc.nextInt();
        int dueM = sc.nextInt();
        int dueY = sc.nextInt();
        LocalDate returnedDate = LocalDate.of(returnedY, returnedM, returnedD);
        LocalDate dueDate = LocalDate.of(dueY, dueM, dueD);
        long sum = 0;
        int diff = returnedDate.compareTo(dueDate);
        if (diff > 0) {
            if (returnedDate.getYear() - dueDate.getYear() > 0) {
                sum = 10000;
            } else if (returnedDate.getMonth().getValue() - dueDate.getMonth().getValue() > 0) {
                sum = 500 * diff;
            } else {
                sum = 15 * diff;
            }
        }
        System.out.println(sum);
    }
}
