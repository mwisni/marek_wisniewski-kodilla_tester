package com.kodilla.collections.adv.immutable.special.homework;

import java.util.*;

public class BookManager extends Book {


    public BookManager(String title, String author) {
        super(title, author);
    }

    public Book createBook(String title, String author){

        return new Book(title, author);

    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
