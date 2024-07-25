package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V1;

public class IntelligentStudent extends Student {
    int iq = 100;

    @Override
    public IntelligentStudent clone() {
        IntelligentStudent is = new IntelligentStudent();

        this.iq = is.iq;

        return is;
    }


    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
