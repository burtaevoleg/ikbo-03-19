package Lesson_8.LAB;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String newText=in.nextLine();
        try {
            FileWriter fileWriter=new FileWriter("task_1.txt",true);
            fileWriter.write(newText);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
