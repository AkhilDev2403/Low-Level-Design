package Multithreading;

public class MyThead implements Runnable {

    @Override
    public void run() {
        System.out.println("  ********* " + Thread.currentThread().getName());
    }
}
