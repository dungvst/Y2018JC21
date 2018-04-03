package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class Main_26_03_2018 {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Ten san pham 1: ");
		sp1.setTenSanPham(sc.nextLine());
		System.out.println("Don gia san pham 1: ");
		sp1.setDonGia(sc1.nextFloat());
		System.out.println("Giam gia san pham 1: ");
		sp1.setDonGia(sc1.nextFloat());
		System.out.println("Ten san pham 2: ");
		sp2.setTenSanPham(sc.nextLine());
		System.out.println("Don gia san pham 2: ");
		sp2.setDonGia(sc1.nextFloat());
		System.out.println("Giam gia san pham 2: ");
		sp2.setDonGia(sc1.nextFloat());
		System.out.println("San pham 1: ");
		sp1.xuatThongTin();
		System.out.println("San pham 2: ");
		sp2.xuatThongTin();

		SanPham sp3 = new SanPham("iphone", 1000, 500);
		SanPham sp4 = new SanPham("Samsung", 9000);
		System.out.println("San pham 3: ");
		sp3.xuatThongTin();
		System.out.println("San pham 4: ");
		sp4.xuatThongTin();
	}

}
