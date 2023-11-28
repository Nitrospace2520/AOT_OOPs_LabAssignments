/**
 * @question: Create an abstract class with three abstract methods check whether you can we override only few methods (not all methods) in subclass or not.
 * @author: Nirmalya Dhara
 * @date: 22 Nov, 2023
 */
package assignment04Classes;

abstract class SuperClass {
    abstract public void methodOne();

    abstract public void methodTwo();

    abstract public void methodThree();
}

abstract class SubClass extends SuperClass {
    public void methodOne() {
        System.out.println("Subclass01.methodOne()");
    }

    public void methodTwo() {
        System.out.println("Subclass01.methodTwo()");
    }
}

class SubSubClass extends SubClass {

    public void methodThree() {
        System.out.println("SubSubClass.methodThree()");
    }
}

public class Solution04 {
    public static void main(String[] args) {
        SubClass subclassObj = new SubSubClass();
        subclassObj.methodOne();
        subclassObj.methodTwo();
        subclassObj.methodThree();
    }
}
