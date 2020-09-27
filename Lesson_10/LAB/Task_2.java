package Lesson_10.LAB;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        Integer[] mas ={1,2,3,4,5,6};
        Saver<Integer> saver=new Saver<>(mas);
        Integer []tester=saver.getMas();
        System.out.println(Arrays.toString(tester));

        String[] mas1 ={"one","two","three","four"};
        Saver<String> saver1= new Saver<String>(mas1);
        String[] tester1=saver1.getMas();
        System.out.println(Arrays.toString(tester1));
    }
}

class Saver<E>{
    private E[] mas;

    public Saver(E[] mas){
        this.mas=mas;
    }

    public E[] getMas() {
        return mas;
    }

    public void setMas(E[] mas) {
        this.mas = mas;
    }
}
