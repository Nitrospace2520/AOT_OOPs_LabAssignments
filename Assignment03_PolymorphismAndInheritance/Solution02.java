/**
 * @question: Write a java program to overload three methods named with addition() having different parameters.
 * @author: Nirmalya Dhara
 * @date: 22 Nov, 2023
 */
package assignment03Classes;

public class Solution02 {
    public static int addition(int n1) {
        return n1;
    }

    public static int addition(int n1, int n2) {
        return n1 + n2;
    }

    public static int addition(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static int addition(int... nums) {
        int sum = 0;
        for (int n : nums)
            sum += n;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addition());
        System.out.println(addition(10));
        System.out.println(addition(10, 20));
        System.out.println(addition(10, 20, 30));
        System.out.println(addition(10, 20, 30, 40));
    }
}
