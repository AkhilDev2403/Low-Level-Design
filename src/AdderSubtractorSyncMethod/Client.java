package AdderSubtractorSyncMethod;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {

//        solution.3 Synchronized method

        Value value = new Value();
        Adder a = new Adder(value);
        Subtracter s = new Subtracter(value);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> futureAdder = es.submit(a);
        Future<Void> futureSubtracter = es.submit(s);

        System.out.println(value.value);

    }
}
