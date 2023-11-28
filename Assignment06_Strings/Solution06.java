/**
 * @question: Write a java program to check whether a String is Palindrome or not.
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution04
 */
public class Solution06 {

    public static void main(String[] args) {
        String str = args[0];
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String revString = new String(sb);
        if (str.equals(revString)) {
            System.out.println("It's a Palindrome String");
        } else {
            System.out.println("It is not a plindrome string");
        }
    }
}