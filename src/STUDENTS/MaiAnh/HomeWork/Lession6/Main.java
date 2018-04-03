package MaiAnh.HomeWork.Lession6;

public class Main {
	public static void main(String[] args) {
		//Sach
		Sach s1 = new Sach();
		System.out.println("Nhap thong tin cuon sach 1:");
		s1.nhapSach();
		System.out.println("Thong tin cuon sach 1:");
		s1.hienThiSach();
		System.out.println();
		
		//Tap chi
		TapChi tc1 = new TapChi();
		System.out.println("Nhap thong tin tap chi 1:");
		tc1.nhapTapChi();
		System.out.println("Thong tin tap chi 1:");
		tc1.hienThiTapChi();
		System.out.println();
		
		//Bao
		Bao b1 = new Bao();
		System.out.println("Nhap thong tin bai bao 1:");
		b1.nhapBao();
		System.out.println("Thong tin bai bao 1:");
		b1.hienThiBao();
		
	}
}
