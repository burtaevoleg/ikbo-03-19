package Sixth_6_prac_lab.Practice;


import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Student []mas=new Student[10];
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            mas[i]=new Student("Alex",random.nextInt(10)+1, random.nextInt(300), random.nextInt(100));
        }
        System.out.print("До сортировки: ");
        for (Student s : mas) {
            System.out.print(s.getIdNumber()+" ");
        }
        for (int i = 1; i < 10; i++) {
            int left=i-1;
            int index=i;
            while (left>=0 && mas[left].getIdNumber()>mas[index].getIdNumber()){
                Student tmp=mas[left];
                mas[left]=mas[index];
                mas[index]=tmp;
                index--;
                left--;
            }
        }
        System.out.println();
        System.out.print("После сортировки: ");
        for (Student s: mas) {
            System.out.print(s.getIdNumber()+" ");
        }
    }
}



class Student{
    private String name;
    private int numberOfClass;
    private int sumOfPoints;
    private int idNumber;

    public Student(String name, int numberOfClass, int sumOfPoints, int idNumber) {
        this.name = name;
        this.numberOfClass = numberOfClass;
        this.sumOfPoints = sumOfPoints;
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfClass() {
        return numberOfClass;
    }

    public void setNumberOfClass(int numberOfClass) {
        this.numberOfClass = numberOfClass;
    }

    public int getSumOfPoints() {
        return sumOfPoints;
    }

    public void setSumOfPoints(int sumOfPoints) {
        this.sumOfPoints = sumOfPoints;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", numberOfClass=" + numberOfClass +
                ", sumOfPoints=" + sumOfPoints +
                ", idNumber=" + idNumber +
                '}';
    }
}