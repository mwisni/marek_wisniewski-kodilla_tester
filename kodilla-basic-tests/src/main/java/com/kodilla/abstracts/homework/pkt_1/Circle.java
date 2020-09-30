package com.kodilla.abstracts.homework.pkt_1;

public class Circle extends Shape {

    private int r;


    public Circle(double r){

        this.r = (int) r;
    }

    @Override
    public double surfaceArea() {

        return Math.PI * r * r;

    }

    @Override
    public double circuit() {
        return 2 * Math.PI * r;

    }
}
