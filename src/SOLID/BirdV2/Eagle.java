package SOLID.BirdV2;

import SOLID.BirdV1.BirdV1;

public class Eagle extends FlyingBird {

    void eat(){
        System.out.println("eating...");
    }

    @Override
    void fly() {
        System.out.println("flying...");
    }

    @Override
    void makeSound() {

    }


    /**
     *
     * Now the necessary classes will extend the necessary abstract classes and implement the method.
     *
     * ***/
}
