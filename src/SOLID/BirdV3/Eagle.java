package SOLID.BirdV3;

public class Eagle extends BirdV3 implements Flyable {

    void eat(){
        System.out.println("eating...");
    }

    @Override
    public void fly() {                                        // in interface the method is simply void fly() methods declared in an interface are implicitly public and abstract by default. so have to mention here it is public
        System.out.println("eagle is flying high ...");
    }

    @Override
    void makeSound() {

    }


    /**
     *
     * Now the necessary classes will implement the necessary interfaces
     *
     * ***/
}
