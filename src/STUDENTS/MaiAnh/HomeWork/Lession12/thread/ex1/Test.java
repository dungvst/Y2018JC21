package STUDENTS.MaiAnh.HomeWork.Lession12.thread.ex1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("So phan tu mang: ");
        int n = scanner.nextInt();
        int[] intNumbers = new int[n];
        Random rd = new Random();
        for(int i =0; i<n; i++){
            intNumbers[i] = rd.nextInt();
        }

        List listSum = new ArrayList<Integer>();
        IntegerNumbers ii = new IntegerNumbers(intNumbers,listSum);


        System.out.println("Enter indexTo of the sum 1:");
        int n1 = scanner.nextInt();
        System.out.println("Enter indexTo of the sum 2:");
        int n2 = scanner.nextInt();
        System.out.println("Enter indexTo of the sum 3:");
        int n3 = scanner.nextInt();



        CalculateSum sum1 = new CalculateSum(0, n1, ii);
        CalculateSum sum2 = new CalculateSum(n1, n2, ii);
        CalculateSum sum3 = new CalculateSum(n2, n3, ii);
        CalculateSum sum4 = new CalculateSum(n3, ii.getIntNumbers().length, ii);

        sum1.start();

        try{
            sum1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        sum2.start();


        try{
            sum2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        sum3.start();


        try{
            sum3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        sum4.start();

        try{
            sum1.join();
            sum2.join();
            sum3.join();
            sum4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        int sums =0;
        for (Integer s: ii.getListSum()) {
            sums = sums + (int)s;
        }
        System.out.println("Sum: " + sums);
    }
}
