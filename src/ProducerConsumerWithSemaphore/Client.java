package ProducerConsumerWithSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {

        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        ExecutorService executor = Executors.newCachedThreadPool();

        Store store = new Store(5);

        for (int i = 0; i < 8; i++) {
            executor.execute(new Producer(store, producerSemaphore, consumerSemaphore));
        }

        for (int i = 0; i < 10; i++) {
            executor.execute(new Consumer(store, producerSemaphore, consumerSemaphore));
        }
    }
}
