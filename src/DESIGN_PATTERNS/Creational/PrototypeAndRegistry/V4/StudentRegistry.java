package DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V4;

import DESIGN_PATTERNS.Creational.PrototypeAndRegistry.V3.Constants;

public interface StudentRegistry {

    void registerStudent(Student student);

    Student getStudent(Constants key);

    Student clone(Constants type);
}
