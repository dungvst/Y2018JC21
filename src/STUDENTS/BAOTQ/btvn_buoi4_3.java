package STUDENTS.BAOTQ;

import java.util.Scanner;

public class btvn_buoi4_3 {
	public static void main(String[] args) {
		Scanner dt = new Scanner(System.in);
		System.out.println("nhap vao mot so nguyen a: ");
		int a = dt.nextInt();
		System.out.println("day so chan sau a");
		for(int i = 0;i<a;i++)
		{
			if((i % 2) == 0)
			{
				System.out.print(" "+i);
				
			}
			
		}
		System.out.println("\nday so le sau a");
		for(int j = 0;j<a;j++)
		{
			if((j % 2) != 0)
			{
				System.out.print(" "+j);
			}
		}
	}
}
