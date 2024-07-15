package SOLID.BirdV1;

public class Eagle extends BirdV1{

    void eat(){
        System.out.println("eating...");
    }

    @Override
    void fly() {

    }

    @Override
    void makeSound() {

    }


//    Since we make the class as abstract  we must implement it's methods
//    we can have abstract and non abstract methods in the abstract class
//    if a method is declared as abstract we must implement its definition/body on the extending class
}
