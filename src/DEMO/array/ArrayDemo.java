package DEMO.array;

public class ArrayDemo {

    public static void main(String[] args) {
        // Khởi tạo  array
        /*int []a = {1,2,4};
        int []b = {1,2,4};
        int []c = new int[10];

        // Copy array
        System.arraycopy(a,1,c,0,2);

        // Loop throw array by using foreach
        for (int x: c) {
            System.out.println(x);
        }*/

        // Pass array to the method
        int x = 1;
        int []arr = new int[10];
        method(x, arr);
        System.out.println("x: "+ x);
        System.out.println("arr[0]: "+ arr[0]);

    }

    private static void method(int i, int []arrInput){
        i = 2;
        arrInput[0] = 10;
    }
}
