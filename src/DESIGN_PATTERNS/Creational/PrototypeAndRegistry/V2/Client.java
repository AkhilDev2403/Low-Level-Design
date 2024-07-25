package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V2;

public class Client {

    static void doSomething(Student st){
        Student s3 = st.clone();
        System.out.println(s3);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student st = s1.clone();
//        System.out.println(st);   //Student{id=1, name='Akhil', age=18}

        IntelligentStudent is1 = new IntelligentStudent();
        IntelligentStudent is2 = is1.clone();
//        System.out.println(is2);   //IntelligentStudent{id=1, name='Akhil', age=18, iq=100}
//        now u can access private members as well.

        Student s2 = new Student();
        doSomething(s2);    //Student{id=1, name='Akhil', age=18}

        IntelligentStudent is3 = new IntelligentStudent();
        doSomething(is3);  //IntelligentStudent{id=1, name='Akhil', age=18, iq=100}



    }
}
