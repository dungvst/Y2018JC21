package STUDENTS.DoKhacTu;

import java.util.Scanner;

import com.sun.org.glassfish.external.statistics.CountStatistic;

public class BT5_16_03_2018 {

	public static void main(String[] args) {
		int nhapso;
		int i;
		int n;
		int tongLe; 
		int tongChan;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("moi nhap: ");
		nhapso = sc.nextInt();
		
		tongLe= 0;
	    tongChan = 0;
		for (i = 0; i <= nhapso; i++) {
			if (i%2 == 0)

			{
				tongChan++;

			}
			if (i%2 == 1) 
			{
				tongLe++;

			}
		}
		System.out.println("so cac so chan la :" +tongChan);
		System.out.println("so cac cac so le la :" +tongLe);

	}
}
