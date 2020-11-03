package Lesson_7.Prac;

import java.util.*;

class Task_1_Stack {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }

        Stack<Integer> second_player=new Stack<>();
        Stack<Integer> first_player=new Stack<>();

        while(list.size()!=0){
            Random random=new Random();
            int index=random.nextInt(list.size());
            first_player.add(list.get(index));
            list.remove(list.get(index));
            index=random.nextInt(list.size());
            second_player.add(list.get(index));
            list.remove(list.get(index));
        }
        System.out.println("Карты первого игрока: "+first_player);
        System.out.println("Карты второго игрока: "+second_player);

        int session=0;
        while (second_player.size()!=0 && first_player.size()!=0 && session!=106){
            int first_player_card=first_player.pop();
            int second_player_card=second_player.pop();
            if(first_player_card==0 || (first_player_card>second_player_card && second_player_card!=0)){
                first_player.add(0,first_player_card);
                first_player.add(0,second_player_card);
            }
            else{
                second_player.add(0,first_player_card);
                second_player.add(0,second_player_card);
            }
            session++;
        }
        if(second_player.isEmpty())
            System.out.println("first "+session);
        else if(first_player.isEmpty())
            System.out.println("second "+session);
        else
            System.out.println("botva");
    }
}
