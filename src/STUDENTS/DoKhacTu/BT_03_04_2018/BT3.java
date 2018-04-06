package DoKhacTu.BT_03_04_2018;

import java.util.Locale;
import java.util.Scanner;

public class BT3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng 1: " );
		int n =sc.nextInt();
		int[] array = new int [n]  ;		
		for (int i = 0; i < n; i++)
		{
			System.out.print("nhập phần tử thứ " + i + " của mảng 1: ");
			array[i] = sc.nextInt();
		
	    }
		System.out.println("mảng 1 là: ");
		for (int i = 0; i < n; i++)
		{
			System.out.print(array[i] + " " );
		
	    }
		Scanner sc1 = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("\nNhập số phần tử của mảng 2: ");
		int l= sc.nextInt();
		double [] array1 = new double [l];

		for (int j = 0; j < l; j++)
		{
			System.out.println("nhập phần tử thứ " + j + " của mảng 2: ");
		array1[j] = sc1.nextDouble();
		
	    }
		System.out.println("mảng 2 là: ");
		for (int j = 0; j < l; j++)
		{
			System.out.print(array1[j] + " " );
		
	    }
		System.out.println("\nTrung bình cộng mảng 1 là: " + average(array, n));
		System.out.println("Trung bình cộng mảng 2 là: " + average(array1, l));

		
	}
	
	public static int average(int[] array , int n)
	{
		int tong=0;
		for(int i = 0 ; i < array.length ; i ++)
		{
			tong = tong + array[i];
		}
		return   tong/n;
		
	} 
	public static double average(double[] array1 , int l)
	{
		double tong = 0;
		for(int j = 0 ; j < array1.length ; j ++)
		{
			tong=  tong + array1[j];
		}
		return tong/l;
		
	} 

}
