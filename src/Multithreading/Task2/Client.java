package Multithreading.Task2;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {

//        method1
//        simply calculate factorial using a thread

//        Thread t1 = new Thread(new FactorialOfNumbers(5));
//        t1.start();


//        method 2
//        List<Integer> list = Arrays.asList(5, 7, 10);
//        for(Integer i : list){
//            Thread t2 = new Thread(new FactorialOfNumbers(i));
//            t2.start();
//        }

//        actual solution
//        For each factorial calculation, do not wait for more than 2 seconds.

        List<Integer> list1 = Arrays.asList(5, 8, 10, 1, 25, 35, 9);
        for(Integer nums : list1){
            Thread t3 = new FactorialOfNumbers(nums);
            t3.start();

            try {
                t3.join(2000);    // Wait for the thread to finish with a timeout of 2 seconds

                if(t3.isAlive()){
                    System.out.println("Factorial of " + nums + " took too long.");
                }

            } catch (InterruptedException e){
                System.out.println("Thread interrupted while computing factorial of " + nums);
            }
        }


    }
}
