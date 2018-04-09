package DEMO.generic.generic_wildcards;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {
    public static void printData(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrString = new ArrayList<>();
        arrString.add("s1");
        arrString.add("s2");
        arrString.add("s3");


        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(1);
        arrInt.add(2);
        arrInt.add(3);

        System.out.println("String value:");
        printData(arrString);

        System.out.println("Integer value:");
        printData(arrInt);
    }
}
