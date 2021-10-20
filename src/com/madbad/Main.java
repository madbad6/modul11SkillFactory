package com.madbad;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> list = new  ArrayList<>();
        list.add(new Book("Java How to Program"));
        list.add(new Book("War & peace"));
        list.add(new Book("How it do"));
        list.add(new Book("Crime and Punishment"));


        Collections.sort(list, new SortByTitle());

        list.forEach(System.out::println);

        Collections.sort(list, new SortById());

        list.forEach(System.out::println);

    }
}
