package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<StudentComparable> s1 = new ArrayList<StudentComparable>();
        s1.add(new StudentComparable("Akhil", 24, 98.5, 90));
        s1.add(new StudentComparable("Sneha", 21, 99.5, 95));
        s1.add(new StudentComparable("Joey", 29, 88.7, 80));
        s1.add(new StudentComparable("Bing", 23, 70, 60));

//        System.out.println(s1);
//        it will only print the address
//        if u wanted to print everything like u want use/create own toString()
//        toString is coming from System.out.println();

//        either you can declare new toString() or do this

//        String ans = s1.toString();
//        System.out.println(ans);

        // both are same

//        System.out.println(s1);
//        Collections.sort(s1);
//        System.out.println(s1);


//        comparator

//        System.out.println(s1);
//        Collections.sort(s1, new StudentComparator());
//        System.out.println(s1);


//        you can also write this as lambda expression (DESC)
        System.out.println(s1);
        Comparator<StudentComparable> c1 = (o1, o2) ->{
            return (int) (o2.attendance - o1.attendance);
        };
        Collections.sort(s1,c1);
        System.out.println(s1);
    }
}
