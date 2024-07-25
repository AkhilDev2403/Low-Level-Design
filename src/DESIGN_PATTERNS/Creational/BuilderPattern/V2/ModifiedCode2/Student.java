package DESIGN_PATTERNS.Creational.BuilderPattern.V2.ModifiedCode2;

public class Student {
    int id;
    String name;
    int age;
    String batch;
    int graduationYear;
    String college_name;

//    and say we have 30 more attributes like these

    static StudentBuilder getStudentBuilder(){
        return new StudentBuilder();
    }


     Student(StudentBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.graduationYear = builder.graduationYear;
    }

}
