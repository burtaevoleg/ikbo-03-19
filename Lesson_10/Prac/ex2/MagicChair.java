package Lesson_10.Prac.ex2;

public class MagicChair implements Chair {

    public void doMagic(){
        System.out.println("It is a magic Chair");
    }

    @Override
    public String toString() {
        return "Magic Chair";
    }
}
