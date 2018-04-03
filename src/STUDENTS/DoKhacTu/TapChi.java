package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	public int getSoPhatHanh() {

		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	private int soPhatHanh;
	private int thangPhatHanh;

	@Override
	public void nhapDuLieu() {
		super.nhapDuLieu();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("so phat hanh la: ");
		this.soPhatHanh = sc1.nextInt();
		System.out.print("thang phat hanh la: ");
		this.thangPhatHanh = sc.nextInt();
	}

	@Override
	public void inDuLieu() {
		super.inDuLieu();
		System.out.println("So phat hanh la: " + soPhatHanh);
		System.out.println("Thang phat hanh la: " + thangPhatHanh);
	}
}
