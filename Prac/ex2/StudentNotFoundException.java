package Lesson_9.Prac.ex2;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Ученика ( "+name+" ) нет в нашем классе");
    }
}
