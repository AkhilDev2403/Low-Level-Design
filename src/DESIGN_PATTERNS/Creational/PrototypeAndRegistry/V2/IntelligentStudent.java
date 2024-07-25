package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V2;

public class IntelligentStudent extends Student {
    int iq = 100;


    public IntelligentStudent(){}


    // here also we need copy constructor, so that we can access the private data members from parent

    public IntelligentStudent(IntelligentStudent copy){
        super(copy);      // this super() calling the parent -> Student
        this.iq = copy.iq;
    }

    @Override
    public IntelligentStudent clone() {
//        IntelligentStudent is = new IntelligentStudent();
//        this.iq = is.iq;
//        instead of this
//        now u can do,

        IntelligentStudent is = new IntelligentStudent(this);
        return is;

    }


    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                '}';
    }
}
