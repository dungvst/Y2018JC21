package DEMO.generic.generic_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBounded {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(1);
        arrInt.add(2);
        arrInt.add(3);

        // Lỗi do màng Integer và xử lý Double trong function
//        double sum = sumWithOutUpper(arrInt);
        double sum = sumWithUpper(arrInt);
        System.out.println("Sum of ints="+sum);      

    }
    public static double sumWithOutUpper(List<Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }

    public static double sumWithUpper(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
}
