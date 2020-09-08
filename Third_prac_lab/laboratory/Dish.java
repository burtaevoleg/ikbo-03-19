package Third_prac_lab.laboratory;


abstract class Dish {
    private int price;
    private int weight;
    private String material;
    private String function;

    public Dish(int price, int weight, String material, String function) {
        this.price = price;
        this.weight = weight;
        this.material = material;
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

class Plait extends Dish{
    private int radius;

    public Plait(int price, int weight, String material, String function, int radius) {
        super(price, weight, material,function);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Тарелка {" +
                "материал = " + getMaterial() + ", " +
                "цена = " + getPrice() + " руб, " +
                "вес = " + getWeight()+" гр, " +
                "функция = " + getFunction() + ", "+
                "размер(радиус) = " + radius + " см }";
    }
}

class Cup extends Dish{
    private double volume;

    public Cup(int price, int weight, String material, String function, double volume) {
        super(price, weight, material, function);
        this.volume=volume;
    }

    @Override
    public String toString() {
        return "Кружка {" +
                "материал = " + getMaterial() + ", " +
                "цена = " + getPrice() + " руб, " +
                "вес = " + getWeight()+" гр, " +
                "функция = " + getFunction() + ", "+
                "объем = " + volume + " мл }";
    }
}
