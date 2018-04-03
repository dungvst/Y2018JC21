package Phamduydieu;

import java.util.Scanner;

public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giá trị của a:");
		int a = sc.nextInt();
		System.out.println("Nhập giá trị của b:");
		int b = sc.nextInt();
		System.out.println("Nhập giá trị của c:");
		int c = sc.nextInt();
		int dt = b * b - 4 * a * c;
		if (a == 0) {
			System.out.println(" Nghiệm của phương trình: x = " + -c / b);
		} else {
			if (dt < 0) {
				System.out.println("Phương trình vô nghiệm..!");
			} else {
				if (dt == 0) {
					System.out.println("Phương trình có nghiệm kép: x = " + (-b / (2 * a)));
				}

				else {
					System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + (-b + Math.sqrt(dt)) / (2 * a));
					System.out.println("x2 = " + (-b - Math.sqrt(dt)) / (2 * a));
				}
			}
		}
	}
}
