package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class BT3_max2_16_03_2018 {

	public static void main(String[] args) {
		int[] a = new int[10];

		System.out.println("nhap 10 phan tu cua mang");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print("nhap phan tu thu " + i + ": ");
			a[i] = sc.nextInt();
		}
		int max1 = a[0];
		for (int i = 0; i < 10; i++)
		{
			{
				if (a[i] > max1)

					max1 = a[i];
			}
		}
		int max2 = a[0];
		for (int i = 0; i < 10; i++) {
			if (a[i] > max2 && a[i] < max1) 
			{

				max2 = a[i];
			}
		}
		System.out.printf("phan tu lon thu 2 trong mang la: " + max2);

	}

}
