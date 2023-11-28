/**
 * @question: Write a program to read lines from a text input file and print them as words over console.
 * @author: Nirmalya Dhara
 * @date: 26.11.2023
 */
package assignment08Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Solution04
 */
public class Solution04 {

    public static void main(String[] args) {
        try {
            File file = new File("./InputTextFile/solution04Input.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String string = scanner.next();
                System.out.println(string);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}