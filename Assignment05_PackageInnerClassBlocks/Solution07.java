/**
 * @question: Write a program to demonstrate anonymous inner class (using super
 *            class and interface)
 * @author: Nirmalya Dhara
 * @date: 24 Nov, 2023
 */
package assignment05Classes;

interface AnonymousInterface {

    void methodOne();
}

class AnonymousClass {
    public void methodOne() {
        System.out.println("AnonymousClass.methodOne()");
    }
}

/**
 * Solution07
 */
public class Solution07 {

    public static void main(String[] args) {
        AnonymousClass anonymousClassObj = new AnonymousClass() {
            public void methodOne() {
                System.out.println("Solution07.main(...).new AnonymousClass() {...}.methodOne()");
            }

            public void methodTwo() {
                System.out.println("Solution07.main(...).new AnonymousClass() {...}.methodTwo()");
            }
        };
        anonymousClassObj.methodOne();
        // anonymousClassObj.methodTwo(); // ! Error: cannot find symbol

        AnonymousInterface anonymousInterfaceObj = new AnonymousInterface() {
            public void methodOne() {
                System.out.println("Solution07.main(...).new AnonymousInterface() {...}.methodOne()");
            }

            public void methodTwo() {
                System.out.println("Solution07.main(...).new AnonymousInterface() {...}.methodTwo()");
            }
        };
        anonymousInterfaceObj.methodOne();
        // anonymousInterfaceObj.methodTwo(); // ! Error: cannot find symbol
    }
}