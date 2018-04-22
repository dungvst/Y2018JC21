package DoKhacTu_BaiTap20_4_2018;

import java.util.Random;

public class ThreadExercise_1 extends Thread {
	@Override
	public void run() {
		super.run();
		Random random = new Random();
		int a[] = new int[10];
		System.out.print("Mảng: ");
		for (int i = 0; i < 10; i++) {
			a[i] = random.nextInt(10);
			System.out.print(a[i] + " ");
		}
		 int tong = 0;
		 for (int i = 0; i < 10; i++) {
		 tong = tong + a[i];
		 }
		 System.out.println("\nTổng các phần tử trong mảng là: " + tong);
	}

	public static void main(String[] args) {
		ThreadExercise_1 b1 = new ThreadExercise_1();
		ThreadExercise_1 b2 = new ThreadExercise_1();
		ThreadExercise_1 b3 = new ThreadExercise_1();
		ThreadExercise_1 b4 = new ThreadExercise_1();
		
		b1.run();
		b2.run();
		b3.run();
		b4.run();

	}

}
