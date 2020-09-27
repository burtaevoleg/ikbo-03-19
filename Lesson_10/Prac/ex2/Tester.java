package Lesson_10.Prac.ex2;

public class Tester {
    public static void main(String[] args) {
        Client client=new Client();
        AbstractChairFactory factory=new ChairFactory();
        client.setChair(factory.createFunctionalChair());
        client.sit();
        client.setChair(factory.createMagicChair());
        client.sit();
        client.setChair(factory.createVictorianChair());
        client.sit();
    }
}
