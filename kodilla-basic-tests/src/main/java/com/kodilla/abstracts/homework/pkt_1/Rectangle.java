package com.kodilla.abstracts.homework.pkt_1;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;

    }

    @Override
    public double surfaceArea() {
        return a * b;
    }

    @Override
    public double circuit() {
        return 2*a + 2*b;
    }
}
