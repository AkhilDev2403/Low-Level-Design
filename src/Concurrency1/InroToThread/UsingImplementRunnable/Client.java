package Concurrency1.InroToThread.UsingImplementRunnable;

import Concurrency1.InroToThread.UsingExtendingThread.HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {

//        1
//        HelloWorldPrinter h1 = new HelloWorldPrinter();
//        Thread t1 = new Thread(h1);
//        h1.run();       // Hello World main
//        t1.start();     // Hello World Thread-0

/**        printing from 1 to 100, order of execution is not parallel because of context switching  **/

//        HelloWorldPrinter h = new HelloWorldPrinter();
//        for (int i = 0; i < 100; i++) {
//            Thread t = new Thread(h);
//            t.start();
//        }

//        2.
//        for (int i = 0; i < 1000000; i++) {
//            NumberPrinter obj = new NumberPrinter(i);
//            Thread thread = new Thread(obj);             // this is the one way that you can call threads
//            thread.start();
//        }

        /* 2. Another way you can the thread is
        * Both class and Thread class are implementing the same interface Runnable
        * we can use this   **/

        Thread t = new HelloWorldPrinter();
        t.start();


/**      Implementing Runnable vs Extending Thread Class
        Since you can inherit only 1 class, scope of extension is not there in 2nd Case
        Thread is also using runnable. **/
    }
}
