/**
 * @question: Check without having any abstract method/s whether a class can be abstract; if so, then use that concrete method/s from another class having main method.
 * @author: Nirmalya Dhara
 * @date: 22 Nov, 2023
 */
package assignment04Classes;

abstract class AbstractClass {
    public void methodOne() {
        System.out.println("AbstractClass.methodOne()");
    }

    public void methodTwo() {
        System.out.println("AbstractClass.methodTwo()");
    }
}

public class Solution03 {
    public static void main(String[] args) {
        // ? ERROR: AbstractClass is abstract; cannot be instantiated
        // AbstractClass abstractClassObj = new AbstractClass();
        // ? The Write way is:-
        AbstractClass abstractClassObj = new AbstractClass() {
        };
        abstractClassObj.methodOne();
    }
}
