package Multithreading;

class SharedResource {
    private int value;
    private boolean hasValue = false;

    // Method to produce a value
    public synchronized void produce(int value) {
        while (hasValue) {
            try {
                wait();  // Wait if there's already a value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        hasValue = true;
        System.out.println("Produced: " + value);
        notify();  // Notify the Consumer that a value is produced
    }

    // Method to consume a value
    public synchronized int consume() {
        while (!hasValue) {
            try {
                wait();  // Wait if there's no value to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasValue = false;
        System.out.println("Consumed: " + value);
        notify();  // Notify the Producer that the value has been consumed
        return value;
    }
}

class Producer implements Runnable {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
            try {
                Thread.sleep(500);  // Simulate time taken to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
            try {
                Thread.sleep(1000);  // Simulate time taken to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource), "ProducerThread");
        Thread consumerThread = new Thread(new Consumer(resource), "ConsumerThread");

        producerThread.start();
        consumerThread.start();
    }

}

