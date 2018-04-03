package HOANGDV.BTVN;

import java.util.Scanner;

public class Buoi4Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai Tap tim so lon thu hai trong mang");
		
		int Mang[] = new int[10];

		System.out.println("Nhap vao 10 phan tu");
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1));
			Mang[i] = scan.nextInt();
		}

		int max1 = 0;
		for (int i = 0; i < Mang.length; i++) {
			if (max1 < Mang[i]) {
				max1 = Mang[i];
			}
		}

		for (int i = 0; i < Mang.length; i++) {
			if (Mang[i] == max1) {
				Mang[i] = 0;
			}
		}
		
		int max2 = 0;
		for (int i = 0; i < Mang.length; i++) {
			if (max2 < Mang[i]) {
				max2 = Mang[i];
			}
		}
		
		System.out.println("So lon thu hai la: "+max2);
		scan.close();
	}

}
