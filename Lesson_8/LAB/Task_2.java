package Lesson_8.LAB;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task_2 {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("task_1.txt");
            int c;
            while ((c=fileReader.read())!=-1){
                System.out.print((char)c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
