package STUDENTS.HOANGDV.BTVN.GENERIC.Ex2;

import java.util.ArrayList;

public class Main {

    public static <E> void modifyArray(E[]ArrayList,int i, int j,E x,E y){
        System.out.print("Mảng ban đầu\n");
        for (E element:ArrayList){
            System.out.print(element+" ");
        }
        ArrayList[i] = x;
        ArrayList[j] = y;
        System.out.println();
        System.out.print("Mảng đã thay đổi giá trị\n");
        for (E element:ArrayList){
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        Double[]doubleArray = {1.1,2.2,3.3,4.4};
        Character[]charactersArray = {'A','B','C','D'};
        modifyArray(intArray,0,1,4,5);
        modifyArray(doubleArray,2,3,6.2,5.9);
        modifyArray(charactersArray,1,2,'D','E');
    }
}
