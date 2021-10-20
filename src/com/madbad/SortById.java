package com.madbad;

import java.util.Comparator;

public class SortById implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getId() < o2.getId())
            return -1;
        if(o1.getId() > o2.getId())
            return 1;
        else
            return 0;
    }
}
