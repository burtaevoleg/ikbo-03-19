package Forth_prac_lab.laboratory;

public class Toy implements Priceable {
    private int price;

    public Toy(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
