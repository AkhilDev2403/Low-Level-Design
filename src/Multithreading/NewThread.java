package Multithreading;

public class NewThread extends Thread {

    private String threadName;

    public NewThread(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + threadName);
    }
}
