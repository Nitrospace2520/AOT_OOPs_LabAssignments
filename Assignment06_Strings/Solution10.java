/**
 * @question: Create two strings s1 and s2 from user input, create another String s3 that contains one
character from s1 and another character from s2.
(for example: s1=”ABC”, s2=”DE”, s3=”ADBEC”).
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution04
 */
public class Solution10 {

    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];
        char[] chars = new char[str1.length() + str2.length()];
        int i = 0, j = 0, k = 0;
        while (i < str1.length() || j < str2.length()) {
            if (i < str1.length()) {
                chars[k++] = str1.charAt(i);
                i++;
            }
            if (j < str2.length()) {
                chars[k++] = str2.charAt(j);
                j++;
            }
        }
        String str3 = new String(chars);
        System.out.println(str3);
    }
}