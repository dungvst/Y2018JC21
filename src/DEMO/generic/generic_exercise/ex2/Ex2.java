package DEMO.generic.generic_exercise.ex2;

public class Ex2 {
    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {

    }
}
