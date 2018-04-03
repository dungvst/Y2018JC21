package STUDENTS.Tien.B6;

import java.util.Scanner;

public class sach extends vanban {
	private String tentacgia;
	private int sotrang;

	@Override
	public void nhapthongtin() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("nhap thong tin ve tap chi bao gom:");
		System.out.print("nhap ma tai lieu:");
		matailieu = nhap.nextLine();
		System.out.print("nhap NXB : ");
		NXB = nhap.nextLine();
		System.out.print("nhap so luot phat hanh :");
		sophahanh = nhap.nextInt();
		System.out.print("ten tac gia :");
		tentacgia = nhap.nextLine();
		System.out.print("so trang :");
		sotrang = nhap.nextInt();
		System.out.println("    ");
		System.out.println("    ");
	}

	@Override
	public void xuatthongtin() {
		 System.out.println("loai tai lieu : sach" );
		 System.out.println("ma tai lieu : "+ matailieu  );
		System.out.println("ma tai lieu : " + matailieu);
		System.out.println("Nha xuat ban : " + NXB);
		System.out.println("So luot phat hanh : " + sophahanh);
		System.out.println("ten tac gia  : " + tentacgia);
		System.out.println("so trang: " + sotrang);
		System.out.println("    ");
	}
}
