package MaiAnh.HomeWork.Lession6;

import java.util.Scanner;

public class QuanLySach {
	private int maTaiLieu;
	private String nhaXuatBan;
	private int soPhatHanh;	
	
	
//Input
	void nhap(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ma tai lieu:");
		maTaiLieu = scan.nextInt();
		scan.nextLine();
		System.out.println("Nhap ten nha xuat ban:");
		nhaXuatBan = scan.nextLine();
		System.out.println("Nhap so phat hanh");
		soPhatHanh = scan.nextInt();
		//scan.close();
	}
	
	
//Display
	void hienThi(){
		System.out.println("Ma tai lieu: " + maTaiLieu + "\nNha xuat ban: " + nhaXuatBan + "\nSo phat hanh: " + soPhatHanh );
	}	
}
