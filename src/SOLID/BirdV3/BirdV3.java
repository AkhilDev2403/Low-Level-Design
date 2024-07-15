package SOLID.BirdV3;

public abstract class BirdV3 {

    void eat(){
        System.out.println("Eating");
    }

    abstract void makeSound();

    /**
     *
     *   Solution - 2
     *   instead of having abstract classes make Interfaces........
     *   Don't need flyable and non-flyable , swim and non-swim and so on... jus create and interface.
     *   why ?
     *   flying, swim, dance, .... these are common behaviours .. so for common behaviours - interfaces.
     *
     *   Flyable - interface
     *   and the necessary classes will implement or they don't
     *
     *
     *   problem . 4
     *
     *   every time we have to write the same method in many classes. if we have 1000 birds and some fly high some fly low
     *   what to do then ?
     *
     *   fly(){
     *     // fly high
     *   }
     *
     *   fly(){
     *       //fly low
     *   }
     *
     *   code redundancy.....
     *
     *   solution.1 for problem.4
     *
     *   Create separate classes....
     *   and implement this method and call this method.
     *
    **/
}
