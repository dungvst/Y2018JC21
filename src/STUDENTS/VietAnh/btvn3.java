package STUDENTS.VietAnh;

import java.util.Scanner;

public class btvn3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max1 = 0;
		int a1[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println(" gia tri cua mang la:");
			System.out.println("a1[" + i + "]");
			a1[i] = sc.nextInt();
			if (i == 0) {
				a1[0] = max1;
			} else if (a1[i] > max1) {
				max1 = a1[i];
			}

		}

		int max2 = a1[0];
		for (int i = 0; i < 10; i++) {
			if (a1[i] > max2 & a1[i] < max1) {
				max2 = a1[i];
			}
		}
		System.out.println("gia tri lon thu 2 la:" + max2);

	}
}
