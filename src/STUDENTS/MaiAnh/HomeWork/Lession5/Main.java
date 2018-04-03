package MaiAnh.HomeWork.Lession5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Products p1 = new Products();
		System.out.println("Enter the infor of product 1");
		p1.input();
		Products p2 = new Products();
		System.out.println("Enter the infor of product 2");
		p2.input();
		
		System.out.println("The information of product 1:");
		p1.output();
		System.out.println();
		System.out.println("The information of product 2:");
		p1.output();
		System.out.println();
		
		//
		Products discountedProduct = new Products("BMW 320i", 1379000000, 1);
		Products nondiscountedProduct = new Products("Camry 2.5G", 1214000000);
		System.out.println("The info of the product that is discounted:");
		discountedProduct.output();
		System.out.println();
		System.out.println("The info of the product that is not discounted:");
		nondiscountedProduct.output();
	}

}
