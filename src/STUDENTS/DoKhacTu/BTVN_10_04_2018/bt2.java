package DoKhacTu.BTVN_10_04_2018;

import java.util.LinkedList;

public class bt2 {

	public static <E> void main(String args[]) {

		LinkedList<E> a = new LinkedList<>();
		a.add((E) new Integer(1));
		a.add((E) new Integer(2));
		a.add((E) new Integer(3));
		a.add((E) new Integer(6));
		System.out.print("Mảng là:");
		for (E e : a) {
			System.out.printf("  " + e);
		}
		a.set(0, (E) new Integer(10));
		a.set(3, (E) new Integer(50));
		System.out.print("\nMảng mới là:");
		for (E e : a) {
			System.out.printf("  " + e);

		}
	}

}