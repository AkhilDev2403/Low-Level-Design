package StreamsAndLambdas;

public class Client {
    public static void main(String[] args) {

//        Anonymous class - Instead of creating a separate class to implement the interface (Runnable)
//                we can directly do this here. not have to create a class and implement there.
//        you can call/derive new methods as well

//        1. Anonymous class
        Runnable r1 = new Runnable(){

            @Override
            public void run() {
                System.out.println("Running Runnable");
            }

            public void test(){
                System.out.println("Running Test");
            }
        };

        Thread t1 = new Thread(r1);
//        t1.start();

//       2.  you can also call thread class as this
        Thread t2 = new Thread(){
            @Override
            public void run() {
                System.out.println("Running Thread");
            }
        };
        t2.start();

    }
}
