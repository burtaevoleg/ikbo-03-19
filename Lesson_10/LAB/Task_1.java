package Lesson_10.LAB;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        Integer []mas={1,2,3,4,5,6,7};
        List<Integer> list=convert(mas);
        System.out.println(list);

        String []mas2={"one","two","three","four"};
        List<String> list2=convert(mas2);
        System.out.println(list2);
    }

    public static <E> List<E> convert(E[] mas){
        List<E> list=new ArrayList<>();
        for(E index:mas){
            list.add(index);
        }
        return list;
    }
}
