package MaiAnh.HomeWork.Lession3;

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a, a = ");
		int a = sc.nextInt();
		System.out.println("Type b, b = ");
		int b = sc.nextInt();
		System.out.println("Type the calculation");
		System.out.println("'1' corresponds to addition");
		System.out.println("'2' corresponds to subtraction");
		System.out.println("'3' corresponds to multiplication");
		System.out.println("'4' corresponds to division");
		System.out.println("calculation: ");
		
		int calculation = sc.nextInt();
// dieu kien neu nguoi dung khong nhap la gi vay thay?
		
		if(calculation==1){
			System.out.println("a + b = " + (a+b));
		}else if(calculation==2){
			System.out.println("a - b = " + (a-b));
		}else if(calculation==3){
			System.out.println("a x b = " + (a*b));
		}else if(calculation==4){
			if(b==0){
				if(a==0){
					System.out.println("Result of function is underfined");
				}else{
					System.out.println("Cannot divide by zero");
				}
			}else{
				System.out.println("a : b = " + (a/b));
			}
		}else{
			System.out.println("You did not choose calculation");
		}
	}
}
