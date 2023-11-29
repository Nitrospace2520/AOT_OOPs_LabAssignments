/**
 * @quesiton: Make several threads (say 5) with names (by extending thread), set
 *            their priority and run them to see what happens
 * @author: Nirmalya Dhara
 * @date: 29.11.2023
 */
package assignment09Classes;

class CustomThread extends Thread {
    public CustomThread(String str) {
        super(str);
        System.out.println("Thread created: " + str);
    }

    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", iteration: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread finished: " + Thread.currentThread().getName());
    }
}

public class Solution03 {

    public static void main(String[] args) {
        CustomThread customThread1 = new CustomThread("CustomThread:1");
        CustomThread customThread2 = new CustomThread("CustomThread:2");
        CustomThread customThread3 = new CustomThread("CustomThread:3");
        CustomThread customThread4 = new CustomThread("CustomThread:4");
        CustomThread customThread5 = new CustomThread("CustomThread:5");
        customThread1.setPriority(Thread.MIN_PRIORITY);
        customThread2.setPriority(3);
        customThread3.setPriority(Thread.NORM_PRIORITY);
        customThread4.setPriority(7);
        customThread5.setPriority(Thread.MAX_PRIORITY);

        customThread1.start();
        customThread2.start();
        customThread3.start();
        customThread4.start();
        customThread5.start();

    }
}