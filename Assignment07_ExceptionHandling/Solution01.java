/**
 * @question: Write a program to handle the ArithmeticException.
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment07Classes;

import java.util.Scanner;

/**
 * ?Solution01: Arithmetic Exception
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers :");
        int n1 = Integer.parseInt(scanner.next());
        int n2 = Integer.parseInt(scanner.next());
        System.out.println("Addition: " + (n1 + n2));
        System.out.println("Substraction: " + (n1 - n2));
        System.out.println("Multiplication: " + (n1 * n2));
        try {
            int div = (n1 / n2);
            System.out.println("Division: " + div);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}