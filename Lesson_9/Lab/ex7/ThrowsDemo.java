package Lesson_9.Lab.ex7;

import java.util.Scanner;

public class ThrowsDemo {

    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key ");
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new NullPointerException("Key set to empty string");
        }

        return "data for " + key;
    }
}