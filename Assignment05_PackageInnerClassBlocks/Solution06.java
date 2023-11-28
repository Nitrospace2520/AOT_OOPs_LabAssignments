/**
 * @question: Create a class which contains an inner class. Show that inner
 *            class can use member of outer
 *            class directly, but Outer class can use member of Inner class only
 *            through its object. Check
 *            the name of class file, you created.
 * @author: Nirmalya Dhara
 * @date: 24 Nov, 2023
 */
package assignment05Classes;

/**
 * Solution06
 */
public class Solution06 {

    String username = "Bruce Wayne";
    String password = "ImBatman";

    public class InnerSolution06 {
        String message = "IamDark";
        String quoate = "IamVengance";

        public void getDetails() {
            System.out.println("username : " + username + ", password: " + password + ", message: " + message
                    + ", quatotion: " + quoate);
        }
    }

    public static void main(String[] args) {
        // InnerSolution06 innerClassobj = new InnerSolution06(); //! Error
        Solution06.InnerSolution06 innerClassobj = new Solution06().new InnerSolution06();
        System.out.println(innerClassobj.message);
        innerClassobj.getDetails();
        // * Approach: 01
        new Solution06().new InnerSolution06().getDetails();
    }
}