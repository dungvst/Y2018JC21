package DEMO.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    void b3(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Số lượng phần từ của mảng: ");
        int arrNumber;
        while(!scanner.hasNextInt()){
            System.out.print("Invalid input. Please input the number: ");
            scanner.next();
        }
        arrNumber = scanner.nextInt();

        // Input array
        int []arrInput = new int[arrNumber];
        for (int i = 0; i < arrNumber; i++) {
            System.out.print("Element "+ (i + 1) + ": ");
            while(!scanner.hasNextInt()){
                System.out.print("Invalid input. Please input the number: ");
                scanner.next();
            }
            arrInput[i] = scanner.nextInt();
        }

        // Sort array
        Arrays.sort(arrInput);

        // Print sorted array
        int divisibleByThreeNumber = 0, divisibleByThreeTotal = 0;
        System.out.println("Mảng sau khi sort");
        for(int element: arrInput){
            if(element % 3 == 0){
                divisibleByThreeNumber += 1;
                divisibleByThreeTotal += element;
            }
            System.out.println(element);
        }

        System.out.println("Phần tử nhỏ nhất trong mảng: "+ arrInput[0]);
        System.out.println("Trung bình cộng các số chia hết cho 3: " + (float)divisibleByThreeTotal/divisibleByThreeNumber);
        scanner.close();
    }
    void inTamGiac(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu cao tam giac: ");
        int chieuCao;
        while(!scanner.hasNextInt()){
            System.out.print("Invalid input. Please input the number: ");
            scanner.next();
        }
        chieuCao = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap loai tam giac(vuong/can): ");
        String type;
        while(!scanner.hasNextLine()){
            System.out.print("Invalid input. Please input the number: ");
            scanner.next();
        }
        type = scanner.nextLine();

        if(type.equals("vuong")){
            String star = "";
            System.out.println("Tam giac vuong:");
            for (int i = 0; i < chieuCao; i++) {
                star += "*";
                System.out.println(star);
            }
        }else if(type.equals("can")){
            StringBuilder star = new StringBuilder("                           *");
            System.out.println("Tam giac can:");
            for (int i = 0; i < chieuCao; i++) {
                System.out.println(star);
                star = new StringBuilder(star.substring(1)).append("**");
            }
        }else{
            System.out.println("Invalid input");
        }
    }
    void timPhanTuLonThuNhiTrongMang(){
        int []arr = {12,34,35,54,2,1,14,45,54};

        int max = arr[0], second = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] > second && arr[i] < max){
                second = arr[i];
            }
        }
        System.out.println("Max: "+ max);
        System.out.println("Second: "+ second);
    }
}
