package Lesson_10.LAB;

public class Task_3 {
    public static void main(String[] args) {
        Integer[] mas={1,2,3,4,5};
        System.out.println("Первый элемент массива: "+getter(0,mas));
        System.out.println("Последний элемент массива: "+getter(mas.length-1,mas));

        String[] mas1={"one","two","three","four"};
        System.out.println("Первый элемент массива: "+getter(0,mas1));
        System.out.println("Последний элемент массива: "+getter(mas1.length-1,mas1));
    }

    public static <E> E getter(int index, E[] mas){
        return mas[index];
    }
}
