/**
 * @question: Write a java program to perform String Reverse.
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution04
 */
public class Solution04 {

    public static void main(String[] args) {
        String str = args[0];
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char ch = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = ch;
        }
        str = new String(chars);
        System.out.println("The reverse string : " + str);
    }
}