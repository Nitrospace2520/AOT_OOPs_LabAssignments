/**
 * @question: Take a string from the keyboard and convert it into a character
 *            array (new one).
 * @author: Nirmalya Dhara
 * @date: 24 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution01
 */
public class Solution01 {

    public static void main(String[] args) {
        String input = args[0];
        // ? Approach: 01
        // char[] ch = input.toCharArray();
        // ? Approach: 02
        char[] ch = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            ch[i] = input.charAt(i);
        }
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}