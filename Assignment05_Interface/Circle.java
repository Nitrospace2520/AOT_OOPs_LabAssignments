package com.classesForSolution01;

import Assignment05_Interface.Shape;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return pie * radius * radius;
    }

}
