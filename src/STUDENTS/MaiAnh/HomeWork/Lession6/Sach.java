package MaiAnh.HomeWork.Lession6;

import java.util.Scanner;

public class Sach extends QuanLySach{
	private String tenTacGia;
	private int soTrang;
	
	
//Input
	public void nhapSach(){
		Scanner scan = new Scanner(System.in);
		nhap();
		System.out.println("Nhap ten tac gia cua cuon sach:");
		tenTacGia=scan.nextLine();
		System.out.println("Nhap so trang sach:");
		soTrang=scan.nextInt();
		//scan.close();
	}
	
	
//Display
	void hienThiSach(){
		hienThi();
		System.out.println("Ten tac gia: " + tenTacGia + "\nSo trang: " + soTrang);
	}	
}
