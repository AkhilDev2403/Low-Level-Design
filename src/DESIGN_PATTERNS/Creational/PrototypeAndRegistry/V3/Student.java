package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V3;

public class Student implements Prototype<Student> {
     String name;
     int age;
     int batch;

    public Student(){}

//    copy constructor
    public Student(Student copy){
        this.name = copy.name;
        this.age = copy.age;
        this.batch = copy.batch;
    }

    @Override
    public Student clone(){
        Student st = new Student(this);
        return st;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batch=" + batch +
                '}';
    }
}
