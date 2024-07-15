package SOLID.BirdV4;

public class Vulture extends BirdV4 implements Flyable {

    FlyHigh fh = new FlyHigh();

    @Override
    public void fly() {
       fh.flyHigh();
    }

//    @Override
//    public void fly() {
//        System.out.println("fly high");
//        //fly high
//    }

    @Override
    void makeSound() {

    }
}
