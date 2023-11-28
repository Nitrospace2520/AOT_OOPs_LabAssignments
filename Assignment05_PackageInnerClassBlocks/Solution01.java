/**
 * @question: Create a class containing some public and private data and having one public method. Access private data from outside the class after satisfying some criteria of the public method.
 * @author: Nirmalya Dhara
 * @date: 24 Nov, 2023
 */
package assignment05Classes;

import com.classesForSolution01.TestForSolution01;

public class Solution01 {
    public static void main(String[] args) {
        TestForSolution01 object = new TestForSolution01("16900121061", "ImBatman");
        object.setName("16900121061", "Imbatman", "Bruce Wayne");
        object.setName("16900121061", "ImBatman", "Bruce Wayne");
        String name = object.getName("16900121061", "IamBatman");
        if (name != null) {
            System.out.println("The Name is : " + name);
        }
        name = object.getName("16900121061", "ImBatman");
        if (name != null) {
            System.out.println("The Name is : " + name);
        }
    }
}
