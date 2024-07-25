package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.CopyConstructorV0;

public class IntelligentStudent extends Student {
    int iq;

    IntelligentStudent(){}

    IntelligentStudent(IntelligentStudent copy){
        super(copy);
        this.iq = copy.iq;
    }


    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
