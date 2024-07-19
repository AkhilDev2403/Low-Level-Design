package BuilderPattern.V1;

public class Student {
    int id;
    String name;
    int age;
    int batch;
    int graduationYear;
    String college_name;
//    and say we have 30 more attributes like these

//    Solution. 2 - Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }



}
