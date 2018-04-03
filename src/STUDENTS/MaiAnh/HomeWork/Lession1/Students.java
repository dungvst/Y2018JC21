package MaiAnh.HomeWork.Lession1;

import java.util.Scanner;

public class Students {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Type Your Roll Number: ");
		int rollNo = sn.nextInt();
		System.out.println("Type Your Age: ");
		int age = sn.nextInt();
		sn.nextLine();
		System.out.println("Type Your Full Name: ");
		String fullName = sn.nextLine();
		System.out.println("Type Your Email: ");
		//sn.nextLine();
		String email = sn.nextLine();
		System.out.println("Type Your Mark: ");
		double mark = sn.nextDouble();
		
		System.out.println("Roll Number: " + rollNo);
		System.out.println("Full Name: "+ fullName);
		System.out.println("Age: "+ age);
		System.out.println("Email: "+ email);
		System.out.println("Mark "+ mark);
	}

}
