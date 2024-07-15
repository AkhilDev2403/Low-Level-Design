package SOLID.BirdV2;

import SOLID.BirdV1.BirdV1;

public class Penguin extends NonFlyingBird {


    @Override
    void makeSound() {

    }

    /**
     *
     * Now the necessary classes will extend the necessary abstract classes and implement the method.
     * So now penguin doesn't need fly(). so it won't extend the flyable. it will extend the non flyable class
     *  and won't implement anything.
     *  it will only care about the makeSound()
     * ***/
}
