package SOLID.BirdV0;

public class BirdV0 {
    String type;
    String name;
    //ALL THE ATTRIBUTES

    void  fly(){
        if(type.equals("Sparrow")){
            //something done here
        }
        else if(type.equals("Eagle")){
            //something done here
        }
    }

    void makeSound(){
        if(type.equals("Sparrow")){
            //do something here
        }
        else if(type.equals("Eagle")){

        }
    }


    /**
     *
     * VIOLATION 0
     *
     *  Single class have more than one responsibility  - S (Single Responsibility problem)
     *
     *
     *  to solve this -> created inheritance and make the methods abstract and extend those methods
     *  make the class abstract
     * */
}
