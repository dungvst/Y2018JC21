package STUDENTS.VietAnh;

import java.util.*;

public class BaiTapVeNha1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a");
		float a = sc.nextFloat();
		System.out.println("gia tri a=" + a);
		System.out.println("Nhap b");
		float b = sc.nextFloat();
		System.out.println("gia tri b=" + b);
		System.out.println("Nhap 1 de chon phep cong");
		System.out.println("Nhap 2 de chon phep tru");
		System.out.println("Nhap 3 de chon phep nhan");
		System.out.println("Nhap 4 de chon phep chia");
		int x = sc.nextInt();
		sc.close();
		if (x == 1) {
			System.out.println("Ban da chon phep cong, ket qua=" + (a + b));
		} else if (x == 2) {
			System.out.println("Ban da chon phep tru, ket qua=" + (a - b));
		} else if (x == 3) {
			System.out.println("Ban da chon phep nhan, ket qua=" + (a * b));
		} else if (x == 4) {
			if (a != 0 & b == 0) {
				System.out.println("Cannot divide by zero");
			} else if (a == 0 & b == 0) {
				System.out.println("Result of function is underfined");
			} else {
				System.out.println("Ban da chon phep chia, ket qua=" + (a / b));
			}

		}

	}
}