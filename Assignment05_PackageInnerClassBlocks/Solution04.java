/**
 * @question: Show that ordinary block is executed when object is created and
 *            also the order of execution
 *            of these blocks (for multiple blocks/ inherited block).
 * @author: Nirmalya Dhara
 * @date: 24 Nov, 2023
 */

package assignment05Classes;

/**
 * Solution04
 */
public class Solution04 {
    static int objectCount = 0;

    Solution04() {
        System.out.println("Object Successfully Created and initialised");
    }

    static {
        System.out.println("It's a static block");
    }
    {
        System.out.println("First Instance Block");
        objectCount++;
        System.out.println("The no. of total objects : " + Solution04.objectCount);
    }

    public static void main(String[] args) {
        Solution04 solution04Obj1 = new Solution04();
        Solution04 solution04Obj2 = new Solution04();
        Solution04 solution04Obj3 = new Solution04();

    }

    {
        System.out.println("Second Instance Block");
    }
}