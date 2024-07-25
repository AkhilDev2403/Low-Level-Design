package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V1;

public class Student implements Prototype<Student>{
    int id = 1;
    String name = "Akhil";
    int age = 18;

//    now we need a prototype (interface). which will have a clone method.
//    now these class will implements this prototype and clone objects


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
