package Lesson_9.Lab.ex3;

public class Exercise3 {

    public static void main(String[] args) {
        // Блок try-catch с перехватом общего исключения класса Exception
        // Перехватит все возможные исключения
        Exception3 exception = new Exception3();
        exception.exceptionDemo();
    }
}