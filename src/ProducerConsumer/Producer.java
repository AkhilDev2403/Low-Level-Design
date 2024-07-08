package ProducerConsumer;

public class Producer implements Runnable{

    private Store store;

    Producer(Store store) {
        this.store = store;
    }


    @Override
    public void run() {
        while(true){
            synchronized (store){
                if(store.getItems().size() < store.getStoreMaxSize()){
                    System.out.println("Cleared production check");
                    store.addItem();
                }
            }
        }
    }
}
