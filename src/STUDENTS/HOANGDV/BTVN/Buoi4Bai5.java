package HOANGDV.BTVN;

import java.util.Scanner;

public class Buoi4Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai Tap in ra so chan le");

		Scanner scan = new Scanner(System.in);

		System.out.println("Nhap vao so bat ky: ");
		int so = scan.nextInt();
		System.out.println("Nhap vao: 1 la chan, 2 la le");
		int in = scan.nextInt();

		int soLuongChan = 0;
		int soLuongLe = 0;

		while (so > 0) {
			if (so % 2 == 0) {
				soLuongChan++;
			} else {
				soLuongLe++;
			}
			so--;
		}
		if (in == 1) {
			System.out.println("So luong phan tu chan la: " + soLuongChan);
		} else {
			System.out.println("So luong phan tu le la: " + soLuongLe);
		}
		scan.close();
	}

}
