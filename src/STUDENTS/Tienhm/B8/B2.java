package Tienhm.B8;

import java.util.Scanner;

public class B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mang[][] = new int[3][2];
		Scanner nhap = new Scanner(System.in);
		System.out.println("nhap gia tri cua mang :");
		int i;
		int j;
		int tong = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print("phan tu dong " + (i + 1) + " cot " + (j + 1) + ": ");
				mang[i][j] = nhap.nextInt();
			} 
		}
		for (j = 0; j < 2; j++) {
			for (i = 0; i < 3; i++) {
				tong = tong + mang[i][j];
			} 
			System.out.println("tong phan tu cot" + (j + 1) + " " + tong);
			tong=0;
		} 
	}

}
