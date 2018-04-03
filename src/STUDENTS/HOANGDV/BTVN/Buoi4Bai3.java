package HOANGDV.BTVN;

import java.util.Scanner;

public class Buoi4Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Bai Tap nhap hai so va nhap phep toan");
		//
		// Scanner scan = new Scanner(System.in);
		//
		// System.out.println("Nhap a: ");
		// double a = scan.nextDouble();
		// System.out.println("Nhap b: ");
		// double b = scan.nextDouble();
		//
		// System.out.println("Nhap phep toan voi:/n 1 -> Cong/n 2 -> Tru/n 3 -> Nhan/n
		// 4 -> Chia");
		// double phepToan = scan.nextInt();
		//
		// if (phepToan == 1) {
		// System.out.println("Ket qua la: " + (a + b));
		// } else if (phepToan == 2) {
		// System.out.println("Ket qua la: " + (a - b));
		// } else if (phepToan == 3) {
		// System.out.println("Ket qua la: " + (a * b));
		// } else if (phepToan == 4) {
		// if (a != 0 && b == 0) {
		// System.out.println("Khong the chia cho 0");
		// } else if (a == 0 && b == 0) {
		// System.out.println("Khong co ket qua nay");
		// } else {
		// System.out.println("Ket qua la: " + (a / b));
		// }
		// } else {
		// System.out.println("Ban da nhap sai phep toan. Bye!");
		// }
		// scan.close();
		Scanner dt = new Scanner(System.in);
		int n, i, j;
		do {
			System.out.println("nhap so luong phan tu mang: ");
			n = dt.nextInt();
		} while (n <= 0);
		int mang[] = new int[n];
		for (i = 0; i < n; i++) {
			System.out.println("nhap vi tri thu " + (i + 1) + " cua mang");
			mang[i] = dt.nextInt();
		}

		int tg;
		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++) {
				if (mang[i] > mang[j]) {
					tg = mang[i];
					mang[i] = mang[j];
					mang[j] = tg;

				}

			}
		for (i = 0; i < n; i++) {
			if (mang[0] > mang[i]) {
				System.out.println("phan tu lon thu 2 cua mang la : " + mang[i]);
				break;
			}
		}
	}

}
