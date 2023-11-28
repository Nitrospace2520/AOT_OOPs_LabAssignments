/**
* @question: Create a class with a method void show () and make 3 subclasses of
*            it and all subclasses have void show () method overridden and call
*            those methods using their class references.By dynamic method dispatching
* @author: Nirmalya Dhara
* @date: 22 Nov, 2023
*/
package assignment03Classes;

class SuperClass {
    public void show() {
        System.out.println("SuperClass.show()");
    }
}

class SubClass1 extends SuperClass {
    public void show() {
        System.out.println("SubClass1.show()");
    }
}

class SubClass2 extends SuperClass {
    public void show() {
        System.out.println("SubClass2.show()");
    }
}

class SubClass3 extends SuperClass {
    public void show() {
        System.out.println("SubClass3.show()");
    }
}

public class Solution09 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        SubClass1 subClass1 = new SubClass1();
        // SubClass2 subClass2 = new SubClass2();
        // SubClass3 subClass3 = new SubClass3();
        SuperClass superClassRef = new SubClass1();

        superClass.show();
        subClass1.show();
        // subClass2.show();
        // subClass3.show();
        superClassRef.show();
    }
}
