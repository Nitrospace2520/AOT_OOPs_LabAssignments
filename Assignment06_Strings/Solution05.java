/**
 * @question: Write a java program to perform String Reverse. (using StringBuffer.)
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution04
 */
public class Solution05 {

    public static void main(String[] args) {
        String str = args[0];
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        str = new String(sb);
        System.out.println("The reverse string : " + str);
    }
}