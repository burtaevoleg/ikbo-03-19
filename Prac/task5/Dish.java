package Lesson_16.Prac.task5;


public final class Dish implements Item {
    private final int cost;
    private final String name;
    private final String description;

    public Dish(String name, String description) {
        cost = 0;
        this.name = name;
        this.description = description;
    }

    public Dish(int cost, String name, String description) {
        this.cost = cost;
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
        return "Dish{" +
                "price=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
