package BuilderPattern.V2;

public class Client {
    public static void main(String[] args) {

//        create a new class - StudentBuilder
//        and add the necessary attr there

        StudentBuilder sb = new StudentBuilder();
        sb.setId(100);
        sb.setName("Akhil");
        sb.setAge(24);
        sb.setGraduationYear(2024);

        Student s1 = new Student(sb);
    }
}
