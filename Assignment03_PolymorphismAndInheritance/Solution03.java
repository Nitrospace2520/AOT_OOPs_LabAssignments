/**
 * @question: Write a java program to overload the constructor named with
 *            Addition() having different parameters.
 * @author: Nirmalya Dhara
 * @date: 22 Nov, 2023
 */
package assignment03Classes;

import java.util.ArrayList;

class Addition {
    private ArrayList<Integer> nums = new ArrayList<>();

    public Addition() {
    }

    public Addition(int n1) {
        nums.add(n1);
    }

    public Addition(int n1, int n2) {
        nums.add(n1);
        nums.add(n2);
    }

    public Addition(int... ns) {
        for (int n : ns) {
            nums.add(n);
        }
    }

    public int getAddition() {
        int sum = 0;
        for (Integer n : nums) {
            sum += n;
        }
        return sum;
    }

    public String toString() {
        return "" + this.getAddition();
    }
}

public class Solution03 {
    public static void main(String[] args) {
        Addition addition1 = new Addition();
        Addition addition2 = new Addition(1);
        Addition addition3 = new Addition(1, 2);
        Addition addition4 = new Addition(1, 2, 3);
        Addition addition5 = new Addition(1, 2, 3, 4);
        System.out.println(addition1);
        System.out.println(addition2);
        System.out.println(addition3);
        System.out.println(addition4);
        System.out.println(addition5);
    }
}
