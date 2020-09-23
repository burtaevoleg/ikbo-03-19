package Sixth_6_prac_lab.Practice;

import java.util.*;

public class Task_2 {

    public static void main(String[] args) {
        Random random=new Random();
        SortingStudentsByGPA sortingStudentsByGPA=new SortingStudentsByGPA();
        TreeSet<Student> ourClass=new TreeSet<>(sortingStudentsByGPA);
        for (int i = 0; i < 10; i++) {
            ourClass.add(new Student("Alex",random.nextInt(10)+1, random.nextInt(300), random.nextInt(100)));
        }
        System.out.println("После сортировки: ");
        for (Student s : ourClass) {
            System.out.println(s.toString());
        }
    }
}

class SortingStudentsByGPA implements Comparator<Student>{
    @Override
    public int compare(Student st1, Student st2) {
        return st2.getSumOfPoints()-st1.getSumOfPoints();
    }
}
