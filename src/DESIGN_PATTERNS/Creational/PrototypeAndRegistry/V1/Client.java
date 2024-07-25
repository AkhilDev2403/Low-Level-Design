package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V1;

public class Client {

    static void doSomething(Student st){
        Student s3 = st.clone();
        System.out.println(s3);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = s1.clone();

//        System.out.println("Student 1: " + s1);    //Student 1: Student{id=1, name='Akhil', age=18}
//        System.out.println("Student2 : " + s2);    //Student2 : Student{id=1, name='Akhil', age=18}
//      s2 successfully copied the Student s1 here we can now do s3, s4, ..... without creating new objects or copying individually.




        IntelligentStudent is1 = new IntelligentStudent();
        IntelligentStudent is2 = is1.clone();
//        System.out.println(is2);   //IntelligentStudent{iq=100, id=1, name='Akhil', age=18}
        // is2 successfully copied the Student is1 here




//        doSomething(is1);    // IntelligentStudent{iq=100, id=1, name='Akhil', age=18}
//        doSomething(s1);    // Student{id=1, name='Akhil', age=18}


//        say we don't have clone() available in IntelligentStudent ? then it will go to it's parent and call it's clone().
//        so every child class should have their own clone().


//        still we got a problem here. what if some data members are of type private ? can u access them - NO
//        if we make some data members on Student as private it won't be available in Intelligent Student class.
//        what is the solution -  create copy constructor
    }
}
