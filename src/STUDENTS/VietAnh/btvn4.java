package STUDENTS.VietAnh;

import java.util.Scanner;

public class btvn4 {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Xin moi ban nhap 1 so");
			int b = sc.nextInt(); 
			int a[]  = {7,14,31,4,5};
			
			
			if(inra(a, b) == true) {
				System.out.println("OK Toi Thich");
			}else {
				System.out.println("Toi Ko Thich");
			}
		}public static boolean inra(int[] a,int nhap) {
			boolean c = false;
			
			for(int i = 0;i < a.length ;i++) {
				if(a[i]==nhap) { c = true;
					return c;
				}
			}
			
			return c;
	
}
}