package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V4;

import DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V3.Constants;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistryImplementation implements StudentRegistry{

    private Map<String, Student> students = new HashMap<>();

    @Override
    public void registerStudent(Student student) {
        Student newStudent = new Student(student);
        newStudent.name = "Chandler Bing";
        newStudent.age = 21;
        newStudent.batch = 2021;

        students.put(Constants.STUDENT, newStudent);

    }

    @Override
    public Student getStudent(Constants key) {
       return students.get(key).clone();
    }

    @Override
    public Student clone(Constants type) {
        return getStudent(type).clone();
    }
}
