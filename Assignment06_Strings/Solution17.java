/**
 * @question: Given a string and a non-empty word string, return a string made
 *            of each char just before
 *            and just after every appearance of the word in the string. Ignore
 *            cases where there is no char
 *            before or after the word, and a char may be included twice if it
 *            is between two words.
 *            (For example, if inputs are "abcXY123XYijk" and "XY", output
 *            should be "c13i". If inputs are
 *            "XY123XY" and "XY", output should be "13". If inputs are "XY1XY"
 *            and "XY", output should
 *            be "11").
 * @author: Nirmalya Dhara,
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution17
 */
public class Solution17 {

    public static void main(String[] args) {
        String word = args[0];
        String check = args[1];
        String ans = "";
        for (int i = 0; i < word.length(); i++) {
            if ((i + check.length() <= word.length()) && word.substring(i, i + check.length()).equals(check)) {
                if (i > 0) {
                    ans += word.charAt(i - 1);
                }
                if ((i + check.length()) < word.length()) {
                    ans += word.charAt(i + check.length());
                }
            }
        }
        System.out.println(ans);
    }
}