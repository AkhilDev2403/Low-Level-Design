package SOLID.BirdV5;

public abstract class BirdV5 {

    void eat(){
        System.out.println("Eating");
    }

    abstract void makeSound();

    /**
     *
     *
     *   solution.1 for problem.4
     *
     *   Create separate classes....
     *   and implement this method and call this method.
     *   creating classes FlyHigh and FlyLow
     *
     *   Not resolved..
     *   it's tightly coupled..
     *   we shouldn't depend on concrete classes.
     *   we should depend on abstract
     *
     *
     *   Proper solution for problem.4
     *      <<interfaces>>
     *
     *          when we create the interface FlyingBehaviour and
     *             we don't need to create this tightly coupled classes.
     *      *          just create an interface - it's a common behaviour
     *      *          interface - FlyingBehaviour
     *      *          and those classes FlyHigh and FlyLow will implement this interface and it's method makeFly()
     *
     *
     *      THE ADVANTAGE in here is
     *      when it's tightly coupled we had to change many places.
     *      but we can do this right ?
     *      FlyingBehaviour fh = new FlyHigh();   // the only place to change is here at the object.. new FlyHigh or new FlyLow()
     *      parent ref points to child obj
     *
     *      the only place to make change is the object this is how phone pe changed from YES Bank to ICICI within short time span
     *
    **/
}
