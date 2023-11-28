/**
 * @question: Write a program in Java which will read a string and rewrite it in
 *            the alphabetical order. For
 *            example, the word STRING should be written as GINRST.
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

import java.util.Arrays;

/**
 * Solution13
 */
public class Solution13 {

    public static void main(String[] args) {
        String str = args[0];
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        str = new String(chars);
        System.out.println(str);
    }
}