package Lesson_9.Prac.ex2;

import Lesson_9.Prac.ex2.*;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws EmptyStringException {
        LabClassUI labClassUi = new LabClass().getLabClassUi();
        labClassUi.addStudent(new Student("Маврина А.А", 4));
        labClassUi.addStudent(new Student("Уськов М.Е.", 3));
        labClassUi.addStudent(new Student("Суюнов Р.А", 4));
        labClassUi.addStudent(new Student("Котков В.П", 5));
        System.out.println(labClassUi);
        System.out.println("Sorted by second name:\n" + labClassUi);
        System.out.println("Sorted by gpa:\n" + labClassUi);

        System.out.print("Enter student's full name: ");
        Scanner sc = new Scanner(System.in);
        String student = sc.nextLine();
        String[] fullName = student.split(" ");
        try {
            if (fullName.length != 3) {
                System.out.println(labClassUi.findStudentByName(student));
            } else throw new StudentNotFoundException(student);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
