package Fifth_5_prac_lab.Pcactice;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int size=(numberSize(number,0));
        System.out.println(turnNumber(number,size));
    }

    public static int numberSize(int number,int iteration){
        if(number/10==0){
            return iteration;
        }
        return numberSize(number/10,iteration+1);
    }

    public static int turnNumber(int number,int iteration){
        int result= (int) ((number%10)*Math.pow(10,iteration));
        if(number/10==0){
            return result;
        }
        return result+turnNumber(number/10,iteration-1);
    }

}
