package VietAnh;

import java.util.Scanner;

public class vietanh {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Xin moi nhap canh hinh vuong");
		int a = scanner.nextInt();
		System.out.println("Canh cua hinh vuong la:"+a);
		scanner.close();
		
		int dt = a*a;
		int cv = a*4;
		System.out.println("Dien tich hinh vuong la:"+dt);
		System.out.println("Chu vi hinh vuong la:"+cv);
	}

}
