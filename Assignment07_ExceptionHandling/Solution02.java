/**
 * @question: Write a program for multiple catch to fire
 *            ArrayIndexOutOfBoundsException and
 *            StringIndexOutOfBoundsException both.
 * @author: Nirmalya Dhara
 * @date: 25 Nov, 2023
 */
package assignment07Classes;

/**
 * Solution02
 */
public class Solution02 {

    public static void main(String[] args) {
        String[] str = args[0].split(" ");
        String string = args[1];
        int index = Integer.parseInt(args[2]);
        int[] array = new int[str.length];
        int i = 0;
        for (String s : str) {
            array[i] = Integer.parseInt(s);
            i++;
        }
        try {
            System.out.println(array[index]);
            System.out.println(string.charAt(index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}