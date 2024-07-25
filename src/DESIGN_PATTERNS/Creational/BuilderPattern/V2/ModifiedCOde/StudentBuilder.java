package DESIGN_PATTERNS.Creational.BuilderPattern.V2.ModifiedCOde;

public class StudentBuilder {

//    only pick the necessary attr from Student

    int id;
    String name;
    int age;
    int graduationYear;


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
