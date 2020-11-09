package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookApplication {

    public static void main(String[] args) {

        Set<Book> books = new HashSet<>();

        BookManager book =  new BookManager();
        BookManager book1 = new BookManager();
        BookManager book2 = new BookManager();

        books.add(book.createBook("Lśnienie", "Stephen King"));
        books.add(book1.createBook("Lśnienie", "Stephen King"));
        books.add(book2.createBook("Lśnienie", "Stephen"));

        System.out.println(book == book1);
        System.out.println(book.equals(book1));
        System.out.println(books.size());

        for (Book bookList: books) {
            System.out.println(bookList);
        }


    }
}
