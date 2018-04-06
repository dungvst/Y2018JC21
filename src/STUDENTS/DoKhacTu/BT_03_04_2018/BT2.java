package DoKhacTu.BT_03_04_2018;

import java.util.Scanner;

import DoKhacTu.TinhToan;

public class BT2 {

	public static void main(String[] args) {
		int soHang;
		int soCot;

		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào số hàng của mảng: ");
		soHang = sc.nextInt();
		System.out.println("Nhập vào số cột của mảng: ");
		soCot = sc.nextInt();

		int[][] a = new int[soHang][soCot];

		for (int i = 0; i < soHang; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Mảng: ");
		for (int i = 0; i < soHang; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "  ");
			}

			System.out.println("\n");
		}
		BT2 bt = new BT2();
		bt.tinhTong(a, soCot, soHang);
	}

	public void tinhTong(int[][] a, int soCot, int soHang) {
		for (int j = 0; j < soCot; j++) {
			int tong = 0;
			for (int i = 0; i < soHang; i++) {
				tong = tong + a[i][j];
			}
			System.out.println("Tổng phần tử cột thứ " + j + ": " + tong);

		}
	}

}
