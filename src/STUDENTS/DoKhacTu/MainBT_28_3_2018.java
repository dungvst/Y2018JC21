package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class MainBT_28_3_2018 {

	public static void main(String[] args) {
		Sach sa = new Sach();
		System.out.println("Nhap du lieu cua sach: ");
		sa.nhapDuLieu();
		System.out.println("Du lieu cua sach: ");
		sa.inDuLieu();
		System.out.println("*****************************");
		TapChi tc = new TapChi();
		System.out.println("Nhap du lieu cua tap chi: ");
		tc.nhapDuLieu();
		System.out.println("Du lieu cua tap chi: ");
		tc.inDuLieu();
		System.out.println("*****************************");
		Bao ba = new Bao();
		System.out.println("Nhap du lieu cua bao: ");
		ba.nhapDuLieu();
		System.out.println("Du lieu cua bao: ");
		ba.inDuLieu();

	}

}
