package Lesson_7.Prac;

import java.util.*;

public class Task_2_Queue {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }

        Queue<Integer> first_player=new LinkedList<>();
        Queue<Integer> second_player=new LinkedList<>();

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
            int first_player_card=first_player.poll();
            int second_player_card=second_player.poll();
            if(first_player_card==0 || (first_player_card>second_player_card && second_player_card!=0)){
                first_player.add(first_player_card);
                first_player.add(second_player_card);
            }
            else{
                second_player.add(first_player_card);
                second_player.add(second_player_card);
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
