/**
 * @question: Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define. In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second type that you define). Test your code in main( ).
 * @author: Nirmalya Dhara
 * @date: 26.11.2023
 */
package assignment07Classes;

import java.io.IOException;

class CustomException1 extends Exception {
    public CustomException1(String str) {
        super(str);
    }
}

class CustomException2 extends Exception {
    public CustomException2(String str) {
        super(str);
    }
}

public class Solution07 {
    public static void f() throws CustomException1 {
        try {
            g();
        } catch (CustomException2 e) {
            System.out.println(e);
            throw new CustomException1("This is a custom exception 01");
        }
    }

    public static void g() throws CustomException2 {
        throw new CustomException2("This is a custom exception 02");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (CustomException1 e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}