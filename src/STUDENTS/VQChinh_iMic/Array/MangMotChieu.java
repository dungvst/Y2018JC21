package VQChinh_iMic.Array;

import java.util.Scanner;

public class MangMotChieu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu mang 1 chieu\t");
		int nPhanTu = scanner.nextInt();
		int[] nMangMotChieu = new int[nPhanTu];
		double[] dMangMotChieu = new double[nPhanTu];
		
		for (int i = 0; i < nMangMotChieu.length; i ++) {
			nMangMotChieu[i] = (int) ((i + 1) * Math.random() * 100); 
		}
		
		for (int i = 0; i < dMangMotChieu.length; i ++) {
			//tao so ngau nhien double voi 2 so sau phan thap phan
			dMangMotChieu[i] = i / 1.0 + 1.0 + Math.round(Math.random() * 100.0) / 100.0;
		}
		
		int nIndex = 0;
		System.out.println("\nMang 1 chieu kieu Int la");
		for (int i : nMangMotChieu) {
			System.out.print(i + "\t");
			nIndex++;
			if (nIndex != 0 && nIndex % 10 == 0) {
				System.out.println();
			}
		}
		
		nIndex = 0;
		System.out.println("\n\nMang mot chieu kieu Double la");
		for (double d : dMangMotChieu) {			
			System.out.print(String.format("%9.2f", d) + "\t");
			nIndex++;
			if (nIndex != 0 && nIndex % 7 == 0) {
				System.out.println();
			}
		}
		
		int max = nMangMotChieu[0];
		double min = dMangMotChieu[0];
		
		nIndex = 0;		
		for (int i = 0; i < nMangMotChieu.length; i++) {
			if (max < nMangMotChieu[i]) {
				max = nMangMotChieu[i];
				nIndex = i;
			}
		}
		
		System.out.println("\n\nPhan tu lon nhat cua mang Int = " + max + " tai vi tri " + nIndex);
		
		for (int i = 0; i < dMangMotChieu.length; i++) {
			if (min > dMangMotChieu[i]) {
				min = dMangMotChieu[i];
				nIndex = i;						
			}
		}
		
		System.out.println("\nPhan tu nho nhat cua mang Dobule = " + min + " tai vi tri " + nIndex);
		
		System.out.println("\nGia tri trung binh cua mang Int =\t" + TrungBinhMangInt(nMangMotChieu));
		System.out.println("\nGia tri trung binh cua mang Double =\t" + String.format("%.2f", TrungBinhMangDobule(dMangMotChieu)));		
		
		scanner.close();
	}
	
	public static int TrungBinhMangInt(int[] nMangMotChieu) {
		int nTong = 0;
		for (int i : nMangMotChieu) {
			nTong += i;
		}
		return Math.round(nTong / nMangMotChieu.length);
	}

	public static double TrungBinhMangDobule(double[] dMangMotChieu) {
		double nTong = 0;
		for (double i : dMangMotChieu) {
			nTong += i;
		}
		return nTong / dMangMotChieu.length;
	}
}
