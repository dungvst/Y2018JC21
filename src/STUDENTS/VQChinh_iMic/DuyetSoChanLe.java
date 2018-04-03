package STUDENTS.VQChinh_iMic;

import java.util.Scanner;

public class DuyetSoChanLe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dSo = 0;
		int nSo = 0;
		short shKieuSo = 0; // shKieuSo = 1 la so chan OR shKieuSo = 2  la so le
		boolean bExitDoWhile = false;
		
		do {
			System.out.println("\n---CHUONG TRINH DUYET SO CHAN LE---");
			System.out.println("1 - Ban nhap so can kiem tra");
			System.out.println("2 - Ban chon kieu so chan hoac kieu so le");
			System.out.println("3 - Hien thi ket qua ");
			System.out.println("4 - Ket Thuc Chuong Trinh");
			System.out.print("Vui long nhap lua chon\t");			
			String sLuaChon = sc.nextLine();
			
			switch (sLuaChon) {
			case "1":
				System.out.print("Nhap gia tri cho so can kiem tra\t");
				dSo = sc.nextDouble();
				sc.nextLine();
 				break;
 				
			case "2":							
				shKieuSo = ChonSoChanLe(shKieuSo);				
				break;
				
			case "3":
				if(KiemTraDuLieu(dSo, shKieuSo)) {
					nSo = (int)Math.abs(dSo);
					HienThiKetQua(nSo,  shKieuSo);
				}				
				break;
				
			case "4":
				System.out.println("\nBAN DA THOAT CHUONG TRINH");
				bExitDoWhile = true;
				break;
				
			default:
				System.out.println("\n***Ban vui long nhap lua chon tu 1 den 4***");
				break;					
			}
			
		}while (!bExitDoWhile);			
	}
	
	public static short ChonSoChanLe(short shKieuSo) {
		Scanner sc = new Scanner(System.in);
		boolean bExit = false; 
		do {
			System.out.println("\n---Ban chon kieu so chan hoac so le---");
			System.out.println("1 - So chan");
			System.out.println("2 - So le");
			System.out.print("Vui long nhap lua chon\t");	
			
			String sLuaChon = sc.nextLine();
			
			switch (sLuaChon) {
			case "1":		
				shKieuSo = 1;
				bExit = true; 
				break;
				
			case "2":
				shKieuSo = 2;
				bExit = true;
				break;
				
			default:
				System.out.println("\n***Ban vui long nhap lua chon 1 hoac 2");
				break;					
			}
		}while (!bExit);			
		return shKieuSo;
	}
	
	public static boolean KiemTraDuLieu(double dSo, short shKieuSo) {
		boolean bCheck = false;
		if(dSo == 0) {
			System.out.println("\n***So nhap vao khong duoc bang 0***");
			System.out.println("Vui long nhap gia tri cho so kiem tra tai tuy chon so 1");
		}
		else if(shKieuSo == 0) {
			System.out.println("\n***Ban can nhap kieu hien thi <so chan hoac so le>***");
			System.out.println("Vui long nhap gia tri cho so kiem tra tai tuy chon so 2");
		}
		else {
			bCheck = true;
		}
		return bCheck;			
	}
	
	public static void HienThiKetQua(int nSo, short shKieuSo) {
		if (shKieuSo == 1) {
			System.out.println("\nDanh Sach so chan la");
			for (int i = 0; i <= nSo; i++) {
				if (i % 2 == 0) {
					System.out.print(i + "\t");
				}
			}
		}
		else {
			System.out.println("\nDanh Sach so le la");
			for (int i = 0; i <= nSo; i++) {
				if (i % 2 != 0) {
					System.out.print(i + "\t");
				}
			}
		}		
	}
}
