package Fifth_5_prac_lab.Pcactice;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char []mas=str.toCharArray();
        String result= isPolindrom(mas) ? "YES" : "NO";
        System.out.println(result);
    }
    public static boolean isPolindrom(char []mas){
        if (mas[0]==mas[mas.length-1]){
            String str=String.copyValueOf(mas);
            str=str.substring(1,str.length()-1);
            if(str.length()==0 || str.length()==1) return true;
            if(isPolindrom(str.toCharArray()))
                return true;
        }
        return false;
    }
}
