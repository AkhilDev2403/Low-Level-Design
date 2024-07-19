package BuilderPattern.V2;

public class Student {
    int id;
    String name;
    int age;
    String batch;
    int graduationYear;
    String college_name;

//    and say we have 30 more attributes like these

//    1. created a StudentBuilder class and call that builder class in Student constr. Also can do the validations here itself

    Student(StudentBuilder builder){

        if(builder.age < 18){
            throw new IllegalArgumentException("Age must be at least 18");
        }

        if(builder.graduationYear > 2024){
            throw new IllegalArgumentException("GraduationYear must be lesser than 2024");
        }


        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.graduationYear = builder.graduationYear;
    }

}
