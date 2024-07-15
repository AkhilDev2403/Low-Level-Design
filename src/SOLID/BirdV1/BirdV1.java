package SOLID.BirdV1;

public abstract class BirdV1 {

    void eat(){
        System.out.println("Eating....");
    }

    abstract void fly();
    abstract void makeSound();


    /*

    Solution 1 for V0

     * Since we make the class as abstract  we must implement it's methods
       we can have abstract and non abstract methods in the abstract class
       if a method is declared as abstract we must implement its definition/body on the extending class
     *
    **/

    /**
     *
     * Violation. 2    L - Liskov's substitution principle
     *
     *  if we do this, penguin doesn't have this fly().
     *  Penguin doesn't fly. so it shouldn't have fly method.
     *
     *  Liskov's : You should not even have this method fly() in Penguin class
     *
     *
     *
     *
     * Solution.1:
     *  we can make fly and non fly abstract classes
     * **/
}
