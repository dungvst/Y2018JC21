package MaiAnh.HomeWork.Lession6;

import java.util.Scanner;

public class Bao extends QuanLySach{
	private String ngayPhatHanh;
	

//input
	void nhapBao(){
		Scanner scan = new Scanner(System.in);
		nhap();
		System.out.println("Nhap ngay phat hanh bao:");
		ngayPhatHanh = scan.nextLine();
		//scan.close();
	}
	
	
//Display
	void hienThiBao(){
		hienThi();
		System.out.println("Ngay phat hanh: " + ngayPhatHanh);
	}
}
