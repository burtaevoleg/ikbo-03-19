package Lesson_12.LAB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2_2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+\\s*\\+");
        Scanner in = new Scanner(System.in);
        String input=in.nextLine();
        Matcher m1 = pattern.matcher(input);

        if(m1.find()) {
            System.out.println(m1.group());
            while (m1.find()) {
                System.out.println(m1.group());
            }
        }
        else System.out.println("Вы ввели неправильное выражение");

    }
}
