package Lesson_8.LAB;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String text=in.nextLine();
        try {
            FileWriter fileWriter=new FileWriter("task_1.txt");
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
