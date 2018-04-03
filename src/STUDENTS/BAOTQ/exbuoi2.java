package STUDENTS.BAOTQ;

import java.util.Scanner;

public class exbuoi2 {
	public static void main(String[] args) {
		Scanner doituong = new Scanner(System.in);
		System.out.println("nhap vao a");
		
		int a = doituong.nextInt();
		System.out.println("nhap vao b");
		int b = doituong.nextInt();
		System.out.println("nhap vao c");
		int c = doituong.nextInt();
		float x,x1,x2;
		if(a==0)
		{
			System.out.println("phuong trinh bac 1");
			x = (-c) / b;
			System.out.println("x ="+x);
		}
		
		int dt;
		
		dt = b * b - 4 * a *c;
		if(dt < 0)
			System.out.println("phuong trinh vo nghiem");
		else if(dt==0) {
			System.out.println("phuong trinh co nghiem kep");
			 x = -b / (2*a);
			System.out.println("x="+x);
		}
		else
		{
			System.out.println("phuong trinh co 2 nghiem phan biet");
			x1 = ( -b + sqrt(dt)) / (2*a);
			x2 = (-b - sqrt(dt)) / (2*a);
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
			
			
		}
		
		
		
		
		
	}

	private static int sqrt(int dt) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
