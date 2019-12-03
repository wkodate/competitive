package com.wkodate.hackerrank.thirtydays_of_code.day13;

abstract public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
