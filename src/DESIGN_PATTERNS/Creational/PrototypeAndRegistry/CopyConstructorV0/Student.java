package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.CopyConstructorV0;

public class Student {
    String name;
    int age;

    Student(){

    }

    Student(Student copy){
        this.name=copy.name;
        this.age=copy.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
