package Third_prac_lab.laboratory;

import Third_prac_lab.laboratory.Cup;
import Third_prac_lab.laboratory.Plait;

public class TestDish {
    public static void main(String[] args) {
        Cup cup=new Cup(1000,150,"керамика","пить",400);
        System.out.println(cup);
        Plait plait=new Plait(800,100,"фарфор","есть",8);
        System.out.println(plait);
    }
}
