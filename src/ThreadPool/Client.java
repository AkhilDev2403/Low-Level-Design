package ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

//        Method 1 to call multithreading

//        for (int i = 0; i < 10000; i++) {
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread t = new Thread(numberPrinter);
//            t.start();
//        }


//        Method.2  Thread thread = new NumberPrinter(i);
//        you can call this only by extending the thread class.

//        for (int i = 0; i < 100000; i++) {
//            Thread thread = new NumberPrinter(i);
//            thread.start();
//        }


//         Method.3 Fixed thread pool

        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100000; i++) {
            NumberPrinter obj = new NumberPrinter(i);
            es.execute(obj);
        }


//        Method 4. newCachedThreadPool
//        ExecutorService es = Executors.newCachedThreadPool();
//        for (int i = 0; i < 1000; i++) {
//            NumberPrinter obj = new NumberPrinter(i);
//            es.execute(obj);
//        }

    }
}
