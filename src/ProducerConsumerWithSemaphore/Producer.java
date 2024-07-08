package ProducerConsumerWithSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }


    @Override
    public void run() {
        while(true){
            try {
                producerSemaphore.acquire();
            }
            catch (InterruptedException e){
                throw new RuntimeException();
            }
//            we don't have to check if condition. it will allow only the permitted threads'
            store.addItem();
            consumerSemaphore.release();
        }
    }
}
