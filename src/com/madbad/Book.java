package com.madbad;

public class Book {
    static int counter = 1;

    private int id;
    private String title;

    public Book(String title) {
        id = counter++;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book id: " + id + " title: " + title;
    }
}
