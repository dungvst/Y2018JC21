package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class MainBT2_30_08_2018 {

	public static void main(String[] args) {
		System.out.println("Xem thông tin từng đối tượng");
		System.out.println("Chọn đối tượng cần xem: ");
		String doituong;
		Scanner sc = new Scanner(System.in);
		doituong = sc.nextLine();
		if (doituong.equals("Con Người")) {
			BT2_30_02_2018_Nguoi n = new BT2_30_02_2018_Nguoi();
			n.thongSoChung();
		} else if (doituong.equals("Chó")) {
			BT2_30_08_2018_Cho c = new BT2_30_08_2018_Cho();
			c.thongSoChung();

		} else {
			System.out.println("Không có thông tin");
		}

	}

}
