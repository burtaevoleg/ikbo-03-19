package Fifth_5_prac_lab.Pcactice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<Integer> numbers=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(n%i==0 && isPrime(i))
                numbers.add(i);
        }
        System.out.println(numbers.toString());

    }

    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0 && isPrime(i)) return false;
         }
        return true;
    }
}
