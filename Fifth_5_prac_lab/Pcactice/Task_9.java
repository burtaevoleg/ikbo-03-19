package Fifth_5_prac_lab.Pcactice;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(); // нули
        int b=in.nextInt(); // единицы
        String number="1";
        b-=1;
        System.out.println("Ответ: "+Zero(number,a,b));
    }

    public static int Zero(String str,int a,int b){
        int result=0;
        if(a==0 && b==0 && !(str.contains("00"))){
            result+=1;
            return result;
        }
        if(a!=0){
            result+=Zero(str+"0",a-1,b);
        }
        if(b!=0){
            result+=Zero(str+"1",a,b-1);
        }
        return result;
    }
}
