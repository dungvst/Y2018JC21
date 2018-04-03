package MaiAnh.HomeWork.Lession4;

import java.util.Scanner;

public class InTamGiac {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("In hinh tam giac vuong can:");
		System.out.println("Nhap do dai canh goc vuong:");
		int canhGocVuong = scan.nextInt();
		tamGiacVuongCan(canhGocVuong);
		System.out.println("In hinh tam giac can");
		System.out.println("Nhap chieu cao:");
		int chieuCao=scan.nextInt();
		tamGiacCan(chieuCao);
		
	}

	
// Print isosceles right-angled triangle
	public static void tamGiacVuongCan(int canhGocVuong){
		String line = "";
		for(int i=1; i<=canhGocVuong; i++){
			line = line + "* ";
			System.out.println(line);
		}	
	}
	
//Print isosceles triangle
	public static void tamGiacCan(int chieuCao){
		for(int i=1; i<=chieuCao; i++){
			for(int j=1; j<=(chieuCao-i);j++){
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
