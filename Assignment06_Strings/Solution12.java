/**
 * @question: Given a string of even length, return the first half. So the string "CatDog" yields "Cat". If the
string length is an odd number then return null.
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment06Classes;

/**
 * Solution04
 */
public class Solution12 {

    public static void main(String[] args) {
        String str = args[0];
        if (str.length() % 2 != 0) {
            System.out.println("NULL");
            return;
        }
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                break;
            } else {
                temp += "" + str.charAt(i);
            }
        }
        System.out.println(temp);
    }
}