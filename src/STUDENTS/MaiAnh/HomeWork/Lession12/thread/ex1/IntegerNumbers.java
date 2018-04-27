package STUDENTS.MaiAnh.HomeWork.Lession12.thread.ex1;

import java.awt.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class IntegerNumbers {
    private int[] intNumbers;
    private List listSum;
    private int max;

// Constructor
    public IntegerNumbers() {
    }

    IntegerNumbers(int[] intNumbers, List<Integer> listSum){
        this.intNumbers = intNumbers;
        this.listSum = listSum;
    }

// Method: create integer numbers array with the number of elements is n>4
    public void createArray() {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter the number of elements more than 4:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            intNumbers[i] = rd.nextInt();
        }
    }
// Method: print integer numbers array
    public void printIntNumbers(){
        for(int i=0; i<intNumbers.length; i++){
            System.out.printf("Element %d: %d\n", (i+1), intNumbers[i]);
        }
    }


    public int[] getIntNumbers() {
        return intNumbers;
    }

    public void setIntNumbers() {

        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter the number of elements more than 4:");
        int n = scanner.nextInt();
        intNumbers = new int[n];
        for (int i=0; i<n; i++){
            intNumbers[i] = rd.nextInt();
        }
    }

    public List<Integer> getListSum() {
        return listSum;
    }


    public void setListSum(List listSum) {
        this.listSum = listSum;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}

