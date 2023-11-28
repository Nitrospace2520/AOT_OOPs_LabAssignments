/**
 * @question: Write a program to do the following:
 *            (i) To display the question “Who is the inventor of Java”?
 *            (ii) To accept an answer.
 *            (iii) To print “Good” and then stop, if the answer is correct.
 *            (iv) To print “Try Again”, if the answer is wrong.
 *            (v) To display the correct answer when the answer is wrong even at
 *            the third attempt and stop.
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

import java.util.Scanner;

/**
 * Solution15
 */
public class Solution15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventer = "James Gosling";
        boolean flag = true;
        System.out.println("Who is the founder of JAVA?");
        for (int i = 0, choice = 3; i < choice; i++) {
            String answer = scanner.nextLine();
            if (inventer.equalsIgnoreCase(answer)) {
                flag = false;
                System.out.println("Good");
                break;
            }
            if (i < choice - 1)
                System.out.println("Try Again");
        }
        if (flag) {
            System.out.println("The founder's name is : " + inventer);
        }
        scanner.close();
    }
}