package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V4;

public class Client {
    public static void main(String[] args) {

//        using registers

        StudentRegistryImplementation register = new StudentRegistryImplementation();
//        fillRegistry(register);

        Student s5 = register.getStudent("Student");
        System.out.println(s5);

//        Student s6 = register.getStudent(Constants.INTELLIGENT_STUDENT);
//        System.out.println(s6);


    }
}
