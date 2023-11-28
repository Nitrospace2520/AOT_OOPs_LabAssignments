/**
 * @question: Create an interface named Shape with a field pie (=3.14). Create two subclasses of it named Circle and Rectangle. Create object of the two sub-classes, override and calculate their area. From main() method define in a separate file test the area() methods.
 * @author: Nirmalya Dhara
 * @date: 23 Nov, 2023
 */
package assignment05Classes;

import com.classesForSolution01.Circle;
import com.classesForSolution01.Reactangle;

public class Solution01 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Reactangle rectangle = new Reactangle(10, 20);
        System.out.println("Area of circle : " + circle.area());
        System.out.println("Area of rectangle : " + rectangle.area());
    }
}
