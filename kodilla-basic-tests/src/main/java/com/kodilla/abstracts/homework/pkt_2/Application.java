package com.kodilla.abstracts.homework.pkt_2;

public class Application {

    public static void main(String[] args) {

        Job softwareTester = new SoftwareTester();
        Person person = new Person("Marek: ", 28, "SoftwareTester");
        System.out.println(person.personResponsibilities(person.firstName, softwareTester.getResponsibilities()));

        Job painter = new Painter();
        Person person1 = new Person("Mariusz: ", 25, "Painter");
        System.out.println(person1.personResponsibilities(person1.firstName, painter.getResponsibilities()));

        Job teacher = new Teacher();
        Person person2 = new Person("Anita: ", 27, "Teacher");
        System.out.println(person2.personResponsibilities(person2.firstName, teacher.getResponsibilities()));


    }

}
