package com.kodilla.inheritance.Homework;

public class Linux extends OperatingSystem {


    public Linux(int yearOfPublish) {
        super(yearOfPublish);
    }

    @Override
    public void turnOn(){

    }

    @Override
    public void displayYarOfPublish(){
        System.out.println("Linux year of publish: " + getYearOfPublish());
    }


}
