/**
 * @question: Write a program to create a user defined exception named PayOutOfBoundsException (provided the monthly salary of a person is less than Rs. 10,000 /-) and fire the exception.
 * @author: Nirmalya Dhara
 * @date: 26.11.2023
 */
package assignment07Classes;

class PayOutOfBoundsException extends Exception {
    public PayOutOfBoundsException(String str) {
        super(str);
    }
}

public class Solution06 {

    public static void main(String[] args) {
        int salary = Integer.parseInt(args[0]);
        try {
            if (salary <= 10_000) {
                throw new PayOutOfBoundsException("PayOutOfBoundsException");
            }
        } catch (PayOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}