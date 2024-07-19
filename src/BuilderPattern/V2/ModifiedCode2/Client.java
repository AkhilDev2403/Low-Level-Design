package BuilderPattern.V2.ModifiedCode2;

public class Client {
    public static void main(String[] args) {


//        now Student class providing the Builder

//        StudentBuilder sb = Student.getStudentBuilder();
//        sb.setName("Dev");
//        sb.setAge(22);
//
//        Student st = new Student(sb);

//        now you can do this
//        finally it's expecting a Student as return type in build we creating new Student and returning the curr obj that why we need
//        to add .build() at the ending.'

        Student s1 = Student.getStudentBuilder()
                .setId(101)
                .setName("Sneha")
                .setAge(20)
                .setGraduationYear(2023)
                .build();

//        now no one can see what StudentBuilder is about. we haven't mention it anywhere now.


//        but still a small problem. we can still do this..

        StudentBuilder sb = new StudentBuilder();
        sb.setAge(12);
        sb.setGraduationYear(2023);
        Student s2 = new Student(sb);

//        we shouldn't let this happen. bcz we moved the validation also. now how does it will validate?
//        can we make our Student class as private ? - so here we can't  create object...
//        now u can't do this -   Student s2 = new Student(sb);'
//        but also can't do this -  return new Student(this); in builder'

//        how to properly write the whole code now ?
//        final solution - inner class
    }
}
