/**
 * @question: Overload the constructors for class Box for cube and cone and also
 *            display its volume by using method overloading
 * @author: Nirmalya Dhara
 * @date: 22 Nov, 2023
 */
package assignment03Classes;

class Box {
    double side;
    double radius;
    double height;

    Box(double side) {
        this.side = side;
    }

    Box(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double calcVolume(double side) {
        return Math.pow(side, 3);
    }

    public double calcVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height / 3.0;
    }
}

public class Solution05 {
    public static void main(String[] args) {
        Box cube = new Box(Integer.parseInt(args[0]));
        Box cone = new Box(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        System.out.println("Volume of cube : " + cube.calcVolume(cube.side));
        System.out.println("Volume of cube : " + cone.calcVolume(cone.radius, cone.height));
    }
}
