package SOLID.BirdV4;

public class Eagle extends BirdV4 implements Flyable {

    FlyHigh fh = new FlyHigh();

    @Override
    public void fly() {
        fh.flyHigh();
    }

    @Override
    void makeSound() {

    }


    /**
     *
     * Now the problem here is Eagle class tightly coupled with FlyHigh.
     *
     * ***/
}
