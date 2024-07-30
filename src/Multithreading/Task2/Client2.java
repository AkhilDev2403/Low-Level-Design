package Multithreading.Task2;

import java.util.concurrent.*;

public class Client2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Integer> res = es.submit(new FactorialUsingCallable(1));
        System.out.println(res);
        int finalRes = res.get();
        System.out.println("The result of the factorial calculation for the number is : " +  finalRes);

    }
}
