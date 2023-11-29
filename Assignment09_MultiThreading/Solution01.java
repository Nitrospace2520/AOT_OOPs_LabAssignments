/**
 * @question: Inherit a class from Thread and override the run( ) method. Inside
 *            run( ), print name of thread , and then call sleep( ). Repeat this
 *            three times, then return from run( ). Put a start-up message in
 *            the constructor. Make your thread object and main thread run to
 *            see
 *            what happens.
 * @author: Nirmalya Dhara
 * @date: 28/11/2023
 */
package assignment09Classes;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Child Thread name: " + getName() + " started!");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Child Thread: name " + getName() + ", iteration: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Child Thread name: " + getName() + " finished!");
    }
}

/**
 * Solution01
 */
public class Solution01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("Custom Thread - 1");
        myThread.start();

        System.out.println("Main thread started!");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Main Thread, iteration: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Main thread finished");
    }
}