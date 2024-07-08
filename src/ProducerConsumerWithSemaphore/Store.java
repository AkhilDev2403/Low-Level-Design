package ProducerConsumerWithSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {

    private int storeMaxSize;
//    private List<Object> items;
    private ConcurrentLinkedQueue<Object> items;

    Store(int storeMaxSize) {
        this.storeMaxSize = storeMaxSize;
        this.items = new ConcurrentLinkedQueue<>();
    }

    public int getStoreMaxSize() {
        return storeMaxSize;
    }

    public ConcurrentLinkedQueue<Object> getItems(){
        return items;
    }

    public void addItem(){
        System.out.println("Producer production time, current size " + this.items.size());
        this.items.add(new Object());
    }

    public void removeItem(){
        System.out.println("Consumer consume time, current size " + this.items.size());
//        instead of this
//       this.items.remove(this.items.size()-1);
//        this.items.removeLast();

//        use this
        this.items.remove();
    }
}
