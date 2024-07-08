package AdderSubtracterSyncBlock;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        solution.4 Synchronized block

        Value value = new Value();
        Adder a = new Adder(value);
        Subtracter s = new Subtracter(value);

        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<Void> futureAdder = es.submit(a);
        Future<Void> futureSubtracter = es.submit(s);

        futureAdder.get();
        futureSubtracter.get();

        System.out.println(value.value);

    }
}
