/**
 * @question: Write a program to fire the NegativeArraySize exception.
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment07Classes;

import java.util.Scanner;

/**
 * Solution03
 */
public class Solution03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : "); // ? Enter a negative integer
        int n = scanner.nextInt();
        try {
            int[] array = new int[n];
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}