package com.kodilla.inheritance.Homework;

public class OperatingSystem {
// Zmienna rok wydania
    private int yearOfPublish;

// Konstruktor OperatingSystem
    public OperatingSystem(int yearOfPublish){
        this.yearOfPublish = yearOfPublish;
    }

// metoda I
    public void turnOn(){
        System.out.println("First publish of Sustems:");

    }
//Metoda II z zadania, w opisie nie było jej użycia ? Można jej użyć do wyświetlenia daty wygaszenia danej wersji.
    public void turnOff(){
        System.out.println("turnOff...");
    }
// getter do użycia zmiennych w klasach child.
    public int getYearOfPublish(){
        return yearOfPublish;
    }
// metoda wyswietlająca rezultat.
    public void displayYarOfPublish(){
        System.out.println("Year of publish: " + getYearOfPublish());
    }



}
