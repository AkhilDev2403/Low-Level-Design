package StreamsAndLambdaExpression;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
//        Lambda Expressions

        List<Integer> list1 = List.of(15, 20, 35, 5, 55, 205);

//        step.1 convert the list of data into stream of data/ runnable stream
        Stream<Integer> stream1 = list1.stream();

//        step.2 perform the stream methods init

//        Stream Methods
//        1. Terminal Operation
//        2. Intermediate Operation

//        1. forEach() - terminal
        stream1.forEach((element) -> {
            System.out.print(" " + element);
        });

//        also write
//        stream1.forEach(element -> System.out.print(" " + element));

//        NOte: now u can't use stream1 it used a terminal operation. now start a new stream'



//        2. limit() -> intermediate
        List<Integer> list2 = List.of(15, 20, 35, 5, 55, 205);
        Stream<Integer> stream2 = list2.stream().limit(3);
//        stream2.forEach(ele -> System.out.println(ele));
//        you can write this as
        stream2.forEach(System.out::println);



        List<Student> list3 = new ArrayList<>();
        list3.add(new Student("Akhil", 24, 96.5, 98));
        list3.add(new Student("Sneha", 20, 99.5, 75));
        list3.add(new Student("Joey", 21, 80.5, 85));
        list3.add(new Student("Bing", 23, 70.5, 60));

//        1. Using comparable interface
//        System.out.println(list3);
//        Collections.sort(list3);
//        System.out.println(list3);

//        2. with LE
        Comparator<Student> comparable = (o1, o2) -> {
            return (int) (o1.score - o2.score);
        };
//        ASC
//        Collections.sort(list3, comparable);  also write
        list3.sort(comparable);
        System.out.println(list3);


//        3.filter()  intermediate
        System.out.println(list3);
        list3.stream()
                .filter(element ->{
            return element.score < 90;
        })
                .forEach(System.out::println);


//        4. collect() terminal

        List<Student> list4 = list3.stream()
                .filter(element -> {
                    return element.attendance > 90;
                })
                .collect(Collectors.toList());
        System.out.println(list4);


//        5. map()
        List<Integer> list6 = List.of(5, 10, 15, 24, 60, 50, 2, 1, 1, 1, 5);

        List<Integer> list7 = list6.stream()
                .filter(ele -> {
                    return ele % 2 == 0;
                })
                .map(ele -> {
                    return ele * ele;
                })
                .toList();
        System.out.println(list7);


//        6. distinct() - intermediate
//         same list but shouldn't have any distinct values
        List<Integer> list8 = list6.stream()
                .distinct()
                .filter(ele -> {
                    return ele % 2 == 0;
                })
                .map(ele ->{
                    return ele * ele;
                })
                .toList();
//        System.out.println(list8);



//        7. findFirst() - terminal
        Optional<Integer> list9 = list6.stream()
                .distinct()
                .filter(ele -> {return (ele % 2 == 0);})
                .map(ele -> {return ele * ele;})
                .findFirst();

//        if(list9.isPresent()){
//            System.out.println(list9.get());
//        }
//        u can also write
        list9.ifPresent(System.out::println);


//        8. count() - terminal
        List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);

        long count = l2.stream().map(ele -> {return ele * ele;})
                .count();
        System.out.println("count " + count);

//        here map() won't even work'. only count() will take place. no need for map


//        9. reduce() - terminal converge your whole stream into a single element based on some logic - Aggregate fun

//        1. normal way to calculate the sum of ele
//        int sum = 0;
//        for(Integer ele : l2){
//            sum += ele;
//        }
//        System.out.println("total sum " + sum);


//        2. using stream/reduce()
        int res = l2.stream().reduce(0, (sum, ele) ->{
            return sum += ele;
        });
        System.out.println("res :" + res);


//        calculate the max
        Optional<Integer> max = l2.stream()
                .max(Comparator.naturalOrder());
        System.out.println("maximum value : " + max.get());



//       10. flatMap() - interm optn
//        convert 2d matrix into 1d

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7,8)
        );

//        way 1
        List<Integer> ans = arr.stream().flatMap(ele -> {
            return ele.stream();
        }).collect(Collectors.toList());
        System.out.println(ans);

//        way 2
//        List<Integer> ans = arr.stream().flatMap(Collection::stream).toList();
//        System.out.println(ans);






        List<Integer> l3 = List.of(4,7,2,6);
        Stream<Integer> stNew = l3.stream();
        stNew = stNew.distinct();
        stNew = stNew.filter(ele -> {
            System.out.println("Hello world");
            return ele % 2 == 0;
        });

    }
}
