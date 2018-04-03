package STUDENTS.Tienhm;

import java.util.Scanner;

public class B3_solonthu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);

		int mang[] = new int[10];
		int index;
		for (index = 0; index < 10; index++) {
			System.out.println("nhap so thu " + index);
			mang[index] = nhap.nextInt();
		}
		int max = mang[0];
		int max2= mang [0];
		for (index = 0; index < 10; index++) {
			if (mang[index] > mang[0]) {
				max = mang[index];
			}
		}
		for (index = 0; index < 10; index++) {
			if (mang[index] > mang[0] && mang[index] < max) {
				max2 = mang[index];
			}
		}
		System.out.println("gia tri lon 2 cua mang là " + max2);
		nhap.close();
	}
}
