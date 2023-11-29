/**
 * @quesiton: Implement program of locking of common method by several threads.
 *            (Using the keyword ‘synchronized’).
 * @author: Nirmalya Dhara
 * @date: 29/11/2023
 */
package assignment09Classes;

class Counter {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
        System.out.println("Increment 1 by " + Thread.currentThread().getName());
    }

    public int getCounter() {
        return this.counter;
    }
}

class CustomThread implements Runnable {
    private Counter counterVal;

    public CustomThread(Counter counterVal) {
        this.counterVal = counterVal;
    }

    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());
        for (int i = 1; i <= 9; i++) {
            counterVal.increment();
        }
        System.out.println("Thread finished: " + Thread.currentThread().getName());
    }
}

/**
 * Solution05
 */
public class Solution05 {

    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new CustomThread(counter), "CustomThread:1");
        Thread thread2 = new Thread(new CustomThread(counter), "CustomThread:2");
        thread2.setPriority(10);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Counter Value : " + counter.getCounter());
    }
}