package MaiAnh.HomeWork.Lession7.Bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ToyotaIQ1 op1 = new ToyotaIQ1();
		ToyotaIQ2 op2 = new ToyotaIQ2();
		System.out.println("Chọn loại xe bạn muốn xem thông số kỹ thuật:");
		System.out.println("1.Toyota IQ1\n2.Toyota IQ2");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		switch (option) {
		case 1:
			op1.displayToyotaIQ1();
			break;
		case 2:
			op2.displayToyotaIQ2();
			break;
		default:
			System.out.println("You did not chose any option");
			break;
		}
	}
}
