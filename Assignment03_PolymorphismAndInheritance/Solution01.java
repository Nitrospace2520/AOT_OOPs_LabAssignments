/**
 * @question: Create a class and test if method overloading holds good for
 *            return type of method or not.
 * @author: Nirmalya Dhara
 * @date: 21 Nov, 2023
 */
package assignment03Classes;

public class Solution01 {
    static public void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    /**
     * @error: method sum(int,int) is already defined in class Solution01
     */
    // public static int sum(int n1, int n2) {
    // System.out.println(n1 + n2);
    // return n1 + n2;
    // }

    public static void sum(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(10);
        sum(10, 20);
        sum(10, 20, 30);
    }
}
