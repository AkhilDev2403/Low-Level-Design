package Multithreading.Task2;

import java.util.concurrent.Callable;

public class FactorialUsingCallable implements Callable<Integer> {

    int number;

    public FactorialUsingCallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        return factorial(this.number);
    }

    public int factorial(int number) {
        if(number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
