package STUDENTS.MaiAnh.HomeWork.Lession9.Bai2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer []integerNums = {1, 5, 7, 3, 8, 10, 11};
        String []languages = {"Java", "C", "C++", "PHP", "JavaScrift"};
        System.out.println("The integer numbers array BEFORE changes value of 2 elements: ");
        display(integerNums);
        System.out.println();
        System.out.println("The languages array BEFORE changes value of 2 elements: ");
        display(languages);
        System.out.println();
        changesValueOfElement(integerNums, 2, 3, 9999, 9999);
        changesValueOfElement(languages, 0, 1, "ĐÃ THAY ĐỔI", "CHANGED");
        System.out.println("The integer numbers array AFTER changes value of 2 elements: ");
        display(integerNums);
        System.out.println();
        System.out.println("The languages array AFTER changes value of 2 elements: ");
        display(languages);


    }


   public static <E> void changesValueOfElement(E[] array, int a, int b, E x, E y){
        array[a] = x;
        array[b] = y;
    }

    public static <E> void display(E[] array){
       int i=1;
        for (E element: array
             ) {
            //System.out.println("The element " + i + ": " + element);
            System.out.print(element + "\t\t");
        }
        System.out.println();
    }

}
