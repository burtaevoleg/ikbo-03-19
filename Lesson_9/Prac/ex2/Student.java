package Lesson_9.Prac.ex2;

public class Student implements Comparable<Student> {
    private String FIO;
    private int gpa;

    public Student(String FIO, int gpa) throws EmptyStringException {
        if(FIO.isEmpty()) throw new EmptyStringException();
        this.FIO = FIO;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        return this.gpa-o.gpa;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FIO='" + FIO + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
