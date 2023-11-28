/**
 * @question: Overload the constructors for class Box for cube and cone and also
 *            display its volume.
 * @author: Nirmalya Dhara
 * @date: 22.11.2023
 */
package assignment03Classes;

class Box {
    double side;
    double radius;
    double height;

    public Box(double side) {
        this.side = side;
    }

    public Box(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        if (this.side == 0) {
            return Math.PI * Math.pow(this.radius, 2) * this.height / 3.0;
        }
        return Math.pow(this.side, 3);
    }
}

public class Solution04 {
    public static void main(String[] args) {
        Box cubeBox = new Box(Integer.parseInt(args[0]));
        Box coneBox = new Box(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        System.out.println("Volume of cube : " + cubeBox.getVolume());
        System.out.println("Volume of cone : " + coneBox.getVolume());
    }
}