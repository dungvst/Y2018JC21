package DEMO.collection;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("Java");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");


        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.print("\t" + linkedList + "\n");

       /*// new TreeSet() sẽ sắp xếp các phần tử
        Set<String> hashSet = new TreeSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("Các phần tử của Set");
        System.out.print("\t" + hashSet + "\n");
*/
       // new TreeMap() sẽ sắp xếp các phần tử dựa vào key của chúng
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", "Java");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap);

        // Duyệt mảng sử dụng iterator
        System.out.println("Duyệt mảng sử dụng iterator");
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println("Key: " + me.getKey() + " Value: "+ me.getValue());
        }

        /*  // Duyệt mảng sử dụng foreach
        System.out.println("Duyệt mảng sử dụng foreach");
        for (String s: arrayList) {
            System.out.println("Value: " + s);
        }

        // Duyệt mảng sử dụng fori
        System.out.println("Duyệt mảng sử dụng fori");
        for (int i = 0 ; i < arrayList.size(); i++) {
            System.out.println("Value: " + arrayList.get(i));
        }*/
    }
}
