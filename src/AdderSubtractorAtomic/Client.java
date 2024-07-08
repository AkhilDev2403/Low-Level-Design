package AdderSubtractorAtomic;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value v = new Value();
        Adder a = new Adder(v);
        Subtractor s = new Subtractor(v);

//        ExecutorService es = Executors.newFixedThreadPool(2);
        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> futureAdder = es.submit(a);
        Future<Void> futureSubtractor = es.submit(s);

        futureAdder.get();
//        futureSubtractor.get();

        System.out.println(v.value);
    }
}
