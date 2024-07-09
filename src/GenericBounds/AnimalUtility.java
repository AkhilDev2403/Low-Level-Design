package GenericBounds;

import java.util.List;

public class AnimalUtility {

    public static void printAnimalName(List<Animal> animal) {
        for (Animal a : animal) {
            System.out.println(a.name);
        }
    }


    // Generic Method with UpperBound on Animal Class
    public static <T extends Animal> List<T> printAnimalsNameWithGeneric(List<T> animals){

//        animals.add(new Animal("elephant")); you can't add anything but a null here
//        animals.add(null);

        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
        return animals;

    }

//    if we don't want to return anything you can write this method as this'

    public static void printAnimalsNameWithGeneric2(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
    }
}
