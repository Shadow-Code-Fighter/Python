import java.util.LinkedList;

class Consumer extends Thread {
    private LinkedList<Integer> queue;
    private int maxSize;

    public Consumer(LinkedList<Integer> queue, int maxSize, String name) {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    System.out.println("Queue is empty, " + Thread.currentThread().getName() + " is waiting");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int value = queue.removeFirst();
                System.out.println("Consumed value by " + Thread.currentThread().getName() + " is " + value);
                queue.notifyAll();
            }
        }
    }
}

class Producer extends Thread {
    private LinkedList<Integer> queue;
    private int maxSize;

    public Producer(LinkedList<Integer> queue, int maxSize, String name) {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        int counter = 0;
        while (true) {
            synchronized (queue) {
                while (queue.size() == maxSize) {
                    System.out.println("Queue is full, " + Thread.currentThread().getName() + " is waiting");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                queue.add(counter++);
                System.out.println("Produced value by " + Thread.currentThread().getName() + " is " + (counter - 1));
                queue.notifyAll();
            }
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        int maxSize = 5;
        Thread consumer = new Consumer(queue, maxSize, "CONSUMER");
        Thread producer = new Producer(queue, maxSize, "PRODUCER");
        consumer.start();
        producer.start();
    }
}
