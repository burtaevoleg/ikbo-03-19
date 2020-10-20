package Lesson_16.Prac.task1;

public class Drink {
    private final int price;
    private final String name;
    private final String description;

    public Drink(String name, String description) {
        this.price=0;
        this.name = name;
        this.description = description;
    }

    public Drink(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
