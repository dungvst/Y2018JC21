package HOANGDV.BTVN;

import java.util.Scanner;

public class Buoi4Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai Tap kiem tra thong tin nguoi dung");

		Scanner scan = new Scanner(System.in);

		System.out.println("Nhap Ten: ");
		String ten = scan.nextLine();
		System.out.println("Nhap Tuoi: ");
		String tuoi = scan.nextLine();
		System.out.println("Nhap Gioi Tinh: ");
		String gioiTinh = scan.nextLine();
		System.out.println("Nhap Tinh Trang Hon Nhan: ");
		String honNhan = scan.nextLine();
		
		if (ten.equals("") || tuoi.equals("") || gioiTinh.equals("") || honNhan.equals("")) {
			System.out.println("Nhap thieu du lieu");
		} else {
			if ((gioiTinh.equals("Nam") && Integer.parseInt(tuoi) >= 22 && honNhan.equals("Chua co gia dinh"))
					|| (gioiTinh.equals("Nam") && Integer.parseInt(tuoi) >= 22 && honNhan.equals("Ly hon"))) {
				System.out.println("Ban duoc tham gia");
			} else if (gioiTinh.equals("Nu") && Integer.parseInt(tuoi) >= 19 && honNhan.equals("Doc than")) {
				System.out.println("Ban duoc tham gia");
			} else {
				System.out.println("Ban ko duoc tham gia");
			}
		}
		scan.close();
	}

}
