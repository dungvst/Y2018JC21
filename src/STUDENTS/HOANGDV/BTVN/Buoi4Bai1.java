package HOANGDV.BTVN;

import java.util.Scanner;

public class Buoi4Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai Tap nhap vao so bat ky in ra ten so day");
		
		System.out.println("Nhap mot so bat ky:\t");
		Scanner scan = new Scanner(System.in);
		int so = scan.nextInt();

		switch (so) {
		case 1:
			System.out.println("Day la so mot");
			break;
		case 2:
			System.out.println("Day la so hai");
			break;
		case 3:
			System.out.println("Day la so ba");
			break;
		case 4:
			System.out.println("Day la so bon");
			break;
		case 5:
			System.out.println("Day la so nam");
			break;
		case 6:
			System.out.println("Day la so sau");
			break;
		case 7:
			System.out.println("Day la so bay");
			break;
		case 8:
			System.out.println("Day la so tam");
			break;
		case 9:
			System.out.println("Day la so chin");
			break;
		case 10:
			System.out.println("Day la so muoi");
			break;
		default:
			System.out.println("Khong nhan ra so nay");
			break;
		}
		scan.close();
	}

}
