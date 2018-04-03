package STUDENTS.Tienhm;

import java.util.Scanner;



public class baitapvn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nhap = new Scanner(System.in);

		System.out.println("nhap gia tri cua a:");
		System.out.print("a=");
		int a = nhap.nextInt();

		System.out.println("nhap gia tri cua b:");
		System.out.print("b=");
		int b = nhap.nextInt();

		System.out.println("lua chon cac phep toan sau : ");
		System.out.println("1.phep cong, 2. phep tru, 3.phep nhan, 4 phep chia");
		
		String f=nhap.nextLine();
		String f1=nhap.nextLine();
		
		System.out.print("nhap phep toan c:");
		int c = nhap.nextInt();
		if (c == 1) {
			System.out.println("ket qua la:" + "a+b="+(a + b));
		} else if (c == 2) {
			System.out.println("ket qua la:" + (a - b));
		} else if (c == 3) {
			System.out.println("ket qua la:" + (a * b));
		} else if (c == 4) {
			System.out.println("ket qua la:" + (a * b));
		} else {
			System.out.println("phep toan khong thich hop");
		}

		nhap.close();
	}

}
