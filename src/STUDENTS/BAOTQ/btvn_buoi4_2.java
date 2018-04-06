package BAOTQ;

import java.util.Scanner;

public class btvn_buoi4_2 {
	public static void main(String[] args) {
		Scanner dt = new Scanner(System.in);
		System.out.println("nhap ten");
		String ten = dt.nextLine();
		System.out.println("nhap tuoi");
		int tuoi = dt.nextInt();
		int gioitinh=0;
		int honnhan;
		do
		{
		   System.out.println("nhap gioi tinh\nNam nhap 1\nNu nhap 2");
		   gioitinh = dt.nextInt();
		}
		while(gioitinh !=1 & gioitinh !=2);
		do
		{
		    System.out.println("nhap tinh trang hon nhan\ndoc than nhap 1\nco gia dinh nhap 2\nly hon nhap 3");
		    honnhan = dt.nextInt();
		}
		while(honnhan != 1 & honnhan !=2 & honnhan != 3);
		if(tuoi >= 22 || gioitinh == 1 || honnhan == 1 ||honnhan == 3)
		{
			System.out.println("ten "+ten);
			System.out.println("tuoi "+tuoi);
			System.out.println("gioi tinh : Nam ");
			System.out.println("duoc phep dang ky ket ban");
		}
		else if(tuoi >= 19 || gioitinh == 2 || honnhan == 1 || honnhan == 3)
		{
			System.out.println("ten"+ten);
			System.out.println("tuoi"+tuoi);
			System.out.println("gioi tinh : Nu ");
			System.out.println("duoc phep dang ky ket ban");
		}
		else System.out.println("khong duoc ket ban");
		
		
		
	}
}
