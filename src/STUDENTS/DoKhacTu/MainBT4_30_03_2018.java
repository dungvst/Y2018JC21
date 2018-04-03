package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class MainBT4_30_03_2018 {

	public static void main(String[] args) {
		BT4_30_03_2018_BangTan bt = new BT4_30_03_2018_BangTan();
		Bt4_30_03_2018_TanSo ts = new Bt4_30_03_2018_TanSo();
		String nhaCCDV;
		String bangTang;
		String tanSo;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Chọn thông tin để đăng ký bản quyền sản phẩm");
		System.out.println("Tên nhà cung cấp dịch vụ: ");
		nhaCCDV = sc.nextLine();
		System.out.println("Đăng ký băng tần: ");
		bangTang = sc.nextLine();
		System.out.println("Đăng ký tần số: ");
		tanSo = sc.nextLine();
		if (bangTang.equals("CDMA")) {
			if (tanSo.equals("900 Mhz-902 Mhz")) {
				System.out.println("Kết quả");
				System.out.println("1.Mã số 1:  " + nhaCCDV);
				System.out.println("Đăng ký băng tầng: " + bangTang);
				System.out.println("Đăng ký tần số: " + tanSo);
				bt.inThongTin();

			}
		} else if (bangTang.equals("WCDMA")) {
			if (tanSo.equals("903 Mhz-905 Mhz")) {
				System.out.println("Kết quả");
				System.out.println("1.Mã số 2:  " + nhaCCDV);
				System.out.println("Đăng ký băng tầng: " + bangTang);
				System.out.println("Đăng ký tần số: " + tanSo);
				bt.inThongTin();

			}
		} else if (bangTang.equals("GSM")) {
			if (tanSo.equals("906 Mhz-908 Mhz")) {
				System.out.println("Kết quả");
				System.out.println("1.Mã số 3:  " + nhaCCDV);
				System.out.println("Đăng ký băng tầng: " + bangTang);
				System.out.println("Đăng ký tần số: " + tanSo);
				bt.inThongTin();

			}

		}
	}
}
