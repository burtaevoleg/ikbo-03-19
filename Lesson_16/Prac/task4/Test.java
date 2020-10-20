package Lesson_16.Prac.task4;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Item dish1 = new Dish(100, "Fish", "fish");
        Item dish2 = new Dish(200, "Meat", "meat");
        Item drink1 = new Drink(100, "Juice", "juice");
        Item drink2 = new Drink(200, "Coffee", "coffee");

        InternetOrder order = new InternetOrder();
        order.add(dish1);
        order.add(dish2);
        order.add(drink1);
        order.add(drink2);
        System.out.println(Arrays.toString(order.getArray()));


    }
}
