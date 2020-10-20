package Lesson_12.PRAC.task1;

public class Person {
    private final String name;
    private final String surname;
    private final String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getFIO(){
        return new StringBuilder(surname).
                append(name !=null && !name.isEmpty() ? name.charAt(0)+".": "").
                append(patronymic!=null && !patronymic.isEmpty() ? patronymic.charAt(0)+"." : "").toString();
    }
}
