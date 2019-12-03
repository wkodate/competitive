package com.wkodate.hackerrank.thirtydays_of_code.day12;

public class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        testScores = scores;
    }

    public String calculate() {
        int sum = 0;
        for (int testScore : testScores) {
            sum += testScore;
        }
        int average = sum / testScores.length;
        if (average >= 90) {
            return "O";
        } else if (average >= 80) {
            return "E";
        } else if (average >= 70) {
            return "A";
        } else if (average >= 55) {
            return "P";
        } else if (average >= 40) {
            return "D";
        } else {
            return "T";
        }
    }

}
