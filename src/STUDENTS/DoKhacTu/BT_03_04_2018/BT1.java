package DoKhacTu.BT_03_04_2018;

import java.util.Scanner;

public class BT1 {

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
		BT1 bt = new BT1();
		bt.tinhTong(a);
	}

	public void tinhTong(int[][] a) {
		int tong = 0;
		for (int[] c : a) {
			for (int d : c) {
				tong = tong + d;
			}

		}

		System.out.println("Tổng các phần tử trong mảng là: " + tong);
	}

}
