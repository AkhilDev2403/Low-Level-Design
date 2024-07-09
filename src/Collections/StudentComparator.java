package Collections;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentComparable> {

//    ASC order
    @Override
    public int compare(StudentComparable o1, StudentComparable o2) {
        return (int) (o1.score - o2.score);
    }
}
