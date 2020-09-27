package Lesson_9.Prac.ex2;

import java.util.TreeSet;

public interface LabClassUI {
    TreeSet<Student> getStudents();
    void addStudent(Student student) throws EmptyStringException;
    Student findStudentByName(String Name) throws StudentNotFoundException;

}
