package Lession6;

import java.util.Scanner;

public class Nguoi {
	int tay, chan;
	String mauDa, thucAn;
	
	
	
	
	
	void diChuyen(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Chon phuong thuc di chuyen: \n1.Di\n2.Chay\n3.Bo");
		int n= scan.nextInt();
		if(n==1){
			System.out.println("Nhan vat da di");
		}else if(n==2){
			System.out.println("Nhan vat da chay");
		}else if(n==3){
			System.out.println("Nhan vat da bo");
		}else{
			System.out.println("Nhan vat khong di chuyen");
			
		}
		
	}
	public int getTay() {
		return tay;
	}
	public void setTay(int tay) {
		this.tay = tay;
	}
	public int getChan() {
		return chan;
	}
	public void setChan(int chan) {
		this.chan = chan;
	}
	public String getMauDa() {
		return mauDa;
	}
	public void setMauDa(String mauDa) {
		this.mauDa = mauDa;
	}
	public String getThucAn() {
		return thucAn;
	}
	public void setThucAn(String thucAn) {
		this.thucAn = thucAn;
	}
	
}
