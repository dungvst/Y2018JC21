package STUDENTS.Tien.B6;

import java.util.Scanner;

public class bao extends vanban {
	private int ngayphathanh;

	public int getNgayphathanh() {
		return ngayphathanh;
	}

	public void setNgayphathanh(int ngayphathanh) {
		this.ngayphathanh = ngayphathanh;
	}

	@Override
	public void nhapthongtin() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("nhap du lieu ve bao    ");
		System.out.print("nhap ma tai lieu:");
		matailieu = nhap.nextLine();
		System.out.print("nhap NXB : ");
		NXB = nhap.nextLine();
		System.out.print("nhap so luot phat hanh :");
		sophahanh = nhap.nextInt();
		System.out.print("ngay phat hanh :");
		ngayphathanh = nhap.nextInt();
		System.out.println("    ");
	}

	@Override
	public void xuatthongtin() {
		System.out.println("loai tai lieu : bao ");
		System.out.println("ma tai lieu : " + matailieu);
		System.out.println("Nha xuat ban : " + NXB);
		System.out.println("So luot phat hanh : " + sophahanh);
		System.out.println("ngay phat hanh  : " + ngayphathanh);
		System.out.println("    ");
	}

}
