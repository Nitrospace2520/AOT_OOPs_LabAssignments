/**
 * @question: Make several threads (say 5) with their names (implementing
 *            Runnable) set their priority and run them to see what happens
 * @author: Nirmalya Dhara
 * @date: 29/11/2023
 */
package assignment09Classes;

class CustomThread implements Runnable {
    public CustomThread() {
        System.out.println("Thread Created: " + Thread.currentThread().getName());
    }

    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + " started!");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " iteration: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + " finished!");
    }
}

public class Solution04 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new CustomThread(), "CustomThread:1");
        Thread thread2 = new Thread(new CustomThread(), "CustomThread:2");
        Thread thread3 = new Thread(new CustomThread(), "CustomThread:3");
        Thread thread4 = new Thread(new CustomThread(), "CustomThread:4");
        Thread thread5 = new Thread(new CustomThread(), "CustomThread:5");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(3);
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread4.setPriority(7);
        thread5.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}