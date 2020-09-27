package Lesson_8.PRAC;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Oleg
 * This class is a class where we test our programm
 */

public class Tester {
    public static void main(String[] args) {
        BoundedWaitList<Integer> bwl=new BoundedWaitList<>(10);
        for(int i=0;i<10;i++) bwl.add(new Random().nextInt(100));

        System.out.println(bwl);
        try {
            bwl.add(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bounds of boundedWaitList");
        }
        System.out.println("Remove first: " + bwl.remove());
        System.out.println(bwl);
        System.out.println("Contains 5: " + bwl.contains(5));
        System.out.println("Contains all [1, 2]: " + bwl.containsAll(Arrays.asList(1, 2)));
        System.out.println("Is empty: " + bwl.isEmpty());

        System.out.println();
        UnfairWaitList<String> uwl=new UnfairWaitList<>();
        uwl.add("one");
        uwl.add("two");
        uwl.add("three");
        System.out.println(uwl);
        uwl.remove("one");
        System.out.println("Первый элемент не удалился: "+uwl);
        uwl.remove("two");
        System.out.println(uwl);
        uwl.moveToBack("one");
        System.out.println("Первый элемент переместили в конец: "+ uwl);
        System.out.println("Is empty: "+uwl.isEmpty());

    }
}
