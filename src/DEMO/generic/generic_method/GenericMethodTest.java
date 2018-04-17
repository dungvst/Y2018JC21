package DEMO.generic.generic_method;

import DEMO.generic.KeyValue;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericMethodTest {

    // phuong thuc generic co ten la printArray
    public static < E > void printArray( E[] inputArray )
    {
        // Hien thi cac phan tu mang
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    // <K,V> : Nói rằng phương thức này có 2 kiểu tham số K,V
    // Phương thức trả về một đối tượng kiểu K.
    public static <K, V> K getKey(KeyValue<K, V> entry) {
        K key = entry.getKey();
        return key;
    }

    // <K,V> : Nói rằng phương thức này có 2 kiểu tham số K,V
    // Phương thức trả về một đối tượng kiểu V.
    public static <K, V> V getValue(KeyValue<K, V> entry) {
        V value = entry.getValue();
        return value;
    }

    // ArrayList<E>: Danh sách chứa các phần tử kiểu E.
    // Phương thức trả về một đối tượng kiểu E.
    public static <E> E getFirstElement(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        E first = list.get(0);
        return first;
    }

    public static <E, T> T testTwoTypeParameter(LinkedList<E> linkedList, ArrayList<T> arrayList){
        return arrayList.get(0);
    }

    public static <E, T> ArrayList<T> testTwoTypeParameter2(LinkedList<E> linkedList, ArrayList<T> arrayList){
        return arrayList;
    }

    public static void main( String args[] )
    {
        // Tao cac mang Integer, Double va Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        // Start test testTwoTypeParameter
        ArrayList<Student> arrayListStudent = new ArrayList<>();
        arrayListStudent.add(new Student("sd1",10));
        arrayListStudent.add(new Student("sd2",11));
        arrayListStudent.add(new Student("sd3",12));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

//        Student student = testTwoTypeParameter(linkedList, arrayListStudent);
//        System.out.println("Student: "+ student);

        ArrayList<Student> lsStudent = testTwoTypeParameter2(linkedList, arrayListStudent);
        System.out.println("Student: "+ lsStudent);

        // End test testTwoTypeParameter

       /* System.out.println( "Mang intArray bao gom:" );
        printArray( intArray  ); // truyen mot mang Integer

        System.out.println( "\nMang doubleArray bao gom:" );
        printArray( doubleArray ); // truyen mot mang Double

        System.out.println( "\nMang charArray bao gom:" );
        printArray( charArray ); // truyen mot mang Character


        // Tạo một đối tượng KeyValue
        // Integer: Số điện thoại (K = Integer)
        // String: Tên người dùng. (V = String).
        KeyValue<Integer, String> entry = new KeyValue<Integer, String>(12000111, "Tom");

        // Java hiểu kiểu trả về là Integer (K = Integer).
        Integer phone = entry.getKey();

        // Java hiểu kiểu trả về là String (V = String).
        String name = entry.getValue();

        System.out.println("Phone = " + phone + " / name = " + name);*/
    }
}
