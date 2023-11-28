/**
 * @question: Write a program to read lines from a text input file and print
 *            them over console.
 * @author: Nirmalya Dhara
 * @date: 26.11.2023
 */
package assignment08Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Solution01
 */
public class Solution01 {

    public static void main(String[] args) {
        try {
            File file = new File("./InputTextFile/solution01Input.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
            while (str != null) {
                System.out.println(str);
                str = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}