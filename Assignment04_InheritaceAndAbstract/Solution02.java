/**
 * @question: Write a Java Program to implement the following: Create a base
 *            class TwoD that contains two instance variable length and breadth
 *            and a method area(). Three subclasses triangle, square and
 *            rectangle inherits the base class TwoD and override the method
 *            area() according to their shape. By using abstract class.
 * @author: Nirmalya Dhara
 * @date: 23 Nov, 2023
 */
package assignment04Classes;

abstract class TwoD {
    double length;
    double breadth;

    TwoD(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    abstract public double area();
}

class Triangle extends TwoD {
    Triangle(double length, double breadth) {
        super(length, breadth);
    }

    public double area() {
        return this.length * this.breadth * 0.5;
    }
}

class Square extends TwoD {
    Square(double length) {
        super(length, length);
    }

    public double area() {
        return this.length * this.breadth;
    }
}

class Rectangle extends TwoD {
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    public double area() {
        return this.length * this.breadth;
    }
}

/**
 * * Solution01 is the main class of this java file
 */
public class Solution02 {

    public static void main(String[] args) {
        double length = Double.parseDouble(args[0]);
        double breadth = Double.parseDouble(args[1]);
        Triangle triangle = new Triangle(length, breadth);
        Square square = new Square(length);
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println("Area of Triangle : " + triangle.area());
        System.out.println("Area of Square : " + square.area());
        System.out.println("Area of Reactangle : " + rectangle.area());
    }
}