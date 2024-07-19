package BuilderPattern.V1;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {

//        we can do this

        Student s1 = new Student();
        s1.setName("Akhil");
        s1.setAge(20);
        s1.setBatch(2021);


//        but the problem here is we can't do any validations

//        Solution . 3

        HashMap<String, Object> map = new HashMap<>();

//        too much flexible

//        solution.4 - class
//                create a new Builder class and use class here

    }
}
