package SOLID.BirdV5;

public class Vulture extends BirdV5 implements Flyable{

    FlyingBehaviour fh = new FlyHigh();   // the only place to change is here at the object.. new FlyHigh or new FlyLow()

    @Override
    public void fly() {
        fh.makeFly();
    }


    @Override
    void makeSound() {

    }
}
