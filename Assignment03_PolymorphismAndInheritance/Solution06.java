/**
 * @question: Create a class Student containing instance variables roll and name
 *            and a parameterized constructor. Create two objects of that class
 *            from the main class and print them (Hints: Override toString
 *            method of Object class).
 * @author: Nirmalya Dhara
 * @date: 22 Nov, 2023
 */
package assignment03Classes;

class Student {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return this.roll + " " + this.name;
    }
}

public class Solution06 {
    public static void main(String[] args) {
        Student student1 = new Student(18, "Sheker Radhe Krishnan");
        Student student2 = new Student(108, "Bister Bisleri");
        System.out.println(student1);
        System.out.println(student2);
    }

}
