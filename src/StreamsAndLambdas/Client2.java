package StreamsAndLambdas;

import java.util.Comparator;

public class Client2 {
    public static void main(String[] args) {


//         way.1 Normally how you do. Create class implement Comparator<> and it's fun() i.e compare)'

//               way 2. Anonymous class
//        Runnable r1 = new Runnable(){
//            @Override
//            public void run() {
//                System.out.println("Running Runnable");
//            }
//
//            public void test(){
//                System.out.println("Running Test");
//            }
//        };
//        what we saw in the anonymous class you can do this with lambda as well.

//        way. 3 using lambda expression
        Runnable r1 = () -> {
            System.out.println("Running Runnable");
        };
        Thread t1 = new Thread(r1);
//        t1.start();

//        r1 acts as lambda object. you don't have to instantiate'




//        2. comparator
        Comparator<Integer> cmp = (a, b) -> {
             return a-b;
        };


//       3. Runnable - run() mapped to lambda expression here
        Thread t3 = new Thread(() -> {
            System.out.println("Running Thread");
        });
        t3.start();

//        3.a. you can write this manner as well don't have to specify {} if u have a single line
        Thread t4 = new Thread(() -> System.out.println("Running Comparator"));
        t4.start();

    }
}
