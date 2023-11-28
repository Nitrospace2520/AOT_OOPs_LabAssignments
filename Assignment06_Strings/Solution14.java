/**
 * @question: Write your own method called deleteMe (String str, int m) that
 *            returns the input string with
 *            the mth element removed.
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution14
 */
public class Solution14 {
    public static String deleteMe(String str, int m) {
        if (m > str.length()) {
            return str;
        }
        return str.substring(0, m - 1) + str.substring(m);
    }

    public static void main(String[] args) {
        String str = args[0];
        int m = Integer.parseInt(args[1]);
        System.out.println(deleteMe(str, m));
    }
}