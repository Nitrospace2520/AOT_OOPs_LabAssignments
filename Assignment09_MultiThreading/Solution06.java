/**
 * @question: Write a program to use join() and isAlive() in
 *            Multi-Threading.Inter thread communication :Consumer consumes item
 *            produced
 *            by Producer with proper synchronization.
 * @author: Nirmalya Dhara
 * @date: 29/11/2023
 */
package assignment09Classes;

class SharedResource {
    private int item;
    private boolean itemProduced;

    public synchronized void produce(int value) {
        while (itemProduced) {
            try {
                wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
        item = value;
        System.out.println("Producer produced: " + item);
        itemProduced = true;
        notify();
    }

    public synchronized int consume() {
        while (!itemProduced) {
            try {
                wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumer consumed: " + item);
        itemProduced = false;
        notify();
        return item;
    }
}

class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedResource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedResource.consume();
        }
    }
}

/**
 * Solution06
 */
public class Solution06 {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producerThread = new Thread(new Producer(sharedResource), "producer");
        Thread consumerThread = new Thread(new Consumer(sharedResource), "consumer");
        producerThread.start();
        consumerThread.start();
        try {
            producerThread.join();
            consumerThread.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}