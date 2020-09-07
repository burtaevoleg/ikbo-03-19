package Second_prac_lab.labaratory;

public class Human {
    private Leg leg;
    private Hand hand;
    private Head head;
    private int age;
    private String sex;

    public Human(Leg leg, Hand hand, Head head, int age, String sex) {
        this.leg = leg;
        this.hand = hand;
        this.head = head;
        this.age = age;
        this.sex = sex;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "leg=" + leg.getSize() +
                ", hand=" + hand.getLength() +
                ", head=" + head.getSize() +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

class Hand{
    private double length;

    public Hand(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
class Leg{
    private double size;

    public Leg(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
class Head{
    private String size;

    public Head(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
