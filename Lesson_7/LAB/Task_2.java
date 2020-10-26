package Lesson_7.LAB;

import java.util.Comparator;
import java.util.LinkedList;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list_of_int=new LinkedList<>();
        list_of_int.add(12);
        list_of_int.add(10);
        list_of_int.add(9);
        System.out.println(list_of_int);
        list_of_int.addFirst(1);
        list_of_int.addLast(100);
        System.out.println(list_of_int);
        list_of_int.removeFirst();
        list_of_int.removeLast();
        System.out.println(list_of_int);
        System.out.println("Первый элемент: "+list_of_int.getFirst());
        System.out.println("Последний элемент: "+list_of_int.getLast());
        list_of_int.remove(Integer.valueOf(9));
        System.out.println(list_of_int);
        System.out.println("Размер: "+list_of_int.size());
        list_of_int.addLast(123);
        list_of_int.addLast(43);
        list_of_int.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return  integer-t1;
            }
        });
        System.out.println("После сортировки: "+list_of_int);
    }
}
