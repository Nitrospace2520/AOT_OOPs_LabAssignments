/**
 * @question: Implement a class from Runnable and override the run( ) method.
 *            Inside run( ), print full qualified name of thread, and then call
 *            sleep( ). Repeat this three times, then return from run( ). Put a
 *            start-up message in the constructor. Make your thread object and
 *            main thread run to see what happens.\
 * @author: Nirmalya Dhara
 * @date: 29/11/2023
 */
package assignment09Classes;

class CustomThread implements Runnable {
    CustomThread() {
        System.out.println(Thread.currentThread().getName() + " is initialished");
    }

    public void run() {
        // Thread.currentThread().setName("First Custom Thread");
        System.out.println("Current Thread Name: " + Thread.currentThread().getName() + ", started!");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Current Thread Name: " + Thread.currentThread().getName() + ", iteration: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Current Thread Name: " + Thread.currentThread().getName() + ", ended!");
    }
}

/**
 * Solution02
 */
public class Solution02 {

    public static void main(String[] args) {
        Runnable runnable = new CustomThread();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println(Thread.currentThread().getName() + " started!");
        for (int i = 1; i <= 3; i++) {
            System.out.println("main Thread Name: " + Thread.currentThread().getName() + ", iteration: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " ended!");
    }
}
