package Collections;

public class StudentComparable implements Comparable<StudentComparable>{

    public String name;
    public int age;
    public double score;
    public int attendance;

    public StudentComparable(String name, int age, double score, int attendance) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.attendance = attendance;
    }

    @Override
    public String toString(){
        return "Student{" +
                "age=" + this.age +
                ", score=" + this.score +
                ", name='" + this.name + '\'' +
                ", attendance=" + this.attendance +
                '}';
    }


//    @Override
//    public int compareTo(StudentComparable o) {
////        this object to come first -> return -1
////        other object to come first -> return 1
////        desc order
//        if(this.age > o.age){
//            return -1;
//        } else if (this.age < o.age) {
//            return 1;
//        }
//        else {
//            return 0;
//        }
//    }

//    you can also write the above code as this

//    DESC order
//    @Override
//    public int compareTo(StudentComparable o) {
//        return o.age - this.age;
//    }

//    ASC Order
    @Override
    public int compareTo(StudentComparable o) {
        return this.age - o.age;
    }
}
