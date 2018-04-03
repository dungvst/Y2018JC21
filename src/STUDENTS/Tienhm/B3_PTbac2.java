package STUDENTS.Tienhm;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class B3_PTbac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nhap = new Scanner(System.in);
		System.out.println("nhap gia tri a =");
		double a = nhap.nextInt();

		System.out.println("nhap gia tri b =");
		int b = nhap.nextInt();

		System.out.println("nhap gia tri c =");
		int c = nhap.nextInt();

		double dt;
		dt = b * b - 4 * a * c;

		double X = -b / c;
		double X1 = (-b + sqrt(dt)) / (2 * a);
		double X2 = (-b - sqrt(dt)) / (2 * a);

		if (a == 0) {
			System.out.println("phuong trinh bac 1:" + "X=" + (-b / c));
		} else if (dt == 0) {
			System.out.println("phuong trinh co nghiem kep:" + "X=" + X);
		} else if (dt < 0) {
			System.out.println("phuong trinh vo nghiem");
		} else {
			System.out.println("phuong trinh co 2 nghiem phan biet:" + "X1=" + X1 + "," + "X2=" + X2);
		}
		nhap.close();
	}

	private static int sqrt(double dt) {
		// TODO Auto-generated method stub
		return 0;
	}

}
