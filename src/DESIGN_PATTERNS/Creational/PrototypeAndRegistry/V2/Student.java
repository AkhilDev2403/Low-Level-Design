package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V2;

public class Student implements Prototype<Student> {
    private int id = 1;
    private String name = "Akhil";
    private int age = 18;

    public Student(){}


//    create a copy constructor
    public Student(Student copy){
        this.id = copy.id;
        this.name = copy.name;
        this.age = copy.age;
    }



    @Override
    public Student clone() {
        Student s1 = new Student();
        this.id = s1.id;
        this.name = s1.name;
        this.age = s1.age;

        return s1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }




}
