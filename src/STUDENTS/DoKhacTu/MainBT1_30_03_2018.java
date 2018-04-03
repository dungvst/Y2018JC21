package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class MainBT1_30_03_2018 {

	public static void main(String[] args) {
		System.out.println("Xem thông tin từng dòng xe");
		System.out.println("Chọn loại xe cần xem: ");
		String loaiXe;
		Scanner sc = new Scanner(System.in);
		loaiXe = sc.nextLine();
		if(loaiXe.equals("Toyota iQ1")){
			BT1_30_03_2018_xeToyotaiQ1 a = new BT1_30_03_2018_xeToyotaiQ1();
			a.thongSoChung();
		}
		else if(loaiXe.equals("Toyota iQ2")){
			BT1_30_03_2018_xeToyotaiQ2 b = new BT1_30_03_2018_xeToyotaiQ2();
			b.thongSoChung();

		}
else {
	System.out.println("Không có thông tin dòng xe này");

}
	}

}
