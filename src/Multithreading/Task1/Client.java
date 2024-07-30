package Multithreading.Task1;

public class Client {
    public static void main(String[] args) {

//     1.   simple way
        for (int i = 0; i < 100; i++) {
            Thread t1 = new Thread(new PrintNumbers(i));
//            t1.start();
        }


//     2.   using lambda exp
        Runnable r1 = () -> {
            for (int i = 0; i < 100; i++) {
                Thread t2 = new Thread(new PrintNumbers(i));
//                t2.start();
            }
        };
        r1.run();



//        method.3 we don't need the extra class -> PrintNumbers
//        If you want to run the r2 task in parallel, use new
//        If you call r2.run(), the task runs in the current thread, which may not be what you intend.
        Runnable r2 = () -> {
            for (int i = 0; i < 100; i++) {
                Thread t3 = new Thread(() -> System.out.println("printing : "  + Thread.currentThread().getName()));
//                t3.start();
            }
        };
//       r2.run();
        new Thread(r2).start();



//        method.4  very easy way of lambda exp no need for extra class or Runnable
        for (int i = 0; i < 100; i++) {
            int num = i;
            Thread t4 = new Thread(() -> System.out.println("printing : " + num  + " from " + Thread.currentThread().getName()));
            t4.start();
        }


    }
}
