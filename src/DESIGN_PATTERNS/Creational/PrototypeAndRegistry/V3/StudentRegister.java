package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V3;

import java.util.HashMap;
import java.util.Map;

public class StudentRegister {

    private Map<String, Student> students = new HashMap<>();

    public void registerStudent(String key, Student s){
        students.put(key, s);
    }

    public Student getStudent(String key){
        return students.get(key).clone();
    }
}
