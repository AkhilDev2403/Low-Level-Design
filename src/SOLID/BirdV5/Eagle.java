package SOLID.BirdV5;

public class Eagle extends BirdV5 implements Flyable {

//    FlyHigh fh = new FlyHigh();
    private FlyingBehaviour behaviour;

    Eagle(FlyingBehaviour behaviour){
        this.behaviour = behaviour;
    }

    @Override
    public void fly() {
        behaviour.makeFly();
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
