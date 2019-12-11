package com.wkodate.hackerrank.thirtydays_of_code.day21;

public class Printer<T> {

    void printArray(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }

}
