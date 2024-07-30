package Multithreading.Task2;


/***
 *
 * problem:
 *
 * Write a program that computes Factorial of a list of numbers. Each factorial should be
 * computed on a separate thread. For each factorial calculation, do not wait for more
 * than 2 seconds. Hint: Use the join() method on each factorial thread, before main
 * starts executing again.
 *
 *
 * *****/

public class FactorialOfNumbers extends Thread implements Runnable {
    int number;

    public FactorialOfNumbers(int number) {
        this.number = number;
    }


    @Override
    public void run() {
        System.out.println("Using Thread " + Thread.currentThread().getName() +   " Factorial of " + number + " is " + factorial(number));
    }

    public int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
