package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V3;

public class IntelligentStudent extends Student {
    int iq;

    IntelligentStudent(){}

    //copy constructor
    public IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq=is.iq;
    }

//    clone method
    @Override
    public IntelligentStudent clone (){
        IntelligentStudent clone = new IntelligentStudent(this);
        return clone;
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", batch=" + batch +
                '}';
    }
}
