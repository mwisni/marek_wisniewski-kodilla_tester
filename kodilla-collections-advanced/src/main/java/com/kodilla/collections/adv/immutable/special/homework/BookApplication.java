package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BookApplication {

    public static void main(String[] args) {

        Set<Book> books = new HashSet<>();

        BookManager book =  new BookManager("Lśnienie", "Stephen King");
        BookManager book1 = new BookManager("Lśnienie", "Stephen King");
        BookManager book2 = new BookManager("Lśnienie", "Stephen");
        BookManager book3 =  new BookManager("Lśnienie", "Stephen King");
        BookManager book4 = new BookManager("Lśnienie", "Stephen King");
        BookManager book5 = new BookManager("Lśnienie", "Stephen");

        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        // zwracany false
        System.out.println(book == book1);
        // zwracany true
        System.out.println(book.equals(book1));
        System.out.println(books.size());

        for (Book bookList: books) {
            System.out.println(bookList);
        }


    }
}
