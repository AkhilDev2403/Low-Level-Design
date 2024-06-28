package Concurrency1.InroToThread.UsingExtendingThread;

import Concurrency1.InroToThread.UsingImplementRunnable.HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
//        HelloWorldPrinter h = new HelloWorldPrinter();
//        Thread thread = new Thread(h);
//        thread.start();

        HelloWorldPrinter h = new HelloWorldPrinter();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(h);
            t.start();
        }
    }
}
