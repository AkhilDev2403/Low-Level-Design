package Generics;

//public class Pair {

//    1. Normal way
//    private String first;
//    private String second;
//
//    Pair(String first, String second) {
//        this.first = first;
//        this.second = second;
//    }
//
//    public String getFirst() {
//        return first;
//    }
//
//    public String getSecond() {
//        return second;
//    }
//}

public class Pair<A, S> {
    A first;
    S second;

    Pair(A first, S second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst(){
        return first;
    }

    public S getSecond(){
        return second;
    }
}



