package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class MainBt5_30_03_2018 {
	public static void main(String[] args) {
		MayTinh mt = new MayTinh();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhập vào số a: ");
        mt.setA(sc.nextFloat());
		System.out.println("Nhập vào số b: ");
		mt.setB(sc.nextFloat());
		System.out.println("Chọn phép toán: ");
		mt.setPhepToan(sc1.nextLine());
		
		System.out.println("Cách 1: ");
		mt.inC1();
		System.out.println("Cách 2: ");
		mt.inC2();



	

	}

}
