package BAOTQ.ARRAY;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,i,j;
		do
		{
			Scanner ip = new Scanner(System.in);
			System.out.println("nhap vao so hang trong mang 2 chieu: n = ");
			n = ip.nextInt();
			System.out.println("nhap vao so cot trong mang 2 chieu: m =  ");
			m = ip.nextInt();
			if(n<0 || m<0)
			{
				System.out.println("vui long nhap n, m >= 0");
			}
			
		}
		while(n<0 || m<0);
		int[][] mang = new int[n][m];
		for(i=0;i<n;i++)
		
			for(j=0;j<m;j++)
			{
				Scanner ipmang = new Scanner(System.in);
				System.out.println("nhap mang ["+(i+1)+"] [" +(j+1)+"] : ");
				mang[i][j] = ipmang.nextInt();
				
			}
		
		System.out.println("mang vua nhap la: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(mang[i][j] +"\t");
				
			}
			System.out.print("\n");
		}
		int tong=0;
		
		for(j=0;j<m;j++)
		{
		for(i=0;i<n;i++)
			
			{
				tong = tong + mang[i][j];
			}
		System.out.println("tong cot " + (j+1) + " la : " + tong);
		}
		

	}

}
