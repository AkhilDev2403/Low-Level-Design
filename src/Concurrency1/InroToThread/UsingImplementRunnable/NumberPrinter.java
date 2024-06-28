package Concurrency1.InroToThread.UsingImplementRunnable;

public class NumberPrinter implements Runnable{

    public int number;

    NumberPrinter(int number){
        this.number = number;
    }

    @Override
    public void run() {
//                try {
//            Thread.sleep(20000);             sleep causes the current thread to suspend execution for a specified period
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(this.number + " " + Thread.currentThread().getName());
    }
}
