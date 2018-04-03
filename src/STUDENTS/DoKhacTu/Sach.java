package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;
	private Scanner sc;
	private Scanner sc1;

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public void nhapDuLieu() {

		super.nhapDuLieu();
		sc = new Scanner(System.in);
		sc1 = new Scanner(System.in);
		System.out.print("ten tac gia la: ");
		this.tenTacGia = sc1.nextLine();
		System.out.print("so trang la: ");
		this.soTrang = sc.nextInt();
	}

	@Override
	public void inDuLieu() {

		super.inDuLieu();
		System.out.println("Ten tac gia la: " + tenTacGia);
		System.out.println("So trang la: " + soTrang);
	}

}
