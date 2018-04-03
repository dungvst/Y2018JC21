package MaiAnh.HomeWork.Lession1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("type length and width: ");
		double length = sn.nextDouble();
		double width = sn.nextDouble();
		System.out.println("Perimeter of the rectangle: " + ((length+width)*2.0));
		System.out.println("Area of the rectangle: " + length*width);
	}

}

