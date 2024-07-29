package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V3;

public class Client {

    public static void fillRegistry(StudentRegister sr){

//        standard object for Student
        Student student = new Student();
        student.name = "Chandler";
        student.age = 18;
        student.batch = 2025;

        sr.registerStudent(Constants.STUDENT, student);


//        standard object for IntelligentStudent
        IntelligentStudent is = new IntelligentStudent();
        is.name = "Ross";
        is.age = 18;
        is.batch = 2022;
        is.iq = 200;

        sr.registerStudent(Constants.INTELLIGENT_STUDENT, is);
    }


    public static void main(String[] args) {

//        using registers

        StudentRegister register = new StudentRegister();
        fillRegistry(register);

//        now u can pass simply the key - class name
        Student s5 = register.getStudent("IntelligentStudent");
        Student s6 = register.getStudent("Student");
        System.out.println(s5);

//        Student s6 = register.getStudent(Constants.INTELLIGENT_STUDENT);
//        System.out.println(s6);


    }
}
