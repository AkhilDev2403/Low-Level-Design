package GenericMethods;

public class GenericStaticMethods<A, S> {

//    public static void doSomething(){
//        System.out.println("Hello World");
//    }



//    public static void doSomething2(A val1, S val2){
//        System.out.println(val1);
//    }
//    A ans S will not be available here that's why we create dynamic datatype for static fun only'


    public static <T> void doSomething(T val){
        System.out.println(val);
    }



//    to return a value
    public static <T> T doSomethingElse(T val){
        System.out.println(val);
        return val;
    }




}
