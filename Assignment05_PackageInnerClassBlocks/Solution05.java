/**
 * @question: Show that static block is executed at the time of class loading
 *            and also the order of execution
 *            of these blocks (for multiple blocks/ inherited block).
 * @author: Nirmalya Dhara
 * @date: 24 Nov, 2023
 */
package assignment05Classes;

/**
 * InnerSolution05
 */
class InnerSolution05 {
    static {
        System.out.println("Parent Class Static Block: 01");
    }

    InnerSolution05() {
        System.out.println("Parent Class Constractor");
    }

    {
        System.out.println("Parent Class Instance Block: 01");
    }

    static {
        System.out.println("Parent Class Static Block: 02");
    }
    {
        System.out.println("Parent Class Instance Block: 02");
    }
}

/**
 * Solution05
 */
public class Solution05 extends InnerSolution05 {

    static {
        System.out.println("Child class Static Block: 01");
    }

    Solution05() {
        System.out.println("Child Class Constractor");
    }

    {
        System.out.println("Child Class Instance Block: 01");
    }

    public static void main(String[] args) {
        Solution05 solution05Object1 = new Solution05();
        // Solution05 solution05Object2 = new Solution05();

    }

    static {
        System.out.println("Child Class Static Block: 02");
    }
    {
        System.out.println("Child Class Instance Block: 02");
    }
}