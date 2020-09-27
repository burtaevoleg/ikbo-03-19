package Lesson_10.Prac.ex2;

public class Client {
    public Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit(){
        System.out.println("Клиент сел на "+chair);
    }

}
