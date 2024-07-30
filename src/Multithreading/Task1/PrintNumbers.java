package Multithreading.Task1;

/***
 *
 * Problem :
 *
 * Write a program to print numbers from 1 to 100 using 100 different threads. Since you
 * can't control the order of execution of threads, it is okay to get these numbers in
 * any order.
 *
 *
 * ****/

public class PrintNumbers implements Runnable {

    private int number;

    public PrintNumbers(int number) {
        this.number = number;
    }


    @Override
    public void run() {
        System.out.println("Printing " + number + " from " +  Thread.currentThread().getName() + " ");
    }
}
