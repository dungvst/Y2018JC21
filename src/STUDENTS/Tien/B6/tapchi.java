package STUDENTS.Tien.B6;

import java.util.Scanner;

public class tapchi extends vanban {

	private int soPH;
	private int thangPH;

	public int getSoPH() {
		return soPH;
	}

	public void setSoPH(int soPH) {
		this.soPH = soPH;
	}

	public int getThangPH() {
		return thangPH;
	}

	public void setThangPH(int thangPH) {
		this.thangPH = thangPH;
	}

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
		System.out.print("nhap so phat hanh :");
		soPH = nhap.nextInt();
		System.out.print("thang phat hanh :");
		thangPH = nhap.nextInt();
		System.out.println("    ");
		System.out.println("    ");
	}

	@Override
	public void xuatthongtin() {
		System.out.println("loai tai lieu : tapchi");
		System.out.println("ma tai lieu : " + matailieu);
		System.out.println("Nha xuat ban : " + NXB);
		System.out.println("So luot phat hanh : " + sophahanh);
		System.out.println("so phat hanh  : " + soPH);
		System.out.println("thang phat hanh : " + thangPH);
		System.out.println("    ");
	}
}
