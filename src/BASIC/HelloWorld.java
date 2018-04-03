package BASIC;

import java.util.Scanner;

public class HelloWorld {

	//Bai giang
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bankinh = 4;

		if (bankinh == 0) {
			double area = bankinh * bankinh * Math.PI;
			System.out.println("dien tich: " + area);
		} else if (bankinh == 1) {
			System.out.println("dien tich_cua1 : ");
		} else if (bankinh == 2) {
			System.out.println("dien tich_cua1 : ");
		} else if (bankinh == 3) {
			System.out.println("dien tich_cua1 : ");
		} else if (bankinh == 4) {
			System.out.println("dien tich_cua1 : ");
		} else if (bankinh == 5) {
			System.out.println("dien tich_cua1 : ");
		} else if (bankinh == 6) {
			System.out.println("dien tich_cua1 : ");
		} else {
			System.out.println("I don't like");
		}
		
		//BTVN : Nhap 1 gia tri, kiem tra tu 1 den : 10 thi in 
		//gia ra tri thuc cua no , 
		//cac truong khac in ra  khong nhan ra so nay. 
		
		switch(bankinh) {
			case 0:
				double area = bankinh * bankinh * Math.PI;
				System.out.println("dien tich: " + area);
				break;
			case 1: 	
				System.out.println("dien tich_cua1 : ");
				break;
			//.....
			case 6:
				System.out.println("dien tich_cua1 : ");
				break;
			default: 
				System.out.println("I don't like");
				break;
		}
		
		
		// Mang la kieu ma chua cac bien co cung loai du lieu
		// Mang la bien kieu tham chieu
		//gia tri default  : 0
		
//		int mang[] =  new int[5];
		Scanner scanner = new Scanner(System.in);
//		int index = 0;
//		
//		index = index+1;
//		System.out.println("nhap phan tu " + index );
//		mang[0] = scanner.nextInt();
//		
//		System.out.println("nhap phan tu " + (index) );
//		mang[1] = scanner.nextInt();
//		index = index + 1;
//		
//		//..........
//		System.out.println("nhap phan tu 5:");
//		mang[4] = scanner.nextInt();
		
		//in  gia cac phan tu trong mang dung ham con
//		System.out.println("phan tu 1 = " + mang[0]);
//		System.out.println("phan tu 2 = " + mang[1]);
//		System.out.println("phan tu 3 = " + mang[2]);
//		System.out.println("phan tu 4 = " + mang[3]);
		
		// Muon goi 1 ham khac trong ham main trong cung class
		// thi ham con cung phai la static neu khong muon 
		// khai bao doi tuong
		
		//inRa(mang);
		
//		int soNguyen1 = 6;
//		int soNguyen2 = 10;
//		
//		int tong = phepCong(soNguyen1, soNguyen2);
//		System.out.println("tong : " + tong);
		
		
		//gioi thieu vong lap
//		for(int index=0; index < 100; index++) {
//			System.out.println("Welcome to Java");
//		}
		
		
		// Nhap mang dung ham for
		int mangFor[] = new int[5];
		
		for(int index = 0; index < 5; index++) {
			System.out.println("nhap vi tri thu " + (index+1) + " cua mang:" );
			mangFor[index] = scanner.nextInt();
		}
		
		int max = -999999999;
		for(int index = 0; index < 5; index++) {
			if(mangFor[index] > max) {
				max = mangFor[index];
			}
		}
		
		System.out.println("gia tri lon nhat cua mang:" + max);
		
		//BTVN: Tim phan lon thu 2 trong 10 phan tu cua mang ma minh nhap vao
		
	}
	
	public static int phepCong(int so1, int so2) {
		so1 = so1*10;
		
		return so1+so2;
	}

	// void khong tra ve bat ky dieu gi
	public static void inRa(int mang2[]) {
		//Bien mang 1 chi co gia tri tai ham inRa() 
		int mang1[] = new int[4];
		
		System.out.println("phan tu 1 = " + mang2[0]);
		System.out.println("phan tu 2 = " + mang2[1]);
		System.out.println("phan tu 3 = " + mang2[2]);
		System.out.println("phan tu 4 = " + mang2[3]);
	}
}
