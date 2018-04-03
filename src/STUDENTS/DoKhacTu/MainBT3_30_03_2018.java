package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class MainBT3_30_03_2018 {

	public static void main(String[] args) {
		BT3_30_03_2018_Nguoi n = new BT3_30_03_2018_Nguoi();
		BT3_30_03_2018_Cho c = new BT3_30_03_2018_Cho();
		System.out.println("Nhập thông tin");
		Scanner sc = new Scanner(System.in);
		String doiTuong;
		String dt;
		System.out.print("Tên đối tượng: ");
		dt = sc.nextLine();
		System.out.print("Chọn đối tượng: ");
		doiTuong = sc.nextLine();

		if (doiTuong.equals("Con Người")) {
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Chân: ");
			n.setChan(sc1.nextInt());
			System.out.print("Mắt: ");
			n.setMat(sc1.nextInt());
			System.out.print("Tay hoặc đuôi: ");
			n.setTayHoacDuoi(sc1.nextInt());

		}
		if (n.getChan() == 2) {
			if (n.getMat() == 2) {
				if (n.getTayHoacDuoi() == 2) {
					System.out.println("Kêt quả");
					System.out.println("Mã số : 1");
					System.out.println("Tên đối tượng: " + dt);
					n.inThongTin();

				}
			}
		}
		
		else if (doiTuong.equals("Chó")) {
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Chân: ");
			c.setChan(sc1.nextInt());
			System.out.print("Mắt: ");
			c.setMat(sc1.nextInt());
			System.out.print("Tay hoặc đuôi: ");
			c.setTayHoacDuoi(sc1.nextInt());
		}

		if (c.getChan() == 4) {
			if (c.getMat() == 2) {
				if (c.getTayHoacDuoi() == 1) {
					System.out.println("Kêt quả");
					System.out.println("Mã số : 2");
					System.out.println("Tên đối tượng: " + dt);
					c.inThongTin1();

				}

			}
		} 

	}

}
