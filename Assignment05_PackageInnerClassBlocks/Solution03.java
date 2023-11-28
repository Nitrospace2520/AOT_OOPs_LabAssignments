/**
 * @question: Create an interface containing three methods, in a package
 *            ‘pkgOne’. Implement the
 *            interface from a class under package pkgTwo. From main, under
 *            working directory, create
 *            object of the class and call methods of interface.
 * @author: Nirmalya Dhara
 * @date: 22 Nov, 2023
 */
package assignment05Classes;

import com.classesForSolution03.pkgTwo.TestForSolution03ImplementedClass;

/**
 * Solution03
 */
public class Solution03 {

    public static void main(String[] args) {
        TestForSolution03ImplementedClass objRef = new TestForSolution03ImplementedClass();
        objRef.methodOne();
        objRef.methodTwo();
        objRef.methodThree();
    }
}