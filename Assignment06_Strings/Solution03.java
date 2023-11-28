/**
 * @question: Find length of a string taken from the keyboard and also find the
 *            length of that string except
 *            front and end spaces.
 * @author: Nirmalya Dhara,
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution03
 */
public class Solution03 {

    public static void main(String[] args) {
        String str = args[0];
        System.out.println("Full length : " + str.length());
        String strTemp = str.trim();
        System.out.println("Length except front and end spaces : " + strTemp.length());

    }
}