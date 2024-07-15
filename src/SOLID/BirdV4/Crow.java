package SOLID.BirdV4;

public class Crow extends BirdV4 implements Flyable {

    FlyLow fl = new FlyLow();


    @Override
    public void fly() {
        fl.flyLow();
    }


    @Override
    void makeSound() {

    }


    /***
     *
     * we can create objects for the classes and call the necessary methods
     * */


}
