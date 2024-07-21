package BuilderPattern.V3.FinalBuildPattern;

public class Student {
    int id;
    String name;
    int age;
    String batch;
    int graduationYear;
    String college_name;

//    and say we have 30 more attributes like these

/**    'BuilderPattern.V3.FinalBuildPattern.Student.this' cannot be referenced from a static context. so to call this static method
    you have to make your StudentBuilder class static.**/
    static StudentBuilder getStudentBuilder(){
        return new StudentBuilder();
    }

    /** make the constructor as private as well so that no one from outside can do anything here. they won't even know **/
    private Student(StudentBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.graduationYear = builder.graduationYear;
    }
/**
    'BuilderPattern.V3.FinalBuildPattern.Student.this' cannot be referenced from a static context. so to call this static method
    you have to make your StudentBuilder class static. inner class has to be static also make it private so that no one from outside
    would have no idea about this class completely */
    public static class StudentBuilder{
        int id;
        String name;
        int age;
        String batch;
        int graduationYear;

//        every method returns StudentBuilder so that we can do chaining as we did in Streams
        public StudentBuilder setId(int id){
            this.id = id;
            return this;  // return the curr StudentBuilder itself
        }

        public StudentBuilder setName(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public StudentBuilder setBatch(String batch){
            this.batch = batch;
            return this;
        }

        public StudentBuilder setGraduationYear(int graduationYear){
            this.graduationYear = graduationYear;
            return this;
        }

        public Student build(){
//            you can do the validations if u want here
            return new Student(this);
        }
    }

}
