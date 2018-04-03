package STUDENTS.VietAnh;

import java.util.Scanner;

public class BaiTapVeNha2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("********Chao mung ban tham gia chuong trinh ket ban 4 phuong********");
		System.out.println("^^De tham gia chuong trinh moi ban nhap cac yeu cau duoi day^^");
		System.out.println("===================================");
		System.out.println("Xin moi ban nhap ten");
		String a = sc.nextLine();
		System.out.println("Ten cua ban la:" + a);
		System.out.println(".............................");
		System.out.println("Xin moi ban nhap tuoi");
		int b = sc.nextInt();
		System.out.println("Tuoi cua ban la:" + b);
		System.out.println(".............................");

		System.out.println("Xin moi ban chon gioi tinh:");
		System.out.println("+)Nhan 1 de chon gioi tinh Nam");
		System.out.println("+)Nhan 2 de chon gioi tinh Nu");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("Gioi tinh cua ban la Nam");
			break;
		case 2:
			System.out.println("Gioi tinh cua ban la Nu");
			break;
		}
		System.out.println(".............................");
		System.out.println("Xin moi ban chon Tinh Trang Hon Nhan");
		System.out.println("+)Nhan 3 de chon doc than");
		System.out.println("+)Nhan 4 de chon da li hon");
		System.out.println("+)Nhan 5 de chon da co gia dinh");
		int d = sc.nextInt();
		switch (d) {
		case 3:
			System.out.println("Tinh trang hon nhan cua ban la doc than");
			break;
		case 4:
			System.out.println("Tinh trang hon nhan cua ban la da li hon");
			break;
		case 5:
			System.out.println("Tinh trang hon nhan cua ban la da co gia dinh");
			break;
		}
		if (c == 1 & b >= 22 & d != 5) {
			System.out.println("<3<3<3<3<3<3<3<3<3<3");
			System.out.println("Ban du dieu kien de tham gia ket ban, hay tim duoc that nhieu ban be nha :3");
		}
		if (c == 2 & b >= 19 & d != 5) {
			System.out.println("<3<3<3<3<3<3<3<3<3<3");
			System.out.println("Ban du dieu kien de tham gia ket ban, hay tim duoc that nhieu ban be nha :3");

		} else if(b<19) {
			System.out.println("Rat tiec ban khong du dien kien tham gia ket ban -.-");
		} else {
			System.out.println("Rat tiec ban khong du dien kien tham gia ket ban -.-");
		}
	}
}
