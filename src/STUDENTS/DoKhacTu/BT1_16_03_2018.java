package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class BT1_16_03_2018 {

	public static void main(String[] args) {
		int a;
		int b;
		int x;
		int menu;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("moi nhap a: ");
		a = sc.nextInt();
		System.out.println("moi nhap b: ");
		b = sc.nextInt();

		System.out.println("1.chon phep cong");
		System.out.println("2.chon phep tru");
		System.out.println("3.chon phep nhan");
		System.out.println("4.chon phep chia");

		menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("chon 1");
			x = a + b;
			System.out.println("ket qua phep cong la :" + x);
			break;
		case 2:
			System.out.println("chon 2");
			x = a - b;
			System.out.println("ket qua phep tru la :" + x);
			break;
		case 3:
			System.out.println("chon 3");
			x = a * b;
			System.out.println("ket qua phep nhan la :" + x);
			break;
		case 4:
			System.out.println("chon 4");
		
			if (b == 0) {

				System.out.println("Cannot divide by zero");
			} else {
				x=a/b;
				System.out.println("ket qua phep chia la :" + x);
			}
			if (a == 0 && b == 0) {
				System.out.println("Result of function is underfined");
			}

			break;

		default:
			System.out.println("ban chua chon");

		}
		System.out.println("END");
	}
		

	}


