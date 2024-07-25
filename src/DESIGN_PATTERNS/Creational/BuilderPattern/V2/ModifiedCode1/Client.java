package DESIGN_PATTERNS.Creational.BuilderPattern.V2.ModifiedCode1;

public class Client {
    public static void main(String[] args) {

//        why don't Student class itself passes the builder class ?  bcz we could have many many builder classes '

//        StudentBuilder sb = new StudentBuilder();
//        sb.setId(100);
//        sb.setName("Akhil");
//        sb.setAge(24);
//        sb.setGraduationYear(2024);
//
//        Student s1 = new Student(sb);

//        now Student class providing the Builder

        StudentBuilder sb = Student.getStudentBuilder();
        sb.setName("Dev");
        sb.setAge(22);

        Student st = new Student(sb);
    }
}
