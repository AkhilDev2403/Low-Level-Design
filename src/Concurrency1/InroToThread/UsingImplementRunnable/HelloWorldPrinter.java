package Concurrency1.InroToThread.UsingImplementRunnable;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello World " + Thread.currentThread().getName());
    }
}
