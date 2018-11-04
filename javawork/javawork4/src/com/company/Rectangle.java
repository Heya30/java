package com.company;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public double getArea() {
        double area;
        area = width * height;
        return area; // to be replaced
    }

}