package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class BT2_16_03_2018 {

	public static void main(String[] args) {
		String ten;
		String TTHonNhan;
		int tuoi;
		String GioiTinh;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten: ");
		ten = sc.next();
		System.out.println("nhap tuoi: ");
		tuoi = sc.nextInt();
		System.out.println("nhap tinh trang hon nhan: ");
		TTHonNhan = sc.next();
		System.out.println("nhap gioi tinh: ");
		GioiTinh = sc.next();
		System.out.println("Moi ban chon: ");
		System.out.println("1.Nam,chua co gia dinh hoặc ly hon");
		System.out.println("2.Nu, chua co gia dinh hoặc ly hon");
		System.out.println("3.Em chua 19");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("chon 1");
			if (tuoi >= 22) {
				System.out.println("duoc phep tham gia");
			} else {
				System.out.println("khong duoc tham gia");
			}
			break;
		case 2:
			System.out.println("chon 2");
			if (tuoi >= 19) {
				System.out.println("duoc phep tham gia");
			} else {
				System.out.println("khong duoc tham gia");
				break;
			}
		case 3:
			System.out.println("chon 3"); {
			System.out.println("khong duoc phep tham gia");
			break;
		}
		default:
			System.out.println("ban chua chon");

		}
		System.out.println("END");
	}

}
