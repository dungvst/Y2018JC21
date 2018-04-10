package HOANGDV.BTVN.ARRAY;

public class Main {

	public static void main(String[] args) {
		// BTVN 1
		System.out.println("BT 1: Tinh tong cac phan tu trong mang hai chieu");
		int[][] mangHaiChieu = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 }, { 11, 12 }, { 13, 14 }, { 15, 16 },
				{ 17, 18 }, { 19, 20 } };
		System.out.println("Tong cac phan tu trong mang la: " + SumAll(mangHaiChieu));
		
		// BTVN 2 
		System.out.println("\n");
		System.out.println("BT 2 Tinh tong cac phan tu trong mang hai chieu theo cot");
		System.out.println("Tong cac phan tu trong mang hai chieu theo cot la: " + SumCol(mangHaiChieu));
		
		// BTVN 3 
		System.out.println("\n");
		System.out.println("BT 3 nap chong phuong thuc");
		int [] arrayInt = {1, 2, 3, 4, 5, 6} ;
		double []arrayDouble = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		System.out.println("Tinh trung binh su dung INT "+average(arrayInt));
		System.out.println("Tinh trung binh su dung DOUBLE "+average(arrayDouble));
	}

	public static int SumAll(int[][] MangHaiChieu) {
		int sum = 0;
		for (int[] mang : MangHaiChieu) {
			for (int j : mang) {
				sum += j;
			}

		}
		return sum;
	}

	public static int SumCol(int[][] MangHaiChieu) {
		int sumCol1 = 0, sumCol2 = 0;
		for (int i = 0; i < MangHaiChieu.length; i++) {
			sumCol1 += MangHaiChieu[i][0];
			// System.out.println(MangHaiChieu[i][0]);
		}
		for (int i = 0; i < MangHaiChieu.length; i++) {
			sumCol2 += MangHaiChieu[i][1];
			// System.out.println(MangHaiChieu[i][1]);
		}
		return sumCol1 + sumCol2;
	}

	public static int average(int[] array) {
		int average = 0;
		for (int i : array) {
			average += i;
		}
		return average / array.length;
	}

	public static double average(double[] array) {
		double average = 0;
		for (double i : array) {
			average += i;
		}
		return average / array.length;
	}
}
