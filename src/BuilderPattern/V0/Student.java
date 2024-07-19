package BuilderPattern.V0;

public class Student {
    int id;
    String name;
    int age;
    String batch;
    int graduationYear;
    String college_name;
//    and say we have 30 more attributes like these

//    How can we create objects for these?
//    Solution.1 - Constructors

//    but there could be lots of constructors we have to implement with all the permutation and combos

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

//    and so on


//    problems
//    1. class will get loaded with lots of constructors
//    2. forgot to maintain the order of passing values
//    3. constructor signature

//    public Student(String name, String batch){
//        this.name = name;
//        this.batch = batch;
//    }
//
//    public Student(String name, String college_name){
//        this.name = name;
//        this.college_name = college_name;
//    }

//    you can't do the above - error - 'Student(String, String)' is already defined in 'BuilderPattern.V0.Student''
//    same method signature not allowed for constructors






}
