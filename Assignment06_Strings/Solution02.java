/**
 * @question: Take a string from the keyboard and a char array (of length 5).
 *            Now append the string to that
 *            char array.
 * @author: Nirmalya Dhara
 * @date: 24 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution02
 */
public class Solution02 {

    public static void main(String[] args) {
        String input = args[0];
        // char[] chars = args[1].toCharArray();
        char[] chars = new char[5];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = args[i + 1].charAt(0);
        }
        String temp = new String(chars);
        temp = temp + input;
        chars = temp.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}