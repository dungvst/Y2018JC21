package STUDENTS.MaiAnh.HomeWork.Lession12.thread.ex2;

import STUDENTS.MaiAnh.HomeWork.Lession12.thread.ex1.IntegerNumbers;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerNumbers iii = new IntegerNumbers();
        iii.setIntNumbers();
        iii.printIntNumbers();
        iii.setMax(iii.getIntNumbers()[0]);
        System.out.println("Enter indexTo of the group 1:");
        int n1 = scanner.nextInt();
        System.out.println("Enter indexTo of the group 2:");
        int n2 = scanner.nextInt();
        System.out.println("Enter indexTo of the group 3:");
        int n3 = scanner.nextInt();

        FindMax findMaxInGroup1 = new FindMax(0, n1, iii);
        Thread t1 = new Thread(findMaxInGroup1);
        FindMax findMaxInGroup2 = new FindMax((n1+1), n2, iii);
        Thread t2 = new Thread(findMaxInGroup2);
        FindMax findMaxInGroup3 = new FindMax((n2+1), n3, iii);
        Thread t3 = new Thread(findMaxInGroup3);
        FindMax findMaxInGroup4 = new FindMax((n3+1), iii.getIntNumbers().length-1, iii);
        Thread t4 = new Thread(findMaxInGroup4);

        t1.start();
        try{
            t1.join();
        }catch (InterruptedException e ){
            e.printStackTrace();
        }

        t2.start();
        try{
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        t3.start();
        try{
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        t4.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(iii.getMax());
    }
}
