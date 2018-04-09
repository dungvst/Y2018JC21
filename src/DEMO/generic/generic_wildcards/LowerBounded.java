package DEMO.generic.generic_wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(1);
        arrInt.add(2);
        arrInt.add(3);

        addIntegers(arrInt);
        System.out.println(arrInt);
    }

    public static void addIntegers(List<? super Integer> list){
        list.add(new Integer(50));
    }
}
