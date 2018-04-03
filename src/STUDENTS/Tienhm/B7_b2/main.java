package STUDENTS.Tienhm.B7_b2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap lua chon sau : 1. con nguoi  1.Cho");
		Scanner nhap=new Scanner(System.in);
		int b=nhap.nextInt();
		dongvat a= new dongvat();
		a.thongtinchung();
		
		
		if (b==1) {
			connguoi d=new connguoi();
			d.thongtinrieng();
		}
		else if (b==2) {
			cho e=new cho();
			e.thongtinrieng();
		}
		else {System.out.println("lua chon sai, vui long chon lai");}
	}

}
