/**
 * @question: Define an object reference and initialize it to null. Try to call
 *            a method through this
 *            reference. Now wrap the code in a try-catch clause to catch the
 *            exception.
 * @author: Nirmalya Dhara
 * @date: 26 Nov, 2023
 */
package assignment07Classes;

public class Solution04 {
    public static void main(String[] args) {
        String str = null;
        try {
            // str.hashCode();
            System.out.println(str.getClass());
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}