package DEMO.array;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        // Khởi tạo  array
        int []a = {1,2,4};
        int []b = new int[a.length];
        b[2] = 22;

        int []arrC = new int[10];
        arrC[0] = 1;
        arrC[2] = 2;
        arrC[3] = 3;
        arrC[1] = 4;

        /*// Sử dụng fori
        for (int i = 0; i < arrC.length; i++) {
            System.out.println("Phan tu: "+ i + " value: "+ arrC[i]);
        }*/

        /*// Sử dụng foreach
        for (int item: arrC) {
            System.out.println("value: "+ item);
        }*/




        /*// Copy array
        System.arraycopy(a,0,b,0,2);

        // Loop throw array by using foreach
        for (int x: b) {
            System.out.println(x);
        }*/

        // Pass array to the method
       /* int x = 1;
        int []arr = new int[10];
        method(x, arr);
        System.out.println("x: "+ x);
        System.out.println("arr[0]: "+ arr[0]);*/

       // Sort array
        /*String[] arr1 = {"abc", "b", "dd", "ad"};
        System.out.println("Before sort");
        for (String i : arr1) {
            System.out.println(i);
        }
        Arrays.sort(arr1);

        System.out.println("After sort");
        for (String i : arr1) {
            System.out.println(i);
        }*/

        int [][]arr2 = new int[8][4];
        arr2[0][0] = 1;
        arr2[0][1] = 2;

        int [][]arr3 = new int[2][2];
        arr2[0][0] = 3;
        arr2[0][1] = 4;

        System.out.println(arr2.length);



    }

    private static void method(int i, int []arrInput){
        i = 2;
        arrInput[0] = 10;
    }
}
