package Phamduydieu;

import java.util.Scanner;

public class MangMotChieu {

	public static void main(String[] args) {
		// VÍ DỤ 2: Khai báo 1 mảng số thực gồm n phần tử từ bàn phím sau đó in ra màn hình.
				Scanner sc = new Scanner(System.in);
				System.out.print("Nhập số phần tử của mảng: ");
				int n=sc.nextInt();
				float a[] = new float[n];
				for(int i=0; i<n; i++) {
					System.out.print("Nhập giá trị phần tử thứ "+ (i+1)+": ");
					a[i]=sc.nextFloat();
				}
				for(int i=0;i<n;i++) {
					System.out.println("Phần tử thứ " + (i+1) + ": " + a[i]);
				}
// 
	}

}
