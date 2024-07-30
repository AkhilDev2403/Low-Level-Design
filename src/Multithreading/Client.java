package Multithreading;

public class Client {
    public static void main(String[] args) {

        NewThread t1 = new NewThread("I am the first thread");
//        t1.start();

//        NewThread t2 = new NewThread("I am the second thread");
//        t2.start();



        for (int i = 0; i < 10; i++) {
            NewThread t2 = new NewThread("I am the second thread");
//            t2.start();
        }

        /**
        output
        Thread-3 I am the second thread
        Thread-1 I am the second thread
        Thread-4 I am the second thread
        Thread-2 I am the second thread
        Thread-5 I am the second thread
        Thread-6 I am the second thread
        Thread-7 I am the second thread
          Thread-0 I am the first thread
        Thread-8 I am the second thread
        Thread-9 I am the second thread
        Thread-10 I am the second thread
         **/


        MyThead m1 = new MyThead();
        Thread t3 = new Thread(m1);
//        t3.start();


        Thread t4 = new Thread(new MyThead());
//        t4.start();


//        for (int i = 0; i < 10; i++) {
//            Thread t4 = new Thread(new MyThead());
//            t4.start();
//        }




//        Multithreading via Anonymous class

//        method.1
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Thread t5 = new Thread(new MyThead());
//                    t5.start();
                }
            }
        };
//        r.run();

//        method.2
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am the implemented thread.." + Thread.currentThread().getName());
            }
        };

        for (int i = 0; i < 10; i++) {
            Thread t6 = new Thread(r1);
//            t6.start();
        }

//        Runnable via lambda expression

        Runnable r3 = () -> {
            System.out.println("I am the second thread.." + Thread.currentThread().getName());
        };



        Runnable r4 = () -> System.out.println("I am the lambda thread.." + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            Thread t7 = new Thread(r4);
//            t7.start();
        }

//        because inside the Thread class we expecting a Runnable run(). so we can write lambda exp
//        r3 is Runnable
        Thread t8 = new Thread(r3);

//        example 2

        MyThead m2 = new MyThead();
        Thread t9 = new Thread(m2);
        t9.start();

//        so we can write this as
        Thread t10 = new Thread(() -> {
            System.out.println("I am the second thread.." + Thread.currentThread().getName());
        });
//        t10.start();


        Thread t11 = new Thread(() -> System.out.println("I am the lambda thread of Thread class.." + Thread.currentThread().getName()));
//        t11.start();


    }
}
