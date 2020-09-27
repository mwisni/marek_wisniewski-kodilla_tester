package com.kodilla.abstracts.homework.pkt_1;

public class Application {

    public static void main(String[] args) {


        Shape circle = new Circle(6);
        System.out.println("Pole Koła wynosi: " + circle.surfaceArea());
        System.out.println("Obwód koła wynosi: " + circle.circuit());

        Shape square = new Square(4.3);
        System.out.println("Pole kwadratu wynosi: " + square.surfaceArea());
        System.out.println("Obwód kwadratu wynosi: " + square.circuit());

        Shape rectangle = new Rectangle(2.5, 3.7);
        System.out.println("Pole prostokąta wynosi: " + rectangle.surfaceArea());
        System.out.println("Obwód prostokąta wynosi: " + rectangle.circuit());



    }
}