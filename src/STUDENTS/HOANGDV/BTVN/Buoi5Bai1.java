package HOANGDV.BTVN;

import java.util.Scanner;

public class Buoi5Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Nhap so luong PT
		int soPT = 0;
		do {
			System.out.println("Nhap vao so phan tu cua mang");
			soPT = scan.nextInt();
		} while (soPT <= 0);
		// Nhap phan tu vao mang
		int mang[] = new int[soPT];
		for (int i = 0; i < mang.length; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1));
			mang[i] = scan.nextInt();
		}
		// Sap xep mang
		int tam = 0;
		for (int i = 0; i < mang.length; i++) {
			for (int j = 0; j < mang.length; j++)
				if (mang[i] < mang[j]) {
					tam = mang[i];
					mang[i] = mang[j];
					mang[j] = tam;
				}
		}
		// in ra man hinh
		String mangSapxep = "";
		for (int i = 0; i < mang.length; i++) {
			mangSapxep += mang[i] + " ";
		}
		System.out.println("Mang da sap xep: " + mangSapxep);
		System.out.println("Phan tu nho nhat: " + mang[0]);
		// Tinh trung binh cong so chia het cho 3
		double tong = 0;
		int n = 0;
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] % 3 == 0) {
				tong += mang[i];
				n++;
			}
		}
		System.out.println("TB cong phan tu chia het cho 3 la: " + tong/n);
	}

}
