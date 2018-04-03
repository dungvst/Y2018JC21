package STUDENTS.Tien.B5;

import java.util.Scanner;

public class Main {

	// tạo hàm constructor
	   public Main() {}
	private String tensp;
	public Main(String tensp, double dongia, double giamgia, double thuenk) {
		super();
		this.tensp = tensp;
		this.dongia = dongia;
		this.giamgia = giamgia;
		this.thuenk = thuenk;
	}
	public Main(String tensp, double dongia) {
		super();
		this.tensp = tensp;
		this.dongia = dongia;
	}
	
	public Main(String tensp, double dongia, double giamgia) {
		super();
		this.tensp = tensp;
		this.dongia = dongia;
		this.giamgia = giamgia;
		
	}
	//đóng gói
	private double dongia;
	private double giamgia;
	private double thuenk;
	public double getThuenk() {
		return thuenk;
	}
	public void setThuenk(double thuenk) {
		this.thuenk = thuenk;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public double getGiamgia() {
		return giamgia;
	}
	public void setGiamgia(double giamgia) {
		this.giamgia = giamgia;
	}
	
   // nhap du liệu sản phẩm từ bàn phím
   public void nhapdulieu() {
	   Scanner nhap =new Scanner(System.in);
	   System.out.print("ten san pham : ");
	   tensp=nhap.nextLine();
	   System.out.print("donn gia  : ");
	   dongia=nhap.nextDouble();
	   System.out.print("giam gia : ");
	   giamgia=nhap.nextDouble();	  
   }
 
   
   public void xuat () {
	   thuenk=(dongia-giamgia)*0.1;
	   System.out.println("ten san pham: "+ tensp + "      "+"don gia: "+ dongia + "      "+"giam gia: "+giamgia
			   +"      "+ "thuenk:"+ thuenk);
	   System.out.println("         ");
	   System.out.println("         ");
   }

   
   
}
