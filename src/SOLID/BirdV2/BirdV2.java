package SOLID.BirdV2;

public abstract class BirdV2 {

    void eat(){
        System.out.println("Eating");
    }

    abstract void makeSound();

    /**
     *
     * we just removed the fly() and make it flying and non-flying classes and there we declaring the methods
     * making the Bird class as abstract.
     *
     * problem. 3
     *
     * what if we had to do swim and non-swim
     *                      dance and non-dance and so on...... ?????
     *
     *
     *   Solution - 2
     *   instead of having abstract classes make Interfaces........
     *
    **/
}
