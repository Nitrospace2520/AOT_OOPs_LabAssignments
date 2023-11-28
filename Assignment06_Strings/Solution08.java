/**
 * @question: Take input a name using command line and print it in abbreviated format.
(e.g. Input: Amit Kumar Das Output: A.K.Das)
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution04
 */
public class Solution08 {

    public static void main(String[] args) {
        char firstLetter = args[0].toUpperCase().charAt(0);
        char middleLetter = args[1].toUpperCase().charAt(0);
        String surname = args[2].substring(0, 1).toUpperCase() + args[2].substring(1).toLowerCase();
        String abbreviatedFormat = "" + firstLetter + "." + middleLetter + "." + surname;
        System.out.println(abbreviatedFormat);
    }
}