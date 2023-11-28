package com.classesForSolution01;

import Assignment05_Interface.Shape;

public class Reactangle implements Shape {
    double length;
    double breadth;

    public Reactangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}
