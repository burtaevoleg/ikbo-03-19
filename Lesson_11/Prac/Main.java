package Lesson_11.Prac;

import Lesson_11.Prac.ArrayQueue;
import Lesson_11.Prac.ArrayQueueADT;
import Lesson_11.Prac.ArrayQueueModule;
import Lesson_11.Prac.LinkedQueue;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule<Integer> aqm = new ArrayQueueModule<>();
        LinkedQueue<Integer> lq = new LinkedQueue<>();
        for (int i = 0; i < 10; i++) {
            aqm.add(i);
            lq.enqueue(i);
        }
        ArrayQueue<Integer> aq = new ArrayQueue<>(aqm.getList());
        ArrayQueueADT<Integer> aqa = new ArrayQueueADT<>();
        System.out.println(lq);
        System.out.println(aq.element());
        System.out.println(aqa.size(aqm.getList()));
        System.out.println(aqm);
        System.out.println(lq.dequeue());
        aq.enqueue (13);
        System.out.println(lq);
        System.out.println(aq);
        aqa.enqueue(aqm.getList(), 15);
        System.out.println(aqm);
    }
}
