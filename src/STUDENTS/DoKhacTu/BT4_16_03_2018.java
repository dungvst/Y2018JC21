package STUDENTS.DoKhacTu;

import java.util.Scanner;

import STUDENTS.Tienhm.baitap;

public class BT4_16_03_2018 {

	public static void main(String[] args) {
		int a[]  = {1,3,5,7,9,15,20};
		int i;
		int KT=0;
		boolean check = false;
		
	Scanner sc = new Scanner(System.in);
	KT=sc.nextInt();
	
	for(i=0 ; i<=6 ; i++)
	{
		if (KT == a[i])
		{
			check=true;

		}
		
	}
       
          if (check==true)
          {
        	  System.out.println("gia tri vua nhap la: " + KT);
          }
          else {
			System.out.println("I don't like this number");
		}

	}




	

}
