package com;

import java.util.*;
//Буртаев Олег ИКБО-03-19

public class Java_ynic {
    public static void main(String[] args) {
        task_1_and_4();
        task_2(args);
        task_3();
        task_5();

        Book book=new Book("Толстой","Война и мир",5000);
        System.out.println(book.toString());
        Ball ball=new Ball("red",2000);
        System.out.println(ball.toString());
        Dog dog=new Dog(8,"male",false);
        System.out.println(dog.toString());

    }
    static void task_1_and_4(){
        int []mas=new int[20];
        for (int i = 0; i < 20; i++) {
            mas[i]= (int)(Math.random()*1000);
        }
        for (int i:mas){
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.sort(mas);
        int index=0;
        while(index<20){
            System.out.print(mas[index]+" ");
            index++;
        }
        System.out.println();
        index=0;
        do{
            System.out.print(mas[index]+" ");
            index++;
        }while (index<20);
        System.out.println();
    }

    static void task_2(String []args){
        for(String str:args){
            System.out.print(str+" ");
        }
        System.out.println();
    }

    static void task_3(){
        Double row=0.0;
        for (int i = 1; i <= 10; i++) {
            row+=(double)1/i;
            System.out.print(row+" ");
        }
        System.out.println();
    }

    static void task_5(){
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        long result=1;
        for (int i = 1; i <= number ; i++) {
            result*=i;
        }
        System.out.println("Факториал числа "+ number+" равен "+result);
        System.out.println();
    }
}



class Dog{
    public int age;
    public String sex;
    public boolean homeless;

    public Dog(int age, String sex, boolean homeless) {
        this.age = age;
        this.sex = sex;
        this.homeless = homeless;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isHomeless() {
        return homeless;
    }

    public void setHomeless(boolean homeless) {
        this.homeless = homeless;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", homeless=" + homeless +
                '}';
    }
}

class Book{
    private String title;
    private int pages;
    private String author;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}

class Ball{
    private String color;
    private int price;

    public Ball(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

