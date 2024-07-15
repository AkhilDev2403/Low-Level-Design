package SOLID.BirdV3;

public class Pigeon extends BirdV3 implements Flyable {

    @Override
    public void fly() {
        System.out.println("Pigeon flying");
    }

    @Override
    void makeSound() {

    }
}
