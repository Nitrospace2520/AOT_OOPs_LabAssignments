/**
 * @quesion: 16. Given a string and an int n, return a string made of n
 *           repetitions of the last n characters of the
 *           string. You may assume that n is between 0 and the length of the
 *           string, inclusive.
 *           (For example if the inputs are “Wipro” and 3, then the output
 *           should be “propropro”.)
 * @author: Nirmalya Dhara,
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution16
 */
public class Solution16 {

    public static void main(String[] args) {
        String str = args[0];
        int n = Integer.parseInt(args[1]);
        if (n < 0 || n > str.length()) {
            System.out.println("Please input integer is between 0 and the length of the string, inclusive.");
            return;
        }
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += str.substring(str.length() - n);
        }
        System.out.println(ans);
    }
}