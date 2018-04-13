package DoKhacTu.BTVN_10_04_2018;

import java.util.LinkedList;

public class Library {
	LinkedList<Object> e = new LinkedList<>();

	public void themMoi(Object f) {
		e.add(f);
	}

	public Object layThuVien() {
		return e.getLast();
	}

	public static void main(String[] args) {
		Library baa = new Library();
		Bao ba1 = new Bao(2, "Báo an ninh", "20/10/2018");
		Bao ba2 = new Bao(3, "Báo phụ nữ", "08/03/2018");
		Bao ba3 = new Bao(4, "Báo quân đội", "22/12/2018");
		baa.themMoi(ba1);
		baa.themMoi(ba2);
		baa.themMoi(ba3);
		System.out.println("Cách 2: ");
		ba1.setMaTaiLieu("111");
		ba1.setSoBanPhatHanh(200);
		ba2.setMaTaiLieu("113");
		ba2.setSoBanPhatHanh(50);
		ba3.setMaTaiLieu("115");
		ba3.setSoBanPhatHanh(100);
		baa.themMoi(ba1);
		baa.themMoi(ba2);
		baa.themMoi(ba3);
		ba1.inthongtin();
		ba2.inthongtin();
		ba3.inthongtin();
		Bao vitri11 = (Bao) baa.layThuVien();
		System.out.println("*********************************************");
		System.out.println("Thư viện cuối cùng của Báo");
		vitri11.inthongtin();

		System.out.println("*********************************************");
		Library sa = new Library();
		Sach sa1 = new Sach("Sách thiếu nhi", 10000, 50);
		Sach sa2 = new Sach("Sách khoa học", 210000, 200);
		Sach sa3 = new Sach("Sách công nghệ", 110000, 100);
		sa1.setMaTaiLieu("130");
		sa1.setSoBanPhatHanh(222);
		sa2.setMaTaiLieu("186");
		sa2.setSoBanPhatHanh(87);
		sa3.setMaTaiLieu("230");
		sa3.setSoBanPhatHanh(854);
		sa.themMoi(sa1);
		sa.themMoi(sa2);
		sa.themMoi(sa3);
		sa1.inthongtin();
		sa2.inthongtin();
		sa3.inthongtin();
		Sach vitri1 = (Sach) sa.layThuVien();
		System.out.println("*********************************************");
		System.out.println("Thư viện cuối cùng của sách");
		vitri1.inthongtin();
		System.out.println("*********************************************");
		Library vi = new Library();
		video vi1 = new video("hoạt hình", 120, "DC");
		video vi2 = new video("phim chưởng Hồng Kông", 120, "TVB");
		video vi3 = new video("Video hài", 130, "Vn");
		vi1.setMaTaiLieu("365");
		vi1.setSoBanPhatHanh(412);
		vi2.setMaTaiLieu("032");
		vi2.setSoBanPhatHanh(124);
		vi3.setMaTaiLieu("302");
		vi3.setSoBanPhatHanh(475);
		vi.themMoi(vi1);
		vi.themMoi(vi2);
		vi.themMoi(vi3);
		vi1.inthongtin();
		vi2.inthongtin();
		vi3.inthongtin();
		System.out.println("*********************************************");
		System.out.println("Thư viện cuối cùng của video");
		video vitri2 = (video) vi.layThuVien();
		vitri2.inthongtin();
	}
}
