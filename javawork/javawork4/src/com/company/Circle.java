package com.company;

public class Circle extends Shape {
    private int r;

    public Circle (int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        double area;
        area = 3.14 * r * r ;
        return area; // to be replaced
    }

}