/**
 * @question: Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars. If the inputs are
“Mark” and “Kate” then the ouput should be “markate”. (The output should be in lowercase)
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution04
 */
public class Solution07 {

    public static void main(String[] args) {
        String str1 = args[0].toLowerCase();
        String str2 = args[1].toLowerCase();
        while (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            str1 = str1.substring(0, str1.length() - 1);
        }
        String concat = str1 + str2;
        System.out.println(concat);
    }
}