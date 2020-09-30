package com.kodilla.abstracts.homework.pkt_2;

public class Application {

    public static void main(String[] args) {

        Job softwareTester = new SoftwareTester();
        Person person = new Person("Marek: ", 28,softwareTester);
        System.out.println(person.personResponsibilities());

        Job painter = new Painter();
        Person person1 = new Person("Mariusz: ", 25, painter);
        System.out.println(person1.personResponsibilities());

        Job teacher = new Teacher();
        Person person2 = new Person("Anita: ", 27, teacher);
        System.out.println(person2.personResponsibilities());


    }

}
