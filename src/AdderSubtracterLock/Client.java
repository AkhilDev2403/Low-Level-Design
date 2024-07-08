package AdderSubtracterLock;

import AdderSubtractor.Value;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        Solution . 1 -> Add lock  Mutex lock
//         simply adding a common shared lock

        Lock lock = new ReentrantLock();

        Value value = new Value();
        Adder a = new Adder(value, lock);
        Subtracter s = new Subtracter(value, lock);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> futureAdder = es.submit(a);
        Future<Void> futureSubtracter = es.submit(s);

        futureAdder.get();


        System.out.println("Final value : " + value.value);
    }
}
