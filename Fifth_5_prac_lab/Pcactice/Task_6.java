package Fifth_5_prac_lab.Pcactice;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        String result=isPrime(number,number/2) ? "YES" : "NO";
        System.out.println(result);
    }

    public static boolean isPrime(int number,int i){
        if(i==1) return true;
        if(number%i==0) return false;
        else return isPrime(number,i-1);
    }
}
