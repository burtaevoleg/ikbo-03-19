package Lesson_7.LAB;

import java.util.ArrayList;
import java.util.Comparator;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> list_of_string=new ArrayList<>();
        list_of_string.add("Москва");
        list_of_string.add("Казань");
        list_of_string.add("Смоленск");
        list_of_string.add(0,"Воронеж");
        System.out.println(list_of_string);
        System.out.println(list_of_string.get(1));
        list_of_string.remove(2);
        System.out.println(list_of_string);
        list_of_string.set(0,"Калининград");
        System.out.println(list_of_string);
        System.out.println("Индекс элемента со значением \"Москва\""+list_of_string.indexOf("Москва"));
        list_of_string.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.length()-t1.length();
            }
        });
        System.out.println(list_of_string);
    }
}
