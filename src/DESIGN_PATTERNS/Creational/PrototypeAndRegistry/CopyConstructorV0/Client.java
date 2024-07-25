package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.CopyConstructorV0;

public class Client {

    public static void doSomething(Student s){
        Student s2=new Student();
        System.out.println(s2);
    }

    public static void doSomething2(IntelligentStudent s){
        IntelligentStudent s2 = new IntelligentStudent(s);
        System.out.println(s2);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "chandler";
        s.age = 18;

//        doSomething(s);   //Student{name='chandler', age=18}

//        now say that i have to get IntelligentStudent

        IntelligentStudent is = new IntelligentStudent();
        is.name = "joey";
        is.age = 18;
        is.iq = 100;

//        doSomething(is);     //Student{name='joey', age=18}

//        this is going into Parents copy constructor and creating the parents object. this is not that we wanted
//        because this doSomething(Student s) -> this s doesn't know it is getting Student or IntelligentStudent.. client could pass anything.
//        and here in the output as well we don't get any fields from IntelligentStudent
//        how to solve this -  create a copy constructor on child as well

        IntelligentStudent is2 = new IntelligentStudent();
        is2.name = "Ross";
        is2.age = 18;
        is2.iq = 100;

        doSomething2(is2);   //IntelligentStudent{iq=100, name='Ross', age=18}

//        Now you're creating the IntelligentStudent object... we got IntelligentStudent fields as well.
//        so we know that we need copy constructor for every class
//        but not in this way..


    }
}
