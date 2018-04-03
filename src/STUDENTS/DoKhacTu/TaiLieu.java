package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class TaiLieu {
	private String maTaiLieu;
	private String tenNhaSx;
	private int soBanPhatHanh;
	private Scanner sc1;
	private Scanner sc;

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenNhaSx() {
		return tenNhaSx;
	}

	public void setTenNhaSx(String tenNhaSx) {
		this.tenNhaSx = tenNhaSx;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public void nhapDuLieu() {
		sc = new Scanner(System.in);
		sc1 = new Scanner(System.in);
		System.out.print("ma tai lieu la: ");
		this.maTaiLieu = sc1.nextLine();
		System.out.print("so ban phat hanh la: ");
		this.soBanPhatHanh = sc.nextInt();
		System.out.print("ten nha san xuat la: ");
		this.tenNhaSx = sc1.nextLine();
	}

	public void inDuLieu() {
		System.out.println("Ma tai lieu la: " + maTaiLieu);
		System.out.println("So ban phat hanh la: " + soBanPhatHanh);
		System.out.println("Ten nha san xuat  la: " + tenNhaSx);
	}

}
