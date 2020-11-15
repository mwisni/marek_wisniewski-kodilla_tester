package com.kodilla.collections.adv.immutable.special.homework;

import com.sun.tools.classfile.Opcode;

import java.util.HashSet;
import java.util.Set;

public class BookApplication {

    public static void main(String[] args) {


        BookManager bookManager =  new BookManager();

        Book book1 = bookManager.createBook("Lśnienie", "Stephen King");
        Book book2 = bookManager.createBook("Lśnienie", "Stephen King");
        Book book3 = bookManager.createBook("Dziewczyny które zabiły Cloe", "Alex Marwood");

        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(bookManager.bookSet.size());

        for (Book bookSet : bookManager.bookSet) {
            System.out.println(bookSet);
        }

    }
}
