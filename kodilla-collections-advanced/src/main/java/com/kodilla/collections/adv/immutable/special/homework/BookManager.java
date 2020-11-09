package com.kodilla.collections.adv.immutable.special.homework;

import java.util.*;

public class BookManager  {


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
