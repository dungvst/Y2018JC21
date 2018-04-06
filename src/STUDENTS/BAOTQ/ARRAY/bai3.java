package BAOTQ.ARRAY;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
//		int n,i;
//		
//		do
//		{
//			Scanner ip = new Scanner(System.in);
//			System.out.println("nhap vao so hang trong mang 2 chieu: n = ");
//			n = ip.nextInt();
//			
//			if(n<0)
//			{
//				System.out.println("vui long nhap n>= 0");
//			}
//			
//		}
//		while(n<0);
//		double[] mang = new double[n];
//		for(i=0;i<n;i++)
//		
//			
//			{
//				Scanner ipmang = new Scanner(System.in);
//				System.out.println("nhap mang ["+(i+1)+"] : ");
//				mang[i] = ipmang.nextDouble();
//				
//			}
		
//		System.out.println("mang vua nhap la: ");
//		for(i=0;i<n;i++)
//		{
//			System.out.print(" " +mang[i]);
//		}
//		
//		System.out.println(" ");
        int[] mang = {1, 2, 3, 4, 5, 6}; 
        double[] mang1 = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		
		average(mang);
		average(mang1);
		System.out.println("tbc mang vua nhap la: " +average(mang));
		System.out.println("tbc mang vua nhap la: " +average(mang1));
	}
	public static int average(int[] array) {
		int tbc;
		int dem = 0;
		int tong = 0;
		for(int i = 0; i<array.length;i++)
		{
			tong = tong + array[i];
			dem++;
			
		}
		tbc = tong/dem;
		return tbc;
		
	}
	public static double average(double[] array) {
		double tbc;
		int dem = 0;
		double tong = 0;
		for(int i = 0; i<array.length;i++)
		{
			tong = tong + array[i];
			dem++;
			
		}
		tbc = tong/dem;
		return tbc;
		
	}
		 
	

}
