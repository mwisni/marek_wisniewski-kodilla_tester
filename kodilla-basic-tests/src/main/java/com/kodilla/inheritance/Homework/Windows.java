package com.kodilla.inheritance.Homework;

public class Windows extends OperatingSystem{

 // Konstruktor systemu Windows
        public Windows(int yearOfPublish) {
            super(yearOfPublish);
        }
// Metoda dziedziczona po klasie Operating System
        @Override
        public void turnOn(){
        }
//  Metoda dziedziczona po klasie Operating System
        @Override
        public void displayYarOfPublish(){
        System.out.println("Windows year of publish: " + getYearOfPublish());
    }


}
