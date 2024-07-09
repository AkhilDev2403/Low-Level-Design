package GenericBounds;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

//        you can't snt Lis<Dogs> to List<Animal>. Not allowed'
//        dogs.add(new Animal("Carni"));

//        this is not allowed
        dogs.add(new Dog("Sirus"));
        dogs.add(new Dog("Bob"));

        //        you can't snt Lis<Dogs> to List<Animal>. Not allowed'
//        AnimalUtility.printAnimalName(dogs);

//        List<Dog> cat = new ArrayList<>();
//        dogs.add(new Dog("Ben"));
//        cat.add(new Dog("kitty"));
//
//        AnimalUtility.printAnimalName(cat);




        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Zyrus"));
        animals.add(new Dog("Loki"));
//        AnimalUtility.printAnimalName(animals);

//   but this allowed.. List<Animal> to List<Animal>

//        How to solve this ?
//        Bounds

//        now you can call List<dogs> with list<animals>
//        anything can be accepted. it is restricted a boud. Animal and below animal class are accepted


        List<Dog> dogs1 = new ArrayList<>();
        dogs1.add(new Dog("Kyra"));
        dogs1.add(new Dog("Jane"));
        AnimalUtility.printAnimalsNameWithGeneric(dogs1);

        List<Animal> a1 = new ArrayList<>();
        a1.add(new Dog("Den"));
        a1.add(new Dog("Jack"));
//        AnimalUtility.printAnimalsNameWithGeneric(a1);


    }

}
