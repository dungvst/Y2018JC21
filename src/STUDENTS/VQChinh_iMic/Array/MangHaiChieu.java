package VQChinh_iMic.Array;

import java.util.Scanner;

public class MangHaiChieu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nHang, nCot;
		System.out.print("Nhap so hang\t");
		nHang = scanner.nextInt();
		System.out.print("Nhap so cot\t");
		nCot = scanner.nextInt();
		System.out.println();
		
		int[][] nMangHaiChieu = new int[nHang][nCot];
		// khoi tai gia tri ngau nhien cho mang 2D
		for (int i = 0; i < nMangHaiChieu.length; i ++) {
			for (int j = 0;  j < nMangHaiChieu[i].length; j++) {				
				nMangHaiChieu[i][j] = (int) ((i+ j + 1) * 100 * Math.random());
			}
		}
		
		System.out.println("\nGia tri cua mang duoc nhap la:");
		for (int i = 0; i < nMangHaiChieu.length; i ++) {
			for (int j = 0; j < nMangHaiChieu[i].length; j++) {
				System.out.print("a [" + i + "][" + j + "] =\t" + nMangHaiChieu[i][j] + "\t");				
			}
			System.out.println();
		}	
		
		System.out.println("\nTong gia tri cac phan tu cua mang 2 chieu (ForEach) =\t" + TongPhanTuMaTranForEach(nMangHaiChieu));
		
		TongHangMaTran2D(nMangHaiChieu);		
		TongCotMaTran2D(nMangHaiChieu);	

		scanner.close();
	}
	
	public static int TongPhanTuMaTranForEach(int[][] nMangHaiChieu) {
		int nTongMang = 0;
		for (int[] i : nMangHaiChieu) {	
			for( int j : i) {				
				nTongMang += j;
			}
		}	
		return nTongMang;
	}
	
	public static int TongHangMaTran2D(int[][] nMangHaiChieu) {
		System.out.println("\n---Tong Hang cua ma tran 2D---");
		int nTongHang = 0;		
		for (int i = 0; i < nMangHaiChieu.length; i++) {
			nTongHang = 0;
			for (int j = 0; j < nMangHaiChieu[i].length; j++) {
				nTongHang += nMangHaiChieu[i][j];				
			}
			System.out.println("Tong hang " + i + " = " + nTongHang);					
		}
		return nTongHang;
	}
	
	public static int TongCotMaTran2D(int[][] nMangHaiChieu) {
		System.out.println("\n---Tong Cot cua ma tran 2D---");
		int nTongCot = 0;
		for (int i = 0; i < nMangHaiChieu[0].length; i++) {
			nTongCot = 0;
			for (int j = 0; j < nMangHaiChieu.length; j ++) {
				nTongCot += nMangHaiChieu[j][i];
			}			
			System.out.println("Tong cot " + i + " = " + nTongCot);			
		}
		return nTongCot;
	}
}
