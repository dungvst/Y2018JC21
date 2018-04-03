package STUDENTS.BAOTQ;

import java.util.Scanner;

public class btvn_buoi4_1 {
	

	public static void main(String[] args) {
		float c;
		Scanner doituong = new Scanner(System.in);
		 
		
		  System.out.println("nhap vao so a");
		  float a = doituong.nextFloat();
		  System.out.println("nhap vao so b");
		  float b = doituong.nextFloat();
		 
		
		System.out.println("nhap 1 de thuc hien phep cong\nnhap 2 de thuc hien phep tru\nnhap 3 de thuc hien phep nhap\nnhap 4 de thuc hien phep chia ");
		int luachon = doituong.nextInt();
		//neu su dung cau truc if else
//		if(luachon==1)
//		{
//			c = a + b;
//			System.out.println("a + b = "+c);
//		}
//		else if(luachon==2)
//		{
//			c = a - b;
//			System.out.println("a - b = "+c);
//		}
//		else if(luachon==3)
//		{
//			c = a * b;
//			System.out.println("a * b = "+c);
//		}
//		else if(luachon==4)
//		{
//			c = a / b;
//		if(b==0)
//		{
//			System.out.println("Cannot divide by zero");
//		}
//		else if(b==0 || a==0)
//		{
//			System.out.println("Result of function is underfined");
//		}
//		else
//			System.out.println("a / b = "+c);
//		}
//		else System.out.println("ban chua chon phep toan");
		switch(luachon) {
			case 1:
				c = a + b;
				System.out.println("a + b = "+c);
				break;
			case 2:
				c = a - b;
				System.out.println("a - b = "+c);
				break;
			case 3:
				c = a * b;
				System.out.println("a x b = "+c);
				break;
			case 4:
				c = a / b;
				if(b==0)
				{
					System.out.println("Cannot divide by zero");
				}
				else if(b==0 || a==0)
				{
					System.out.println("Result of function is underfined");
				}
				else
				System.out.println("a / b = "+c);
				break;
			default:
				System.out.println("ban chua chon phep toan");
				break;
		}

	}



}
