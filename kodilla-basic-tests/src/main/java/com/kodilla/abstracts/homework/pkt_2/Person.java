package com.kodilla.abstracts.homework.pkt_2;

public class Person {

    String firstName;
    int age;
    String job;


    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String personResponsibilities(String firstName, String responsibilities){

        return firstName + responsibilities;
    }

}
