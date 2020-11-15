package com.kodilla.collections.adv.immutable.special.homework;

import org.graalvm.compiler.phases.common.util.HashSetNodeEventListener;

import java.util.*;

public class BookManager  {

    Set<Book> bookSet = new HashSet<>();


    public Book createBook(String title, String author){
        Book book = new Book(title, author);
        bookSet.add(book);
        for (Book book1 : bookSet) {
            if (book1.equals(book)){
                return book1;
            }
        }
        return null;
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
