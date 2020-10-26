package Lesson_9.Lab.ex8;

import java.util.Scanner;

public class ThrowsDemo {

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);

        while (myScanner.hasNextLine()) {
            try {
                System.out.print("Enter Key ");
                String key = myScanner.next();
                printDetails(key);
            } catch (Exception e) {
                System.out.print("You entered an empty key, try entering correct line");
            }
        }
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