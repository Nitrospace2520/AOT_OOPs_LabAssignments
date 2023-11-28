/**
 * @question: Generate password from initials of one’s first_name, middle_name,
 *            last_name and with the
 *            last four digits of your roll_no.(if the middle name is not
 *            present, it won't come).
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution09
 */
public class Solution09 {

    public static void main(String[] args) {
        String firstLetter = "" + args[0].toUpperCase().charAt(0);
        String middleLetter = args.length >= 4 ? ("" + args[1].toUpperCase().charAt(0)) : "";
        String lastLetter = "" + args[(args.length >= 4 ? 2 : 1)].toUpperCase().charAt(0);
        String roll = String.valueOf((Integer.parseInt(args[(args.length >= 4 ? 3 : 2)])) % 10000);
        System.out.println("Password : " + firstLetter + middleLetter + lastLetter + roll);
    }
}