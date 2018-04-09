package DEMO.generic.generic_inheritance;

import DEMO.generic.KeyValue;

public class GenericInheritanceTest {
    public static void main(String[] args) {
        PhoneNameEntry entry = new PhoneNameEntry(12000111, "Tom");

        // Java hiểu kiểu trả về là Integer.
        Integer phone = entry.getKey();

        // Java hiểu kiểu trả về là String.
        String name = entry.getValue();

        System.out.println("Phone = " + phone + " / name = " + name);
    }
}

// Lớp này mở rộng (extends) từ lớp KeyValue<K,V>.
// Và chỉ định rõ K,V:
// K = Integer  (Số điện thoại).
// V = String   (Tên người dùng).
class PhoneNameEntry extends KeyValue<Integer, String> {

    public PhoneNameEntry(Integer key, String value) {
        super(key, value);
    }

}

// Lớp này mở rộng (extends) từ lớp KeyValue<K,V>.
// Xác định rõ kiểu tham số <K> là String.
// Vẫn giữ kiểu tham số Generic <V>.
class StringAndValueEntry<V> extends KeyValue<String, V> {

    public StringAndValueEntry(String key, V value) {
        super(key, value);
    }

}

// Lớp này mở rộng (extends) từ lớp KeyValue<K,V>
// Nó có thêm một tham số Generics <I>.
class KeyValueInfo<K, V, I> extends KeyValue<K, V> {

    private I info;

    public KeyValueInfo(K key, V value) {
        super(key, value);
    }

    public KeyValueInfo(K key, V value, I info) {
        super(key, value);
        this.info = info;
    }

    public I getInfo() {
        return info;
    }

    public void setInfo(I info) {
        this.info = info;
    }

}