package HOANGDV.OOP.BTVN.QL_TAILIEU;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Quản lý sách");
		
		Sach sach = new Sach("TL001", "Kim Đồng", 1000, "A", 1000);
		System.out.println("Sách");
		sach.in();
		
		System.out.println("\n");
		TapChi tapChi = new TapChi("TL002", "Phụ Nữ", 12000, 90, 5);
		System.out.println("Tạp chí");
		tapChi.in();
		
		System.out.println("\n");
		Bao bao = new Bao("TL003", "Thanh Niên", 1300, 9);
		System.out.println("Báo: ");
		bao.in();
	}

}
