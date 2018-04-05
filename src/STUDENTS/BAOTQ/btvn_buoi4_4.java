package BAOTQ;

import java.util.Scanner;

public class btvn_buoi4_4 {
	public static void main(String[] args) {
		Scanner dt = new Scanner(System.in);
		int n,i,j;
		do
		{
			System.out.println("nhap so luong phan tu mang: ");
			n = dt.nextInt();
		}
		while(n <= 0);
		int mang[] = new int[n];
		for(i = 0; i < n; i ++)
		{
			System.out.println("nhap vi tri thu " + (i+1) + " cua mang");
			mang[i] = dt.nextInt();
		}
	
		
		int tg;
		for(i = 0; i < n ; i++)
			for(j = 0; j < n ; j++)
			{
				if(mang[i]>mang[j])
				{
					tg=mang[i];
					mang[i]=mang[j];
					mang[j]=tg;
					
				}
				
			}
		for(i = 0; i < n; i++)
		{
			if(mang[0] > mang[i])
			{
				System.out.println("phan tu lon thu 2 cua mang la : "+mang[i]);
				break;
			}
		}
		
	}

}
