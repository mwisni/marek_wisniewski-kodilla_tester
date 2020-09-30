package com.kodilla.abstracts.homework.pkt_2;

public class Person {

    String firstName;
    int age;
    Job job;


    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String personResponsibilities(){

        return this.firstName + this.job.getResponsibilities();
    }

}
