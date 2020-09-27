package Lesson_9.Prac.ex2;

import java.util.TreeSet;

public class LabClassDriver implements LabClassUI {
    private TreeSet<Student> our_class;


    public LabClassDriver() {
        this.our_class = new TreeSet<>();
    }

    @Override
    public TreeSet<Student> getStudents() {
        return our_class;
    }

    @Override
    public void addStudent(Student student) {
        our_class.add(student);
    }

    @Override
    public Student findStudentByName(String Name) throws StudentNotFoundException {
        for(Student student:our_class){
            if(student.getFIO().equals(Name))
                return student;
        }
        throw new StudentNotFoundException(Name);
    }

    @Override
    public String toString() {
        return "LabClassDriver{" +
                "our_class=" + our_class +
                '}';
    }
}
