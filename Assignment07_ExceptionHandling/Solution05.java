/**
 * @question: Write a program to fire any checked exception manually using
 *            ‘throw’ keyword.
 * @author: Nirmalya Dhara
 * @date: 26.11.2023
 */
package assignment07Classes;

import java.io.IOException;

/**
 * Solution05
 */
public class Solution05 {

    public static void main(String[] args) {
        try {
            if (true) {
                throw new IOException("It's an IOException");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}