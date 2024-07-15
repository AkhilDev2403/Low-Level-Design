package SOLID.BirdV5;

public class Crow extends BirdV5 implements Flyable {

//    FlyLow fl = new FlyLow();
    FlyingBehaviour behaviour = new FlyHigh();

    @Override
    public void fly() {
        behaviour.makeFly();
    }

//    or you can do in another way see Eagle class


    @Override
    void makeSound() {

    }


    /***
     *
     * we can create objects for the classes and call the necessary methods
     * */


}
