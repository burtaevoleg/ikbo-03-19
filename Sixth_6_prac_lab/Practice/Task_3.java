package Sixth_6_prac_lab.Practice;

import Sixth_6_prac_lab.Practice.SortingStudentsByGPA;
import Sixth_6_prac_lab.Practice.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random random=new Random();
        SortingStudentsByGPA sortingStudentsByGPA=new SortingStudentsByGPA();
        List<Student> ourClass1=new ArrayList<>();
        List<Student> ourClass2=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ourClass1.add(new Student("Alex",random.nextInt(10)+1, random.nextInt(300), random.nextInt(100)));
            ourClass2.add(new Student("Oleg",random.nextInt(10)+1, random.nextInt(300), random.nextInt(100)));
        }
        ourClass1.sort(sortingStudentsByGPA);
        ourClass2.sort(sortingStudentsByGPA);
        System.out.println("Первая часть класса:");
        for (Student s:ourClass1){
            System.out.println("\t"+s.toString());
        }
        System.out.println("Вторая часть класса:");
        for (Student s:ourClass2){
            System.out.println("\t"+s.toString());
        }
        List<Student> wholeClass=margeSort(ourClass1,ourClass2);
        System.out.println("Весь класс:");
        for (Student s:wholeClass){
            System.out.println("\t"+s.toString());
        }
    }

    public static List<Student> margeSort(List<Student> ourClass1, List<Student> ourClass2){
        List<Student> wholeClass=new ArrayList<>();
        int i1=0,i2=0;
        while (wholeClass.size()!=ourClass1.size()+ourClass2.size()){
            if(i1>=ourClass1.size()){
                wholeClass.add(ourClass2.get(i2++));
            }
            else if(i2>=ourClass2.size()){
                wholeClass.add(ourClass1.get(i1++));
            }
            else if(ourClass1.get(i1).getSumOfPoints()>ourClass2.get(i2).getSumOfPoints()){
                wholeClass.add(ourClass1.get(i1++));
            }
            else{
                wholeClass.add(ourClass2.get(i2++));
            }
        }
        return wholeClass;
    }
}
