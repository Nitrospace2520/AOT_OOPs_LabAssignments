/**
 * @question: Create two interfaces, each with two methods. Inherit a new
 *            interface from the two, adding anew method. Create a class by
 *            implementing the new interface and also inheriting from a concrete
 *            class. In main (), create an object of derived class and call the
 *            methods. [do all without package statement]
 * @author: Nirmalya Dhara
 * @date: 23 Nov, 2023
 */
package assignment05Classes;

interface InterfaceOne {
    void methodOne01();

    void methodOne02();
}

interface InterfaceTwo {
    void methodTwo01();

    void methodTwo02();
}

interface InterfaceThree extends InterfaceOne, InterfaceTwo {
    void methodThree();
}

class ConcreteClass {
    public void methodConcrete() {
    }
}

public class Solution02 extends ConcreteClass implements InterfaceThree {

    public void methodOne01() {
        System.out.println("Interface01.methodOne01()");
    }

    public void methodOne02() {
        System.out.println("Interface01.methodOne02()");
    }

    public void methodTwo01() {
        System.out.println("Interface02.methodTwo01()");
    }

    public void methodTwo02() {
        System.out.println("Interface02.methodTwo02()");
    }

    public void methodThree() {
        System.out.println("Interface03.methodThree()");
    }

    public void methodConcrete() {
        System.out.println("ConcreteClass.methodConcrete()");
    }

    public static void main(String[] args) {
        Solution02 obj = new Solution02();
        obj.methodOne01();
        obj.methodOne02();
        obj.methodTwo01();
        obj.methodTwo02();
        obj.methodThree();
        obj.methodConcrete();
    }
}