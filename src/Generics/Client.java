package Generics;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
//        1. Normal way
//        Pair p1 = new Pair("Akhil", "Dev");
//        System.out.println(p1.getFirst());

//        2. Generic data type
//        you can use same class (Pair<A,S>) to act as different data types
//        the data type will be decided at the object/instance creation only

        Pair<String, String> p1 = new Pair<>("Akhil", "Dev");
//        System.out.println(p1.getFirst());

        Pair<Integer, Integer> p2 = new Pair<>(100, 200);
//        System.out.println(p2.getSecond());

        Pair<Double, Integer> p3 = new Pair<>(2.5, 56);
//        System.out.println(p3.getFirst());


//        3. Raw types
//        you don't havet to declare the data type when you creating the object
//        eventually this doo and bee are acting as Object type only
        Pair p4 = new Pair("doo", "bee");
//      Pair<String, String> p4 = new Pair<>("doo", "bee");
//        both are same
        System.out.println(p4.getFirst());
//        this allowed because of backward compatibility
//        Map map = new HashMap();


    }
}
