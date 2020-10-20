package Lesson_12.LAB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Scanner in = new Scanner(System.in);
        String input=in.nextLine();
        Matcher m1 = p1.matcher(input);
        if(m1.matches()){
            System.out.println(m1.group(0));
        }
        else System.out.println("Вы ввели неправильную строку");
    }
}

