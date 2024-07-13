package StreamsAndLambdaExpression;

public class Student implements Comparable<Student>{
    public String name;
    public int age;
    public double score;
    public int attendance;

    public Student(String name, int age, double score, int attendance) {
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


//    DESC
    @Override
    public int compareTo(Student o) {
        if(this.score > o.score){
            return -1;
        } else if (this.score < o.score) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
