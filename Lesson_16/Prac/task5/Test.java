package Lesson_16.Prac.task5;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Item dish1 = new Dish(500, "Meat", "Стейк из мраморной говядины");
        Item dish2 = new Dish(400, "Fish", "Стейк лосося в имбироном соусе");

        Item drink1 = new Drink(100, "Coffee", "Экспрессо");
        Item drink2 = new Drink(200, "Apple juice", "Вкусный яблочный сок");

        Order order = new RestaurantOrder();
        order.add(dish1);
        order.add(dish2);
        order.add(drink1);
        order.add(drink2);
        System.out.println("RestaurantOrder:");
        System.out.println(Arrays.toString(order.getArray()));

        System.out.println("\nSorted by cost desc:");
        System.out.println(Arrays.toString(order.sortedOrderByCost()));

        order.delete("Coffee");
        System.out.println("\nDelete coffee:");
        System.out.println(Arrays.toString(order.getArray()));

        System.out.println("\nItems in order: " + order.getOrderSize());
        System.out.println("Order cost: " + order.getOrderCost());
        System.out.println("Count of paste: " + order.getItemQuantity("Pasta"));
        System.out.println("\nArray of items name:");
        System.out.println(Arrays.toString(order.getArrayOfItemsName()));

    }
}
