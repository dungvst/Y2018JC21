package STUDENTS.VQChinh_iMic;

import java.util.Scanner;

public class PhuongTrinhBacHai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap a:\t");
		int a = scanner.nextInt();
		System.out.print("Nhap b:\t");
		int b = scanner.nextInt();
		System.out.print("Nhap c:\t");
		int c = scanner.nextInt();

		if (a == 0) {
			System.out.println("Phuong trinh bac 1");
		} else {
			float delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Phuong Trinh Vo Nghiem");
			} else if (delta == 0) {
				float x = -b / (2 * a);
				System.out.println("Phuong Trinh Co nghiem kep la " + x);
			} else {
				float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
				float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
				System.out.println("x1 = \t" + x1);
				System.out.println("x2 = \t" + x2);
			}
		}
	}
}
