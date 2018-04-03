package Phamduydieu;

import java.util.Scanner;

public class BTVN_DangKyKetBan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
Yêu cầu người dùng nhập vào các thông tin liên quan cho việc xử lý thông tin. 
 Phải kiểm tra tất cả những trường thông tin bắt buộc phải nhập như : Tên,
Tuổi, Tình trạng hôn nhân, Giới tính. Nếu người dùng chưa nhập thì đưa ra
thông báo.
 Xử lý nghiệp vụ đăng ký tham gia kết bạn. Yêu cầu người dùng nhập các thông
tin: Tên, Tuổi, Giới tính và Tình trạng hôn nhân. Các qui định bắt buộc khi tham gia :
o Thành viên là Nam, độ tuổi >= 22 tuổi và chưa có gia đình hoặc ly hôn được phép tham gia.
o Thành viên là Nữ, độ tuổi >= 19 tuổi và chưa có gia đình hoặc ly hôn được phép tham gia.
      o Tất cả các thành viên tuổi < 19không được tham gia.
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("MỜI BẠN NHẬP THÔNG TIN ĐĂNG KÝ:");
		System.out.print("Họ Và Tên:               ");
		String HoVaTen = sc.nextLine();
		System.out.print("Tuổi:                    ");
		int Tuoi = sc.nextInt();
		System.out.print("Giới Tính: \n[1]: Nam\n[2]: Nữ                  ");
		int GioiTinh = sc.nextInt();
		System.out.print("Tình Trạng Hôn Nhân: \n [1] Chưa có gia đình \n [2] Ly Hôn \n [3] Đã Lập Gia Đình     ");
		int TinhTrangHonNhan = sc.nextInt();
		if (Tuoi > 19) {
			switch (GioiTinh) {
			case 1:
				if (Tuoi >= 22) {
					switch (TinhTrangHonNhan) {
					case 1:
						System.out.println("Chúc mừng bạn " + HoVaTen + "\nBạn đã đăng ký tham gia thành công..!");
						break;
					case 2:
						System.out.println("Chúc mừng bạn " + HoVaTen + "\nBạn đã đăng ký tham gia thành công..!");
						break;
					default:
						System.out.println(
								"Bạn không thuộc đối tượng tham gia..!\nYêu cầu chưa có gia đình hoặc đã ly hôn..!");
					}
				} else
					System.out.println("Bạn không thuộc đối tượng tham gia..!\nYêu cầu nam lớn hơn 22 tuổi..!");
				break;
			case 2:
				if (Tuoi >= 19) {
					switch (TinhTrangHonNhan) {
					case 1:
						System.out.println("Chúc mừng bạn " + HoVaTen + "\nBạn đã đăng ký tham gia thành công..!");
						break;
					case 2:
						System.out.println("Chúc mừng bạn " + HoVaTen + "\nBạn đã đăng ký tham gia thành công..!");
						break;
					default:
						System.out.println(
								"Bạn không thuộc đối tượng tham gia..!\nĐối tượng tham gia đã ly hôn hoặc chưa có gia đình..!");
					}
				} else
					System.out.println("Bạn không thuộc đối tượng tham gia..!\nYêu cầu nữ lớn hơn 19 tuổi.");
				break;
			default:
				System.out.println("Giới tính không xác định.\nBạn không thuộc đối tượng tham gia..!");
			}
		} else
			System.out.println("Bạn không thuộc đối tượng tham gia..!\nBạn phải lớn hơn 19 tuổi.");
	}

}
