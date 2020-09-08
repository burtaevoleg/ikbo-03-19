package Third_prac_lab.laboratory;

import Third_prac_lab.laboratory.Husky;
import Third_prac_lab.laboratory.Shepherd;

public class TestDog {
    public static void main(String[] args) {
        Husky husky=new Husky(6,false,"white");
        System.out.println(husky);
        Shepherd shepherd=new Shepherd(8,false,"black");
        System.out.println(shepherd);
    }
}
