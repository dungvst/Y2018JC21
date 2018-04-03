package MaiAnh.HomeWork.Lession5;

import java.util.Scanner;

public class Products {
	private String name;
	private double price;
	private double discount;
	
	public Products() {

	}
	
	
	public Products(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}


	public Products(String name, double price, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

// Import tax	
	private double getTax(){
		return price*0.1;
	}

// Print product's information
	public void output(){
		System.out.println("Product's name: " + name + "\nProduct's price: " + price + "\nDiscount: " + discount + "\nTax: " + getTax());
	}

//Input product's information
	public void input(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Name:");
		String name = scan.nextLine();
		this.name = name;
		System.out.println("Price:");
		double price = scan.nextDouble();
		this.price = price;
		System.out.println("Discount:");
		double discount = scan.nextDouble();
		this.discount = discount;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}
