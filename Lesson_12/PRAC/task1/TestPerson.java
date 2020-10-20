package Lesson_12.PRAC.task1;

import Lesson_12.PRAC.task1.Person;

public class TestPerson {
    public static void main(String[] args) {
        System.out.println(new Person("Иванов", "Иван", "Егорович").getFIO());
        System.out.println(new Person("Иванов", "Егор", "").getFIO());
        System.out.println(new Person("Иванов", "", "").getFIO());
        System.out.println(new Person("Иванов", null, null).getFIO());
    }
}
