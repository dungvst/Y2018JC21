package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class Bao extends TaiLieu {
	private int ngayPhatHanh;

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public void nhapDuLieu() {
		super.nhapDuLieu();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("ngay phat hanh: ");
		this.ngayPhatHanh = sc1.nextInt();

	}

	@Override
	public void inDuLieu() {
		super.inDuLieu();
		System.out.println("Ngay phat hanh la: " + ngayPhatHanh);
	}
}
