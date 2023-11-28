/**
 * @question: Check if "Tech" presents in "University of Technology" or not. If yes, return its position.
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution04
 */
public class Solution11 {

    public static void main(String[] args) {
        String mainStr = args[0];
        String findStr = args[1];
        // ? Approach: 01
        // for (int i = 0; i < mainStr.length() - findStr.length() + 1; i++) {
        // if (mainStr.substring(i, i + findStr.length()).equals(findStr)) {
        // System.out.println("Find at " + i);
        // return;
        // }
        // }
        // ? Approach: 02
        if (mainStr.indexOf(findStr) != -1) {
            System.out.println("Find at  " + mainStr.indexOf(findStr));
            return;
        }
        System.out.println("Can't find");
    }
}