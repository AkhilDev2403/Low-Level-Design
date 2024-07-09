package GenericMethods;

public class Client {
    public static void main(String[] args) {
//        GenericStaticMethods gm = new GenericStaticMethods();
//        gm.doSomething();
//        you can't call this fun bcz it's static. static methods are called before the object creation;

//        GenericStaticMethods.doSomething();

//        we make the doSomething as Generic type. now it can accept any datatype. it will get called before the object creation

        GenericStaticMethods.doSomething("51");
        GenericStaticMethods.doSomething(2534);
        GenericStaticMethods.doSomething("AKhil Dev");

        GenericStaticMethods.doSomethingElse("SNeha");
    }
}
