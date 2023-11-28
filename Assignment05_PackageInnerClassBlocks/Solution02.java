/**
 * @question: Create a class with variable(s) and method(s) (all will be default
 *            accessed) under package
 *            pOne. Now create a class under package pTwo, which is subclass of
 *            firstly created class. In
 *            the method here (i.e. class of pTwo) call variable(s) and
 *            method(s) of previous class (i.e.
 *            class of pOne). If errors come, rectify them. Now from Main (under
 *            working directory)
 *            access second class’s members.
 * @author: Nirmalya Dhara
 * @date: 24 Nov, 2023
 */
package assignment05Classes;

import com.classesForSolution02.pTwo.TestForSolution02B;

public class Solution02 {

    public static void main(String[] args) {
        TestForSolution02B objRef = new TestForSolution02B("Nokia", "3310",
                new String[] { "hard than your bones", "Long lasting better than any relationship" });
        objRef.getDetails();
        System.out.println(objRef.brandName);
        System.out.println(objRef.modelName);
    }
}