package StreamPractices;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {

//        1.
        List<Integer> l1 = List.of(3, 1, 4, 1, 5, 9, 2, 6, 5);
        Integer maxNumber1 = l1.stream().max(Integer::compare).get();
//        System.out.println(maxNumber);
        Optional<Integer> maxNumber = l1.stream().max(Comparator.naturalOrder());
//        System.out.println(maxNumber.get());

//        2.
//        stream from collection
//        List<String> fruits = Arrays.asList("apple", "orange", "banana");
//        Stream<String> fruitStream = fruits.stream();
//        fruitStream.forEach(e -> System.out.println(e));
//        fruitStream.forEach(System.out::println);

//        stream of integers
        IntStream intStream = IntStream.rangeClosed(1,10);
//        intStream.forEach(System.out::println);

//        3.
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");
        List<String> ans = fruits.stream().filter(e -> e.startsWith("A"))
//                .map(e -> e.toUpperCase())
                .map(String::toUpperCase)
                .toList();
//        System.out.println(ans);


//        4.
        List<String> fruits1 = Arrays.asList("Apple", "Banana", "Orange", "Mango", "Avocado");
        List<String> filtered = new ArrayList<>();
        for (String x : fruits1){
            if (x.startsWith("A")){
                filtered.add(x);
            }
        }
//        System.out.println(filtered);

        List<String> f1 = fruits1.stream()
                .filter(x -> x.startsWith("A"))
                .toList();
//        System.out.println(f1);


//        5. sorting
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Ben");
//        Collections.sort(names, (a, b) -> a.compareTo(b));   ASC
//        names.sort((a, b) -> b.compareTo(a));                DESC
         names.sort(String::compareTo);
        List<String> sorted1 = names.stream().sorted().toList();
//        names.sort(Comparator.reverseOrder());    DESC
//        System.out.println(names);
//        System.out.println(sorted1);

//        5. filter even numbers
        List<Integer> l2 = List.of(3, 1, 4, 1, 5, 9, 2, 6, 5);
//        normal way
//        List<Integer> res = new ArrayList<>();
//        for (Integer x : l2){
//            if (x%2 == 0){
//                res.add(x);
//            }
//        }
//        System.out.println(res);


//        6.
        List<Integer> evenNumbers = l2.stream().filter(ele -> ele % 2 == 0).toList();
//        System.out.println(evenNumbers);


//        7.
        List<Integer> l3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> squares = l3.stream().map(ele -> ele * ele).toList();
//        System.out.println(squares);


//        8.
        List<Integer> l4 = List.of(10, 15, 9, 2, 6, 17, 34, 8);
//        List<Integer> sorted = l4.stream().sorted(Comparator.naturalOrder()).toList();
        List<Integer> sorted = l4.stream().sorted().toList();
//          List<Integer> sorted = l4.stream().sorted(Integer::compare).toList();
//        List<Integer> sorted = l4.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sorted);

//        9.Iterating
//        l4.stream().forEach(ele -> System.out.println(ele));
//        l4.forEach(ele -> System.out.println("array : " + ele));
          l4.forEach(System.out::println);

    }
}
