package STUDENTS.Tienhm.B7;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iQ1 xe = new iQ1();

		iQ2 car = new iQ2();

		Scanner nhap = new Scanner(System.in);
		System.out.println("lua chon cua nguoi dung: 1: IQ1, 2:IQ2");
		int luachon = nhap.nextInt();
		if (luachon == 1) {
			System.out.println("thong tin xe IQ1: ");
			System.out.println();
			xe.xuatthongtinchung();
			xe.xuathongtin();
			
		} else if (luachon == 2) {
			System.out.println("thong tin xe IQ2: ");
			System.out.println();
			xe.xuatthongtinchung();
			car.xuathongtin();
		} else {
			System.out.println(" chon sai, vui long chon lai");
		}

	}

}
