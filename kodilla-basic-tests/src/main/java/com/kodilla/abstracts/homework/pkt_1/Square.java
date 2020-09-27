package com.kodilla.abstracts.homework.pkt_1;

import com.kodilla.abstracts.homework.pkt_1.Shape;

public class Square extends Shape {

    private double a;

    public Square(double a){
        this.a = a;
    }



    @Override
    public double surfaceArea() {
        return a * a;
    }

    @Override
    public double circuit() {
        return 4 * a;
    }
}
