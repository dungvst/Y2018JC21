package MaiAnh.HomeWork.Lession1;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Type three sides: ");
		double side1 = sn.nextDouble();
		double side2 = sn.nextDouble();
		double side3 = sn.nextDouble();
		double perimeterTrianlge = side1 + side2 + side3;
		System.out.println("perimeter of the triangle: " + perimeterTrianlge);
	}
}
