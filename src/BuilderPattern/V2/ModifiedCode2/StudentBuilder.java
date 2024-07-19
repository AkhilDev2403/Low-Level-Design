package BuilderPattern.V2.ModifiedCode2;

public class StudentBuilder {

//    only pick the necessary attr from Student

    int id;
    String name;
    int age;
    int graduationYear;

//    make every method return StudentBuilder in Setters and add a build method which returns itself

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
        return this;
    }

//    public Student build(){
//        return new Student(this);
//    }

//    now u can do the validation here in the builder
    public Student build(){
        if(this.age < 18){
            throw new IllegalArgumentException("Age must be at least 18");
        }

        if(this.graduationYear > 2024){
            throw new IllegalArgumentException("GraduationYear must be lesser than 2024");
        }
        return new Student(this);
    }

}
