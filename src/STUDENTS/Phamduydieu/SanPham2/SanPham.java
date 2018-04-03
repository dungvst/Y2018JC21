package Phamduydieu.SanPham2;

import java.util.Scanner;

public class SanPham {
/*
 	Viết chương trình tạo ra 2 sản phẩm thông tin được nhập
 	từ bàn phím sau đó gọi phương thức xuất để xuất thông tin
 	hai đối tượng sản phẩm đã tạo.
 */
	private String maSp;
	private String tenSanPham;
	private int donGia;
	private int giamGia;
	public String getMaSp() {
		return maSp;
	}
	public void setMaSp(String maSp) {
		this.maSp = maSp;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public int getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}
	public SanPham(String maSp, String tenSanPham, int donGia, int giamGia) {
		super();
		this.maSp = maSp;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma san pham: ");
		this.maSp = sc.nextLine();
		System.out.print("Nhap ten san pham: ");
		this.tenSanPham = sc.nextLine();
		System.out.print("Nhap gia san pham: ");
		this.donGia = sc.nextInt();
		System.out.print("Giam gia san pham: ");
		this.giamGia = sc.nextInt();
	}
	public void hienthi() {
		System.out.println("Thong tin san pham: "+ maSp);
		System.out.println("Ma san pham: "+ maSp);
		System.out.println("Ten san pham: "+tenSanPham);
		System.out.println("Gia san pham: "+donGia);
		System.out.println("Giam gia: "+ giamGia);
		System.out.println("=======================");
		
	}
	
}
