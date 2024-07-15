package SOLID.BirdV4;

public abstract class BirdV4 {

    void eat(){
        System.out.println("Eating");
    }

    abstract void makeSound();

    /**
     *
     *
     *
     *   Proper solution for problem.4
     *      <<interfaces>>
     *
     *          we don't need to create this tightly coupled classes.
     *          just create an interface - it's a common behaviour
     *          interface - FlyingBehaviour
     *          and those classes FlyHigh and FlyLow will implement this interface and it's method makeFly()
     *
    **/
}
