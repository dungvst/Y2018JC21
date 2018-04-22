package DoKhacTu_BaiTap20_4_2018;

import java.util.Random;

public class ThreadExercise2 extends Thread {
	@Override
	public void run() {
		super.run();
		Random random = new Random();
		int d[] = new int[10];
		System.out.print("Mảng: ");
		for (int i = 0; i < 10; i++) {
			d[i] = random.nextInt(100);
			System.out.print(d[i] + " ");
		}
		int i = 0;
		int max = d[i];
		for (i = 0; i < 10; i++) {
			if (d[i] > max) {
				max = d[i];
			}
		}
		System.out.println("\nGía trị lớn nhất trong mảng là: " + max);
	}

	public static void main(String[] args) {
		ThreadExercise2 b1 = new ThreadExercise2();
		ThreadExercise2 b2 = new ThreadExercise2();
		ThreadExercise2 b3 = new ThreadExercise2();
		ThreadExercise2 b4 = new ThreadExercise2();

		b1.run();
		b2.run();
		b3.run();
		b4.run();

	}

}
