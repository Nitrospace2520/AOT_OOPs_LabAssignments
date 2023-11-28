/**
 * @question: Write a program that takes one string and two integers as command
 *            line argument and prints
 *            the reverse of the substring of the string specified by the two
 *            numbers. The program should
 *            handle all possible exception that may arise due to bad input.
 * @author: Nirmalya Dhara
 * @date: 26.11.2023
 */
package assignment07Classes;

import java.nio.ShortBuffer;

class CustomException extends Exception {
    public CustomException(String str) {
        super(str);
    }
}

/**
 * Solution08
 */
public class Solution08 {

    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                throw new CustomException("Argument length not matched must be 3");
            }
            String str = args[0];
            int i1 = Integer.parseInt(args[1]);
            int i2 = Integer.parseInt(args[2]);
            String subString = (i1 < i2) ? str.substring(i1, i2) : str.substring(i2, i1);
            StringBuffer sb = new StringBuffer(subString);
            sb.reverse();
            subString = new String(sb);
            System.out.println(subString);
        } catch (CustomException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}