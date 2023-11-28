/**
 * @question: Write a program to save the sentences to a file you type using
 *            keyboard on a
 *            console until you put ‘eof’ marker (say ‘q’).
 * @author: Nirmalya Dhara
 * @date: 26.11.2023
 */
package assignment08Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Solution02
 */
public class Solution02 {

    public static void main(String[] args) {
        try {
            File file = new File("./InputTextFile/solution02Output.txt");
            FileWriter fileWriter = new FileWriter(file);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String inputString = scanner.nextLine();
                if (inputString.equals("q")) {
                    break;
                }
                fileWriter.write(inputString);
                fileWriter.write('\n');
            }
            fileWriter.flush();
            fileWriter.close();
            scanner.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}