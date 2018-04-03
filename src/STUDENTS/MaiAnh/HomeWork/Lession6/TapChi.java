package MaiAnh.HomeWork.Lession6;

import java.util.Scanner;

public class TapChi extends QuanLySach{
	private String thangPhatHanh;
	private int soPhatHanh;
	
//Input
	void nhapTapChi(){
		Scanner scan = new Scanner(System.in);
		nhap();
		System.out.println("Nhap thang phat hanh tap chi:");
		thangPhatHanh = scan.nextLine();
		System.out.println("Nhap so phat hanh tap chi:");
		soPhatHanh = scan.nextInt();
		//scan.close();
	}
	
//Display
	void hienThiTapChi(){
		hienThi();
		System.out.println("Thang phat hanh: " + thangPhatHanh + "\nSo phat hanh: " + soPhatHanh);
	}
	
	
//	public String getThangPhatHanh() {
//		return thangPhatHanh;
//	}
//	public void setThangPhatHanh(String thangPhatHanh) {
//		this.thangPhatHanh = thangPhatHanh;
//	}
//	public int getSoPhatHanh() {
//		return soPhatHanh;
//	}
//	public void setSoPhatHanh(int soPhatHanh) {
//		this.soPhatHanh = soPhatHanh;
//	}
	
	
}
