package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class BTVN_23_03_2018 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so phan tu cua mang: ");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + i + ": ");
			a[i] = sc.nextInt();
		}

		System.out.print("Mang: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int tg = a[j];
					a[j] = a[i];
					a[i] = tg;
				}
			}

		}
		System.out.print("\nmang sau khi sap xep tang dan la : ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		int dem = 0;
		int tong = 0;
		System.out.print("\ncac phan tu chia het cho 3 la : ");
		for (int i = 0; i < n; i++) {
			if (a[i] % 3 == 0) {
				System.out.print(a[i] + " ");
				tong = tong + a[i];
				dem++;
			}

		}

		if (dem == 0) {
			System.out.println("\nkhong co so chia het cho 3");
		} else {
			float TBC = (float)tong / dem;
			System.out.println("\ntrung binh cong cac so chia het cho 3 la :" + TBC);
		}

	}
}
