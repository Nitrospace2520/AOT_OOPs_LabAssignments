/**
 * @question: Write a program to concatenate the contents of two files into
 *            third one.
 * @author: Nirmalya Dhara
 * @date: 26.11.2023
 */
package assignment08Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Solution03
 */
public class Solution03 {

    public static void main(String[] args) {
        try {
            File writeFile = new File("./InputTextFile/solution03Output.txt");
            FileWriter fileWriter = new FileWriter(writeFile);
            File readFile = new File("./InputTextFile/solution03Input1.txt");
            FileReader fileReader = new FileReader(readFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string = bufferedReader.readLine();
            while (string != null) {
                fileWriter.write(string + '\n');
                string = bufferedReader.readLine();
            }
            fileWriter.write('\n');
            fileWriter.flush();
            bufferedReader.close();
            fileReader.close();
            readFile = new File("./InputTextFile/solution03Input2.txt");
            fileReader = new FileReader(readFile);
            bufferedReader = new BufferedReader(fileReader);
            string = bufferedReader.readLine();
            while (string != null) {
                fileWriter.write(string + '\n');
                string = bufferedReader.readLine();
            }
            fileWriter.flush();
            bufferedReader.close();
            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}