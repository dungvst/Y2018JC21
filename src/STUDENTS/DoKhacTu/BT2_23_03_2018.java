package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class BT2_23_03_2018 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("In ra tam giac can");
		System.out.println("Nhap chieu cao tam giac: ");
		n = sc.nextInt();

		 for(int i = 1; i <= n; i++) {
		      for(int j = 1; j <= n-i; j++)
		    	  System.out.printf(" ");

		      for(int j = 1; j <= i; j++)
		    	  System.out.printf("* ");

		      System.out.println("");
		}

		int m;
		System.out.println("In ra tam giac vuong");
		System.out.println("Nhap chieu cao tam giac: ");
		m = sc.nextInt();	 
        for(int i = 0; i < m; i++){
            for(int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println(" ");

		}

	}
}
