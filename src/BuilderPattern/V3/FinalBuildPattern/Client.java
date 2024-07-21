package BuilderPattern.V3.FinalBuildPattern;

public class Client {
    public static void main(String[] args) {

//        how to properly write the whole code now ?
//        final solution - inner class
//        you don't actually need to write Builder class separately make it inside of the Student class itself. called inner class

        Student obj = Student.getStudentBuilder()
                .setId(101)
                .setAge(24)
                .setName("Oggy")
                .setGraduationYear(2021)
                .build();


//        now u can't simply create object for the Student'
//        Student s = new Student();



    }
}
