package DEMO.generic.non_generic;

import java.util.ArrayList;
import java.util.List;

public class NonGeneric {
    public static void main(String[] args) {

        /*With out generic*/
        List list = new ArrayList();
        list.add("abc");
//        list.add(new Integer(5)); //OK

        for(Object obj : list){
            //type casting leading to ClassCastException at runtime
            String str=(String)obj ;
            System.out.println(str);
        }

        /*Use generic*/
        List<String> list1 = new ArrayList<String>();
        list1.add("abc");
//        list1.add(new Integer(5)); //compiler error

        for(String str : list1){
            //no type casting needed, avoids ClassCastException
            System.out.println(str);

        }
    }
}
