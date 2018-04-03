package DoKhacTu;

import java.util.Scanner;

public class BT_16_03 {

	public static void main(String[] args) {
		float a;
		float b;
		float c;
		float x;
		float x1;
		float x2;
		float dt;

		Scanner sc = new Scanner(System.in);
		System.out.print("nhap gia tri cua a :");
		a = sc.nextFloat();
		System.out.print("nhap gia tri cua b :");
		b = sc.nextFloat();
		System.out.print("nhap gia tri cua c :");
		c = sc.nextFloat();
		dt = b * b - 4 * a * c;
		if (a == 0) {
			x = -(c / b);
			System.out.println("phuong trinh co nghiem la : " + x);
		} else {
			if (dt < 0) {
				System.out.println("phuong trinh vo nghiem");
			}
			if (dt > 0) {
				x1 = (float) ((-b + Math.sqrt(dt)) / (2 * a));
				x2 = (float) ((-b - Math.sqrt(dt)) / (2 * a));
				System.out.println("phuong trinh co nghiem la x1 : " + x1);
				System.out.println("phuong trinh co nghiem la x2 : " + x2);

			}
			if (dt == 0) {
				x = -b / (2 * a);
				System.out.printf("phuong trinh co nghiem kep : ", +x);
			}
		}
	}

	}


