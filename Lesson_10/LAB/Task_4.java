package Lesson_10.LAB;

import java.util.*;

public class Task_4 {
    public static void main(String[] args) {
        List<Integer> mas_int=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mas_int.add(new Random().nextInt(100));
        }
        output(mas_int);

        Queue<String> q_str=new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            q_str.add("Oleg"+i);
        }
        output(q_str);

    }

    public static <E> void output(Collection<E> collection){
        List<E> list = new ArrayList<>(collection);
        for (int i=0;i<5;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
