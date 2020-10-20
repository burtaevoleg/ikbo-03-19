package Lesson_16.Prac.task3;


public class Drink implements Item {
    private final int cost;
    private final String name;
    private final String description;

    public Drink(String name, String description) {
        this.cost =0;
        this.name = name;
        this.description = description;
    }

    public Drink(int price, String name, String description) {
        this.cost = price;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
